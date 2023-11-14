
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrivalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RetrivalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="LATEST_THREE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetrivalType")
@XmlEnum
public enum RetrivalType {

    ALL,
    LATEST_THREE;

    public String value() {
        return name();
    }

    public static RetrivalType fromValue(String v) {
        return valueOf(v);
    }

}
