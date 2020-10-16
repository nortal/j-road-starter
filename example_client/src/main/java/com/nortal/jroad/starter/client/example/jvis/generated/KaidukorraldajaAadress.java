
package com.nortal.jroad.starter.client.example.jvis.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Kaidukorraldaja_Aadress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Kaidukorraldaja_Aadress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Asukoha_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Asukoha_nimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Postiindeks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TanavMajaKorter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kaidukorraldaja_Aadress", propOrder = {
    "asukohaKood",
    "asukohaNimetus",
    "postiindeks",
    "tanavMajaKorter"
})
public class KaidukorraldajaAadress {

    @XmlElement(name = "Asukoha_kood", required = true)
    protected String asukohaKood;
    @XmlElement(name = "Asukoha_nimetus", required = true)
    protected String asukohaNimetus;
    @XmlElement(name = "Postiindeks", required = true)
    protected String postiindeks;
    @XmlElement(name = "TanavMajaKorter", required = true)
    protected String tanavMajaKorter;

    /**
     * Gets the value of the asukohaKood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsukohaKood() {
        return asukohaKood;
    }

    /**
     * Sets the value of the asukohaKood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsukohaKood(String value) {
        this.asukohaKood = value;
    }

    /**
     * Gets the value of the asukohaNimetus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsukohaNimetus() {
        return asukohaNimetus;
    }

    /**
     * Sets the value of the asukohaNimetus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsukohaNimetus(String value) {
        this.asukohaNimetus = value;
    }

    /**
     * Gets the value of the postiindeks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostiindeks() {
        return postiindeks;
    }

    /**
     * Sets the value of the postiindeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostiindeks(String value) {
        this.postiindeks = value;
    }

    /**
     * Gets the value of the tanavMajaKorter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTanavMajaKorter() {
        return tanavMajaKorter;
    }

    /**
     * Sets the value of the tanavMajaKorter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTanavMajaKorter(String value) {
        this.tanavMajaKorter = value;
    }

}
