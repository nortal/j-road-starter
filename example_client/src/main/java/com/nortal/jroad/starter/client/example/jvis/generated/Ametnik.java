
package com.nortal.jroad.starter.client.example.jvis.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ametnik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ametnik"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Eesnimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Perenimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Isikukood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mobiiltelefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Epost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Asutus_nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Asutus_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ametnik", propOrder = {
    "eesnimi",
    "perenimi",
    "isikukood",
    "telefon",
    "mobiiltelefon",
    "epost",
    "asutusNimi",
    "asutusKood"
})
public class Ametnik {

    @XmlElement(name = "Eesnimi")
    protected String eesnimi;
    @XmlElement(name = "Perenimi", required = true)
    protected String perenimi;
    @XmlElement(name = "Isikukood")
    protected String isikukood;
    @XmlElement(name = "Telefon")
    protected String telefon;
    @XmlElement(name = "Mobiiltelefon")
    protected String mobiiltelefon;
    @XmlElement(name = "Epost")
    protected String epost;
    @XmlElement(name = "Asutus_nimi", required = true)
    protected String asutusNimi;
    @XmlElement(name = "Asutus_kood", required = true)
    protected String asutusKood;

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
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the mobiiltelefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobiiltelefon() {
        return mobiiltelefon;
    }

    /**
     * Sets the value of the mobiiltelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobiiltelefon(String value) {
        this.mobiiltelefon = value;
    }

    /**
     * Gets the value of the epost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpost() {
        return epost;
    }

    /**
     * Sets the value of the epost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpost(String value) {
        this.epost = value;
    }

    /**
     * Gets the value of the asutusNimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsutusNimi() {
        return asutusNimi;
    }

    /**
     * Sets the value of the asutusNimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsutusNimi(String value) {
        this.asutusNimi = value;
    }

    /**
     * Gets the value of the asutusKood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsutusKood() {
        return asutusKood;
    }

    /**
     * Sets the value of the asutusKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsutusKood(String value) {
        this.asutusKood = value;
    }

}
