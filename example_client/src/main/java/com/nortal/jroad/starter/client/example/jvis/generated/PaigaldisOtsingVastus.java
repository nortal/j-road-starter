
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
 *                 &lt;all&gt;
 *                   &lt;element name="paigaldis_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="paigaldis_nimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="paigaldis_liik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="naita_kaardil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="paigaldis_liik_nimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="paigaldis_aadress_tapne" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="paigaldis_aadress_indeks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="paigaldis_aadress_asula" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="omanik_nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="omanik_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="valdaja_nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="valdaja_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="paigaldis_regnr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="paigaldis_muudetud" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="paigaldis_lest_pl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="paigaldis_lest_ip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="paigaldis_staatus" type="{http://jvisv6.x-road.eu/producer}p_staatus"/&gt;
 *                   &lt;element name="mis_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ohutusraadius" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "item"
})
@XmlRootElement(name = "paigaldis_otsing_vastus")
public class PaigaldisOtsingVastus {

    protected List<PaigaldisOtsingVastus.Item> item;

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
     * {@link PaigaldisOtsingVastus.Item }
     * 
     * 
     */
    public List<PaigaldisOtsingVastus.Item> getItem() {
        if (item == null) {
            item = new ArrayList<PaigaldisOtsingVastus.Item>();
        }
        return this.item;
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
     *       &lt;all&gt;
     *         &lt;element name="paigaldis_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="paigaldis_nimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="paigaldis_liik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="naita_kaardil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="paigaldis_liik_nimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="paigaldis_aadress_tapne" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="paigaldis_aadress_indeks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="paigaldis_aadress_asula" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="omanik_nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="omanik_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="valdaja_nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="valdaja_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="paigaldis_regnr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="paigaldis_muudetud" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="paigaldis_lest_pl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="paigaldis_lest_ip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="paigaldis_staatus" type="{http://jvisv6.x-road.eu/producer}p_staatus"/&gt;
     *         &lt;element name="mis_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ohutusraadius" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    public static class Item {

        @XmlElement(name = "paigaldis_id", required = true)
        protected String paigaldisId;
        @XmlElement(name = "paigaldis_nimetus", required = true)
        protected String paigaldisNimetus;
        @XmlElement(name = "paigaldis_liik", required = true)
        protected String paigaldisLiik;
        @XmlElement(name = "naita_kaardil", required = true)
        protected String naitaKaardil;
        @XmlElement(name = "paigaldis_liik_nimetus", required = true)
        protected String paigaldisLiikNimetus;
        @XmlElement(name = "paigaldis_aadress_tapne", required = true)
        protected String paigaldisAadressTapne;
        @XmlElement(name = "paigaldis_aadress_indeks", required = true)
        protected String paigaldisAadressIndeks;
        @XmlElement(name = "paigaldis_aadress_asula", required = true)
        protected String paigaldisAadressAsula;
        @XmlElement(name = "omanik_nimi", required = true)
        protected String omanikNimi;
        @XmlElement(name = "omanik_kood", required = true)
        protected String omanikKood;
        @XmlElement(name = "valdaja_nimi", required = true)
        protected String valdajaNimi;
        @XmlElement(name = "valdaja_kood", required = true)
        protected String valdajaKood;
        @XmlElement(name = "paigaldis_regnr", required = true)
        protected String paigaldisRegnr;
        @XmlElement(name = "paigaldis_muudetud", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar paigaldisMuudetud;
        @XmlElement(name = "paigaldis_lest_pl", required = true)
        protected String paigaldisLestPl;
        @XmlElement(name = "paigaldis_lest_ip", required = true)
        protected String paigaldisLestIp;
        @XmlElement(name = "paigaldis_staatus", required = true)
        protected BigInteger paigaldisStaatus;
        @XmlElement(name = "mis_id", required = true)
        protected String misId;
        @XmlElement(required = true)
        protected BigInteger ohutusraadius;

        /**
         * Gets the value of the paigaldisId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaigaldisId() {
            return paigaldisId;
        }

        /**
         * Sets the value of the paigaldisId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaigaldisId(String value) {
            this.paigaldisId = value;
        }

        /**
         * Gets the value of the paigaldisNimetus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaigaldisNimetus() {
            return paigaldisNimetus;
        }

        /**
         * Sets the value of the paigaldisNimetus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaigaldisNimetus(String value) {
            this.paigaldisNimetus = value;
        }

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
         * Gets the value of the naitaKaardil property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaitaKaardil() {
            return naitaKaardil;
        }

        /**
         * Sets the value of the naitaKaardil property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaitaKaardil(String value) {
            this.naitaKaardil = value;
        }

        /**
         * Gets the value of the paigaldisLiikNimetus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaigaldisLiikNimetus() {
            return paigaldisLiikNimetus;
        }

        /**
         * Sets the value of the paigaldisLiikNimetus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaigaldisLiikNimetus(String value) {
            this.paigaldisLiikNimetus = value;
        }

        /**
         * Gets the value of the paigaldisAadressTapne property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaigaldisAadressTapne() {
            return paigaldisAadressTapne;
        }

        /**
         * Sets the value of the paigaldisAadressTapne property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaigaldisAadressTapne(String value) {
            this.paigaldisAadressTapne = value;
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
         * Gets the value of the paigaldisMuudetud property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPaigaldisMuudetud() {
            return paigaldisMuudetud;
        }

        /**
         * Sets the value of the paigaldisMuudetud property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPaigaldisMuudetud(XMLGregorianCalendar value) {
            this.paigaldisMuudetud = value;
        }

        /**
         * Gets the value of the paigaldisLestPl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaigaldisLestPl() {
            return paigaldisLestPl;
        }

        /**
         * Sets the value of the paigaldisLestPl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaigaldisLestPl(String value) {
            this.paigaldisLestPl = value;
        }

        /**
         * Gets the value of the paigaldisLestIp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaigaldisLestIp() {
            return paigaldisLestIp;
        }

        /**
         * Sets the value of the paigaldisLestIp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaigaldisLestIp(String value) {
            this.paigaldisLestIp = value;
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
         * Gets the value of the misId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMisId() {
            return misId;
        }

        /**
         * Sets the value of the misId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMisId(String value) {
            this.misId = value;
        }

        /**
         * Gets the value of the ohutusraadius property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOhutusraadius() {
            return ohutusraadius;
        }

        /**
         * Sets the value of the ohutusraadius property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOhutusraadius(BigInteger value) {
            this.ohutusraadius = value;
        }

    }

}
