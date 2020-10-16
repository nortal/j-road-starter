
package com.nortal.jroad.starter.client.example.jvis.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="isikukood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="loaNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="katteandmiseKuupaev" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "vedurijuhiloaKatteandmineParing")
public class VedurijuhiloaKatteandmineParing {

    @XmlElement(required = true)
    protected String isikukood;
    @XmlElement(required = true)
    protected String loaNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar katteandmiseKuupaev;

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
     * Gets the value of the loaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoaNumber() {
        return loaNumber;
    }

    /**
     * Sets the value of the loaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoaNumber(String value) {
        this.loaNumber = value;
    }

    /**
     * Gets the value of the katteandmiseKuupaev property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKatteandmiseKuupaev() {
        return katteandmiseKuupaev;
    }

    /**
     * Sets the value of the katteandmiseKuupaev property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKatteandmiseKuupaev(XMLGregorianCalendar value) {
        this.katteandmiseKuupaev = value;
    }

}
