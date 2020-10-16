package com.nortal.jroad.starter.server.model;

import com.nortal.jroad.starter.server.XroadV4Constant;

import java.io.Serializable;
import java.util.Objects;

public class XroadEndpointMappingKey implements Serializable {
  private static final long serialVersionUID = -7714795069322529947L;

  private String databaseCode;
  private String serviceCode;
  private String serviceVersion = XroadV4Constant.SERVICE_VERSION__V1;

  public XroadEndpointMappingKey() {
    // empty constructor
  }

  public XroadEndpointMappingKey(String databaseCode, String serviceCode, String serviceVersion) {
    this.databaseCode = databaseCode;
    this.serviceCode = serviceCode;
    this.serviceVersion = serviceVersion;
  }

  public String getMappingKey() {
    return databaseCode + "." + serviceCode + "." + serviceVersion;
  }

  public String getDatabaseCode() {
    return databaseCode;
  }

  public void setDatabaseCode(String databaseCode) {
    this.databaseCode = databaseCode;
  }

  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  public String getServiceVersion() {
    return serviceVersion;
  }

  public void setServiceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XroadEndpointMappingKey that = (XroadEndpointMappingKey) o;
    return Objects.equals(getDatabaseCode(), that.getDatabaseCode()) &&
      Objects.equals(getServiceCode(), that.getServiceCode()) &&
      Objects.equals(getServiceVersion(), that.getServiceVersion());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getDatabaseCode(), getServiceCode(), getServiceVersion());
  }

  @Override
  public String toString() {
    return "XroadEndpointMappingKey{" +
      "databaseCode='" + databaseCode + '\'' +
      ", serviceCode='" + serviceCode + '\'' +
      ", serviceVersion='" + serviceVersion + '\'' +
      '}';
  }
}

