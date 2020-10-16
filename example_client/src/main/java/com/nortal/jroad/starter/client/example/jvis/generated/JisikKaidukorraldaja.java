
package com.nortal.jroad.starter.client.example.jvis.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Jisik_Kaidukorraldaja complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Jisik_Kaidukorraldaja"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Registrikood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Omandivorm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KaidukorraldajaAadress" type="{http://jvisv6.x-road.eu/producer}Kaidukorraldaja_Aadress"/&gt;
 *         &lt;element name="KontaktTelefon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KontaktFaks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Veebiaadress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KontaktEpost" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FisikKaidukorraldaja" type="{http://jvisv6.x-road.eu/producer}Fisik_Kaidukorraldaja" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Jisik_Kaidukorraldaja", propOrder = {
    "registrikood",
    "nimi",
    "omandivorm",
    "kaidukorraldajaAadress",
    "kontaktTelefon",
    "kontaktFaks",
    "veebiaadress",
    "kontaktEpost",
    "fisikKaidukorraldaja"
})
public class JisikKaidukorraldaja {

    @XmlElement(name = "Registrikood", required = true)
    protected String registrikood;
    @XmlElement(name = "Nimi", required = true)
    protected String nimi;
    @XmlElement(name = "Omandivorm", required = true)
    protected String omandivorm;
    @XmlElement(name = "KaidukorraldajaAadress", required = true)
    protected KaidukorraldajaAadress kaidukorraldajaAadress;
    @XmlElement(name = "KontaktTelefon", required = true)
    protected String kontaktTelefon;
    @XmlElement(name = "KontaktFaks", required = true)
    protected String kontaktFaks;
    @XmlElement(name = "Veebiaadress")
    protected String veebiaadress;
    @XmlElement(name = "KontaktEpost", required = true)
    protected String kontaktEpost;
    @XmlElement(name = "FisikKaidukorraldaja", required = true)
    protected List<FisikKaidukorraldaja> fisikKaidukorraldaja;

    /**
     * Gets the value of the registrikood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrikood() {
        return registrikood;
    }

    /**
     * Sets the value of the registrikood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrikood(String value) {
        this.registrikood = value;
    }

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
     * Gets the value of the omandivorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmandivorm() {
        return omandivorm;
    }

    /**
     * Sets the value of the omandivorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmandivorm(String value) {
        this.omandivorm = value;
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
     * Gets the value of the veebiaadress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeebiaadress() {
        return veebiaadress;
    }

    /**
     * Sets the value of the veebiaadress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeebiaadress(String value) {
        this.veebiaadress = value;
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

    /**
     * Gets the value of the fisikKaidukorraldaja property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fisikKaidukorraldaja property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFisikKaidukorraldaja().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FisikKaidukorraldaja }
     * 
     * 
     */
    public List<FisikKaidukorraldaja> getFisikKaidukorraldaja() {
        if (fisikKaidukorraldaja == null) {
            fisikKaidukorraldaja = new ArrayList<FisikKaidukorraldaja>();
        }
        return this.fisikKaidukorraldaja;
    }

}
