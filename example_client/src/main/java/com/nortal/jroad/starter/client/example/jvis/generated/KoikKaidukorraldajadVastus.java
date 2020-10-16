
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
 *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TarbimiskohaUnikaalneID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="x_op" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="JurKaidukorraldaja" type="{http://jvisv6.x-road.eu/producer}Jisik_Kaidukorraldaja" minOccurs="0"/&gt;
 *                   &lt;element name="FisikKaidukorraldaja" type="{http://jvisv6.x-road.eu/producer}Fisik_Kaidukorraldaja" minOccurs="0"/&gt;
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
@XmlRootElement(name = "koik_kaidukorraldajad_vastus")
public class KoikKaidukorraldajadVastus {

    protected List<KoikKaidukorraldajadVastus.Item> item;
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
     * {@link KoikKaidukorraldajadVastus.Item }
     * 
     * 
     */
    public List<KoikKaidukorraldajadVastus.Item> getItem() {
        if (item == null) {
            item = new ArrayList<KoikKaidukorraldajadVastus.Item>();
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
     *         &lt;element name="TarbimiskohaUnikaalneID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="x_op" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="JurKaidukorraldaja" type="{http://jvisv6.x-road.eu/producer}Jisik_Kaidukorraldaja" minOccurs="0"/&gt;
     *         &lt;element name="FisikKaidukorraldaja" type="{http://jvisv6.x-road.eu/producer}Fisik_Kaidukorraldaja" minOccurs="0"/&gt;
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
        "tarbimiskohaUnikaalneID",
        "xOp",
        "jurKaidukorraldaja",
        "fisikKaidukorraldaja"
    })
    public static class Item {

        @XmlElement(name = "TarbimiskohaUnikaalneID")
        protected long tarbimiskohaUnikaalneID;
        @XmlElement(name = "x_op", required = true)
        protected String xOp;
        @XmlElement(name = "JurKaidukorraldaja")
        protected JisikKaidukorraldaja jurKaidukorraldaja;
        @XmlElement(name = "FisikKaidukorraldaja")
        protected FisikKaidukorraldaja fisikKaidukorraldaja;

        /**
         * Gets the value of the tarbimiskohaUnikaalneID property.
         * 
         */
        public long getTarbimiskohaUnikaalneID() {
            return tarbimiskohaUnikaalneID;
        }

        /**
         * Sets the value of the tarbimiskohaUnikaalneID property.
         * 
         */
        public void setTarbimiskohaUnikaalneID(long value) {
            this.tarbimiskohaUnikaalneID = value;
        }

        /**
         * Gets the value of the xOp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXOp() {
            return xOp;
        }

        /**
         * Sets the value of the xOp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXOp(String value) {
            this.xOp = value;
        }

        /**
         * Gets the value of the jurKaidukorraldaja property.
         * 
         * @return
         *     possible object is
         *     {@link JisikKaidukorraldaja }
         *     
         */
        public JisikKaidukorraldaja getJurKaidukorraldaja() {
            return jurKaidukorraldaja;
        }

        /**
         * Sets the value of the jurKaidukorraldaja property.
         * 
         * @param value
         *     allowed object is
         *     {@link JisikKaidukorraldaja }
         *     
         */
        public void setJurKaidukorraldaja(JisikKaidukorraldaja value) {
            this.jurKaidukorraldaja = value;
        }

        /**
         * Gets the value of the fisikKaidukorraldaja property.
         * 
         * @return
         *     possible object is
         *     {@link FisikKaidukorraldaja }
         *     
         */
        public FisikKaidukorraldaja getFisikKaidukorraldaja() {
            return fisikKaidukorraldaja;
        }

        /**
         * Sets the value of the fisikKaidukorraldaja property.
         * 
         * @param value
         *     allowed object is
         *     {@link FisikKaidukorraldaja }
         *     
         */
        public void setFisikKaidukorraldaja(FisikKaidukorraldaja value) {
            this.fisikKaidukorraldaja = value;
        }

    }

}
