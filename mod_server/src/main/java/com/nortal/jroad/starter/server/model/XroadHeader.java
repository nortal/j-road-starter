package com.nortal.jroad.starter.server.model;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPHeader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static com.nortal.jroad.starter.server.XroadV4Constant.*;

public class XroadHeader implements Serializable {
  private static final long serialVersionUID = -1607279589168602066L;

  private SOAPHeader source;
  private final List<XroadHeaderElement> children = new ArrayList<>();

  public XroadHeader() {
    // empty constructor
  }

  public XroadHeader(SOAPHeader source) {
    this.source = source;
  }

  public SOAPHeader getSource() {
    return source;
  }

  public void setSource(SOAPHeader source) {
    this.source = source;
  }

  public List<XroadHeaderElement> getChildren() {
    return children;
  }

  public String getClientXRoadInstanceValue() {
    return getValueByQName(CLIENT, X_ROAD_INSTANCE);
  }

  public String getClientMemberClassValue() {
    return getValueByQName(CLIENT, MEMBER_CLASS);
  }

  public String getClientMemberCodeValue() {
    return getValueByQName(CLIENT, MEMBER_CODE);
  }

  public String getClientUserIdValue() {
    return getValueByQName(CLIENT, USER_ID);
  }

  public String getClientSubsystemCodeValue() {
    return getValueByQName(CLIENT, SUBSYSTEM_CODE);
  }

  public String getServiceXRoadInstanceValue() {
    return getValueByQName(SERVICE, X_ROAD_INSTANCE);
  }

  public String getServiceMemberClassValue() {
    return getValueByQName(SERVICE, MEMBER_CLASS);
  }

  public String getServiceMemberCodeValue() {
    return getValueByQName(SERVICE, MEMBER_CODE);
  }

  public String getServiceSubsystemCodeValue() {
    return getValueByQName(SERVICE, SUBSYSTEM_CODE);
  }

  public String getServiceCodeValue() {
    return getValueByQName(SERVICE, SERVICE_CODE);
  }

  public String getServiceVersionValue() {
    return getValueByQName(SERVICE, SERVICE_VERSION);
  }

  public String getRepresentedPartyClassValue() {
    return getValueByQName(REPRESENTED_PARTY, PARTY_CLASS);
  }

  public String getRepresentedPartyCodeValue() {
    return getValueByQName(REPRESENTED_PARTY, PARTY_CODE);
  }

  public String getValueByQName(QName... names) {
    XroadHeaderElement element = getByQName(names);
    return element == null ? null : element.getValue();
  }

  public XroadHeaderElement getByQName(QName... names) {
    return getByQName(this.children, names);
  }

  private XroadHeaderElement getByQName(List<XroadHeaderElement> elements, QName... names) {
    for (XroadHeaderElement element : elements) {
      if (names == null) {
        return element;
      }
      if (element.getQName().equals(names[0])) {
        if (element.getChildren() == null || element.getChildren().isEmpty() || names.length == 1) {
          return element;
        }
        return getByQName(element.getChildren(), Arrays.copyOfRange(names, 1, names.length));
      }
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XroadHeader that = (XroadHeader) o;
    return Objects.equals(getSource(), that.getSource()) &&
      Objects.equals(getChildren(), that.getChildren());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getSource(), getChildren());
  }

  @Override
  public String toString() {
    return "XroadHeader{" +
      "source=" + source +
      ", children=" + children +
      '}';
  }
}
