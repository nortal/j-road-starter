
package com.nortal.jroad.starter.client.example.jvis.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ettekirjutus" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="saanud_isik_nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="saanud_isik_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="mtr_nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="valjastaja_nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="valjastaja_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="valjastaja_aadress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="valjastaja_telefon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="menetleja_eesnimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="menetleja_perenimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="menetleja_isikukood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="tegemise_kp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ettekirjutuse_nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="alus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="vaidlustus_voimalused" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ettekirjutus_read" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="rikkumine_viide" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="taitmise_tahtaeg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="pikendatud_tahtaeg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="meetmed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="taitmise_kp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="taitmise_kommentaar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
    "ettekirjutus"
})
@XmlRootElement(name = "ettekirjutused")
public class Ettekirjutused {

    @XmlElement(required = true)
    protected List<Ettekirjutused.Ettekirjutus> ettekirjutus;

    /**
     * Gets the value of the ettekirjutus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ettekirjutus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEttekirjutus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ettekirjutused.Ettekirjutus }
     * 
     * 
     */
    public List<Ettekirjutused.Ettekirjutus> getEttekirjutus() {
        if (ettekirjutus == null) {
            ettekirjutus = new ArrayList<Ettekirjutused.Ettekirjutus>();
        }
        return this.ettekirjutus;
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
     *         &lt;element name="saanud_isik_nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="saanud_isik_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="mtr_nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="valjastaja_nimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="valjastaja_kood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="valjastaja_aadress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="valjastaja_telefon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="menetleja_eesnimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="menetleja_perenimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="menetleja_isikukood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="tegemise_kp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ettekirjutuse_nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="alus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="vaidlustus_voimalused" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ettekirjutus_read" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="rikkumine_viide" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="taitmise_tahtaeg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="pikendatud_tahtaeg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="meetmed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="taitmise_kp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="taitmise_kommentaar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
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
        "saanudIsikNimi",
        "saanudIsikKood",
        "mtrNr",
        "valjastajaNimi",
        "valjastajaKood",
        "valjastajaAadress",
        "valjastajaTelefon",
        "menetlejaEesnimi",
        "menetlejaPerenimi",
        "menetlejaIsikukood",
        "tegemiseKp",
        "ettekirjutuseNr",
        "alus",
        "vaidlustusVoimalused",
        "ettekirjutusRead"
    })
    public static class Ettekirjutus {

        @XmlElement(name = "saanud_isik_nimi", required = true)
        protected String saanudIsikNimi;
        @XmlElement(name = "saanud_isik_kood", required = true)
        protected String saanudIsikKood;
        @XmlElement(name = "mtr_nr", required = true)
        protected String mtrNr;
        @XmlElement(name = "valjastaja_nimi", required = true)
        protected String valjastajaNimi;
        @XmlElement(name = "valjastaja_kood", required = true)
        protected String valjastajaKood;
        @XmlElement(name = "valjastaja_aadress", required = true)
        protected String valjastajaAadress;
        @XmlElement(name = "valjastaja_telefon", required = true)
        protected String valjastajaTelefon;
        @XmlElement(name = "menetleja_eesnimi", required = true)
        protected String menetlejaEesnimi;
        @XmlElement(name = "menetleja_perenimi", required = true)
        protected String menetlejaPerenimi;
        @XmlElement(name = "menetleja_isikukood", required = true)
        protected String menetlejaIsikukood;
        @XmlElement(name = "tegemise_kp", required = true)
        protected String tegemiseKp;
        @XmlElement(name = "ettekirjutuse_nr", required = true)
        protected String ettekirjutuseNr;
        @XmlElement(required = true)
        protected String alus;
        @XmlElement(name = "vaidlustus_voimalused", required = true)
        protected String vaidlustusVoimalused;
        @XmlElement(name = "ettekirjutus_read")
        protected List<Ettekirjutused.Ettekirjutus.EttekirjutusRead> ettekirjutusRead;

        /**
         * Gets the value of the saanudIsikNimi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSaanudIsikNimi() {
            return saanudIsikNimi;
        }

        /**
         * Sets the value of the saanudIsikNimi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSaanudIsikNimi(String value) {
            this.saanudIsikNimi = value;
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
         * Gets the value of the mtrNr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMtrNr() {
            return mtrNr;
        }

        /**
         * Sets the value of the mtrNr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMtrNr(String value) {
            this.mtrNr = value;
        }

        /**
         * Gets the value of the valjastajaNimi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValjastajaNimi() {
            return valjastajaNimi;
        }

        /**
         * Sets the value of the valjastajaNimi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValjastajaNimi(String value) {
            this.valjastajaNimi = value;
        }

        /**
         * Gets the value of the valjastajaKood property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValjastajaKood() {
            return valjastajaKood;
        }

        /**
         * Sets the value of the valjastajaKood property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValjastajaKood(String value) {
            this.valjastajaKood = value;
        }

        /**
         * Gets the value of the valjastajaAadress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValjastajaAadress() {
            return valjastajaAadress;
        }

        /**
         * Sets the value of the valjastajaAadress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValjastajaAadress(String value) {
            this.valjastajaAadress = value;
        }

        /**
         * Gets the value of the valjastajaTelefon property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValjastajaTelefon() {
            return valjastajaTelefon;
        }

        /**
         * Sets the value of the valjastajaTelefon property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValjastajaTelefon(String value) {
            this.valjastajaTelefon = value;
        }

        /**
         * Gets the value of the menetlejaEesnimi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMenetlejaEesnimi() {
            return menetlejaEesnimi;
        }

        /**
         * Sets the value of the menetlejaEesnimi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMenetlejaEesnimi(String value) {
            this.menetlejaEesnimi = value;
        }

        /**
         * Gets the value of the menetlejaPerenimi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMenetlejaPerenimi() {
            return menetlejaPerenimi;
        }

        /**
         * Sets the value of the menetlejaPerenimi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMenetlejaPerenimi(String value) {
            this.menetlejaPerenimi = value;
        }

        /**
         * Gets the value of the menetlejaIsikukood property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMenetlejaIsikukood() {
            return menetlejaIsikukood;
        }

        /**
         * Sets the value of the menetlejaIsikukood property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMenetlejaIsikukood(String value) {
            this.menetlejaIsikukood = value;
        }

        /**
         * Gets the value of the tegemiseKp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTegemiseKp() {
            return tegemiseKp;
        }

        /**
         * Sets the value of the tegemiseKp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTegemiseKp(String value) {
            this.tegemiseKp = value;
        }

        /**
         * Gets the value of the ettekirjutuseNr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEttekirjutuseNr() {
            return ettekirjutuseNr;
        }

        /**
         * Sets the value of the ettekirjutuseNr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEttekirjutuseNr(String value) {
            this.ettekirjutuseNr = value;
        }

        /**
         * Gets the value of the alus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlus() {
            return alus;
        }

        /**
         * Sets the value of the alus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlus(String value) {
            this.alus = value;
        }

        /**
         * Gets the value of the vaidlustusVoimalused property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVaidlustusVoimalused() {
            return vaidlustusVoimalused;
        }

        /**
         * Sets the value of the vaidlustusVoimalused property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVaidlustusVoimalused(String value) {
            this.vaidlustusVoimalused = value;
        }

        /**
         * Gets the value of the ettekirjutusRead property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ettekirjutusRead property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEttekirjutusRead().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ettekirjutused.Ettekirjutus.EttekirjutusRead }
         * 
         * 
         */
        public List<Ettekirjutused.Ettekirjutus.EttekirjutusRead> getEttekirjutusRead() {
            if (ettekirjutusRead == null) {
                ettekirjutusRead = new ArrayList<Ettekirjutused.Ettekirjutus.EttekirjutusRead>();
            }
            return this.ettekirjutusRead;
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
         *         &lt;element name="rikkumine_viide" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="taitmise_tahtaeg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="pikendatud_tahtaeg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="meetmed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="taitmise_kp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="taitmise_kommentaar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "rikkumineViide",
            "taitmiseTahtaeg",
            "pikendatudTahtaeg",
            "meetmed",
            "taitmiseKp",
            "taitmiseKommentaar"
        })
        public static class EttekirjutusRead {

            @XmlElement(name = "rikkumine_viide", required = true)
            protected String rikkumineViide;
            @XmlElement(name = "taitmise_tahtaeg", required = true)
            protected String taitmiseTahtaeg;
            @XmlElement(name = "pikendatud_tahtaeg", required = true)
            protected String pikendatudTahtaeg;
            @XmlElement(required = true)
            protected String meetmed;
            @XmlElement(name = "taitmise_kp", required = true)
            protected String taitmiseKp;
            @XmlElement(name = "taitmise_kommentaar", required = true)
            protected String taitmiseKommentaar;

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
             * Gets the value of the taitmiseTahtaeg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaitmiseTahtaeg() {
                return taitmiseTahtaeg;
            }

            /**
             * Sets the value of the taitmiseTahtaeg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaitmiseTahtaeg(String value) {
                this.taitmiseTahtaeg = value;
            }

            /**
             * Gets the value of the pikendatudTahtaeg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPikendatudTahtaeg() {
                return pikendatudTahtaeg;
            }

            /**
             * Sets the value of the pikendatudTahtaeg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPikendatudTahtaeg(String value) {
                this.pikendatudTahtaeg = value;
            }

            /**
             * Gets the value of the meetmed property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMeetmed() {
                return meetmed;
            }

            /**
             * Sets the value of the meetmed property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMeetmed(String value) {
                this.meetmed = value;
            }

            /**
             * Gets the value of the taitmiseKp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaitmiseKp() {
                return taitmiseKp;
            }

            /**
             * Sets the value of the taitmiseKp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaitmiseKp(String value) {
                this.taitmiseKp = value;
            }

            /**
             * Gets the value of the taitmiseKommentaar property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaitmiseKommentaar() {
                return taitmiseKommentaar;
            }

            /**
             * Sets the value of the taitmiseKommentaar property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaitmiseKommentaar(String value) {
                this.taitmiseKommentaar = value;
            }

        }

    }

}
