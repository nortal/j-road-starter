
package com.nortal.jroad.starter.client.example.jvis.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for padevustunnistusega_isik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="padevustunnistusega_isik"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isikukood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="padevustunnistused" type="{http://jvisv6.x-road.eu/producer}padevustunnistused"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "padevustunnistusega_isik", propOrder = {
    "nimi",
    "isikukood",
    "padevustunnistused"
})
public class PadevustunnistusegaIsik {

    @XmlElement(required = true)
    protected String nimi;
    @XmlElement(required = true)
    protected String isikukood;
    @XmlElement(required = true)
    protected Padevustunnistused padevustunnistused;

    /**
     * Gets the value of the nimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * Sets the value of the nimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNimi(String value) {
        this.nimi = value;
    }

    /**
     * Gets the value of the isikukood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsikukood() {
        return isikukood;
    }

    /**
     * Sets the value of the isikukood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsikukood(String value) {
        this.isikukood = value;
    }

    /**
     * Gets the value of the padevustunnistused property.
     * 
     * @return
     *     possible object is
     *     {@link Padevustunnistused }
     *     
     */
    public Padevustunnistused getPadevustunnistused() {
        return padevustunnistused;
    }

    /**
     * Sets the value of the padevustunnistused property.
     * 
     * @param value
     *     allowed object is
     *     {@link Padevustunnistused }
     *     
     */
    public void setPadevustunnistused(Padevustunnistused value) {
        this.padevustunnistused = value;
    }

}
