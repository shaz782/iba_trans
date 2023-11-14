
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageFnFSMSResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageFnFSMSResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountIdType" minOccurs="0"/&gt;
 *         &lt;element name="SuccessList" type="{http://billing.xius.com/SubscriberManagement.xsd}NumberListType" minOccurs="0"/&gt;
 *         &lt;element name="FailureList" type="{http://billing.xius.com/SubscriberManagement.xsd}FailureListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageFnFSMSResponse", propOrder = {
    "accountId",
    "successList",
    "failureList"
})
public class ManageFnFSMSResponse {

    protected Long accountId;
    @XmlElement(name = "SuccessList")
    protected NumberListType successList;
    @XmlElement(name = "FailureList")
    protected FailureListType failureList;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the successList property.
     * 
     * @return
     *     possible object is
     *     {@link NumberListType }
     *     
     */
    public NumberListType getSuccessList() {
        return successList;
    }

    /**
     * Sets the value of the successList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberListType }
     *     
     */
    public void setSuccessList(NumberListType value) {
        this.successList = value;
    }

    /**
     * Gets the value of the failureList property.
     * 
     * @return
     *     possible object is
     *     {@link FailureListType }
     *     
     */
    public FailureListType getFailureList() {
        return failureList;
    }

    /**
     * Sets the value of the failureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureListType }
     *     
     */
    public void setFailureList(FailureListType value) {
        this.failureList = value;
    }

}
