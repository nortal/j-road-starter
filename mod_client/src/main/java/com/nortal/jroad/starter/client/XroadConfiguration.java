package com.nortal.jroad.starter.client;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.Serializable;
import java.util.Objects;

public class XroadConfiguration<I, O> implements Serializable {
  private static final long serialVersionUID = -5007438423008390722L;

  private static final String OBJECT_TYPE__SUBSYSTEM = "SUBSYSTEM";
  private static final String OBJECT_TYPE__SERVICE = "SERVICE";

  private String securityServer;
  private String idCode;
  private String issue;

  private String clientObjectType = OBJECT_TYPE__SUBSYSTEM;
  private String clientXRoadInstance;
  private String clientMemberClass;
  private String clientMemberCode;
  private String clientSubsystemCode;

  private String serviceObjectType = OBJECT_TYPE__SERVICE;
  private String serviceXRoadInstance;
  private String serviceMemberClass;
  private String serviceMemberCode;
  private String serviceSubsystemCode;

  private String serviceCode;
  private String serviceVersion;

  private Marshaller marshaller;
  private Unmarshaller unmarshaller;

  public String getSecurityServer() {
    return securityServer;
  }

  public void setSecurityServer(String securityServer) {
    this.securityServer = securityServer;
  }

  public String getIdCode() {
    return idCode;
  }

  public void setIdCode(String idCode) {
    this.idCode = idCode;
  }

  public String getIssue() {
    return issue;
  }

  public void setIssue(String issue) {
    this.issue = issue;
  }

  public String getClientObjectType() {
    return clientObjectType;
  }

  public void setClientObjectType(String clientObjectType) {
    this.clientObjectType = clientObjectType;
  }

  public String getClientXRoadInstance() {
    return clientXRoadInstance;
  }

  public void setClientXRoadInstance(String clientXRoadInstance) {
    this.clientXRoadInstance = clientXRoadInstance;
  }

  public String getClientMemberClass() {
    return clientMemberClass;
  }

  public void setClientMemberClass(String clientMemberClass) {
    this.clientMemberClass = clientMemberClass;
  }

  public String getClientMemberCode() {
    return clientMemberCode;
  }

  public void setClientMemberCode(String clientMemberCode) {
    this.clientMemberCode = clientMemberCode;
  }

  public String getClientSubsystemCode() {
    return clientSubsystemCode;
  }

  public void setClientSubsystemCode(String clientSubsystemCode) {
    this.clientSubsystemCode = clientSubsystemCode;
  }

  public String getServiceObjectType() {
    return serviceObjectType;
  }

  public void setServiceObjectType(String serviceObjectType) {
    this.serviceObjectType = serviceObjectType;
  }

  public String getServiceXRoadInstance() {
    return serviceXRoadInstance;
  }

  public void setServiceXRoadInstance(String serviceXRoadInstance) {
    this.serviceXRoadInstance = serviceXRoadInstance;
  }

  public String getServiceMemberClass() {
    return serviceMemberClass;
  }

  public void setServiceMemberClass(String serviceMemberClass) {
    this.serviceMemberClass = serviceMemberClass;
  }

  public String getServiceMemberCode() {
    return serviceMemberCode;
  }

  public void setServiceMemberCode(String serviceMemberCode) {
    this.serviceMemberCode = serviceMemberCode;
  }

  public String getServiceSubsystemCode() {
    return serviceSubsystemCode;
  }

  public void setServiceSubsystemCode(String serviceSubsystemCode) {
    this.serviceSubsystemCode = serviceSubsystemCode;
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

  public Marshaller getMarshaller() {
    return marshaller;
  }

  public void setMarshaller(Marshaller marshaller) {
    this.marshaller = marshaller;
  }

  public void setMarshallerForClass(Class<I> clazz) {
    try {
      setMarshaller(JAXBContext.newInstance(clazz).createMarshaller());
    } catch (JAXBException e) {
      throw new RuntimeException(e);
    }
  }

  public Unmarshaller getUnmarshaller() {
    return unmarshaller;
  }

  public void setUnmarshaller(Unmarshaller unmarshaller) {
    this.unmarshaller = unmarshaller;
  }

  public void setUnmarshallerForClass(Class<O> clazz) {
    try {
      setUnmarshaller(JAXBContext.newInstance(clazz).createUnmarshaller());
    } catch (JAXBException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XroadConfiguration<?, ?> that = (XroadConfiguration<?, ?>) o;
    return Objects.equals(getSecurityServer(), that.getSecurityServer()) &&
      Objects.equals(getIdCode(), that.getIdCode()) &&
      Objects.equals(getIssue(), that.getIssue()) &&
      Objects.equals(getClientObjectType(), that.getClientObjectType()) &&
      Objects.equals(getClientXRoadInstance(), that.getClientXRoadInstance()) &&
      Objects.equals(getClientMemberClass(), that.getClientMemberClass()) &&
      Objects.equals(getClientMemberCode(), that.getClientMemberCode()) &&
      Objects.equals(getClientSubsystemCode(), that.getClientSubsystemCode()) &&
      Objects.equals(getServiceObjectType(), that.getServiceObjectType()) &&
      Objects.equals(getServiceXRoadInstance(), that.getServiceXRoadInstance()) &&
      Objects.equals(getServiceMemberClass(), that.getServiceMemberClass()) &&
      Objects.equals(getServiceMemberCode(), that.getServiceMemberCode()) &&
      Objects.equals(getServiceSubsystemCode(), that.getServiceSubsystemCode()) &&
      Objects.equals(getServiceCode(), that.getServiceCode()) &&
      Objects.equals(getServiceVersion(), that.getServiceVersion()) &&
      Objects.equals(getMarshaller(), that.getMarshaller()) &&
      Objects.equals(getUnmarshaller(), that.getUnmarshaller());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      getSecurityServer(),
      getIdCode(),
      getIssue(),
      getClientObjectType(),
      getClientXRoadInstance(),
      getClientMemberClass(),
      getClientMemberCode(),
      getClientSubsystemCode(),
      getServiceObjectType(),
      getServiceXRoadInstance(),
      getServiceMemberClass(),
      getServiceMemberCode(),
      getServiceSubsystemCode(),
      getServiceCode(),
      getServiceVersion(),
      getMarshaller(),
      getUnmarshaller());
  }

  @Override
  public String toString() {
    return "XroadConfiguration{" +
      "securityServer='" + securityServer + '\'' +
      ", idCode='" + idCode + '\'' +
      ", issue='" + issue + '\'' +
      ", clientObjectType='" + clientObjectType + '\'' +
      ", clientXRoadInstance='" + clientXRoadInstance + '\'' +
      ", clientMemberClass='" + clientMemberClass + '\'' +
      ", clientMemberCode='" + clientMemberCode + '\'' +
      ", clientSubsystemCode='" + clientSubsystemCode + '\'' +
      ", serviceObjectType='" + serviceObjectType + '\'' +
      ", serviceXRoadInstance='" + serviceXRoadInstance + '\'' +
      ", serviceMemberClass='" + serviceMemberClass + '\'' +
      ", serviceMemberCode='" + serviceMemberCode + '\'' +
      ", serviceSubsystemCode='" + serviceSubsystemCode + '\'' +
      ", serviceCode='" + serviceCode + '\'' +
      ", serviceVersion='" + serviceVersion + '\'' +
      ", marshaller=" + marshaller +
      ", unmarshaller=" + unmarshaller +
      '}';
  }
}
