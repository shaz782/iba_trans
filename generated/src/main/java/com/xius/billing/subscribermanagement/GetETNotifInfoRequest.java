
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetETNotifInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetETNotifInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="publicityId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msisdn" type="{http://billing.xius.com/SubscriberManagement.xsd}MSISDNType" minOccurs="0"/&gt;
 *         &lt;element name="accountId" type="{http://billing.xius.com/SubscriberManagement.xsd}AccIdType" minOccurs="0"/&gt;
 *         &lt;element name="freepublicityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetETNotifInfoRequest", propOrder = {
    "eventType",
    "publicityId",
    "msisdn",
    "accountId",
    "freepublicityId"
})
public class GetETNotifInfoRequest {

    @XmlElement(required = true)
    protected String eventType;
    @XmlElement(required = true)
    protected String publicityId;
    protected String msisdn;
    protected String accountId;
    protected String freepublicityId;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the publicityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicityId() {
        return publicityId;
    }

    /**
     * Sets the value of the publicityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicityId(String value) {
        this.publicityId = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the freepublicityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreepublicityId() {
        return freepublicityId;
    }

    /**
     * Sets the value of the freepublicityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreepublicityId(String value) {
        this.freepublicityId = value;
    }

}
