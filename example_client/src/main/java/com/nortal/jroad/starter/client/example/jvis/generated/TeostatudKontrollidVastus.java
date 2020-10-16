
package com.nortal.jroad.starter.client.example.jvis.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence&gt;
 *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="Paigaldis_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="TK_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="Muudetud" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="Protokoll_number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Teostatud" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="Teostaja" type="{http://jvisv6.x-road.eu/producer}Ametnik"/&gt;
 *                   &lt;element name="Kontrolli_toiming"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Tulemus"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Eksperdi_markused" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Jargmine_kontroll" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="Tunnistus_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Tunnistus_kuupaev" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="faultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "item",
    "faultString",
    "faultCode"
})
@XmlRootElement(name = "teostatud_kontrollid_vastus")
public class TeostatudKontrollidVastus {

    protected List<TeostatudKontrollidVastus.Item> item;
    protected String faultString;
    protected String faultCode;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeostatudKontrollidVastus.Item }
     * 
     * 
     */
    public List<TeostatudKontrollidVastus.Item> getItem() {
        if (item == null) {
            item = new ArrayList<TeostatudKontrollidVastus.Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the faultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultString() {
        return faultString;
    }

    /**
     * Sets the value of the faultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultString(String value) {
        this.faultString = value;
    }

    /**
     * Gets the value of the faultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultCode() {
        return faultCode;
    }

    /**
     * Sets the value of the faultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultCode(String value) {
        this.faultCode = value;
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
     *         &lt;element name="EE_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="Paigaldis_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="TK_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="Muudetud" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="Protokoll_number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Teostatud" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="Teostaja" type="{http://jvisv6.x-road.eu/producer}Ametnik"/&gt;
     *         &lt;element name="Kontrolli_toiming"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Tulemus"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Eksperdi_markused" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Jargmine_kontroll" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="Tunnistus_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Tunnistus_kuupaev" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
        "eeid",
        "paigaldisID",
        "tkid",
        "muudetud",
        "protokollNumber",
        "teostatud",
        "teostaja",
        "kontrolliToiming",
        "tulemus",
        "eksperdiMarkused",
        "jargmineKontroll",
        "tunnistusNumber",
        "tunnistusKuupaev"
    })
    public static class Item {

        @XmlElement(name = "EE_ID", required = true)
        protected BigInteger eeid;
        @XmlElement(name = "Paigaldis_ID", required = true)
        protected BigInteger paigaldisID;
        @XmlElement(name = "TK_ID", required = true)
        protected BigInteger tkid;
        @XmlElement(name = "Muudetud", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar muudetud;
        @XmlElement(name = "Protokoll_number", required = true)
        protected String protokollNumber;
        @XmlElement(name = "Teostatud", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar teostatud;
        @XmlElement(name = "Teostaja", required = true)
        protected Ametnik teostaja;
        @XmlElement(name = "Kontrolli_toiming", required = true)
        protected BigInteger kontrolliToiming;
        @XmlElement(name = "Tulemus", required = true)
        protected BigInteger tulemus;
        @XmlElement(name = "Eksperdi_markused")
        protected String eksperdiMarkused;
        @XmlElement(name = "Jargmine_kontroll")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar jargmineKontroll;
        @XmlElement(name = "Tunnistus_number")
        protected String tunnistusNumber;
        @XmlElement(name = "Tunnistus_kuupaev")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar tunnistusKuupaev;

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
         * Gets the value of the paigaldisID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPaigaldisID() {
            return paigaldisID;
        }

        /**
         * Sets the value of the paigaldisID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPaigaldisID(BigInteger value) {
            this.paigaldisID = value;
        }

        /**
         * Gets the value of the tkid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTKID() {
            return tkid;
        }

        /**
         * Sets the value of the tkid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTKID(BigInteger value) {
            this.tkid = value;
        }

        /**
         * Gets the value of the muudetud property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMuudetud() {
            return muudetud;
        }

        /**
         * Sets the value of the muudetud property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setMuudetud(XMLGregorianCalendar value) {
            this.muudetud = value;
        }

        /**
         * Gets the value of the protokollNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtokollNumber() {
            return protokollNumber;
        }

        /**
         * Sets the value of the protokollNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtokollNumber(String value) {
            this.protokollNumber = value;
        }

        /**
         * Gets the value of the teostatud property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTeostatud() {
            return teostatud;
        }

        /**
         * Sets the value of the teostatud property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTeostatud(XMLGregorianCalendar value) {
            this.teostatud = value;
        }

        /**
         * Gets the value of the teostaja property.
         * 
         * @return
         *     possible object is
         *     {@link Ametnik }
         *     
         */
        public Ametnik getTeostaja() {
            return teostaja;
        }

        /**
         * Sets the value of the teostaja property.
         * 
         * @param value
         *     allowed object is
         *     {@link Ametnik }
         *     
         */
        public void setTeostaja(Ametnik value) {
            this.teostaja = value;
        }

        /**
         * Gets the value of the kontrolliToiming property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getKontrolliToiming() {
            return kontrolliToiming;
        }

        /**
         * Sets the value of the kontrolliToiming property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setKontrolliToiming(BigInteger value) {
            this.kontrolliToiming = value;
        }

        /**
         * Gets the value of the tulemus property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTulemus() {
            return tulemus;
        }

        /**
         * Sets the value of the tulemus property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTulemus(BigInteger value) {
            this.tulemus = value;
        }

        /**
         * Gets the value of the eksperdiMarkused property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEksperdiMarkused() {
            return eksperdiMarkused;
        }

        /**
         * Sets the value of the eksperdiMarkused property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEksperdiMarkused(String value) {
            this.eksperdiMarkused = value;
        }

        /**
         * Gets the value of the jargmineKontroll property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getJargmineKontroll() {
            return jargmineKontroll;
        }

        /**
         * Sets the value of the jargmineKontroll property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setJargmineKontroll(XMLGregorianCalendar value) {
            this.jargmineKontroll = value;
        }

        /**
         * Gets the value of the tunnistusNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTunnistusNumber() {
            return tunnistusNumber;
        }

        /**
         * Sets the value of the tunnistusNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTunnistusNumber(String value) {
            this.tunnistusNumber = value;
        }

        /**
         * Gets the value of the tunnistusKuupaev property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTunnistusKuupaev() {
            return tunnistusKuupaev;
        }

        /**
         * Sets the value of the tunnistusKuupaev property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTunnistusKuupaev(XMLGregorianCalendar value) {
            this.tunnistusKuupaev = value;
        }

    }

}
