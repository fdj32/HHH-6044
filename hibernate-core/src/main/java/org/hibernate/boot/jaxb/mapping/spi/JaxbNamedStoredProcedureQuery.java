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
 *                 public @interface NamedStoredProcedureQuery {
 *                 String name();
 *                 String procedureName();
 *                 StoredProcedureParameter[] parameters() default {};
 *                 Class[] resultClasses() default {};
 *                 String[] resultSetMappings() default{};
 *                 QueryHint[] hints() default {};
 *                 }
 * 
 *             
 * 
 * <p>Java class for named-stored-procedure-query complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="named-stored-procedure-query"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parameter" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}stored-procedure-parameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="result-class" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="result-set-mapping" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hint" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}query-hint" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="procedure-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "named-stored-procedure-query", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm", propOrder = {
    "description",
    "parameter",
    "resultClass",
    "resultSetMapping",
    "hint"
})
public class JaxbNamedStoredProcedureQuery
    implements Serializable
{

    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected String description;
    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbStoredProcedureParameter> parameter;
    @XmlElement(name = "result-class", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<String> resultClass;
    @XmlElement(name = "result-set-mapping", namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<String> resultSetMapping;
    @XmlElement(namespace = "http://xmlns.jcp.org/xml/ns/persistence/orm")
    protected List<JaxbQueryHint> hint;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "procedure-name", required = true)
    protected String procedureName;

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
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbStoredProcedureParameter }
     * 
     * 
     */
    public List<JaxbStoredProcedureParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<JaxbStoredProcedureParameter>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the resultClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResultClass() {
        if (resultClass == null) {
            resultClass = new ArrayList<String>();
        }
        return this.resultClass;
    }

    /**
     * Gets the value of the resultSetMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultSetMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultSetMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResultSetMapping() {
        if (resultSetMapping == null) {
            resultSetMapping = new ArrayList<String>();
        }
        return this.resultSetMapping;
    }

    /**
     * Gets the value of the hint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbQueryHint }
     * 
     * 
     */
    public List<JaxbQueryHint> getHint() {
        if (hint == null) {
            hint = new ArrayList<JaxbQueryHint>();
        }
        return this.hint;
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
     * Gets the value of the procedureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedureName() {
        return procedureName;
    }

    /**
     * Sets the value of the procedureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedureName(String value) {
        this.procedureName = value;
    }

}