
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBaseATPServicesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBaseATPServicesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atpList" type="{http://billing.xius.com/SubscriberManagement.xsd}ATPDetailList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBaseATPServicesResponse", propOrder = {
    "atpList"
})
public class GetBaseATPServicesResponse {

    protected ATPDetailList atpList;

    /**
     * Gets the value of the atpList property.
     * 
     * @return
     *     possible object is
     *     {@link ATPDetailList }
     *     
     */
    public ATPDetailList getAtpList() {
        return atpList;
    }

    /**
     * Sets the value of the atpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATPDetailList }
     *     
     */
    public void setAtpList(ATPDetailList value) {
        this.atpList = value;
    }

}
