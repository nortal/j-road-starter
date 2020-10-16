package com.nortal.jroad.starter.server.model;

import javax.xml.soap.SOAPMessage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class XroadMessage<T> implements Serializable {
  private static final long serialVersionUID = 1390637410783154913L;

  private final SOAPMessage source;
  private final List<XroadAttachment> attachments = new ArrayList<>();
  private XroadHeader header;
  private T content;

  public XroadMessage(SOAPMessage source) {
    this.source = source;
  }

  public SOAPMessage getSource() {
    return source;
  }

  public XroadHeader getHeader() {
    return header;
  }

  public void setHeader(XroadHeader header) {
    this.header = header;
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public List<XroadAttachment> getAttachments() {
    return attachments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XroadMessage<?> that = (XroadMessage<?>) o;
    return Objects.equals(getSource(), that.getSource()) &&
      Objects.equals(getAttachments(), that.getAttachments()) &&
      Objects.equals(getHeader(), that.getHeader()) &&
      Objects.equals(getContent(), that.getContent());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getSource(), getAttachments(), getHeader(), getContent());
  }

  @Override
  public String toString() {
    return "XroadMessage{" +
      "source=" + source +
      ", attachments=" + attachments +
      ", header=" + header +
      ", content=" + content +
      '}';
  }
}
