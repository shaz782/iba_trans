
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscribedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscribedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscribeOptionalServicesSuccess" type="{http://billing.xius.com/SubscriberManagement.xsd}SubOptionalServicesSuccessType" minOccurs="0"/&gt;
 *         &lt;element name="subscribeOptionalServicesFailure" type="{http://billing.xius.com/SubscriberManagement.xsd}SubOptionalServicesFailureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribedType", propOrder = {
    "subscribeOptionalServicesSuccess",
    "subscribeOptionalServicesFailure"
})
public class SubscribedType {

    protected SubOptionalServicesSuccessType subscribeOptionalServicesSuccess;
    protected SubOptionalServicesFailureType subscribeOptionalServicesFailure;

    /**
     * Gets the value of the subscribeOptionalServicesSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link SubOptionalServicesSuccessType }
     *     
     */
    public SubOptionalServicesSuccessType getSubscribeOptionalServicesSuccess() {
        return subscribeOptionalServicesSuccess;
    }

    /**
     * Sets the value of the subscribeOptionalServicesSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubOptionalServicesSuccessType }
     *     
     */
    public void setSubscribeOptionalServicesSuccess(SubOptionalServicesSuccessType value) {
        this.subscribeOptionalServicesSuccess = value;
    }

    /**
     * Gets the value of the subscribeOptionalServicesFailure property.
     * 
     * @return
     *     possible object is
     *     {@link SubOptionalServicesFailureType }
     *     
     */
    public SubOptionalServicesFailureType getSubscribeOptionalServicesFailure() {
        return subscribeOptionalServicesFailure;
    }

    /**
     * Sets the value of the subscribeOptionalServicesFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubOptionalServicesFailureType }
     *     
     */
    public void setSubscribeOptionalServicesFailure(SubOptionalServicesFailureType value) {
        this.subscribeOptionalServicesFailure = value;
    }

}
