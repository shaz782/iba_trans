
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBalanceDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBalanceDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BalanceDetails" type="{http://billing.xius.com/SubscriberManagement.xsd}BalanceDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBalanceDetailsResponse", propOrder = {
    "balanceDetails"
})
public class GetBalanceDetailsResponse {

    @XmlElement(name = "BalanceDetails")
    protected BalanceDetailsType balanceDetails;

    /**
     * Gets the value of the balanceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceDetailsType }
     *     
     */
    public BalanceDetailsType getBalanceDetails() {
        return balanceDetails;
    }

    /**
     * Sets the value of the balanceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceDetailsType }
     *     
     */
    public void setBalanceDetails(BalanceDetailsType value) {
        this.balanceDetails = value;
    }

}
