//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.31 at 12:53:46 AM IST 
//


package com.metamug.parser.schema;

import com.metamug.parser.exception.ResourceTestException;
import com.metamug.parser.service.ParserService;
import static com.metamug.parser.service.ParserService.DATASOURCE;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.xpath.XPathExpressionException;
import org.apache.commons.text.StringEscapeUtils;
import org.xml.sax.SAXException;


/**
 * <p>Java class for transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Sql" type="{http://xml.metamug.net/resource/1.0}sql" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction", propOrder = {
    "sql"
})
public class Transaction extends InvocableElement {

    @XmlElement(name = "Sql")
    protected List<Sql> sql;
    @XmlAttribute(name = "when")
    protected String when;
    @XmlAttribute(name = "datasource")
    protected String datasource;

    /**
     * Gets the value of the sql property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sql property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSql().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sql }
     * 
     * 
     * @return list of Sql contained inside this Transaction
     */
    public List<Sql> getSql() {
        if (sql == null) {
            sql = new ArrayList<>();
        }
        return this.sql;
    }
    

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhen(String value) {
        this.when = value;
    }

    @Override
    public void print(XMLStreamWriter writer, ParserService parent) throws XMLStreamException, IOException, XPathExpressionException, ResourceTestException, SAXException {
        this.parent = parent;
        
        if (getWhen() != null) {
            writer.writeStartElement("c:if");
            //String testString = getQuotedString(tx.getWhen());
            //writer.writeAttribute("test", enclose(testString.replace("$", "mtgReq.params")));
            String test = transformVariables(getWhen(),parent.elementIds,false);
            writeUnescapedData(" test=\""+enclose(StringEscapeUtils.unescapeXml(test))+"\"",parent.output);
        }
        writer.writeCharacters(System.lineSeparator());
        writer.writeStartElement("sql:transaction");
        
        String ds = this.datasource != null ? this.datasource : DATASOURCE;
        writer.writeAttribute("dataSource", enclose(ds));
        
        for(Sql s: getSql()){
            s.print(writer, parent);
        }
        
        writer.writeEndElement(); //End of <sql:transaction> 
        if (getWhen() != null) {
            writer.writeEndElement(); //End of <c:if>
        }
    }

    @Override
    public Set<String> getRequestParameters() {
        Set<String> p = new HashSet<>();
        getSql().forEach( s -> {
            getRequestParametersFromString(p, s.getWhen());
            getRequestParametersFromString(p, s.getValue());
        });   
        return p;
    }

    @Override
    public String extractFromMPath(String mpathVariable, String elementId, boolean enclose) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}