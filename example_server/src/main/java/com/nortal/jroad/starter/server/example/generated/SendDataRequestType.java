
package com.nortal.jroad.starter.server.example.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendDataRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendDataRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="items" type="{http://server-example.x-road.eu}SendDataRequestItems"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendDataRequestType", propOrder = {
    "items"
})
public class SendDataRequestType {

    @XmlElement(required = true)
    protected SendDataRequestItems items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link SendDataRequestItems }
     *     
     */
    public SendDataRequestItems getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendDataRequestItems }
     *     
     */
    public void setItems(SendDataRequestItems value) {
        this.items = value;
    }

}
