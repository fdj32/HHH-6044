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
 *                 Defines the settings and mappings for embeddable objects. Is
 *                 allowed to be sparsely populated and used in conjunction with
 *                 the annotations. Alternatively, the metadata-complete attribute
 *                 can be used to indicate that no annotations are to be processed
 *                 in the class. If this is the case then the defaulting rules will
 *                 be recursively applied.
 * 
 *                 @Target({TYPE}) @Retention(RUNTIME)
 *                 public @interface Embeddable {}
 * 
 *             
 * 
 * <p>Java class for embeddable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="embeddable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attributes" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}embeddable-attributes" minOccurs="0"/&gt;
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
@XmlType(name = "embeddable", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm", propOrder = {
    "description",
    "attributes"
})
public class JaxbEmbeddable
    implements Serializable, ManagedType
{

    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected String description;
    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbEmbeddableAttributes attributes;
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
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbEmbeddableAttributes }
     *     
     */
    public JaxbEmbeddableAttributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbEmbeddableAttributes }
     *     
     */
    public void setAttributes(JaxbEmbeddableAttributes value) {
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
