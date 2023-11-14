
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFnFSMSResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFnFSMSResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountIdType" minOccurs="0"/&gt;
 *         &lt;element name="Provision" type="{http://billing.xius.com/SubscriberManagement.xsd}ProvisionType" minOccurs="0"/&gt;
 *         &lt;element name="FnFSMSList" type="{http://billing.xius.com/SubscriberManagement.xsd}NumberListType" minOccurs="0"/&gt;
 *         &lt;element name="IsServiceAvlbl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSubscribed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFnFSMSResponse", propOrder = {
    "accountId",
    "provision",
    "fnFSMSList",
    "isServiceAvlbl",
    "isSubscribed"
})
public class GetFnFSMSResponse {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "Provision")
    @XmlSchemaType(name = "string")
    protected ProvisionType provision;
    @XmlElement(name = "FnFSMSList")
    protected NumberListType fnFSMSList;
    @XmlElement(name = "IsServiceAvlbl")
    protected String isServiceAvlbl;
    @XmlElement(name = "IsSubscribed")
    protected String isSubscribed;

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
     * Gets the value of the provision property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisionType }
     *     
     */
    public ProvisionType getProvision() {
        return provision;
    }

    /**
     * Sets the value of the provision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisionType }
     *     
     */
    public void setProvision(ProvisionType value) {
        this.provision = value;
    }

    /**
     * Gets the value of the fnFSMSList property.
     * 
     * @return
     *     possible object is
     *     {@link NumberListType }
     *     
     */
    public NumberListType getFnFSMSList() {
        return fnFSMSList;
    }

    /**
     * Sets the value of the fnFSMSList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberListType }
     *     
     */
    public void setFnFSMSList(NumberListType value) {
        this.fnFSMSList = value;
    }

    /**
     * Gets the value of the isServiceAvlbl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsServiceAvlbl() {
        return isServiceAvlbl;
    }

    /**
     * Sets the value of the isServiceAvlbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsServiceAvlbl(String value) {
        this.isServiceAvlbl = value;
    }

    /**
     * Gets the value of the isSubscribed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSubscribed() {
        return isSubscribed;
    }

    /**
     * Sets the value of the isSubscribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSubscribed(String value) {
        this.isSubscribed = value;
    }

}
