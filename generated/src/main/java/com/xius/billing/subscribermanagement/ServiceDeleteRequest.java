
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceDeleteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeleteRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountType"/&gt;
 *         &lt;element name="subsSvcs" type="{http://billing.xius.com/SubscriberManagement.xsd}SubscriberServicesList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeleteRequest", propOrder = {
    "account",
    "subsSvcs"
})
public class ServiceDeleteRequest {

    @XmlElement(required = true)
    protected AccountType account;
    protected SubscriberServicesList subsSvcs;

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
     * Gets the value of the subsSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberServicesList }
     *     
     */
    public SubscriberServicesList getSubsSvcs() {
        return subsSvcs;
    }

    /**
     * Sets the value of the subsSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberServicesList }
     *     
     */
    public void setSubsSvcs(SubscriberServicesList value) {
        this.subsSvcs = value;
    }

}
