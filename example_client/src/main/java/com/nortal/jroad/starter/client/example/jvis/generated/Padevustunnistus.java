
package com.nortal.jroad.starter.client.example.jvis.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for padevustunnistus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="padevustunnistus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="padevustunnistus_nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="padevusulatused"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="padevusulatus" type="{http://jvisv6.x-road.eu/producer}padevusulatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="valjastaja_registrikood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valjaandmiskoht" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valjastamise_kuupaev" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="kehtivuse_lopp" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "padevustunnistus", propOrder = {
    "padevustunnistusNr",
    "padevusulatused",
    "valjastajaRegistrikood",
    "valjaandmiskoht",
    "valjastamiseKuupaev",
    "kehtivuseLopp"
})
public class Padevustunnistus {

    @XmlElement(name = "padevustunnistus_nr", required = true)
    protected String padevustunnistusNr;
    @XmlElement(required = true)
    protected Padevustunnistus.Padevusulatused padevusulatused;
    @XmlElement(name = "valjastaja_registrikood", required = true)
    protected String valjastajaRegistrikood;
    @XmlElement(required = true)
    protected String valjaandmiskoht;
    @XmlElement(name = "valjastamise_kuupaev", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valjastamiseKuupaev;
    @XmlElement(name = "kehtivuse_lopp", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kehtivuseLopp;

    /**
     * Gets the value of the padevustunnistusNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadevustunnistusNr() {
        return padevustunnistusNr;
    }

    /**
     * Sets the value of the padevustunnistusNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadevustunnistusNr(String value) {
        this.padevustunnistusNr = value;
    }

    /**
     * Gets the value of the padevusulatused property.
     * 
     * @return
     *     possible object is
     *     {@link Padevustunnistus.Padevusulatused }
     *     
     */
    public Padevustunnistus.Padevusulatused getPadevusulatused() {
        return padevusulatused;
    }

    /**
     * Sets the value of the padevusulatused property.
     * 
     * @param value
     *     allowed object is
     *     {@link Padevustunnistus.Padevusulatused }
     *     
     */
    public void setPadevusulatused(Padevustunnistus.Padevusulatused value) {
        this.padevusulatused = value;
    }

    /**
     * Gets the value of the valjastajaRegistrikood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValjastajaRegistrikood() {
        return valjastajaRegistrikood;
    }

    /**
     * Sets the value of the valjastajaRegistrikood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValjastajaRegistrikood(String value) {
        this.valjastajaRegistrikood = value;
    }

    /**
     * Gets the value of the valjaandmiskoht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValjaandmiskoht() {
        return valjaandmiskoht;
    }

    /**
     * Sets the value of the valjaandmiskoht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValjaandmiskoht(String value) {
        this.valjaandmiskoht = value;
    }

    /**
     * Gets the value of the valjastamiseKuupaev property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValjastamiseKuupaev() {
        return valjastamiseKuupaev;
    }

    /**
     * Sets the value of the valjastamiseKuupaev property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValjastamiseKuupaev(XMLGregorianCalendar value) {
        this.valjastamiseKuupaev = value;
    }

    /**
     * Gets the value of the kehtivuseLopp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKehtivuseLopp() {
        return kehtivuseLopp;
    }

    /**
     * Sets the value of the kehtivuseLopp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKehtivuseLopp(XMLGregorianCalendar value) {
        this.kehtivuseLopp = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="padevusulatus" type="{http://jvisv6.x-road.eu/producer}padevusulatus" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "padevusulatus"
    })
    public static class Padevusulatused {

        protected List<Padevusulatus> padevusulatus;

        /**
         * Gets the value of the padevusulatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the padevusulatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPadevusulatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Padevusulatus }
         * 
         * 
         */
        public List<Padevusulatus> getPadevusulatus() {
            if (padevusulatus == null) {
                padevusulatus = new ArrayList<Padevusulatus>();
            }
            return this.padevusulatus;
        }

    }

}
