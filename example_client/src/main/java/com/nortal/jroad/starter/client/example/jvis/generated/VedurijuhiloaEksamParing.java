
package com.nortal.jroad.starter.client.example.jvis.generated;

import java.math.BigInteger;
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
 *         &lt;element name="sooritatud" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="kuupaev" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
@XmlRootElement(name = "vedurijuhiloaEksamParing")
public class VedurijuhiloaEksamParing {

    @XmlElement(required = true)
    protected String isikukood;
    @XmlElement(required = true)
    protected BigInteger sooritatud;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kuupaev;

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
     * Gets the value of the sooritatud property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSooritatud() {
        return sooritatud;
    }

    /**
     * Sets the value of the sooritatud property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSooritatud(BigInteger value) {
        this.sooritatud = value;
    }

    /**
     * Gets the value of the kuupaev property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKuupaev() {
        return kuupaev;
    }

    /**
     * Sets the value of the kuupaev property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKuupaev(XMLGregorianCalendar value) {
        this.kuupaev = value;
    }

}
