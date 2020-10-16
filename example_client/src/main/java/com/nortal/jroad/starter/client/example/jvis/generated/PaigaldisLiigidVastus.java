
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
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="vanem_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="nimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlRootElement(name = "paigaldis_liigid_vastus")
public class PaigaldisLiigidVastus {

    protected List<PaigaldisLiigidVastus.Item> item;

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
     * {@link PaigaldisLiigidVastus.Item }
     * 
     * 
     */
    public List<PaigaldisLiigidVastus.Item> getItem() {
        if (item == null) {
            item = new ArrayList<PaigaldisLiigidVastus.Item>();
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
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="vanem_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="nimetus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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

        @XmlElement(required = true)
        protected String id;
        @XmlElement(name = "vanem_id", required = true)
        protected String vanemId;
        @XmlElement(required = true)
        protected String nimetus;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the vanemId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVanemId() {
            return vanemId;
        }

        /**
         * Sets the value of the vanemId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVanemId(String value) {
            this.vanemId = value;
        }

        /**
         * Gets the value of the nimetus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNimetus() {
            return nimetus;
        }

        /**
         * Sets the value of the nimetus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNimetus(String value) {
            this.nimetus = value;
        }

    }

}
