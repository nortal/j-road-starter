package com.nortal.jroad.starter.server.example;

import com.nortal.jroad.starter.server.AbstractXroadEndpointMapping;
import com.nortal.jroad.starter.server.AbstractXroadV4BaseEndpoint;
import com.nortal.jroad.starter.server.model.XroadEndpointMappingKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

@Component
public class XroadEndpointMapping extends AbstractXroadEndpointMapping {
  @Autowired
  private SendDataEndpoint sendDataEndpoint;

  @Nonnull
  @Override
  protected Map<XroadEndpointMappingKey, AbstractXroadV4BaseEndpoint> getRegisteredEndpoints() {
    Map<XroadEndpointMappingKey, AbstractXroadV4BaseEndpoint> result = new HashMap<>();
    result.put(new XroadEndpointMappingKey("exampleserver", "sendData", "v1"), sendDataEndpoint);
    return result;
  }
}
