package com.nortal.jroad.starter.server;

import com.nortal.jroad.starter.server.model.XroadAttachment;

import javax.activation.DataHandler;
import javax.xml.bind.attachment.AttachmentMarshaller;
import java.util.List;
import java.util.UUID;

public class XroadAttachmentMarshaller extends AttachmentMarshaller {
  private final List<XroadAttachment> attachments;

  public XroadAttachmentMarshaller(final List<XroadAttachment> attachments) {
    super();
    this.attachments = attachments;
  }

  @Override
  public String addMtomAttachment(byte[] data,
                                  int offset,
                                  int length,
                                  String mimeType,
                                  String elementNamespace,
                                  String elementLocalName) {
    throw new UnsupportedOperationException("MTOM Support is disabled!");
  }

  @Override
  public String addMtomAttachment(DataHandler data, String elementNamespace, String elementLocalName) {
    throw new UnsupportedOperationException("MTOM Support is disabled!");
  }

  @Override
  public String addSwaRefAttachment(DataHandler data) {
    String contentId = UUID.randomUUID().toString();
    attachments.add(new XroadAttachment(contentId, data));
    return "cid:" + contentId;
  }

  @Override
  public boolean isXOPPackage() {
    return false;
  }
}
