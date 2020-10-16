package com.nortal.jroad.starter.server.model;

import javax.activation.DataSource;
import javax.annotation.concurrent.Immutable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

@Immutable
public class ByteArrayDataSource implements DataSource {
  private final String contentType;
  private final byte[] data;

  public ByteArrayDataSource(String contentType, byte[] data) {
    this.contentType = contentType;
    this.data = data;
  }

  @Override
  public InputStream getInputStream() {
    return new ByteArrayInputStream(data);
  }

  @Override
  public OutputStream getOutputStream() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getContentType() {
    return contentType;
  }

  @Override
  public String getName() {
    return "ByteArrayDataSource";
  }
}
