package com.nortal.jroad.starter.server.model;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class XroadHeaderElement {
  private final QName qName;
  private String value;
  private final List<XroadHeaderElement> children = new ArrayList<>();

  public XroadHeaderElement(QName qName) {
    this.qName = qName;
  }

  public QName getQName() {
    return qName;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public List<XroadHeaderElement> getChildren() {
    return children;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XroadHeaderElement that = (XroadHeaderElement) o;
    return Objects.equals(getQName(), that.getQName()) &&
      Objects.equals(getValue(), that.getValue()) &&
      Objects.equals(getChildren(), that.getChildren());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getQName(), getValue(), getChildren());
  }

  @Override
  public String toString() {
    return "XroadHeaderElement{" +
      "qName=" + qName +
      ", value='" + value + '\'' +
      ", children=" + children +
      '}';
  }
}
