//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.04.19 at 06:43:03 PM IST
//
package com.metamug.parser.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Tag")
public class Tag extends XMLElement {

    @XmlAttribute(name = "name")
    protected String name;

    @XmlAttribute(name = "color")
    protected String colorcode;

    public Tag() {
    }

    public String getName() {
        return name;
    }

    public void setName(String tagName) {
        this.name = tagName;
    }

    public String getColor() {
        return colorcode;
    }

    public void setColor(String tagColor) {
        this.colorcode = tagColor;
    }

}

