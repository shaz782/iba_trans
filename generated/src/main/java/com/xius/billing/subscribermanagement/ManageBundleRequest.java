
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageBundleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageBundleRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://billing.xius.com/SubscriberManagement.xsd}ActionType"/&gt;
 *         &lt;element name="MSISDNList" type="{http://billing.xius.com/SubscriberManagement.xsd}MSISDNListType"/&gt;
 *         &lt;element name="bundleList" type="{http://billing.xius.com/SubscriberManagement.xsd}BundleListType" minOccurs="0"/&gt;
 *         &lt;element name="validationFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageBundleRequest", propOrder = {
    "action",
    "msisdnList",
    "bundleList",
    "validationFlag"
})
public class ManageBundleRequest {

    @XmlElement(required = true)
    protected String action;
    @XmlElement(name = "MSISDNList", required = true)
    protected MSISDNListType msisdnList;
    protected BundleListType bundleList;
    protected String validationFlag;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the msisdnList property.
     * 
     * @return
     *     possible object is
     *     {@link MSISDNListType }
     *     
     */
    public MSISDNListType getMSISDNList() {
        return msisdnList;
    }

    /**
     * Sets the value of the msisdnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSISDNListType }
     *     
     */
    public void setMSISDNList(MSISDNListType value) {
        this.msisdnList = value;
    }

    /**
     * Gets the value of the bundleList property.
     * 
     * @return
     *     possible object is
     *     {@link BundleListType }
     *     
     */
    public BundleListType getBundleList() {
        return bundleList;
    }

    /**
     * Sets the value of the bundleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleListType }
     *     
     */
    public void setBundleList(BundleListType value) {
        this.bundleList = value;
    }

    /**
     * Gets the value of the validationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationFlag() {
        return validationFlag;
    }

    /**
     * Sets the value of the validationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationFlag(String value) {
        this.validationFlag = value;
    }

}
