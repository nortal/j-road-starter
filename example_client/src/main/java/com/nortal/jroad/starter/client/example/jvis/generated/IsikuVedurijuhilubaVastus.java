
package com.nortal.jroad.starter.client.example.jvis.generated;

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
 *         &lt;element name="loaNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kehtivKuni" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="peatamisePohjus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="koolitused"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Koolitus" type="{http://jvisv6.x-road.eu/producer}Koolitus" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "loaNumber",
    "kehtivKuni",
    "peatamisePohjus",
    "koolitused"
})
@XmlRootElement(name = "isikuVedurijuhilubaVastus")
public class IsikuVedurijuhilubaVastus {

    @XmlElement(required = true)
    protected String loaNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kehtivKuni;
    @XmlElement(required = true)
    protected String peatamisePohjus;
    @XmlElement(required = true)
    protected IsikuVedurijuhilubaVastus.Koolitused koolitused;

    /**
     * Gets the value of the loaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoaNumber() {
        return loaNumber;
    }

    /**
     * Sets the value of the loaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoaNumber(String value) {
        this.loaNumber = value;
    }

    /**
     * Gets the value of the kehtivKuni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKehtivKuni() {
        return kehtivKuni;
    }

    /**
     * Sets the value of the kehtivKuni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKehtivKuni(XMLGregorianCalendar value) {
        this.kehtivKuni = value;
    }

    /**
     * Gets the value of the peatamisePohjus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeatamisePohjus() {
        return peatamisePohjus;
    }

    /**
     * Sets the value of the peatamisePohjus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeatamisePohjus(String value) {
        this.peatamisePohjus = value;
    }

    /**
     * Gets the value of the koolitused property.
     * 
     * @return
     *     possible object is
     *     {@link IsikuVedurijuhilubaVastus.Koolitused }
     *     
     */
    public IsikuVedurijuhilubaVastus.Koolitused getKoolitused() {
        return koolitused;
    }

    /**
     * Sets the value of the koolitused property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsikuVedurijuhilubaVastus.Koolitused }
     *     
     */
    public void setKoolitused(IsikuVedurijuhilubaVastus.Koolitused value) {
        this.koolitused = value;
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
     *         &lt;element name="Koolitus" type="{http://jvisv6.x-road.eu/producer}Koolitus" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "koolitus"
    })
    public static class Koolitused {

        @XmlElement(name = "Koolitus")
        protected List<Koolitus> koolitus;

        /**
         * Gets the value of the koolitus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the koolitus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKoolitus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Koolitus }
         * 
         * 
         */
        public List<Koolitus> getKoolitus() {
            if (koolitus == null) {
                koolitus = new ArrayList<Koolitus>();
            }
            return this.koolitus;
        }

    }

}
