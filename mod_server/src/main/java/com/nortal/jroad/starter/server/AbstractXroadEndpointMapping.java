package com.nortal.jroad.starter.server;

import com.nortal.jroad.starter.server.model.XroadEndpointMappingKey;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.mapping.AbstractEndpointMapping;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.w3c.dom.Element;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import java.util.HashMap;
import java.util.Map;

import static com.nortal.jroad.starter.server.XroadV4Constant.*;

public abstract class AbstractXroadEndpointMapping extends AbstractEndpointMapping implements InitializingBean {
  private final Map<String, AbstractXroadV4BaseEndpoint> endpoints = new HashMap<>();

  @Nonnull
  protected abstract Map<XroadEndpointMappingKey, AbstractXroadV4BaseEndpoint> getRegisteredEndpoints();

  @Override
  public void afterPropertiesSet() {
    getRegisteredEndpoints().forEach((key, value) -> endpoints.put(key.getMappingKey(), value));
  }

  @Nullable
  @Override
  protected Object getEndpointInternal(MessageContext messageCtx) throws Exception {
    SOAPMessage message = ((SaajSoapMessage) messageCtx.getRequest()).getSaajMessage();
    XroadEndpointMappingKey endpointKey = getEndpointKey(message.getSOAPHeader());
    return endpoints.get(endpointKey.getMappingKey());
  }

  @Nonnull
  protected XroadEndpointMappingKey getEndpointKey(SOAPHeader header) {
    XroadEndpointMappingKey result = new XroadEndpointMappingKey();

    if (header == null) {
      return result;
    }

    Element service = SoapUtil.getNsElement(header, HEADER__SERVICE, NS_XRD_URI);
    if (service == null) {
      return result;
    }

    String subsystemCode = SoapUtil.getNsElementValue(service, HEADER__SUBSYSTEM_CODE, NS_IDEN_URI);
    result.setSubsystemCode(subsystemCode);

    String serviceCode = SoapUtil.getNsElementValue(service, HEADER__SERVICE_CODE, NS_IDEN_URI);
    result.setServiceCode(serviceCode);

    String serviceVersion = SoapUtil.getNsElementValue(service, HEADER__SERVICE_VERSION, NS_IDEN_URI);
    if (StringUtils.isNotEmpty(serviceVersion)) {
      result.setServiceVersion(serviceVersion);
    }
    return result;
  }


}
