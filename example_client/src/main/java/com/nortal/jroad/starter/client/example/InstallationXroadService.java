package com.nortal.jroad.starter.client.example;

import com.nortal.jroad.starter.client.XroadClientWebService;
import com.nortal.jroad.starter.client.XroadConfiguration;
import com.nortal.jroad.starter.client.example.jvis.generated.InstallationListRequest;
import com.nortal.jroad.starter.client.example.jvis.generated.InstallationListResponse;
import com.nortal.jroad.starter.client.example.jvis.generated.InstallationStatus;

import javax.annotation.Nonnull;
import java.math.BigInteger;
import java.util.Collection;

/**
 * This class is your singleton service class (bean).
 */
public class InstallationXroadService extends XroadClientWebService {

  @Nonnull
  public InstallationListResponse getInstallationList(@Nonnull Collection<Long> groups,
                                                      @Nonnull Collection<Long> ids,
                                                      @Nonnull Collection<String> statuses,
                                                      int limit,
                                                      long offset) {
    // try to not passing "InstallationListRequest" class into the service. It's better to keep
    // wsdl-generated classes in the scope of the SOAP call only, so WSDL changes will not affect
    // your business logic.
    InstallationListRequest request = new InstallationListRequest();
    groups.forEach(group -> request.getGroup().add(BigInteger.valueOf(group)));
    ids.forEach(id -> request.getId().add(BigInteger.valueOf(id)));
    statuses.forEach(status -> request.getStatus().add(InstallationStatus.fromValue(status)));
    request.setLimit(limit);
    request.setOffset(BigInteger.valueOf(offset));

    // create configuration file (your security server and used service data)
    XroadConfiguration<InstallationListRequest, InstallationListResponse> conf = new XroadConfiguration<>();
    fillConfigurationCommonData(conf);
    fillConfigurationServiceData(conf);

    // this call is doing all the magic
    // also the best variant is to isolate generated "InstallationListResponse" class and convert this
    // class into your model/dto. It's better to keep wsdl-generated classes in the scope of the SOAP
    // call only, so WSDL changes will not affect your business logic.
    return sendRequest(conf, request);
  }

  /**
   * This data is specific for the service you want to use.
   */
  protected void fillConfigurationServiceData(XroadConfiguration conf) {
    conf.setServiceSubsystemCode("jvisv6");
    conf.setServiceCode("installationList");
    conf.setServiceVersion("v1");
    conf.setMarshallerForClass(InstallationListRequest.class);
    conf.setUnmarshallerForClass(InstallationListResponse.class);
  }

  /**
   * This data should be set from the properties file. It is common data for the security server on your project side.
   */
  protected void fillConfigurationCommonData(XroadConfiguration conf) {
    conf.setSecurityServer("http://xtee6-development.server.com");

    conf.setClientXRoadInstance("ee-dev");
    conf.setClientMemberClass("COM");
    conf.setClientMemberCode("10391131");
    conf.setClientSubsystemCode("your-app-code");

    conf.setServiceXRoadInstance("ee-dev");
    conf.setServiceMemberClass("GOV");
    conf.setServiceMemberCode("70003218");
  }
}
