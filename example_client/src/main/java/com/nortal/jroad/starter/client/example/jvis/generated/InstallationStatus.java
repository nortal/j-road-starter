
package com.nortal.jroad.starter.client.example.jvis.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for installation_status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="installation_status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="archived"/&gt;
 *     &lt;enumeration value="passive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "installation_status")
@XmlEnum
public enum InstallationStatus {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("archived")
    ARCHIVED("archived"),
    @XmlEnumValue("passive")
    PASSIVE("passive");
    private final String value;

    InstallationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstallationStatus fromValue(String v) {
        for (InstallationStatus c: InstallationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
