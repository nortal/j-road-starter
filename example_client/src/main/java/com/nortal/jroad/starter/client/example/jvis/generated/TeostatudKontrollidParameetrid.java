
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
 *       &lt;choice&gt;
 *         &lt;element name="EE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Hetk" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eeid",
    "hetk"
})
@XmlRootElement(name = "teostatud_kontrollid_parameetrid")
public class TeostatudKontrollidParameetrid {

    @XmlElement(name = "EE_ID")
    protected BigInteger eeid;
    @XmlElement(name = "Hetk")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hetk;

    /**
     * Gets the value of the eeid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEEID() {
        return eeid;
    }

    /**
     * Sets the value of the eeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEEID(BigInteger value) {
        this.eeid = value;
    }

    /**
     * Gets the value of the hetk property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHetk() {
        return hetk;
    }

    /**
     * Sets the value of the hetk property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHetk(XMLGregorianCalendar value) {
        this.hetk = value;
    }

}
