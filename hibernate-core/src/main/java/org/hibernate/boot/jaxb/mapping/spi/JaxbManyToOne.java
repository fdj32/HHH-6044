//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.23 at 03:19:15 PM CST 
//


package org.hibernate.boot.jaxb.mapping.spi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.AccessType;
import javax.persistence.FetchType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 *                 @Target({METHOD, FIELD}) @Retention(RUNTIME)
 *                 public @interface ManyToOne {
 *                 Class targetEntity() default void.class;
 *                 CascadeType[] cascade() default {};
 *                 FetchType fetch() default EAGER;
 *                 boolean optional() default true;
 *                 }
 * 
 *             
 * 
 * <p>Java class for many-to-one complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="many-to-one"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="join-column" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}join-column" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element name="foreign-key" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}foreign-key" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="join-table" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}join-table" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="cascade" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}cascade-type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="target-entity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fetch" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}fetch-type" /&gt;
 *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="access" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}access-type" /&gt;
 *       &lt;attribute name="maps-id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "many-to-one", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm", propOrder = {
    "joinColumn",
    "foreignKey",
    "joinTable",
    "cascade"
})
public class JaxbManyToOne
    implements Serializable, AssociationAttribute, FetchableAttribute, PersistentAttribute
{

    @XmlElement(name = "join-column", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbJoinColumn> joinColumn;
    @XmlElement(name = "foreign-key", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbForeignKey foreignKey;
    @XmlElement(name = "join-table", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbJoinTable joinTable;
    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbCascadeType cascade;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "target-entity")
    protected String targetEntity;
    @XmlAttribute(name = "fetch")
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected FetchType fetch;
    @XmlAttribute(name = "optional")
    protected Boolean optional;
    @XmlAttribute(name = "access")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected AccessType access;
    @XmlAttribute(name = "maps-id")
    protected String mapsId;
    @XmlAttribute(name = "id")
    protected Boolean id;

    /**
     * Gets the value of the joinColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the joinColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJoinColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbJoinColumn }
     * 
     * 
     */
    public List<JaxbJoinColumn> getJoinColumn() {
        if (joinColumn == null) {
            joinColumn = new ArrayList<JaxbJoinColumn>();
        }
        return this.joinColumn;
    }

    /**
     * Gets the value of the foreignKey property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbForeignKey }
     *     
     */
    public JaxbForeignKey getForeignKey() {
        return foreignKey;
    }

    /**
     * Sets the value of the foreignKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbForeignKey }
     *     
     */
    public void setForeignKey(JaxbForeignKey value) {
        this.foreignKey = value;
    }

    /**
     * Gets the value of the joinTable property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbJoinTable }
     *     
     */
    public JaxbJoinTable getJoinTable() {
        return joinTable;
    }

    /**
     * Sets the value of the joinTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbJoinTable }
     *     
     */
    public void setJoinTable(JaxbJoinTable value) {
        this.joinTable = value;
    }

    /**
     * Gets the value of the cascade property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbCascadeType }
     *     
     */
    public JaxbCascadeType getCascade() {
        return cascade;
    }

    /**
     * Sets the value of the cascade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbCascadeType }
     *     
     */
    public void setCascade(JaxbCascadeType value) {
        this.cascade = value;
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
     * Gets the value of the targetEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEntity() {
        return targetEntity;
    }

    /**
     * Sets the value of the targetEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEntity(String value) {
        this.targetEntity = value;
    }

    /**
     * Gets the value of the fetch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public FetchType getFetch() {
        return fetch;
    }

    /**
     * Sets the value of the fetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetch(FetchType value) {
        this.fetch = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptional(Boolean value) {
        this.optional = value;
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

    /**
     * Gets the value of the mapsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapsId() {
        return mapsId;
    }

    /**
     * Sets the value of the mapsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapsId(String value) {
        this.mapsId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setId(Boolean value) {
        this.id = value;
    }

}
