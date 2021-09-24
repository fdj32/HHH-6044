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
 *                 @Target({METHOD, FIELD}) @Retention(RUNTIME)
 *                 public @interface Column {
 *                 String name() default "";
 *                 boolean unique() default false;
 *                 boolean nullable() default true;
 *                 boolean insertable() default true;
 *                 boolean updatable() default true;
 *                 String columnDefinition() default "";
 *                 String table() default "";
 *                 int length() default 255;
 *                 int precision() default 0; // decimal precision
 *                 int scale() default 0; // decimal scale
 *                 }
 * 
 *             
 * 
 * <p>Java class for column complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="column"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="unique" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="nullable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="insertable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="updatable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="column-definition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="table" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "column", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
public class JaxbColumn
    implements Serializable
{

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "unique")
    protected Boolean unique;
    @XmlAttribute(name = "nullable")
    protected Boolean nullable;
    @XmlAttribute(name = "insertable")
    protected Boolean insertable;
    @XmlAttribute(name = "updatable")
    protected Boolean updatable;
    @XmlAttribute(name = "column-definition")
    protected String columnDefinition;
    @XmlAttribute(name = "table")
    protected String table;
    @XmlAttribute(name = "length")
    protected Integer length;
    @XmlAttribute(name = "precision")
    protected Integer precision;
    @XmlAttribute(name = "scale")
    protected Integer scale;

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
     * Gets the value of the unique property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnique(Boolean value) {
        this.unique = value;
    }

    /**
     * Gets the value of the nullable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNullable() {
        return nullable;
    }

    /**
     * Sets the value of the nullable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNullable(Boolean value) {
        this.nullable = value;
    }

    /**
     * Gets the value of the insertable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsertable() {
        return insertable;
    }

    /**
     * Sets the value of the insertable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsertable(Boolean value) {
        this.insertable = value;
    }

    /**
     * Gets the value of the updatable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdatable() {
        return updatable;
    }

    /**
     * Sets the value of the updatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdatable(Boolean value) {
        this.updatable = value;
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

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
    }

}
