package com.nortal.jroad.starter.server;

import com.nortal.jroad.starter.server.model.XroadHeader;
import com.nortal.jroad.starter.server.model.XroadHeaderElement;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import java.util.Iterator;
import java.util.List;

public class XroadHeaderUtil {
  private XroadHeaderUtil() {
    // no instances
  }

  public static XroadHeader getXroadHeader(SOAPMessage message) throws SOAPException {
    SOAPHeader header = message.getSOAPHeader();
    XroadHeader xroadHeader = new XroadHeader(header);

    for (Iterator<? extends Node> headerElements = header.getChildElements(); headerElements.hasNext(); ) {
      Node headerElement = headerElements.next();
      if (!SoapUtil.isTextNode(headerElement) && headerElement.getFirstChild() != null) {
        parseNode(headerElement, xroadHeader.getChildren());
      }
    }

    return xroadHeader;
  }

  private static void parseNodeList(NodeList nodeList, List<XroadHeaderElement> elements) {
    for (int i = 0; i < nodeList.getLength(); i++) {
      Node currentNode = nodeList.item(i);
      if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
        parseNode(currentNode, elements);
      }
    }
  }

  private static void parseNode(Node node, List<XroadHeaderElement> elements) {
    QName qName = new QName(node.getNamespaceURI(), node.getLocalName());
    XroadHeaderElement element = new XroadHeaderElement(qName);
    element.setValue(getValue(node));
    elements.add(element);
    parseNodeList(node.getChildNodes(), element.getChildren());
  }

  private static String getValue(Node node) {
    for (int i = 0; i < node.getChildNodes().getLength(); i++) {
      Node child = node.getChildNodes().item(i);
      if (SoapUtil.isTextNode(child) && child.getNodeValue() != null && child.getNodeValue().trim().length() > 0) {
        return child.getNodeValue().trim();
      }
    }
    return null;
  }
}
