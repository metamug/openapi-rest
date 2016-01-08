//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.02 at 06:40:50 PM IST 
//
package com.metamug.jaxb.gener;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for out.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 *
 * <pre>
 * &lt;simpleType name="out">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="json"/>
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="table"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "out")
@XmlEnum
public enum Out {

    @XmlEnumValue("json")
    JSON("json"),
    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("table")
    TABLE("table");
    private final String value;

    Out(String stirngValue) {
        value = stirngValue;
    }

    public String value() {
        return value;
    }

    public static Out fromValue(String stringValue) {
        for (Out c : Out.values()) {
            if (c.value.equals(stringValue)) {
                return c;
            }
        }
        throw new IllegalArgumentException(stringValue);
    }

}
