package com.nortal.jroad.starter.server.example.bindings;

import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

public final class BindingUtil {

  private BindingUtil() {
    // utility class
  }

  @Nullable
  public static XMLGregorianCalendar toXmlGregorianCalendar(@Nullable String value) {
    try {
      return StringUtils.isEmpty(value) ? null : DatatypeFactory.newInstance().newXMLGregorianCalendar(value);
    } catch (DatatypeConfigurationException | IllegalArgumentException e) {
      return null;
    }
  }

  @Nullable
  public static XMLGregorianCalendar toXmlGregorianCalendarWithTime(@Nullable String value) {
    if (StringUtils.isEmpty(value)) {
      return null;
    }

    try {
      OffsetDateTime.parse(value);
    } catch (DateTimeParseException e1) {
      try {
        LocalDateTime.parse(value);
      } catch (DateTimeParseException e2) {
        return null;
      }
    }

    return toXmlGregorianCalendar(value);
  }

  @Nullable
  public static BigDecimal toBigDecimal(@Nullable String value) {
    try {
      return StringUtils.isEmpty(value) ? null : new BigDecimal(value);
    } catch (NumberFormatException e) {
      return null;
    }
  }
}
