
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeTariffPlanPreInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeTariffPlanPreInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountType"/&gt;
 *         &lt;element name="servicesNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="eventFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="atpCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeTariffPlanPreInfoRequest", propOrder = {
    "account",
    "servicesNeeded",
    "eventFlag",
    "atpCategory"
})
public class ChangeTariffPlanPreInfoRequest {

    @XmlElement(required = true)
    protected AccountType account;
    protected boolean servicesNeeded;
    protected String eventFlag;
    protected String atpCategory;

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
     * Gets the value of the servicesNeeded property.
     * 
     */
    public boolean isServicesNeeded() {
        return servicesNeeded;
    }

    /**
     * Sets the value of the servicesNeeded property.
     * 
     */
    public void setServicesNeeded(boolean value) {
        this.servicesNeeded = value;
    }

    /**
     * Gets the value of the eventFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventFlag() {
        return eventFlag;
    }

    /**
     * Sets the value of the eventFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventFlag(String value) {
        this.eventFlag = value;
    }

    /**
     * Gets the value of the atpCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtpCategory() {
        return atpCategory;
    }

    /**
     * Sets the value of the atpCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtpCategory(String value) {
        this.atpCategory = value;
    }

}
