
package com.nortal.jroad.starter.client.example.jvis.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Koolitus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Koolitus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="koolitusasutus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tunnistuseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tunnistuseKuupaev" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Koolitus", propOrder = {
    "koolitusasutus",
    "tunnistuseNumber",
    "tunnistuseKuupaev"
})
public class Koolitus {

    @XmlElement(required = true)
    protected String koolitusasutus;
    @XmlElement(required = true)
    protected String tunnistuseNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tunnistuseKuupaev;

    /**
     * Gets the value of the koolitusasutus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoolitusasutus() {
        return koolitusasutus;
    }

    /**
     * Sets the value of the koolitusasutus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoolitusasutus(String value) {
        this.koolitusasutus = value;
    }

    /**
     * Gets the value of the tunnistuseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunnistuseNumber() {
        return tunnistuseNumber;
    }

    /**
     * Sets the value of the tunnistuseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunnistuseNumber(String value) {
        this.tunnistuseNumber = value;
    }

    /**
     * Gets the value of the tunnistuseKuupaev property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTunnistuseKuupaev() {
        return tunnistuseKuupaev;
    }

    /**
     * Sets the value of the tunnistuseKuupaev property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTunnistuseKuupaev(XMLGregorianCalendar value) {
        this.tunnistuseKuupaev = value;
    }

}
