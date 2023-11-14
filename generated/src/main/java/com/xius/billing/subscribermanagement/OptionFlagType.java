
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionFlagType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OptionFlagType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INSERT"/&gt;
 *     &lt;enumeration value="UPDATE"/&gt;
 *     &lt;enumeration value="DELETE"/&gt;
 *     &lt;enumeration value="ACTIVATE"/&gt;
 *     &lt;enumeration value="DEACTIVATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptionFlagType")
@XmlEnum
public enum OptionFlagType {

    INSERT,
    UPDATE,
    DELETE,
    ACTIVATE,
    DEACTIVATE;

    public String value() {
        return name();
    }

    public static OptionFlagType fromValue(String v) {
        return valueOf(v);
    }

}
