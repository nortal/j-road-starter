package com.nortal.jroad.starter.server;

import com.nortal.jroad.starter.server.model.XroadAttachment;
import com.nortal.jroad.starter.server.model.XroadHeader;
import com.nortal.jroad.starter.server.model.XroadMessage;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.MessageEndpoint;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.wsdl.wsdl11.provider.SuffixBasedMessagesProvider;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.AttachmentPart;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractXroadV4BaseEndpoint implements MessageEndpoint {
  protected abstract void invokeInternal(XroadMessage<Document> requestMessage,
                                         XroadMessage<Element> responseMessage) throws Exception;

  @Override
  public final void invoke(MessageContext messageContext) throws Exception {
    SOAPMessage request = ((SaajSoapMessage) messageContext.getRequest()).getSaajMessage();
    Node requestBody = SoapUtil.getFirstNonTextChild(request.getSOAPBody());
    if (requestBody.getPrefix() == null || requestBody.getNamespaceURI() == null) {
      throw new IllegalStateException("Request body is missing namespace!");
    }

    final XroadHeader header = getRequestHeader(request);

    XroadMessage<Document> requestMessage = new XroadMessage<>(request);
    requestMessage.setHeader(header);
    requestMessage.setContent(getRequestContent(requestBody));
    requestMessage.getAttachments().addAll(getAttachments(request));

    SOAPMessage response = ((SaajSoapMessage) messageContext.getResponse()).getSaajMessage();
    prepareResponse(response);
    assignResponseNamespacesFromRequest(response, request);
    assignResponseNamespaceFromRequestBody(response, requestBody);
    assignResponseHeadersFromRequest(response, request);

    XroadMessage<Element> responseMessage = new XroadMessage<>(response);
    responseMessage.setHeader(header);
    responseMessage.setContent(getResponseEmptyContent(response, requestBody));
    invokeInternal(requestMessage, responseMessage);
    assignResponseAttachments(response, responseMessage.getAttachments());
  }

  protected XroadHeader getRequestHeader(SOAPMessage requestSoapMessage) throws SOAPException {
    return XroadHeaderUtil.getXroadHeader(requestSoapMessage);
  }

  protected Document getRequestContent(Node requestBodyNode) throws ParserConfigurationException {
    Document query = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
    requestBodyNode = query.importNode(requestBodyNode, true);
    query.appendChild(requestBodyNode);
    return query;
  }

  protected List<XroadAttachment> getAttachments(SOAPMessage message) throws SOAPException {
    List<XroadAttachment> result = new ArrayList<>();
    for (Iterator<AttachmentPart> i = message.getAttachments(); i.hasNext(); ) {
      AttachmentPart attachmentPart = i.next();
      result.add(new XroadAttachment(
        attachmentPart.getContentId(),
        attachmentPart.getContentType(),
        attachmentPart.getRawContentBytes()));
    }
    return result;
  }

  protected void prepareResponse(SOAPMessage response) throws SOAPException {
    final MimeHeaders mimeHeaders = response.getMimeHeaders();
    mimeHeaders.setHeader("Content-Type", "multipart/related");
    mimeHeaders.setHeader("SOAPAction", "\"\"");
    mimeHeaders.setHeader("Accept", "application/soap+xml, application/mime, multipart/related, text/*");
    mimeHeaders.setHeader("Cache-Control", "no-cache");
    mimeHeaders.setHeader("Pragma", "no-cache");

    final SOAPPart soapPart = response.getSOAPPart();
    soapPart.setMimeHeader("Content-Type", "text/xml; charset=UTF-8");
    soapPart.setMimeHeader("Content-Transfer-Encoding", "8bit");

    final SOAPEnvelope envelope = soapPart.getEnvelope();
    envelope.addNamespaceDeclaration("xsi", "http://www.w3.org/2001/XMLSchema-instance");
    envelope.addNamespaceDeclaration("xsd", "http://www.w3.org/2001/XMLSchema");
    envelope.addNamespaceDeclaration("SOAP-ENC", "http://schemas.xmlsoap.org/soap/encoding/");
    envelope.addNamespaceDeclaration("SOAP-ENV", "http://schemas.xmlsoap.org/soap/envelope/");
    envelope.setEncodingStyle("http://schemas.xmlsoap.org/soap/encoding/");
  }

  protected void assignResponseNamespacesFromRequest(SOAPMessage response, SOAPMessage request) throws SOAPException {
    List<String> namespaces = new ArrayList<>();
    namespaces.add(XroadV4Constant.NS_XRD_URI);
    namespaces.add(XroadV4Constant.NS_IDEN_URI);

    Iterator<String> prefixes = request.getSOAPPart().getEnvelope().getNamespacePrefixes();
    while (prefixes.hasNext()) {
      String nsPrefix = prefixes.next();
      String nsUri = request.getSOAPPart().getEnvelope().getNamespaceURI(nsPrefix).toLowerCase();
      if (namespaces.contains(nsUri)) {
        response.getSOAPPart().getEnvelope().addNamespaceDeclaration(nsPrefix, nsUri);
      }
    }
  }

  protected void assignResponseNamespaceFromRequestBody(SOAPMessage response, Node requestBody) throws SOAPException {
    final SOAPEnvelope envelope = response.getSOAPPart().getEnvelope();
    envelope.addNamespaceDeclaration(requestBody.getPrefix(), requestBody.getNamespaceURI());
  }

  protected void assignResponseHeadersFromRequest(SOAPMessage response, SOAPMessage request) throws SOAPException {
    NodeList requestHeaders = request.getSOAPHeader().getChildNodes();
    for (int i = 0; i < requestHeaders.getLength(); i++) {
      Node requestHeader = requestHeaders.item(i);
      if (requestHeader.getNodeType() == Node.ELEMENT_NODE) {
        Node responseHeader = response.getSOAPPart().importNode(requestHeader, true);
        response.getSOAPHeader().appendChild(responseHeader);
      }
    }
  }

  protected SOAPElement getResponseEmptyContent(SOAPMessage response, Node requestBody) throws SOAPException {
    String localName = requestBody.getLocalName();
    final String requestSuffix = SuffixBasedMessagesProvider.DEFAULT_REQUEST_SUFFIX;
    if (localName.endsWith(requestSuffix)) {
      localName = localName.substring(0, localName.lastIndexOf(requestSuffix));
    }
    localName += SuffixBasedMessagesProvider.DEFAULT_RESPONSE_SUFFIX;
    return response.getSOAPBody().addChildElement(localName, requestBody.getPrefix(), requestBody.getNamespaceURI());
  }

  protected void assignResponseAttachments(SOAPMessage response, List<XroadAttachment> attachments) {
    attachments.forEach(attachment -> {
      AttachmentPart attachmentPart = response.createAttachmentPart(attachment.getDataHandler());
      attachmentPart.setContentId("<" + attachment.getCid() + ">");
      response.addAttachmentPart(attachmentPart);
    });
  }
}
