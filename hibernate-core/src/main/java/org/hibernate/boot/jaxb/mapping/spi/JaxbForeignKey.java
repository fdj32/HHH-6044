//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.23 at 03:19:15 PM CST 
//


package org.hibernate.boot.jaxb.mapping.spi;

import java.io.Serializable;
import javax.persistence.ConstraintMode;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 *                 @Target({}) @Retention(RUNTIME)
 *                 public @interface ForeignKey {
 *                 String name() default "";
 *                 ConstraintMode value() defalut CONSTRAINT
 *                 String foreign-key-definition() default "";
 * 
 *                 Note that the elements that embed the use of the annotation
 *                 default this use as @ForeignKey(PROVIDER_DEFAULT)
 *                 }
 * 
 *             
 * 
 * <p>Java class for foreign-key complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foreign-key"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="constraint-mode" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}constraint-mode" /&gt;
 *       &lt;attribute name="foreign-key-definition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foreign-key", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm", propOrder = {
    "description"
})
public class JaxbForeignKey
    implements Serializable
{

    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected String description;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "constraint-mode")
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected ConstraintMode constraintMode;
    @XmlAttribute(name = "foreign-key-definition")
    protected String foreignKeyDefinition;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the constraintMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ConstraintMode getConstraintMode() {
        return constraintMode;
    }

    /**
     * Sets the value of the constraintMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintMode(ConstraintMode value) {
        this.constraintMode = value;
    }

    /**
     * Gets the value of the foreignKeyDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignKeyDefinition() {
        return foreignKeyDefinition;
    }

    /**
     * Sets the value of the foreignKeyDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignKeyDefinition(String value) {
        this.foreignKeyDefinition = value;
    }

}