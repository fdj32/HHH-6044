//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.23 at 03:19:15 PM CST 
//


package org.hibernate.boot.jaxb.mapping.spi;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *                 @Target({TYPE, METHOD, FIELD}) @Retention(RUNTIME)
 *                 public @interface PrimaryKeyJoinColumn {
 *                 String name() default "";
 *                 String referencedColumnName() default "";
 *                 String columnDefinition() default "";
 *                 }
 * 
 *             
 * 
 * <p>Java class for primary-key-join-column complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="primary-key-join-column"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="referenced-column-name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="column-definition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "primary-key-join-column", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
public class JaxbPrimaryKeyJoinColumn
    implements Serializable
{

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "referenced-column-name")
    protected String referencedColumnName;
    @XmlAttribute(name = "column-definition")
    protected String columnDefinition;

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
     * Gets the value of the referencedColumnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedColumnName() {
        return referencedColumnName;
    }

    /**
     * Sets the value of the referencedColumnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedColumnName(String value) {
        this.referencedColumnName = value;
    }

    /**
     * Gets the value of the columnDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnDefinition() {
        return columnDefinition;
    }

    /**
     * Sets the value of the columnDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnDefinition(String value) {
        this.columnDefinition = value;
    }

}
