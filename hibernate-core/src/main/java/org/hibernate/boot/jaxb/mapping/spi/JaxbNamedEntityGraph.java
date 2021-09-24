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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *                 @Target({TYPE}) @Retention(RUNTIME)
 *                 public @interface NamedEntityGraph {
 *                 String name() default "";
 *                 NamedAttributeNode[] attributeNodes() default {};
 *                 boolean includeAllAttributes() default false;
 *                 NamedSubgraph[] subgraphs() default {};
 *                 NamedSubGraph[] subclassSubgraphs() default {};
 *                 }
 * 
 *             
 * 
 * <p>Java class for named-entity-graph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="named-entity-graph"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="named-attribute-node" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}named-attribute-node" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subgraph" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}named-subgraph" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subclass-subgraph" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}named-subgraph" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="include-all-attributes" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "named-entity-graph", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm", propOrder = {
    "namedAttributeNode",
    "subgraph",
    "subclassSubgraph"
})
public class JaxbNamedEntityGraph
    implements Serializable
{

    @XmlElement(name = "named-attribute-node", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbNamedAttributeNode> namedAttributeNode;
    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbNamedSubgraph> subgraph;
    @XmlElement(name = "subclass-subgraph", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbNamedSubgraph> subclassSubgraph;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "include-all-attributes")
    protected Boolean includeAllAttributes;

    /**
     * Gets the value of the namedAttributeNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedAttributeNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedAttributeNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbNamedAttributeNode }
     * 
     * 
     */
    public List<JaxbNamedAttributeNode> getNamedAttributeNode() {
        if (namedAttributeNode == null) {
            namedAttributeNode = new ArrayList<JaxbNamedAttributeNode>();
        }
        return this.namedAttributeNode;
    }

    /**
     * Gets the value of the subgraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subgraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubgraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbNamedSubgraph }
     * 
     * 
     */
    public List<JaxbNamedSubgraph> getSubgraph() {
        if (subgraph == null) {
            subgraph = new ArrayList<JaxbNamedSubgraph>();
        }
        return this.subgraph;
    }

    /**
     * Gets the value of the subclassSubgraph property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subclassSubgraph property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubclassSubgraph().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbNamedSubgraph }
     * 
     * 
     */
    public List<JaxbNamedSubgraph> getSubclassSubgraph() {
        if (subclassSubgraph == null) {
            subclassSubgraph = new ArrayList<JaxbNamedSubgraph>();
        }
        return this.subclassSubgraph;
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
     * Gets the value of the includeAllAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllAttributes() {
        return includeAllAttributes;
    }

    /**
     * Sets the value of the includeAllAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllAttributes(Boolean value) {
        this.includeAllAttributes = value;
    }

}
