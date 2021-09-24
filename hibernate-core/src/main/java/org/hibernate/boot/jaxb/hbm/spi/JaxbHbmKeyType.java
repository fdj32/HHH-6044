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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Declares the column name of a foreign key.
 *             
 * 
 * <p>Java class for key-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="key-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="column" type="{http://www.hibernate.org/xsd/orm/hbm}ColumnType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="foreign-key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="not-null" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="on-delete" type="{http://www.hibernate.org/xsd/orm/hbm}OnDeleteEnum" default="noaction" /&gt;
 *       &lt;attribute name="property-ref" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="unique" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="update" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "key-type", namespace = "http://www.hibernate.org/xsd/orm/hbm", propOrder = {
    "column"
})
public class JaxbHbmKeyType
    implements Serializable
{

    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmColumnType> column;
    @XmlAttribute(name = "column")
    protected String columnAttribute;
    @XmlAttribute(name = "foreign-key")
    protected String foreignKey;
    @XmlAttribute(name = "not-null")
    protected Boolean notNull;
    @XmlAttribute(name = "on-delete")
    protected JaxbHbmOnDeleteEnum onDelete;
    @XmlAttribute(name = "property-ref")
    protected String propertyRef;
    @XmlAttribute(name = "unique")
    protected Boolean unique;
    @XmlAttribute(name = "update")
    protected Boolean update;

    /**
     * Gets the value of the column property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmColumnType }
     * 
     * 
     */
    public List<JaxbHbmColumnType> getColumn() {
        if (column == null) {
            column = new ArrayList<JaxbHbmColumnType>();
        }
        return this.column;
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
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdate() {
        return update;
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

}
