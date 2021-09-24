//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.23 at 03:19:14 PM CST 
//


package org.hibernate.boot.jaxb.hbm.spi;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Optimistic locking attribute based on a (last-updated) timestamp.
 *             
 * 
 * <p>Java class for TimestampAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimestampAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hibernate.org/xsd/orm/hbm}BaseVersionAttributeType"&gt;
 *       &lt;attribute name="source" type="{http://www.hibernate.org/xsd/orm/hbm}TimestampSourceEnum" default="vm" /&gt;
 *       &lt;attribute name="unsaved-value" type="{http://www.hibernate.org/xsd/orm/hbm}UnsavedValueTimestampEnum" default="null" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimestampAttributeType", namespace = "http://www.hibernate.org/xsd/orm/hbm")
public class JaxbHbmTimestampAttributeType
    extends JaxbHbmBaseVersionAttributeType
    implements Serializable, SingularAttributeInfo, ToolingHintContainer
{

    @XmlAttribute(name = "source")
    protected JaxbHbmTimestampSourceEnum source;
    @XmlAttribute(name = "unsaved-value")
    protected JaxbHbmUnsavedValueTimestampEnum unsavedValue;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmTimestampSourceEnum }
     *     
     */
    public JaxbHbmTimestampSourceEnum getSource() {
        if (source == null) {
            return JaxbHbmTimestampSourceEnum.VM;
        } else {
            return source;
        }
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmTimestampSourceEnum }
     *     
     */
    public void setSource(JaxbHbmTimestampSourceEnum value) {
        this.source = value;
    }

    /**
     * Gets the value of the unsavedValue property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmUnsavedValueTimestampEnum }
     *     
     */
    public JaxbHbmUnsavedValueTimestampEnum getUnsavedValue() {
        if (unsavedValue == null) {
            return JaxbHbmUnsavedValueTimestampEnum.NULL;
        } else {
            return unsavedValue;
        }
    }

    /**
     * Sets the value of the unsavedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmUnsavedValueTimestampEnum }
     *     
     */
    public void setUnsavedValue(JaxbHbmUnsavedValueTimestampEnum value) {
        this.unsavedValue = value;
    }

}
