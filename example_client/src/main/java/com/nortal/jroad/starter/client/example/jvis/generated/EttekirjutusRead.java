
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
 *         &lt;element name="ettekirjutus" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="1000"/&gt;
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
@XmlRootElement(name = "ettekirjutus_read")
public class EttekirjutusRead {

    @XmlElement(required = true)
    protected List<Object> ettekirjutus;

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
     * {@link Object }
     * 
     * 
     */
    public List<Object> getEttekirjutus() {
        if (ettekirjutus == null) {
            ettekirjutus = new ArrayList<Object>();
        }
        return this.ettekirjutus;
    }

}
