
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
 *         &lt;element name="saanud_isik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="saanud_isik_kood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mtr_reg_nr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="teinud_isik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rikkumine_viide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tegemise_kp_alates" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="tegemise_kp_kuni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="rea_taitmise_kp_alates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rea_taitmise_kp_kuni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mtr_reg_olemas" type="{http://jvisv6.x-road.eu/producer}ainult_nendega" minOccurs="0"/&gt;
 *         &lt;element name="kirjetearv" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlRootElement(name = "ettekirjutused_search")
public class EttekirjutusedSearch {

    @XmlElement(name = "saanud_isik")
    protected String saanudIsik;
    @XmlElement(name = "saanud_isik_kood")
    protected String saanudIsikKood;
    @XmlElement(name = "mtr_reg_nr")
    protected String mtrRegNr;
    protected String number;
    @XmlElement(name = "teinud_isik")
    protected String teinudIsik;
    @XmlElement(name = "rikkumine_viide")
    protected String rikkumineViide;
    @XmlElement(name = "tegemise_kp_alates")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tegemiseKpAlates;
    @XmlElement(name = "tegemise_kp_kuni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tegemiseKpKuni;
    @XmlElement(name = "rea_taitmise_kp_alates")
    protected String reaTaitmiseKpAlates;
    @XmlElement(name = "rea_taitmise_kp_kuni")
    protected String reaTaitmiseKpKuni;
    @XmlElement(name = "mtr_reg_olemas", defaultValue = "0")
    protected BigInteger mtrRegOlemas;
    @XmlElement(defaultValue = "25")
    protected BigInteger kirjetearv;

    /**
     * Gets the value of the saanudIsik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaanudIsik() {
        return saanudIsik;
    }

    /**
     * Sets the value of the saanudIsik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaanudIsik(String value) {
        this.saanudIsik = value;
    }

    /**
     * Gets the value of the saanudIsikKood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaanudIsikKood() {
        return saanudIsikKood;
    }

    /**
     * Sets the value of the saanudIsikKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaanudIsikKood(String value) {
        this.saanudIsikKood = value;
    }

    /**
     * Gets the value of the mtrRegNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtrRegNr() {
        return mtrRegNr;
    }

    /**
     * Sets the value of the mtrRegNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtrRegNr(String value) {
        this.mtrRegNr = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the teinudIsik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeinudIsik() {
        return teinudIsik;
    }

    /**
     * Sets the value of the teinudIsik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeinudIsik(String value) {
        this.teinudIsik = value;
    }

    /**
     * Gets the value of the rikkumineViide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRikkumineViide() {
        return rikkumineViide;
    }

    /**
     * Sets the value of the rikkumineViide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRikkumineViide(String value) {
        this.rikkumineViide = value;
    }

    /**
     * Gets the value of the tegemiseKpAlates property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTegemiseKpAlates() {
        return tegemiseKpAlates;
    }

    /**
     * Sets the value of the tegemiseKpAlates property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTegemiseKpAlates(XMLGregorianCalendar value) {
        this.tegemiseKpAlates = value;
    }

    /**
     * Gets the value of the tegemiseKpKuni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTegemiseKpKuni() {
        return tegemiseKpKuni;
    }

    /**
     * Sets the value of the tegemiseKpKuni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTegemiseKpKuni(XMLGregorianCalendar value) {
        this.tegemiseKpKuni = value;
    }

    /**
     * Gets the value of the reaTaitmiseKpAlates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReaTaitmiseKpAlates() {
        return reaTaitmiseKpAlates;
    }

    /**
     * Sets the value of the reaTaitmiseKpAlates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReaTaitmiseKpAlates(String value) {
        this.reaTaitmiseKpAlates = value;
    }

    /**
     * Gets the value of the reaTaitmiseKpKuni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReaTaitmiseKpKuni() {
        return reaTaitmiseKpKuni;
    }

    /**
     * Sets the value of the reaTaitmiseKpKuni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReaTaitmiseKpKuni(String value) {
        this.reaTaitmiseKpKuni = value;
    }

    /**
     * Gets the value of the mtrRegOlemas property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMtrRegOlemas() {
        return mtrRegOlemas;
    }

    /**
     * Sets the value of the mtrRegOlemas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMtrRegOlemas(BigInteger value) {
        this.mtrRegOlemas = value;
    }

    /**
     * Gets the value of the kirjetearv property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKirjetearv() {
        return kirjetearv;
    }

    /**
     * Sets the value of the kirjetearv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKirjetearv(BigInteger value) {
        this.kirjetearv = value;
    }

}
