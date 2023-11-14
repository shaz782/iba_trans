
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNotesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNotesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountType"/&gt;
 *         &lt;element name="retrivalType" type="{http://billing.xius.com/SubscriberManagement.xsd}RetrivalType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNotesRequest", propOrder = {
    "account",
    "retrivalType"
})
public class GetNotesRequest {

    @XmlElement(required = true)
    protected AccountType account;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RetrivalType retrivalType;

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
     * Gets the value of the retrivalType property.
     * 
     * @return
     *     possible object is
     *     {@link RetrivalType }
     *     
     */
    public RetrivalType getRetrivalType() {
        return retrivalType;
    }

    /**
     * Sets the value of the retrivalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrivalType }
     *     
     */
    public void setRetrivalType(RetrivalType value) {
        this.retrivalType = value;
    }

}
