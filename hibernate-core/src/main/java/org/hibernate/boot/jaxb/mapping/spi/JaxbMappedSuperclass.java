//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.23 at 03:19:15 PM CST 
//


package org.hibernate.boot.jaxb.mapping.spi;

import java.io.Serializable;
import javax.persistence.AccessType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 *                 Defines the settings and mappings for a mapped superclass. Is
 *                 allowed to be sparsely populated and used in conjunction with
 *                 the annotations. Alternatively, the metadata-complete attribute
 *                 can be used to indicate that no annotations are to be processed
 *                 If this is the case then the defaulting rules will be recursively
 *                 applied.
 * 
 *                 @Target(TYPE) @Retention(RUNTIME)
 *                 public @interface MappedSuperclass{}
 * 
 *             
 * 
 * <p>Java class for mapped-superclass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mapped-superclass"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id-class" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}id-class" minOccurs="0"/&gt;
 *         &lt;element name="exclude-default-listeners" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}emptyType" minOccurs="0"/&gt;
 *         &lt;element name="exclude-superclass-listeners" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}emptyType" minOccurs="0"/&gt;
 *         &lt;element name="entity-listeners" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}entity-listeners" minOccurs="0"/&gt;
 *         &lt;element name="pre-persist" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}pre-persist" minOccurs="0"/&gt;
 *         &lt;element name="post-persist" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}post-persist" minOccurs="0"/&gt;
 *         &lt;element name="pre-remove" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}pre-remove" minOccurs="0"/&gt;
 *         &lt;element name="post-remove" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}post-remove" minOccurs="0"/&gt;
 *         &lt;element name="pre-update" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}pre-update" minOccurs="0"/&gt;
 *         &lt;element name="post-update" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}post-update" minOccurs="0"/&gt;
 *         &lt;element name="post-load" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}post-load" minOccurs="0"/&gt;
 *         &lt;element name="attributes" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}attributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="access" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}access-type" /&gt;
 *       &lt;attribute name="metadata-complete" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mapped-superclass", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm", propOrder = {
    "description",
    "idClass",
    "excludeDefaultListeners",
    "excludeSuperclassListeners",
    "entityListeners",
    "prePersist",
    "postPersist",
    "preRemove",
    "postRemove",
    "preUpdate",
    "postUpdate",
    "postLoad",
    "attributes"
})
public class JaxbMappedSuperclass
    implements Serializable, EntityOrMappedSuperclass, LifecycleCallbackContainer, ManagedType
{

    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected String description;
    @XmlElement(name = "id-class", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbIdClass idClass;
    @XmlElement(name = "exclude-default-listeners", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbEmptyType excludeDefaultListeners;
    @XmlElement(name = "exclude-superclass-listeners", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbEmptyType excludeSuperclassListeners;
    @XmlElement(name = "entity-listeners", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbEntityListeners entityListeners;
    @XmlElement(name = "pre-persist", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbPrePersist prePersist;
    @XmlElement(name = "post-persist", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbPostPersist postPersist;
    @XmlElement(name = "pre-remove", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbPreRemove preRemove;
    @XmlElement(name = "post-remove", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbPostRemove postRemove;
    @XmlElement(name = "pre-update", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbPreUpdate preUpdate;
    @XmlElement(name = "post-update", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbPostUpdate postUpdate;
    @XmlElement(name = "post-load", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbPostLoad postLoad;
    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbAttributes attributes;
    @XmlAttribute(name = "class", required = true)
    protected String clazz;
    @XmlAttribute(name = "access")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected AccessType access;
    @XmlAttribute(name = "metadata-complete")
    protected Boolean metadataComplete;

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
     * Gets the value of the idClass property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbIdClass }
     *     
     */
    public JaxbIdClass getIdClass() {
        return idClass;
    }

    /**
     * Sets the value of the idClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbIdClass }
     *     
     */
    public void setIdClass(JaxbIdClass value) {
        this.idClass = value;
    }

    /**
     * Gets the value of the excludeDefaultListeners property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbEmptyType }
     *     
     */
    public JaxbEmptyType getExcludeDefaultListeners() {
        return excludeDefaultListeners;
    }

    /**
     * Sets the value of the excludeDefaultListeners property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbEmptyType }
     *     
     */
    public void setExcludeDefaultListeners(JaxbEmptyType value) {
        this.excludeDefaultListeners = value;
    }

    /**
     * Gets the value of the excludeSuperclassListeners property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbEmptyType }
     *     
     */
    public JaxbEmptyType getExcludeSuperclassListeners() {
        return excludeSuperclassListeners;
    }

    /**
     * Sets the value of the excludeSuperclassListeners property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbEmptyType }
     *     
     */
    public void setExcludeSuperclassListeners(JaxbEmptyType value) {
        this.excludeSuperclassListeners = value;
    }

    /**
     * Gets the value of the entityListeners property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbEntityListeners }
     *     
     */
    public JaxbEntityListeners getEntityListeners() {
        return entityListeners;
    }

    /**
     * Sets the value of the entityListeners property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbEntityListeners }
     *     
     */
    public void setEntityListeners(JaxbEntityListeners value) {
        this.entityListeners = value;
    }

    /**
     * Gets the value of the prePersist property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbPrePersist }
     *     
     */
    public JaxbPrePersist getPrePersist() {
        return prePersist;
    }

    /**
     * Sets the value of the prePersist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbPrePersist }
     *     
     */
    public void setPrePersist(JaxbPrePersist value) {
        this.prePersist = value;
    }

    /**
     * Gets the value of the postPersist property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbPostPersist }
     *     
     */
    public JaxbPostPersist getPostPersist() {
        return postPersist;
    }

    /**
     * Sets the value of the postPersist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbPostPersist }
     *     
     */
    public void setPostPersist(JaxbPostPersist value) {
        this.postPersist = value;
    }

    /**
     * Gets the value of the preRemove property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbPreRemove }
     *     
     */
    public JaxbPreRemove getPreRemove() {
        return preRemove;
    }

    /**
     * Sets the value of the preRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbPreRemove }
     *     
     */
    public void setPreRemove(JaxbPreRemove value) {
        this.preRemove = value;
    }

    /**
     * Gets the value of the postRemove property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbPostRemove }
     *     
     */
    public JaxbPostRemove getPostRemove() {
        return postRemove;
    }

    /**
     * Sets the value of the postRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbPostRemove }
     *     
     */
    public void setPostRemove(JaxbPostRemove value) {
        this.postRemove = value;
    }

    /**
     * Gets the value of the preUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbPreUpdate }
     *     
     */
    public JaxbPreUpdate getPreUpdate() {
        return preUpdate;
    }

    /**
     * Sets the value of the preUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbPreUpdate }
     *     
     */
    public void setPreUpdate(JaxbPreUpdate value) {
        this.preUpdate = value;
    }

    /**
     * Gets the value of the postUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbPostUpdate }
     *     
     */
    public JaxbPostUpdate getPostUpdate() {
        return postUpdate;
    }

    /**
     * Sets the value of the postUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbPostUpdate }
     *     
     */
    public void setPostUpdate(JaxbPostUpdate value) {
        this.postUpdate = value;
    }

    /**
     * Gets the value of the postLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbPostLoad }
     *     
     */
    public JaxbPostLoad getPostLoad() {
        return postLoad;
    }

    /**
     * Sets the value of the postLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbPostLoad }
     *     
     */
    public void setPostLoad(JaxbPostLoad value) {
        this.postLoad = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbAttributes }
     *     
     */
    public JaxbAttributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbAttributes }
     *     
     */
    public void setAttributes(JaxbAttributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
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
     * Gets the value of the metadataComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMetadataComplete() {
        return metadataComplete;
    }

    /**
     * Sets the value of the metadataComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMetadataComplete(Boolean value) {
        this.metadataComplete = value;
    }

}
