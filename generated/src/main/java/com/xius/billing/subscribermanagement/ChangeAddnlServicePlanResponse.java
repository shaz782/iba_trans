
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeAddnlServicePlanResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAddnlServicePlanResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="acctValidityExtend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountDates" type="{http://billing.xius.com/SubscriberManagement.xsd}accountDatesList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAddnlServicePlanResponse", propOrder = {
    "message",
    "acctValidityExtend",
    "accountDates"
})
public class ChangeAddnlServicePlanResponse {

    protected String message;
    protected String acctValidityExtend;
    protected AccountDatesList accountDates;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the acctValidityExtend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctValidityExtend() {
        return acctValidityExtend;
    }

    /**
     * Sets the value of the acctValidityExtend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctValidityExtend(String value) {
        this.acctValidityExtend = value;
    }

    /**
     * Gets the value of the accountDates property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDatesList }
     *     
     */
    public AccountDatesList getAccountDates() {
        return accountDates;
    }

    /**
     * Sets the value of the accountDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDatesList }
     *     
     */
    public void setAccountDates(AccountDatesList value) {
        this.accountDates = value;
    }

}
