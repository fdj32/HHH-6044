//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.23 at 03:19:15 PM CST 
//


package org.hibernate.boot.jaxb.mapping.spi;

import javax.persistence.FetchType;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter5
    extends XmlAdapter<String, FetchType>
{


    public FetchType unmarshal(String value) {
        return (org.hibernate.boot.jaxb.mapping.internal.FetchTypeMarshalling.fromXml(value));
    }

    public String marshal(FetchType value) {
        return (org.hibernate.boot.jaxb.mapping.internal.FetchTypeMarshalling.toXml(value));
    }

}
