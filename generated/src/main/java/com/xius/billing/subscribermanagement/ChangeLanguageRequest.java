
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeLanguageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeLanguageRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountType"/&gt;
 *         &lt;element name="newLanguage" type="{http://billing.xius.com/SubscriberManagement.xsd}LanguageType" minOccurs="0"/&gt;
 *         &lt;element name="IVR" type="{http://billing.xius.com/SubscriberManagement.xsd}IVRType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeLanguageRequest", propOrder = {
    "account",
    "newLanguage",
    "ivr"
})
public class ChangeLanguageRequest {

    @XmlElement(required = true)
    protected AccountType account;
    protected String newLanguage;
    @XmlElement(name = "IVR")
    protected String ivr;

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
     * Gets the value of the newLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewLanguage() {
        return newLanguage;
    }

    /**
     * Sets the value of the newLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewLanguage(String value) {
        this.newLanguage = value;
    }

    /**
     * Gets the value of the ivr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVR() {
        return ivr;
    }

    /**
     * Sets the value of the ivr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVR(String value) {
        this.ivr = value;
    }

}
