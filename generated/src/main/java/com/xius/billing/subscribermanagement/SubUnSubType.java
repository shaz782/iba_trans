
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubUnSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SubUnSubType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUBSCRIBE"/&gt;
 *     &lt;enumeration value="UNSUBSCRIBE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubUnSubType")
@XmlEnum
public enum SubUnSubType {

    SUBSCRIBE,
    UNSUBSCRIBE;

    public String value() {
        return name();
    }

    public static SubUnSubType fromValue(String v) {
        return valueOf(v);
    }

}
