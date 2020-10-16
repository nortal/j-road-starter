package com.nortal.jroad.starter.server;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SoapUtil {

  private SoapUtil() {
    // no instances
  }

  public static Node getFirstNonTextChild(Node root) {
    Node resultNode = null;
    NodeList nodeList = root.getChildNodes();
    for (int i = 0; i < nodeList.getLength(); i++) {
      if (!isTextNode(nodeList.item(i))) {
        resultNode = nodeList.item(i);
        break;
      }
    }
    return resultNode;
  }

  public static boolean isTextNode(Node node) {
    return node != null && Node.TEXT_NODE == node.getNodeType();
  }

  public static String getNsElementValue(Element root, String name, String namespace) {
    return getTextContent(getNsElement(root, name, namespace));
  }

  public static Element getNsElement(Element root, String name, String namespace) {
    NodeList nodeList = getNsElements(root, name, namespace);
    return nodeList == null || nodeList.getLength() != 1 ? null : (Element) nodeList.item(0);
  }

  public static NodeList getNsElements(Element root, String name, String ns) {
    return root == null ? null : root.getElementsByTagNameNS(ns, name);
  }

  public static String getTextContent(Node node) {
    if (node == null) {
      return null;
    }

    NodeList nodeList = node.getChildNodes();
    for (int i = 0; i < nodeList.getLength(); i++) {
      Node childNode = nodeList.item(i);
      if (isTextNode(childNode)) {
        return childNode.getNodeValue();
      }
    }
    return null;
  }
}
