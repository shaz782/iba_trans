
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageBundleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageBundleResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="succesNumberList" type="{http://billing.xius.com/SubscriberManagement.xsd}SuccessNumberListType" minOccurs="0"/&gt;
 *         &lt;element name="failureNumberList" type="{http://billing.xius.com/SubscriberManagement.xsd}FailureNumberListType" minOccurs="0"/&gt;
 *         &lt;element name="totalBundleCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalActivationFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageBundleResponse", propOrder = {
    "succesNumberList",
    "failureNumberList",
    "totalBundleCharge",
    "totalActivationFee"
})
public class ManageBundleResponse {

    protected SuccessNumberListType succesNumberList;
    protected FailureNumberListType failureNumberList;
    protected String totalBundleCharge;
    protected String totalActivationFee;

    /**
     * Gets the value of the succesNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessNumberListType }
     *     
     */
    public SuccessNumberListType getSuccesNumberList() {
        return succesNumberList;
    }

    /**
     * Sets the value of the succesNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessNumberListType }
     *     
     */
    public void setSuccesNumberList(SuccessNumberListType value) {
        this.succesNumberList = value;
    }

    /**
     * Gets the value of the failureNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link FailureNumberListType }
     *     
     */
    public FailureNumberListType getFailureNumberList() {
        return failureNumberList;
    }

    /**
     * Sets the value of the failureNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureNumberListType }
     *     
     */
    public void setFailureNumberList(FailureNumberListType value) {
        this.failureNumberList = value;
    }

    /**
     * Gets the value of the totalBundleCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBundleCharge() {
        return totalBundleCharge;
    }

    /**
     * Sets the value of the totalBundleCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBundleCharge(String value) {
        this.totalBundleCharge = value;
    }

    /**
     * Gets the value of the totalActivationFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalActivationFee() {
        return totalActivationFee;
    }

    /**
     * Sets the value of the totalActivationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalActivationFee(String value) {
        this.totalActivationFee = value;
    }

}
