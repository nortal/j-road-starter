package com.nortal.jroad.starter.server;

import com.nortal.jroad.starter.server.model.XroadMessage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.annotation.Nonnull;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;

public abstract class AbstractXroadV4JaxbEndpoint<T> extends AbstractXroadV4BaseEndpoint {
  @Nonnull
  protected abstract Class<T> getRequestBodyClass();

  @Nonnull
  protected abstract Unmarshaller getUnmarshaller() throws JAXBException;

  @Nonnull
  protected abstract Marshaller getMarshaller() throws JAXBException;

  protected abstract void invoke(@Nonnull XroadMessage<T> request,
                                 @Nonnull XroadMessage<Object> response) throws Exception;

  @Override
  protected void invokeInternal(@Nonnull XroadMessage<Document> requestDocument,
                                @Nonnull XroadMessage<Element> responseElement) throws Exception {
    Unmarshaller unmarshaller = getUnmarshaller();
    unmarshaller.setAttachmentUnmarshaller(new XroadAttachmentUnmarshaller(requestDocument.getAttachments()));

    Document requestOnly = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
    requestOnly.appendChild(requestOnly.importNode(SoapUtil.getFirstNonTextChild(requestDocument.getContent()), true));
    T requestContent = unmarshaller.unmarshal(requestOnly.getDocumentElement(), getRequestBodyClass()).getValue();

    XroadMessage<T> request = new XroadMessage<>(requestDocument.getSource());
    request.setHeader(requestDocument.getHeader());
    request.setContent(requestContent);
    request.getAttachments().addAll(requestDocument.getAttachments());

    XroadMessage<Object> response = new XroadMessage<>(responseElement.getSource());
    response.setHeader(responseElement.getHeader());

    invoke(request, response);

    if (response.getContent() == null) {
      return;
    }

    Element responseContent = responseElement.getContent();
    Node parent = responseContent.getParentNode();
    Node child = parent.removeChild(responseContent);

    Marshaller responseMarshaller = getMarshaller();
    responseMarshaller.setAttachmentMarshaller(new XroadAttachmentMarshaller(responseElement.getAttachments()));

    QName name = new QName(responseContent.getNamespaceURI(), child.getLocalName(), responseContent.getPrefix());
    JAXBElement jaxbElement = new JAXBElement(name, response.getContent().getClass(), response.getContent());
    responseMarshaller.marshal(jaxbElement, parent);
  }
}
