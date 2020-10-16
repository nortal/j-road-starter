
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
 *         &lt;element name="JurKaidukorraldaja" type="{http://jvisv6.x-road.eu/producer}Jisik_Kaidukorraldaja" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FisikKaidukorraldaja" type="{http://jvisv6.x-road.eu/producer}Fisik_Kaidukorraldaja" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "jurKaidukorraldaja",
    "fisikKaidukorraldaja",
    "faultString",
    "faultCode"
})
@XmlRootElement(name = "tarbimiskoha_kaidukorraldajad_vastus")
public class TarbimiskohaKaidukorraldajadVastus {

    @XmlElement(name = "JurKaidukorraldaja")
    protected List<JisikKaidukorraldaja> jurKaidukorraldaja;
    @XmlElement(name = "FisikKaidukorraldaja")
    protected List<FisikKaidukorraldaja> fisikKaidukorraldaja;
    protected String faultString;
    protected String faultCode;

    /**
     * Gets the value of the jurKaidukorraldaja property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurKaidukorraldaja property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurKaidukorraldaja().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JisikKaidukorraldaja }
     * 
     * 
     */
    public List<JisikKaidukorraldaja> getJurKaidukorraldaja() {
        if (jurKaidukorraldaja == null) {
            jurKaidukorraldaja = new ArrayList<JisikKaidukorraldaja>();
        }
        return this.jurKaidukorraldaja;
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

}
