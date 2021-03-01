package com.nortal.jroad.starter.server.model;

import com.nortal.jroad.starter.server.XroadV4Constant;

import java.io.Serializable;
import java.util.Objects;

public class XroadEndpointMappingKey implements Serializable {
  private static final long serialVersionUID = -7714795069322529947L;

  private String subsystemCode;
  private String serviceCode;
  private String serviceVersion = XroadV4Constant.SERVICE_VERSION__V1;

  public XroadEndpointMappingKey() {
    // empty constructor
  }

  public XroadEndpointMappingKey(String subsystemCode, String serviceCode, String serviceVersion) {
    this.subsystemCode = subsystemCode;
    this.serviceCode = serviceCode;
    this.serviceVersion = serviceVersion;
  }

  public String getMappingKey() {
    return subsystemCode + "." + serviceCode + "." + serviceVersion;
  }

  public String getSubsystemCode() {
    return subsystemCode;
  }

  public void setSubsystemCode(String subsystemCode) {
    this.subsystemCode = subsystemCode;
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
    return Objects.equals(getSubsystemCode(), that.getSubsystemCode()) &&
      Objects.equals(getServiceCode(), that.getServiceCode()) &&
      Objects.equals(getServiceVersion(), that.getServiceVersion());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getSubsystemCode(), getServiceCode(), getServiceVersion());
  }

  @Override
  public String toString() {
    return "XroadEndpointMappingKey{" +
      "subsystemCode='" + subsystemCode + '\'' +
      ", serviceCode='" + serviceCode + '\'' +
      ", serviceVersion='" + serviceVersion + '\'' +
      '}';
  }
}

