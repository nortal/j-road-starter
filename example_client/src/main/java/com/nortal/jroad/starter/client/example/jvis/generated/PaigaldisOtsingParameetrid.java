
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
 *         &lt;element name="paigaldis_liik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="omanik_nimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="omanik_kood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valdaja_nimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valdaja_kood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paigaldis_aadress_tanav" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paigaldis_aadress_maja_korter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paigaldis_aadress_indeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paigaldis_aadress_asula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paigaldis_regnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paigaldis_muudetud_alates" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="paigaldis_muudetud_kuni" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="paigaldis_staatus" type="{http://jvisv6.x-road.eu/producer}p_staatus" minOccurs="0"/&gt;
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
@XmlRootElement(name = "paigaldis_otsing_parameetrid")
public class PaigaldisOtsingParameetrid {

    @XmlElement(name = "paigaldis_liik")
    protected String paigaldisLiik;
    @XmlElement(name = "omanik_nimi")
    protected String omanikNimi;
    @XmlElement(name = "omanik_kood")
    protected String omanikKood;
    @XmlElement(name = "valdaja_nimi")
    protected String valdajaNimi;
    @XmlElement(name = "valdaja_kood")
    protected String valdajaKood;
    @XmlElement(name = "paigaldis_aadress_tanav")
    protected String paigaldisAadressTanav;
    @XmlElement(name = "paigaldis_aadress_maja_korter")
    protected String paigaldisAadressMajaKorter;
    @XmlElement(name = "paigaldis_aadress_indeks")
    protected String paigaldisAadressIndeks;
    @XmlElement(name = "paigaldis_aadress_asula")
    protected String paigaldisAadressAsula;
    @XmlElement(name = "paigaldis_regnr")
    protected String paigaldisRegnr;
    @XmlElement(name = "paigaldis_muudetud_alates")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paigaldisMuudetudAlates;
    @XmlElement(name = "paigaldis_muudetud_kuni")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paigaldisMuudetudKuni;
    @XmlElement(name = "paigaldis_staatus")
    protected BigInteger paigaldisStaatus;
    @XmlElement(defaultValue = "25")
    protected BigInteger kirjetearv;

    /**
     * Gets the value of the paigaldisLiik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaigaldisLiik() {
        return paigaldisLiik;
    }

    /**
     * Sets the value of the paigaldisLiik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaigaldisLiik(String value) {
        this.paigaldisLiik = value;
    }

    /**
     * Gets the value of the omanikNimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmanikNimi() {
        return omanikNimi;
    }

    /**
     * Sets the value of the omanikNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmanikNimi(String value) {
        this.omanikNimi = value;
    }

    /**
     * Gets the value of the omanikKood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmanikKood() {
        return omanikKood;
    }

    /**
     * Sets the value of the omanikKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmanikKood(String value) {
        this.omanikKood = value;
    }

    /**
     * Gets the value of the valdajaNimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValdajaNimi() {
        return valdajaNimi;
    }

    /**
     * Sets the value of the valdajaNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValdajaNimi(String value) {
        this.valdajaNimi = value;
    }

    /**
     * Gets the value of the valdajaKood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValdajaKood() {
        return valdajaKood;
    }

    /**
     * Sets the value of the valdajaKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValdajaKood(String value) {
        this.valdajaKood = value;
    }

    /**
     * Gets the value of the paigaldisAadressTanav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaigaldisAadressTanav() {
        return paigaldisAadressTanav;
    }

    /**
     * Sets the value of the paigaldisAadressTanav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaigaldisAadressTanav(String value) {
        this.paigaldisAadressTanav = value;
    }

    /**
     * Gets the value of the paigaldisAadressMajaKorter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaigaldisAadressMajaKorter() {
        return paigaldisAadressMajaKorter;
    }

    /**
     * Sets the value of the paigaldisAadressMajaKorter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaigaldisAadressMajaKorter(String value) {
        this.paigaldisAadressMajaKorter = value;
    }

    /**
     * Gets the value of the paigaldisAadressIndeks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaigaldisAadressIndeks() {
        return paigaldisAadressIndeks;
    }

    /**
     * Sets the value of the paigaldisAadressIndeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaigaldisAadressIndeks(String value) {
        this.paigaldisAadressIndeks = value;
    }

    /**
     * Gets the value of the paigaldisAadressAsula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaigaldisAadressAsula() {
        return paigaldisAadressAsula;
    }

    /**
     * Sets the value of the paigaldisAadressAsula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaigaldisAadressAsula(String value) {
        this.paigaldisAadressAsula = value;
    }

    /**
     * Gets the value of the paigaldisRegnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaigaldisRegnr() {
        return paigaldisRegnr;
    }

    /**
     * Sets the value of the paigaldisRegnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaigaldisRegnr(String value) {
        this.paigaldisRegnr = value;
    }

    /**
     * Gets the value of the paigaldisMuudetudAlates property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaigaldisMuudetudAlates() {
        return paigaldisMuudetudAlates;
    }

    /**
     * Sets the value of the paigaldisMuudetudAlates property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaigaldisMuudetudAlates(XMLGregorianCalendar value) {
        this.paigaldisMuudetudAlates = value;
    }

    /**
     * Gets the value of the paigaldisMuudetudKuni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaigaldisMuudetudKuni() {
        return paigaldisMuudetudKuni;
    }

    /**
     * Sets the value of the paigaldisMuudetudKuni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaigaldisMuudetudKuni(XMLGregorianCalendar value) {
        this.paigaldisMuudetudKuni = value;
    }

    /**
     * Gets the value of the paigaldisStaatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaigaldisStaatus() {
        return paigaldisStaatus;
    }

    /**
     * Sets the value of the paigaldisStaatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaigaldisStaatus(BigInteger value) {
        this.paigaldisStaatus = value;
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
