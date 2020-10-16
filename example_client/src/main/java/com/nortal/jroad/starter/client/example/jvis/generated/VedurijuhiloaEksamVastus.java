
package com.nortal.jroad.starter.client.example.jvis.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vastuskood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vastuskood"
})
@XmlRootElement(name = "vedurijuhiloaEksamVastus")
public class VedurijuhiloaEksamVastus {

    @XmlElement(required = true)
    protected String vastuskood;

    /**
     * Gets the value of the vastuskood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVastuskood() {
        return vastuskood;
    }

    /**
     * Sets the value of the vastuskood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVastuskood(String value) {
        this.vastuskood = value;
    }

}
