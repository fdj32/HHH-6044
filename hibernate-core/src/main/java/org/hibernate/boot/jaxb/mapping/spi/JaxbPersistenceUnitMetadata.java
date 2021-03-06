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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *                 Metadata that applies to the persistence unit and not just to
 *                 the mapping file in which it is contained.
 * 
 *                 If the xml-mapping-metadata-complete element is specified,
 *                 the complete set of mapping metadata for the persistence unit
 *                 is contained in the XML mapping files for the persistence unit.
 * 
 *             
 * 
 * <p>Java class for persistence-unit-metadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistence-unit-metadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xml-mapping-metadata-complete" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}emptyType" minOccurs="0"/&gt;
 *         &lt;element name="persistence-unit-defaults" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}persistence-unit-defaults" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistence-unit-metadata", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm", propOrder = {
    "description",
    "xmlMappingMetadataComplete",
    "persistenceUnitDefaults"
})
public class JaxbPersistenceUnitMetadata
    implements Serializable
{

    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected String description;
    @XmlElement(name = "xml-mapping-metadata-complete", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbEmptyType xmlMappingMetadataComplete;
    @XmlElement(name = "persistence-unit-defaults", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected JaxbPersistenceUnitDefaults persistenceUnitDefaults;

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
     * Gets the value of the xmlMappingMetadataComplete property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbEmptyType }
     *     
     */
    public JaxbEmptyType getXmlMappingMetadataComplete() {
        return xmlMappingMetadataComplete;
    }

    /**
     * Sets the value of the xmlMappingMetadataComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbEmptyType }
     *     
     */
    public void setXmlMappingMetadataComplete(JaxbEmptyType value) {
        this.xmlMappingMetadataComplete = value;
    }

    /**
     * Gets the value of the persistenceUnitDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbPersistenceUnitDefaults }
     *     
     */
    public JaxbPersistenceUnitDefaults getPersistenceUnitDefaults() {
        return persistenceUnitDefaults;
    }

    /**
     * Sets the value of the persistenceUnitDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbPersistenceUnitDefaults }
     *     
     */
    public void setPersistenceUnitDefaults(JaxbPersistenceUnitDefaults value) {
        this.persistenceUnitDefaults = value;
    }

}
