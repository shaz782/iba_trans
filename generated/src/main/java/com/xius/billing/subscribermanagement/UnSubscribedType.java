
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnSubscribedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnSubscribedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unSubscribeOptionalServicesSuccess" type="{http://billing.xius.com/SubscriberManagement.xsd}UnSubOptionalServicesSuccessType" minOccurs="0"/&gt;
 *         &lt;element name="unSubscribeOptionalServicesFailure" type="{http://billing.xius.com/SubscriberManagement.xsd}UnSubOptionalServicesFailureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnSubscribedType", propOrder = {
    "unSubscribeOptionalServicesSuccess",
    "unSubscribeOptionalServicesFailure"
})
public class UnSubscribedType {

    protected UnSubOptionalServicesSuccessType unSubscribeOptionalServicesSuccess;
    protected UnSubOptionalServicesFailureType unSubscribeOptionalServicesFailure;

    /**
     * Gets the value of the unSubscribeOptionalServicesSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link UnSubOptionalServicesSuccessType }
     *     
     */
    public UnSubOptionalServicesSuccessType getUnSubscribeOptionalServicesSuccess() {
        return unSubscribeOptionalServicesSuccess;
    }

    /**
     * Sets the value of the unSubscribeOptionalServicesSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnSubOptionalServicesSuccessType }
     *     
     */
    public void setUnSubscribeOptionalServicesSuccess(UnSubOptionalServicesSuccessType value) {
        this.unSubscribeOptionalServicesSuccess = value;
    }

    /**
     * Gets the value of the unSubscribeOptionalServicesFailure property.
     * 
     * @return
     *     possible object is
     *     {@link UnSubOptionalServicesFailureType }
     *     
     */
    public UnSubOptionalServicesFailureType getUnSubscribeOptionalServicesFailure() {
        return unSubscribeOptionalServicesFailure;
    }

    /**
     * Sets the value of the unSubscribeOptionalServicesFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnSubOptionalServicesFailureType }
     *     
     */
    public void setUnSubscribeOptionalServicesFailure(UnSubOptionalServicesFailureType value) {
        this.unSubscribeOptionalServicesFailure = value;
    }

}
