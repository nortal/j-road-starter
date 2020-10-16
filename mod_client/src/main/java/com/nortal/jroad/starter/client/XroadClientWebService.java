package com.nortal.jroad.starter.client;

import org.apache.commons.lang3.StringUtils;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageExtractor;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.annotation.Nonnull;
import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.dom.DOMResult;
import java.util.UUID;

public class XroadClientWebService extends WebServiceGatewaySupport {
  @Override
  protected void initGateway() {
    getWebServiceTemplate().setCheckConnectionForFault(false);
  }

  public <I, O> O sendRequest(@Nonnull XroadConfiguration configuration, @Nonnull I inputContent) {
    return getWebServiceTemplate()
      .sendAndReceive(configuration.getSecurityServer(),
        requestMsg -> prepareRequestMessage(configuration, inputContent, requestMsg),
        (WebServiceMessageExtractor<O>) responseMsg -> extractData(configuration, responseMsg));
  }

  public <I> void prepareRequestMessage(@Nonnull XroadConfiguration conf,
                                        @Nonnull I content,
                                        @Nonnull WebServiceMessage request) {
    try {
      final SaajSoapMessage saajMessage = (SaajSoapMessage) request;
      final SOAPMessage soapMessage = saajMessage.getSaajMessage();
      final SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();

      conf.getMarshaller().marshal(content, new DOMResult(soapMessage.getSOAPBody()));

      fillSoapEnvelopeNamespaces(soapEnvelope);
      fillSoapEnvelopeHeader(conf, soapEnvelope);
    } catch (SOAPException | JAXBException e) {
      throw new RuntimeException(e);
    }
  }

  private void fillSoapEnvelopeNamespaces(@Nonnull SOAPEnvelope soapEnvelope) throws SOAPException {
    soapEnvelope.addNamespaceDeclaration("xsd", "http://www.w3.org/2001/XMLSchema");
    soapEnvelope.addNamespaceDeclaration("xsi", "http://www.w3.org/2001/XMLSchema-instance");
    soapEnvelope.addNamespaceDeclaration("xrd", "http://x-road.eu/xsd/xroad.xsd");
    soapEnvelope.addNamespaceDeclaration("iden", "http://x-road.eu/xsd/identifiers");
  }

  private void fillSoapEnvelopeHeader(@Nonnull XroadConfiguration conf,
                                      @Nonnull SOAPEnvelope soapEnvelope) throws SOAPException {
    final SOAPHeader header = soapEnvelope.getHeader();
    if (StringUtils.isNotBlank(conf.getIdCode())) {
      header.addChildElement("userId", "xrd").addTextNode(conf.getIdCode());
    }
    if (StringUtils.isNotBlank(conf.getIssue())) {
      header.addChildElement("issue", "xrd").addTextNode(conf.getIssue());
    }
    header.addChildElement("id", "xrd").addTextNode(UUID.randomUUID().toString());
    header.addChildElement("protocolVersion", "xrd").addTextNode("4.0");

    final SOAPElement client = header.addChildElement("client", "xrd");
    client.addAttribute(soapEnvelope.createName("iden:objectType"), conf.getClientObjectType());
    client.addChildElement("xRoadInstance", "iden").addTextNode(conf.getClientXRoadInstance());
    client.addChildElement("memberClass", "iden").addTextNode(conf.getClientMemberClass());
    client.addChildElement("memberCode", "iden").addTextNode(conf.getClientMemberCode());
    if (StringUtils.isNotBlank(conf.getClientSubsystemCode())) {
      client.addChildElement("subsystemCode", "iden").addTextNode(conf.getClientSubsystemCode());
    }

    final SOAPElement service = header.addChildElement("service", "xrd");
    service.addAttribute(soapEnvelope.createName("iden:objectType"), conf.getServiceObjectType());
    service.addChildElement("xRoadInstance", "iden").addTextNode(conf.getServiceXRoadInstance());
    service.addChildElement("memberClass", "iden").addTextNode(conf.getServiceMemberClass());
    service.addChildElement("memberCode", "iden").addTextNode(conf.getServiceMemberCode());
    service.addChildElement("serviceCode", "iden").addTextNode(conf.getServiceCode());
    if (StringUtils.isNotBlank(conf.getServiceVersion())) {
      service.addChildElement("serviceVersion", "iden").addTextNode(conf.getServiceVersion());
    }
    if (StringUtils.isNotBlank(conf.getServiceSubsystemCode())) {
      service.addChildElement("subsystemCode", "iden").addTextNode(conf.getServiceSubsystemCode());
    }
  }

  public <O> O extractData(@Nonnull XroadConfiguration conf, @Nonnull WebServiceMessage response) {
    try {
      return (O) conf.getUnmarshaller().unmarshal(response.getPayloadSource());
    } catch (JAXBException e) {
      throw new RuntimeException(e);
    }
  }
}
