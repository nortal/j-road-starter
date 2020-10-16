package com.nortal.jroad.starter.server;

import javax.xml.namespace.QName;

public class XroadV4Constant {
  public static final String SERVICE_VERSION__V1 = "v1";

  public static final String NS_XRD_URI = "http://x-road.eu/xsd/xroad.xsd";
  public static final String NS_IDEN_URI = "http://x-road.eu/xsd/identifiers";
  public static final String NS_REP_URI = "http://x-road.eu/xsd/representation.xsd";

  public static final String HEADER__CLIENT = "client";
  public static final QName CLIENT = new QName(NS_XRD_URI, HEADER__CLIENT);

  public static final String HEADER__SERVICE = "service";
  public static final QName SERVICE = new QName(NS_XRD_URI, HEADER__SERVICE);

  public static final String HEADER__REPRESENTED_PARTY = "representedParty";
  public static final QName REPRESENTED_PARTY = new QName(NS_REP_URI, HEADER__REPRESENTED_PARTY);

  public static final String HEADER__X_ROAD_INSTANCE = "xRoadInstance";
  public static final QName X_ROAD_INSTANCE = new QName(NS_IDEN_URI, HEADER__X_ROAD_INSTANCE);
  public static final String HEADER__MEMBER_CLASS = "memberClass";
  public static final QName MEMBER_CLASS = new QName(NS_IDEN_URI, HEADER__MEMBER_CLASS);
  public static final String HEADER__MEMBER_CODE = "memberCode";
  public static final QName MEMBER_CODE = new QName(NS_IDEN_URI, HEADER__MEMBER_CODE);
  public static final String HEADER__USER_ID = "userId";
  public static final QName USER_ID = new QName(NS_IDEN_URI, HEADER__USER_ID);
  public static final String HEADER__SUBSYSTEM_CODE = "subsystemCode";
  public static final QName SUBSYSTEM_CODE = new QName(NS_IDEN_URI, HEADER__SUBSYSTEM_CODE);
  public static final String HEADER__SERVICE_CODE = "serviceCode";
  public static final QName SERVICE_CODE = new QName(NS_IDEN_URI, HEADER__SERVICE_CODE);
  public static final String HEADER__SERVICE_VERSION = "serviceVersion";
  public static final QName SERVICE_VERSION = new QName(NS_IDEN_URI, HEADER__SERVICE_VERSION);
  public static final String HEADER__PARTY_CLASS = "partyClass";
  public static final QName PARTY_CLASS = new QName(NS_REP_URI, HEADER__PARTY_CLASS);
  public static final String HEADER__PARTY_CODE = "partyCode";
  public static final QName PARTY_CODE = new QName(NS_REP_URI, HEADER__PARTY_CODE);
}
