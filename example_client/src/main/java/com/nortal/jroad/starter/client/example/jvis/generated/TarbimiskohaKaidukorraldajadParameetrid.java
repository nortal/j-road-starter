
package com.nortal.jroad.starter.client.example.jvis.generated;

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
 *         &lt;element name="TarbimiskohaUnikaalneID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "tarbimiskohaUnikaalneID"
})
@XmlRootElement(name = "tarbimiskoha_kaidukorraldajad_parameetrid")
public class TarbimiskohaKaidukorraldajadParameetrid {

    @XmlElement(name = "TarbimiskohaUnikaalneID")
    protected long tarbimiskohaUnikaalneID;

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

}
