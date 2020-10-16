package com.nortal.jroad.starter.server.model;

import org.springframework.core.io.InputStreamSource;
import org.springframework.util.FileCopyUtils;

import javax.activation.DataHandler;
import javax.annotation.concurrent.Immutable;
import java.io.IOException;
import java.io.InputStream;

@Immutable
public class XroadAttachment implements InputStreamSource {
  private final String cid;
  private final DataHandler dataHandler;

  public XroadAttachment(String cid, String contentType, byte[] data) {
    this.cid = cid;
    this.dataHandler = new DataHandler(new ByteArrayDataSource(contentType, data));
  }

  public XroadAttachment(String cid, DataHandler dataHandler) {
    this.cid = cid;
    this.dataHandler = dataHandler;
  }

  public String getCid() {
    return cid;
  }

  public DataHandler getDataHandler() {
    return dataHandler;
  }

  @Override
  public InputStream getInputStream() throws IOException {
    return dataHandler.getInputStream();
  }

  public byte[] getData() throws IOException {
    return FileCopyUtils.copyToByteArray(dataHandler.getInputStream());
  }

  @Override
  public String toString() {
    return "cid:" + cid;
  }
}
