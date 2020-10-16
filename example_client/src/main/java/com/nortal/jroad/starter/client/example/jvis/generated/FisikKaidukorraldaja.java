
package com.nortal.jroad.starter.client.example.jvis.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Fisik_Kaidukorraldaja complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fisik_Kaidukorraldaja"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Isikukood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Synniaeg" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Eesnimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Perenimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KaidukorraldajaAadress" type="{http://jvisv6.x-road.eu/producer}Kaidukorraldaja_Aadress" minOccurs="0"/&gt;
 *         &lt;element name="KontaktTelefon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KontaktFaks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KontaktEpost" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fisik_Kaidukorraldaja", propOrder = {
    "isikukood",
    "synniaeg",
    "eesnimi",
    "perenimi",
    "kaidukorraldajaAadress",
    "kontaktTelefon",
    "kontaktFaks",
    "kontaktEpost"
})
public class FisikKaidukorraldaja {

    @XmlElement(name = "Isikukood")
    protected String isikukood;
    @XmlElement(name = "Synniaeg")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar synniaeg;
    @XmlElement(name = "Eesnimi", required = true)
    protected String eesnimi;
    @XmlElement(name = "Perenimi", required = true)
    protected String perenimi;
    @XmlElement(name = "KaidukorraldajaAadress")
    protected KaidukorraldajaAadress kaidukorraldajaAadress;
    @XmlElement(name = "KontaktTelefon", required = true)
    protected String kontaktTelefon;
    @XmlElement(name = "KontaktFaks", required = true)
    protected String kontaktFaks;
    @XmlElement(name = "KontaktEpost", required = true)
    protected String kontaktEpost;

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
     * Gets the value of the kaidukorraldajaAadress property.
     * 
     * @return
     *     possible object is
     *     {@link KaidukorraldajaAadress }
     *     
     */
    public KaidukorraldajaAadress getKaidukorraldajaAadress() {
        return kaidukorraldajaAadress;
    }

    /**
     * Sets the value of the kaidukorraldajaAadress property.
     * 
     * @param value
     *     allowed object is
     *     {@link KaidukorraldajaAadress }
     *     
     */
    public void setKaidukorraldajaAadress(KaidukorraldajaAadress value) {
        this.kaidukorraldajaAadress = value;
    }

    /**
     * Gets the value of the kontaktTelefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontaktTelefon() {
        return kontaktTelefon;
    }

    /**
     * Sets the value of the kontaktTelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontaktTelefon(String value) {
        this.kontaktTelefon = value;
    }

    /**
     * Gets the value of the kontaktFaks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontaktFaks() {
        return kontaktFaks;
    }

    /**
     * Sets the value of the kontaktFaks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontaktFaks(String value) {
        this.kontaktFaks = value;
    }

    /**
     * Gets the value of the kontaktEpost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontaktEpost() {
        return kontaktEpost;
    }

    /**
     * Sets the value of the kontaktEpost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontaktEpost(String value) {
        this.kontaktEpost = value;
    }

}
