
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTPActivationFeeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTPActivationFeeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FeeDetails" type="{http://billing.xius.com/SubscriberManagement.xsd}FeeDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTPActivationFeeResponse", propOrder = {
    "feeDetails"
})
public class GetTPActivationFeeResponse {

    @XmlElement(name = "FeeDetails")
    protected FeeDetailsType feeDetails;

    /**
     * Gets the value of the feeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FeeDetailsType }
     *     
     */
    public FeeDetailsType getFeeDetails() {
        return feeDetails;
    }

    /**
     * Sets the value of the feeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeDetailsType }
     *     
     */
    public void setFeeDetails(FeeDetailsType value) {
        this.feeDetails = value;
    }

}
