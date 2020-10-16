
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isikukood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eesnimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="perenimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="synniaeg" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="pilt" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="allkiri" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="taotlemisePohjus" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
@XmlRootElement(name = "vedurijuhiloaTaotlusParing")
public class VedurijuhiloaTaotlusParing {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String isikukood;
    @XmlElement(required = true)
    protected String eesnimi;
    @XmlElement(required = true)
    protected String perenimi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar synniaeg;
    @XmlElement(required = true)
    protected byte[] pilt;
    @XmlElement(required = true)
    protected byte[] allkiri;
    @XmlElement(required = true)
    protected BigInteger taotlemisePohjus;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the eesnimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEesnimi() {
        return eesnimi;
    }

    /**
     * Sets the value of the eesnimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEesnimi(String value) {
        this.eesnimi = value;
    }

    /**
     * Gets the value of the perenimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerenimi() {
        return perenimi;
    }

    /**
     * Sets the value of the perenimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerenimi(String value) {
        this.perenimi = value;
    }

    /**
     * Gets the value of the synniaeg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSynniaeg() {
        return synniaeg;
    }

    /**
     * Sets the value of the synniaeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSynniaeg(XMLGregorianCalendar value) {
        this.synniaeg = value;
    }

    /**
     * Gets the value of the pilt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPilt() {
        return pilt;
    }

    /**
     * Sets the value of the pilt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPilt(byte[] value) {
        this.pilt = value;
    }

    /**
     * Gets the value of the allkiri property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAllkiri() {
        return allkiri;
    }

    /**
     * Sets the value of the allkiri property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAllkiri(byte[] value) {
        this.allkiri = value;
    }

    /**
     * Gets the value of the taotlemisePohjus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTaotlemisePohjus() {
        return taotlemisePohjus;
    }

    /**
     * Sets the value of the taotlemisePohjus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTaotlemisePohjus(BigInteger value) {
        this.taotlemisePohjus = value;
    }

}
