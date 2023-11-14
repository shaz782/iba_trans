
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTrpltSIMStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTrpltSIMStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SIMSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTrpltSIMStatusResponse", propOrder = {
    "simstatus"
})
public class GetTrpltSIMStatusResponse {

    @XmlElement(name = "SIMSTATUS")
    protected String simstatus;

    /**
     * Gets the value of the simstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIMSTATUS() {
        return simstatus;
    }

    /**
     * Sets the value of the simstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIMSTATUS(String value) {
        this.simstatus = value;
    }

}
