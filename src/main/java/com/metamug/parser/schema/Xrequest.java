//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.19 at 07:00:32 PM IST 
//
package com.metamug.parser.schema;

import com.metamug.parser.exception.ResourceTestException;
import com.metamug.parser.service.ParserService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.xpath.XPathExpressionException;
import org.apache.commons.text.StringEscapeUtils;
import org.xml.sax.SAXException;

/**
 *
 * For making external request to 3rd party APIs
 *
 *
 * <p>
 * Java class for xrequest complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="xrequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Param" type="{http://xml.metamug.net/resource/1.0}xparam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Header" type="{http://xml.metamug.net/resource/1.0}xheader" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://xml.metamug.net/resource/1.0}xbody" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" use="required" type="{http://xml.metamug.net/resource/1.0}id" />
 *       &lt;attribute name="when" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="method" use="required" type="{http://xml.metamug.net/resource/1.0}method" />
 *       &lt;attribute name="verbose" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="persist" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xrequest", propOrder = {
    "paramOrHeaderOrBody"
})
public class Xrequest extends RequestChild{
    @XmlElements({
        @XmlElement(name = "Param", type = Xparam.class),
        @XmlElement(name = "Header", type = Xheader.class),
        @XmlElement(name = "Body", type = String.class)
    })
    protected List<Object> paramOrHeaderOrBody;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "when")
    protected String when;
    @XmlAttribute(name = "url", required = true)
    protected String url;
    @XmlAttribute(name = "method", required = true)
    protected Method method;
    @XmlAttribute(name = "output")
    protected XrequestOutput output;
    @XmlAttribute(name = "classname")
    protected String className;

    /**
     * Gets the value of the paramOrHeaderOrBody property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
     * not a <CODE>set</CODE> method for the paramOrHeaderOrBody property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamOrHeaderOrBody().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Xparam }
     * {@link Xheader }
     * {@link String }
     *
     *
     * @return
     */
    public List<Object> getParamOrHeaderOrBody() {
        if (paramOrHeaderOrBody == null) {
            paramOrHeaderOrBody = new ArrayList<>();
        }
        return this.paramOrHeaderOrBody;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the when property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setWhen(String value) {
        this.when = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the method property.
     *
     * @return possible object is {@link Method }
     *
     */
    public Method getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     *
     * @param value allowed object is {@link Method }
     *
     */
    public void setMethod(Method value) {
        this.method = value;
    }

    /**
     * Gets the value of the output property.
     *
     * @return possible object is {@link XrequestOutput}.
     *
     */
    public XrequestOutput getOutput() {
        return output;
    }

    /**
     * Sets the value of the verbose property.
     *
     * @param output allowed object is {@link XrequestOutput}
     *
     */
    public void setOutput(XrequestOutput output) {
        this.output = output;
    }
    /**
     * Gets the value of the className property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setClassName(String value) {
        this.className = value;
    }

    @Override
    public void print(XMLStreamWriter writer, ParserService parent) throws XMLStreamException, IOException, XPathExpressionException, ResourceTestException, SAXException {
        this.parent = parent;
        //Xrequest xrequest = (Xrequest)this;
        
        if (getWhen() != null) {
            writer.writeStartElement("c:if");
            //String testString = getQuotedString(xrequest.getWhen());
            //writer.writeAttribute("test", enclose(testString.replace("$", "mtgReq.params")));
            String test = transformVariables(getWhen(),parent.elementIds,false);
            writeUnescapedData(" test=\""+enclose(StringEscapeUtils.unescapeXml(test))+"\"",parent.output);
        }
   
        //print xrequest mason tags
        writer.writeCharacters(System.lineSeparator());
        writer.writeStartElement("m:xrequest");
        writer.writeAttribute("var", getId());
        writer.writeAttribute("method", getMethod().name());
        if ( getOutput() != null ) { 
            String outputVal = getOutput().value();
            if(outputVal.equals("headers")){
                writer.writeAttribute("outputHeaders", "true");
                writer.writeAttribute("output", "true");
            } else if(outputVal.equals("true")) {
                writer.writeAttribute("output", "true");
            }
        }
        
        if ( getClassName() != null ) {
            writer.writeAttribute("className", getClassName());
        }
        
        writeUnescapedData(" url=\""+StringEscapeUtils.unescapeXml(getUrl())+"\"",parent.output);
                
        for (Object paramOrHeaderOrBody : getParamOrHeaderOrBody()) {
            if (paramOrHeaderOrBody instanceof Xheader) {
                writer.writeEmptyElement("m:header");
                writer.writeAttribute("name", ((Xheader) paramOrHeaderOrBody).getName());
                
                String value = ((Xheader) paramOrHeaderOrBody).getValue();
                writeUnescapedData(" value=\""+StringEscapeUtils.unescapeXml(value)+"\"",parent.output);
            } else if (paramOrHeaderOrBody instanceof Xparam) {
                writer.writeEmptyElement("m:xparam");
                writer.writeAttribute("name", ((Xparam) paramOrHeaderOrBody).getName());
                //transform request parameters and mpath variables in xrequest param value
                String v = transformVariables(((Xparam) paramOrHeaderOrBody).getValue(),parent.elementIds,true);
                writeUnescapedData(" value=\""+StringEscapeUtils.unescapeXml(v)+"\"",parent.output);
            } else if (paramOrHeaderOrBody instanceof String) {
                writer.writeStartElement("m:xbody");
                //transform request parameters and mpath variables in xrequest body
                String body = transformVariables((String) paramOrHeaderOrBody,parent.elementIds,true);
              
                writeUnescapedCharacters(writer, body,parent.output);
                writer.writeEndElement();
            }
        }
        writer.writeEndElement(); //End of <m:xrequest>    
        writer.writeCharacters(System.lineSeparator());
        
        if (getWhen() != null) {
            writer.writeEndElement(); //End of <c:if>
        }
    }

    @Override
    public List<String> getRequestParameters() {
        return null;
    }
}