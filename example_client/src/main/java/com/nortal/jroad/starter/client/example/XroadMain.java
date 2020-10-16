package com.nortal.jroad.starter.client.example;

import com.nortal.jroad.starter.client.XroadConfiguration;
import com.nortal.jroad.starter.client.example.jvis.generated.Installation;
import com.nortal.jroad.starter.client.example.jvis.generated.InstallationListResponse;

import java.util.Collections;

/**
 * NB! You need to setup your server data in {@link InstallationXroadService#fillConfigurationCommonData(XroadConfiguration)}
 */
public class XroadMain {
  public static void main(String[] args) {
    final InstallationXroadService service = new InstallationXroadService();
    final InstallationListResponse result = service.getInstallationList(
      Collections.EMPTY_LIST, Collections.EMPTY_LIST, Collections.EMPTY_LIST, 100, 0);
    for (Installation installation : result.getInstallation()) {
      System.out.println(installation); // check purposes
    }
  }
}
