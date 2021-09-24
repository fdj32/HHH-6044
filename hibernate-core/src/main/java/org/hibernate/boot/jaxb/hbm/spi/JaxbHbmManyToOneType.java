//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.23 at 03:19:14 PM CST 
//


package org.hibernate.boot.jaxb.hbm.spi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManyToOneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManyToOneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hibernate.org/xsd/orm/hbm}ToolingHintContainer"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}column-or-formula"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cascade" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="class" type="{http://www.hibernate.org/xsd/orm/hbm}ClassNameType" /&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="embed-xml" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="entity-name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fetch" type="{http://www.hibernate.org/xsd/orm/hbm}FetchStyleEnum" /&gt;
 *       &lt;attribute name="foreign-key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="formula" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="insert" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="lazy" type="{http://www.hibernate.org/xsd/orm/hbm}LazyWithNoProxyEnum" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="not-found" type="{http://www.hibernate.org/xsd/orm/hbm}NotFoundEnum" default="exception" /&gt;
 *       &lt;attribute name="not-null" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="optimistic-lock" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="outer-join" type="{http://www.hibernate.org/xsd/orm/hbm}OuterJoinEnum" /&gt;
 *       &lt;attribute name="property-ref" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="unique" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="unique-key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="update" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="on-delete" type="{http://www.hibernate.org/xsd/orm/hbm}OnDeleteEnum" default="noaction" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManyToOneType", namespace = "http://www.hibernate.org/xsd/orm/hbm", propOrder = {
    "columnOrFormula"
})
public class JaxbHbmManyToOneType
    extends JaxbHbmToolingHintContainer
    implements Serializable, SingularAttributeInfo, ToolingHintContainer
{

    @XmlElements({
        @XmlElement(name = "column", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmColumnType.class),
        @XmlElement(name = "formula", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = String.class)
    })
    protected List<Serializable> columnOrFormula;
    @XmlAttribute(name = "access")
    protected String access;
    @XmlAttribute(name = "cascade")
    protected String cascade;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "column")
    protected String columnAttribute;
    @XmlAttribute(name = "embed-xml")
    protected Boolean embedXml;
    @XmlAttribute(name = "entity-name")
    protected String entityName;
    @XmlAttribute(name = "fetch")
    protected JaxbHbmFetchStyleEnum fetch;
    @XmlAttribute(name = "foreign-key")
    protected String foreignKey;
    @XmlAttribute(name = "formula")
    protected String formulaAttribute;
    @XmlAttribute(name = "index")
    protected String index;
    @XmlAttribute(name = "insert")
    protected Boolean insert;
    @XmlAttribute(name = "lazy")
    protected JaxbHbmLazyWithNoProxyEnum lazy;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "node")
    protected String node;
    @XmlAttribute(name = "not-found")
    protected JaxbHbmNotFoundEnum notFound;
    @XmlAttribute(name = "not-null")
    protected Boolean notNull;
    @XmlAttribute(name = "optimistic-lock")
    protected Boolean optimisticLock;
    @XmlAttribute(name = "outer-join")
    protected JaxbHbmOuterJoinEnum outerJoin;
    @XmlAttribute(name = "property-ref")
    protected String propertyRef;
    @XmlAttribute(name = "unique")
    protected Boolean unique;
    @XmlAttribute(name = "unique-key")
    protected String uniqueKey;
    @XmlAttribute(name = "update")
    protected Boolean update;
    @XmlAttribute(name = "on-delete")
    protected JaxbHbmOnDeleteEnum onDelete;

    /**
     * Gets the value of the columnOrFormula property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnOrFormula property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnOrFormula().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmColumnType }
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getColumnOrFormula() {
        if (columnOrFormula == null) {
            columnOrFormula = new ArrayList<Serializable>();
        }
        return this.columnOrFormula;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccess() {
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
    public void setAccess(String value) {
        this.access = value;
    }

    /**
     * Gets the value of the cascade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCascade() {
        return cascade;
    }

    /**
     * Sets the value of the cascade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCascade(String value) {
        this.cascade = value;
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
     * Gets the value of the columnAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnAttribute() {
        return columnAttribute;
    }

    /**
     * Sets the value of the columnAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnAttribute(String value) {
        this.columnAttribute = value;
    }

    /**
     * Gets the value of the embedXml property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmbedXml() {
        return embedXml;
    }

    /**
     * Sets the value of the embedXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmbedXml(Boolean value) {
        this.embedXml = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the fetch property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmFetchStyleEnum }
     *     
     */
    public JaxbHbmFetchStyleEnum getFetch() {
        return fetch;
    }

    /**
     * Sets the value of the fetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmFetchStyleEnum }
     *     
     */
    public void setFetch(JaxbHbmFetchStyleEnum value) {
        this.fetch = value;
    }

    /**
     * Gets the value of the foreignKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignKey() {
        return foreignKey;
    }

    /**
     * Sets the value of the foreignKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignKey(String value) {
        this.foreignKey = value;
    }

    /**
     * Gets the value of the formulaAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaAttribute() {
        return formulaAttribute;
    }

    /**
     * Sets the value of the formulaAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaAttribute(String value) {
        this.formulaAttribute = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the insert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInsert() {
        if (insert == null) {
            return true;
        } else {
            return insert;
        }
    }

    /**
     * Sets the value of the insert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsert(Boolean value) {
        this.insert = value;
    }

    /**
     * Gets the value of the lazy property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmLazyWithNoProxyEnum }
     *     
     */
    public JaxbHbmLazyWithNoProxyEnum getLazy() {
        return lazy;
    }

    /**
     * Sets the value of the lazy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmLazyWithNoProxyEnum }
     *     
     */
    public void setLazy(JaxbHbmLazyWithNoProxyEnum value) {
        this.lazy = value;
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
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the notFound property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmNotFoundEnum }
     *     
     */
    public JaxbHbmNotFoundEnum getNotFound() {
        if (notFound == null) {
            return JaxbHbmNotFoundEnum.EXCEPTION;
        } else {
            return notFound;
        }
    }

    /**
     * Sets the value of the notFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmNotFoundEnum }
     *     
     */
    public void setNotFound(JaxbHbmNotFoundEnum value) {
        this.notFound = value;
    }

    /**
     * Gets the value of the notNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotNull() {
        return notNull;
    }

    /**
     * Sets the value of the notNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotNull(Boolean value) {
        this.notNull = value;
    }

    /**
     * Gets the value of the optimisticLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOptimisticLock() {
        if (optimisticLock == null) {
            return true;
        } else {
            return optimisticLock;
        }
    }

    /**
     * Sets the value of the optimisticLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimisticLock(Boolean value) {
        this.optimisticLock = value;
    }

    /**
     * Gets the value of the outerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmOuterJoinEnum }
     *     
     */
    public JaxbHbmOuterJoinEnum getOuterJoin() {
        return outerJoin;
    }

    /**
     * Sets the value of the outerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmOuterJoinEnum }
     *     
     */
    public void setOuterJoin(JaxbHbmOuterJoinEnum value) {
        this.outerJoin = value;
    }

    /**
     * Gets the value of the propertyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyRef() {
        return propertyRef;
    }

    /**
     * Sets the value of the propertyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyRef(String value) {
        this.propertyRef = value;
    }

    /**
     * Gets the value of the unique property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUnique() {
        if (unique == null) {
            return false;
        } else {
            return unique;
        }
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
     * Gets the value of the uniqueKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * Sets the value of the uniqueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueKey(String value) {
        this.uniqueKey = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUpdate() {
        if (update == null) {
            return true;
        } else {
            return update;
        }
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdate(Boolean value) {
        this.update = value;
    }

    /**
     * Gets the value of the onDelete property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmOnDeleteEnum }
     *     
     */
    public JaxbHbmOnDeleteEnum getOnDelete() {
        if (onDelete == null) {
            return JaxbHbmOnDeleteEnum.NOACTION;
        } else {
            return onDelete;
        }
    }

    /**
     * Sets the value of the onDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmOnDeleteEnum }
     *     
     */
    public void setOnDelete(JaxbHbmOnDeleteEnum value) {
        this.onDelete = value;
    }

}
