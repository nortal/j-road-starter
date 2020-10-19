package com.nortal.jroad.starter.server.example;

import com.nortal.jroad.starter.server.AbstractXroadV4JaxbEndpoint;
import com.nortal.jroad.starter.server.example.generated.SendData;
import com.nortal.jroad.starter.server.example.generated.SendDataRequestItem;
import com.nortal.jroad.starter.server.example.generated.SendDataResponse;
import com.nortal.jroad.starter.server.example.generated.SendDataResponseType;
import com.nortal.jroad.starter.server.model.XroadMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.helpers.DefaultValidationEventHandler;
import java.util.List;

@Component
public class SendDataEndpoint extends AbstractXroadV4JaxbEndpoint<SendData> {
  private static final Logger LOG = LoggerFactory.getLogger(SendDataEndpoint.class);

  @Nonnull
  @Override
  protected Class<SendData> getRequestBodyClass() {
    return SendData.class;
  }

  @Nonnull
  @Override
  protected Unmarshaller getUnmarshaller() throws JAXBException {
    Unmarshaller unmarshaller = JAXBContext.newInstance(SendData.class).createUnmarshaller();
    // unmarshaller.setSchema(XRoadSchemaUtil.getSchemaFromContext(SendNotes.class));
    unmarshaller.setEventHandler(new DefaultValidationEventHandler());
    return unmarshaller;
  }

  @Nonnull
  @Override
  protected Marshaller getMarshaller() throws JAXBException {
    return JAXBContext.newInstance(SendDataResponse.class).createMarshaller();
  }

  @Override
  protected void invoke(@Nonnull XroadMessage<SendData> request, @Nonnull XroadMessage<Object> response) {
    final String userId = request.getHeader().getClientMemberCodeValue();
    final String principalPersonCode = request.getHeader().getRepresentedPartyCodeValue();

    // Additional security check, if needed using header data

    final SendDataResponseType sendDataResponseType = new SendDataResponseType();
    final List<SendDataRequestItem> xmlItems = request.getContent().getRequest().getItems().getItem();

    // Work with items and create the response

    sendDataResponseType.setStatusCode("ok");
    SendDataResponse sendDataResponse = new SendDataResponse();
    sendDataResponse.setResponse(sendDataResponseType);
    response.setContent(sendDataResponse);
  }
}
