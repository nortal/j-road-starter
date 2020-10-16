package com.nortal.jroad.starter.server;

import com.nortal.jroad.starter.server.model.XroadAttachment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.activation.DataHandler;
import javax.xml.bind.attachment.AttachmentUnmarshaller;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XroadAttachmentUnmarshaller extends AttachmentUnmarshaller {
  private static final Logger LOGGER = LoggerFactory.getLogger(XroadAttachmentUnmarshaller.class);
  private final Map<String, XroadAttachment> attachments = new HashMap<>();

  public XroadAttachmentUnmarshaller(final List<XroadAttachment> attachments) {
    super();
    attachments.forEach(attachment -> this.attachments.put(attachment.getCid(), attachment));
  }

  private XroadAttachment getAttachment(String contentId) {
    if (contentId.startsWith("cid:")) {
      contentId = contentId.substring("cid:".length());
      try {
        contentId = URLDecoder.decode(contentId, "UTF-8");
      } catch (UnsupportedEncodingException e) {
        LOGGER.error(String.format("Failed to decode contentId (%s) - not UTF-8!", contentId), e);
        contentId = "UNDEFINED__UTF8_DECODE_FAILED";
      }
      contentId = '<' + contentId + '>';
    }
    return attachments.get(contentId);
  }

  @Override
  public byte[] getAttachmentAsByteArray(String contentId) {
    try {
      return getAttachment(contentId).getData();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public DataHandler getAttachmentAsDataHandler(String cid) {
    return getAttachment(cid).getDataHandler();
  }

  @Override
  public boolean isXOPPackage() {
    return false;
  }
}
