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
 * Java class for sqlType.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sqlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="query"/>
 *     &lt;enumeration value="update"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "sqlType")
@XmlEnum
public enum SqlType {

    @XmlEnumValue("query")
    QUERY("query"),
    @XmlEnumValue("update")
    UPDATE("update");
    private final String value;

    SqlType(String queryType) {
        value = queryType;
    }

    public String value() {
        return value;
    }

    public static SqlType fromValue(String stringValue) {
        for (SqlType sqlType : SqlType.values()) {
            if (sqlType.value.equals(stringValue)) {
                return sqlType;
            }
        }
        throw new IllegalArgumentException(stringValue);
    }

}
