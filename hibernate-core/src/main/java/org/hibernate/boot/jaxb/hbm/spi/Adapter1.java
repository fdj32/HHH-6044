//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.23 at 03:19:14 PM CST 
//


package org.hibernate.boot.jaxb.hbm.spi;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.hibernate.CacheMode;

public class Adapter1
    extends XmlAdapter<String, CacheMode>
{


    public CacheMode unmarshal(String value) {
        return (org.hibernate.boot.jaxb.hbm.internal.CacheModeConverter.fromXml(value));
    }

    public String marshal(CacheMode value) {
        return (org.hibernate.boot.jaxb.hbm.internal.CacheModeConverter.toXml(value));
    }

}
