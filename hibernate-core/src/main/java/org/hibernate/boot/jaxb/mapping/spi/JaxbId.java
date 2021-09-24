//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.23 at 03:19:15 PM CST 
//


package org.hibernate.boot.jaxb.mapping.spi;

import java.io.Serializable;
import javax.persistence.AccessType;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 *                 @Target({METHOD, FIELD}) @Retention(RUNTIME)
 *                 public @interface Id {}
 * 
 *             
 * 
 * <p>Java class for id complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="id"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="column" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}column" minOccurs="0"/&gt;
 *         &lt;element name="generated-value" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}generated-value" minOccurs="0"/&gt;
 *         &lt;element name="temporal" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}temporal" minOccurs="0"/&gt;
 *         &lt;element name="table-generator" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}table-generator" minOccurs="0"/&gt;
 *         &lt;element name="sequence-generator" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}sequence-generator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="access" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}access-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "id", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm", propOrder = {
    "column",
    "generatedValue",
    "temporal",
    "tableGenerator",
    "sequenceGenerator"
})
public class JaxbId
    implements Serializable, PersistentAttribute
{

    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbColumn column;
    @XmlElement(name = "generated-value", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbGeneratedValue generatedValue;
    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm", type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    @XmlSchemaType(name = "token")
    protected TemporalType temporal;
    @XmlElement(name = "table-generator", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbTableGenerator tableGenerator;
    @XmlElement(name = "sequence-generator", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbSequenceGenerator sequenceGenerator;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "access")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected AccessType access;

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbColumn }
     *     
     */
    public JaxbColumn getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbColumn }
     *     
     */
    public void setColumn(JaxbColumn value) {
        this.column = value;
    }

    /**
     * Gets the value of the generatedValue property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbGeneratedValue }
     *     
     */
    public JaxbGeneratedValue getGeneratedValue() {
        return generatedValue;
    }

    /**
     * Sets the value of the generatedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbGeneratedValue }
     *     
     */
    public void setGeneratedValue(JaxbGeneratedValue value) {
        this.generatedValue = value;
    }

    /**
     * Gets the value of the temporal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public TemporalType getTemporal() {
        return temporal;
    }

    /**
     * Sets the value of the temporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporal(TemporalType value) {
        this.temporal = value;
    }

    /**
     * Gets the value of the tableGenerator property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbTableGenerator }
     *     
     */
    public JaxbTableGenerator getTableGenerator() {
        return tableGenerator;
    }

    /**
     * Sets the value of the tableGenerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbTableGenerator }
     *     
     */
    public void setTableGenerator(JaxbTableGenerator value) {
        this.tableGenerator = value;
    }

    /**
     * Gets the value of the sequenceGenerator property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbSequenceGenerator }
     *     
     */
    public JaxbSequenceGenerator getSequenceGenerator() {
        return sequenceGenerator;
    }

    /**
     * Sets the value of the sequenceGenerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbSequenceGenerator }
     *     
     */
    public void setSequenceGenerator(JaxbSequenceGenerator value) {
        this.sequenceGenerator = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public AccessType getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccess(AccessType value) {
        this.access = value;
    }

}
