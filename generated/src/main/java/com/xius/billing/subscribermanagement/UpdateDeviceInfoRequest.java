
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateDeviceInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDeviceInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountType"/&gt;
 *         &lt;element name="cancelDate" type="{http://billing.xius.com/SubscriberManagement.xsd}DateType" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://billing.xius.com/SubscriberManagement.xsd}DateType" minOccurs="0"/&gt;
 *         &lt;element name="passcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intialAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VRULanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="messageLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDeviceInfoRequest", propOrder = {
    "account",
    "cancelDate",
    "expiryDate",
    "passcode",
    "intialAllowed",
    "vruLanguage",
    "messageLevel"
})
public class UpdateDeviceInfoRequest {

    @XmlElement(required = true)
    protected AccountType account;
    protected String cancelDate;
    protected String expiryDate;
    protected String passcode;
    protected String intialAllowed;
    @XmlElement(name = "VRULanguage")
    protected String vruLanguage;
    protected String messageLevel;

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
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDate(String value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the passcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasscode() {
        return passcode;
    }

    /**
     * Sets the value of the passcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasscode(String value) {
        this.passcode = value;
    }

    /**
     * Gets the value of the intialAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntialAllowed() {
        return intialAllowed;
    }

    /**
     * Sets the value of the intialAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntialAllowed(String value) {
        this.intialAllowed = value;
    }

    /**
     * Gets the value of the vruLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRULanguage() {
        return vruLanguage;
    }

    /**
     * Sets the value of the vruLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRULanguage(String value) {
        this.vruLanguage = value;
    }

    /**
     * Gets the value of the messageLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageLevel() {
        return messageLevel;
    }

    /**
     * Sets the value of the messageLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageLevel(String value) {
        this.messageLevel = value;
    }

}
