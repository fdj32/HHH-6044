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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for embeddable-attributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="embeddable-attributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}basic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="many-to-one" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}many-to-one" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="one-to-many" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}one-to-many" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="one-to-one" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}one-to-one" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="many-to-many" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}many-to-many" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="element-collection" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}element-collection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="embedded" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}embedded" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transient" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}transient" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "embeddable-attributes", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm", propOrder = {
    "basic",
    "manyToOne",
    "oneToMany",
    "oneToOne",
    "manyToMany",
    "elementCollection",
    "embedded",
    "_transient"
})
public class JaxbEmbeddableAttributes
    implements Serializable, AttributesContainer
{

    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbBasic> basic;
    @XmlElement(name = "many-to-one", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbManyToOne> manyToOne;
    @XmlElement(name = "one-to-many", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbOneToMany> oneToMany;
    @XmlElement(name = "one-to-one", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbOneToOne> oneToOne;
    @XmlElement(name = "many-to-many", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbManyToMany> manyToMany;
    @XmlElement(name = "element-collection", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbElementCollection> elementCollection;
    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbEmbedded> embedded;
    @XmlElement(name = "transient", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbTransient> _transient;

    /**
     * Gets the value of the basic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbBasic }
     * 
     * 
     */
    public List<JaxbBasic> getBasic() {
        if (basic == null) {
            basic = new ArrayList<JaxbBasic>();
        }
        return this.basic;
    }

    /**
     * Gets the value of the manyToOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manyToOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManyToOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbManyToOne }
     * 
     * 
     */
    public List<JaxbManyToOne> getManyToOne() {
        if (manyToOne == null) {
            manyToOne = new ArrayList<JaxbManyToOne>();
        }
        return this.manyToOne;
    }

    /**
     * Gets the value of the oneToMany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oneToMany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOneToMany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbOneToMany }
     * 
     * 
     */
    public List<JaxbOneToMany> getOneToMany() {
        if (oneToMany == null) {
            oneToMany = new ArrayList<JaxbOneToMany>();
        }
        return this.oneToMany;
    }

    /**
     * Gets the value of the oneToOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oneToOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOneToOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbOneToOne }
     * 
     * 
     */
    public List<JaxbOneToOne> getOneToOne() {
        if (oneToOne == null) {
            oneToOne = new ArrayList<JaxbOneToOne>();
        }
        return this.oneToOne;
    }

    /**
     * Gets the value of the manyToMany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manyToMany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManyToMany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbManyToMany }
     * 
     * 
     */
    public List<JaxbManyToMany> getManyToMany() {
        if (manyToMany == null) {
            manyToMany = new ArrayList<JaxbManyToMany>();
        }
        return this.manyToMany;
    }

    /**
     * Gets the value of the elementCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbElementCollection }
     * 
     * 
     */
    public List<JaxbElementCollection> getElementCollection() {
        if (elementCollection == null) {
            elementCollection = new ArrayList<JaxbElementCollection>();
        }
        return this.elementCollection;
    }

    /**
     * Gets the value of the embedded property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the embedded property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmbedded().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbEmbedded }
     * 
     * 
     */
    public List<JaxbEmbedded> getEmbedded() {
        if (embedded == null) {
            embedded = new ArrayList<JaxbEmbedded>();
        }
        return this.embedded;
    }

    /**
     * Gets the value of the transient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbTransient }
     * 
     * 
     */
    public List<JaxbTransient> getTransient() {
        if (_transient == null) {
            _transient = new ArrayList<JaxbTransient>();
        }
        return this._transient;
    }

}
