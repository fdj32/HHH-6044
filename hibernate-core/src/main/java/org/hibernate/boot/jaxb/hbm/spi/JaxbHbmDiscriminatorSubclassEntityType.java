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
 * 
 *                 Subclass declarations are nested beneath the root class declaration to achieve
 *                 polymorphic persistence with the table-per-hierarchy mapping strategy.
 *                 See the note on the class element regarding <pojo/> vs. @name usage...
 *             
 * 
 * <p>Java class for DiscriminatorSubclassEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscriminatorSubclassEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hibernate.org/xsd/orm/hbm}SubclassEntityBaseDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tuplizer" type="{http://www.hibernate.org/xsd/orm/hbm}tuplizer-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="synchronize" type="{http://www.hibernate.org/xsd/orm/hbm}synchronize-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}SingularAttributeGroup"/&gt;
 *           &lt;element name="idbag" type="{http://www.hibernate.org/xsd/orm/hbm}IdBagCollectionType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="join" type="{http://www.hibernate.org/xsd/orm/hbm}SecondaryTableType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subclass" type="{http://www.hibernate.org/xsd/orm/hbm}DiscriminatorSubclassEntityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="loader" type="{http://www.hibernate.org/xsd/orm/hbm}loader-type" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}CustomSqlDmlGroup" minOccurs="0"/&gt;
 *         &lt;element name="fetch-profile" type="{http://www.hibernate.org/xsd/orm/hbm}FetchProfileType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resultset" type="{http://www.hibernate.org/xsd/orm/hbm}ResultSetMappingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}NamedQueryGroup"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="discriminator-value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscriminatorSubclassEntityType", namespace = "http://www.hibernate.org/xsd/orm/hbm", propOrder = {
    "tuplizer",
    "synchronize",
    "attributes",
    "join",
    "subclass",
    "loader",
    "sqlInsert",
    "sqlUpdate",
    "sqlDelete",
    "fetchProfile",
    "resultset",
    "query",
    "sqlQuery"
})
public class JaxbHbmDiscriminatorSubclassEntityType
    extends JaxbHbmSubclassEntityBaseDefinition
    implements Serializable, SecondaryTableContainer, SubEntityInfo, ToolingHintContainer
{

    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmTuplizerType> tuplizer;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmSynchronizeType> synchronize;
    @XmlElements({
        @XmlElement(name = "property", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmBasicAttributeType.class),
        @XmlElement(name = "many-to-one", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmManyToOneType.class),
        @XmlElement(name = "one-to-one", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmOneToOneType.class),
        @XmlElement(name = "component", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmCompositeAttributeType.class),
        @XmlElement(name = "dynamic-component", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmDynamicComponentType.class),
        @XmlElement(name = "properties", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmPropertiesType.class),
        @XmlElement(name = "any", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmAnyAssociationType.class),
        @XmlElement(name = "map", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmMapType.class),
        @XmlElement(name = "set", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmSetType.class),
        @XmlElement(name = "list", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmListType.class),
        @XmlElement(name = "bag", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmBagCollectionType.class),
        @XmlElement(name = "array", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmArrayType.class),
        @XmlElement(name = "primitive-array", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmPrimitiveArrayType.class),
        @XmlElement(name = "idbag", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmIdBagCollectionType.class)
    })
    protected List<Serializable> attributes;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmSecondaryTableType> join;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmDiscriminatorSubclassEntityType> subclass;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmLoaderType loader;
    @XmlElement(name = "sql-insert", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmCustomSqlDmlType sqlInsert;
    @XmlElement(name = "sql-update", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmCustomSqlDmlType sqlUpdate;
    @XmlElement(name = "sql-delete", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmCustomSqlDmlType sqlDelete;
    @XmlElement(name = "fetch-profile", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmFetchProfileType> fetchProfile;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmResultSetMappingType> resultset;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmNamedQueryType> query;
    @XmlElement(name = "sql-query", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmNamedNativeQueryType> sqlQuery;
    @XmlAttribute(name = "discriminator-value")
    protected String discriminatorValue;

    /**
     * Gets the value of the tuplizer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tuplizer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuplizer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmTuplizerType }
     * 
     * 
     */
    public List<JaxbHbmTuplizerType> getTuplizer() {
        if (tuplizer == null) {
            tuplizer = new ArrayList<JaxbHbmTuplizerType>();
        }
        return this.tuplizer;
    }

    /**
     * Gets the value of the synchronize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synchronize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynchronize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmSynchronizeType }
     * 
     * 
     */
    public List<JaxbHbmSynchronizeType> getSynchronize() {
        if (synchronize == null) {
            synchronize = new ArrayList<JaxbHbmSynchronizeType>();
        }
        return this.synchronize;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmBasicAttributeType }
     * {@link JaxbHbmManyToOneType }
     * {@link JaxbHbmOneToOneType }
     * {@link JaxbHbmCompositeAttributeType }
     * {@link JaxbHbmDynamicComponentType }
     * {@link JaxbHbmPropertiesType }
     * {@link JaxbHbmAnyAssociationType }
     * {@link JaxbHbmMapType }
     * {@link JaxbHbmSetType }
     * {@link JaxbHbmListType }
     * {@link JaxbHbmBagCollectionType }
     * {@link JaxbHbmArrayType }
     * {@link JaxbHbmPrimitiveArrayType }
     * {@link JaxbHbmIdBagCollectionType }
     * 
     * 
     */
    public List<Serializable> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<Serializable>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the join property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the join property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmSecondaryTableType }
     * 
     * 
     */
    public List<JaxbHbmSecondaryTableType> getJoin() {
        if (join == null) {
            join = new ArrayList<JaxbHbmSecondaryTableType>();
        }
        return this.join;
    }

    /**
     * Gets the value of the subclass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subclass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubclass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmDiscriminatorSubclassEntityType }
     * 
     * 
     */
    public List<JaxbHbmDiscriminatorSubclassEntityType> getSubclass() {
        if (subclass == null) {
            subclass = new ArrayList<JaxbHbmDiscriminatorSubclassEntityType>();
        }
        return this.subclass;
    }

    /**
     * Gets the value of the loader property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmLoaderType }
     *     
     */
    public JaxbHbmLoaderType getLoader() {
        return loader;
    }

    /**
     * Sets the value of the loader property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmLoaderType }
     *     
     */
    public void setLoader(JaxbHbmLoaderType value) {
        this.loader = value;
    }

    /**
     * Gets the value of the sqlInsert property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public JaxbHbmCustomSqlDmlType getSqlInsert() {
        return sqlInsert;
    }

    /**
     * Sets the value of the sqlInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public void setSqlInsert(JaxbHbmCustomSqlDmlType value) {
        this.sqlInsert = value;
    }

    /**
     * Gets the value of the sqlUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public JaxbHbmCustomSqlDmlType getSqlUpdate() {
        return sqlUpdate;
    }

    /**
     * Sets the value of the sqlUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public void setSqlUpdate(JaxbHbmCustomSqlDmlType value) {
        this.sqlUpdate = value;
    }

    /**
     * Gets the value of the sqlDelete property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public JaxbHbmCustomSqlDmlType getSqlDelete() {
        return sqlDelete;
    }

    /**
     * Sets the value of the sqlDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public void setSqlDelete(JaxbHbmCustomSqlDmlType value) {
        this.sqlDelete = value;
    }

    /**
     * Gets the value of the fetchProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fetchProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFetchProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmFetchProfileType }
     * 
     * 
     */
    public List<JaxbHbmFetchProfileType> getFetchProfile() {
        if (fetchProfile == null) {
            fetchProfile = new ArrayList<JaxbHbmFetchProfileType>();
        }
        return this.fetchProfile;
    }

    /**
     * Gets the value of the resultset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmResultSetMappingType }
     * 
     * 
     */
    public List<JaxbHbmResultSetMappingType> getResultset() {
        if (resultset == null) {
            resultset = new ArrayList<JaxbHbmResultSetMappingType>();
        }
        return this.resultset;
    }

    /**
     * Gets the value of the query property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the query property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmNamedQueryType }
     * 
     * 
     */
    public List<JaxbHbmNamedQueryType> getQuery() {
        if (query == null) {
            query = new ArrayList<JaxbHbmNamedQueryType>();
        }
        return this.query;
    }

    /**
     * Gets the value of the sqlQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sqlQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSqlQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmNamedNativeQueryType }
     * 
     * 
     */
    public List<JaxbHbmNamedNativeQueryType> getSqlQuery() {
        if (sqlQuery == null) {
            sqlQuery = new ArrayList<JaxbHbmNamedNativeQueryType>();
        }
        return this.sqlQuery;
    }

    /**
     * Gets the value of the discriminatorValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscriminatorValue() {
        return discriminatorValue;
    }

    /**
     * Sets the value of the discriminatorValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscriminatorValue(String value) {
        this.discriminatorValue = value;
    }

}
