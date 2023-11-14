
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageFnFSMSRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageFnFSMSRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountType"/&gt;
 *         &lt;element name="ProvisionType" type="{http://billing.xius.com/SubscriberManagement.xsd}ProvisionType"/&gt;
 *         &lt;element name="ActionType" type="{http://billing.xius.com/SubscriberManagement.xsd}ActionType"/&gt;
 *         &lt;element name="NumberList" type="{http://billing.xius.com/SubscriberManagement.xsd}NumberListType" minOccurs="0"/&gt;
 *         &lt;element name="NewNumber" type="{http://billing.xius.com/SubscriberManagement.xsd}MSISDNType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageFnFSMSRequest", propOrder = {
    "account",
    "provisionType",
    "actionType",
    "numberList",
    "newNumber"
})
public class ManageFnFSMSRequest {

    @XmlElement(name = "Account", required = true)
    protected AccountType account;
    @XmlElement(name = "ProvisionType", required = true)
    @XmlSchemaType(name = "string")
    protected ProvisionType provisionType;
    @XmlElement(name = "ActionType", required = true)
    protected String actionType;
    @XmlElement(name = "NumberList")
    protected NumberListType numberList;
    @XmlElement(name = "NewNumber")
    protected String newNumber;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccount(AccountType value) {
        this.account = value;
    }

    /**
     * Gets the value of the provisionType property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisionType }
     *     
     */
    public ProvisionType getProvisionType() {
        return provisionType;
    }

    /**
     * Sets the value of the provisionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisionType }
     *     
     */
    public void setProvisionType(ProvisionType value) {
        this.provisionType = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the numberList property.
     * 
     * @return
     *     possible object is
     *     {@link NumberListType }
     *     
     */
    public NumberListType getNumberList() {
        return numberList;
    }

    /**
     * Sets the value of the numberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberListType }
     *     
     */
    public void setNumberList(NumberListType value) {
        this.numberList = value;
    }

    /**
     * Gets the value of the newNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewNumber() {
        return newNumber;
    }

    /**
     * Sets the value of the newNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewNumber(String value) {
        this.newNumber = value;
    }

}
