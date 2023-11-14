
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailNotifPref" type="{http://billing.xius.com/SubscriberManagement.xsd}LangIdType" minOccurs="0"/&gt;
 *         &lt;element name="SMSNotifPref" type="{http://billing.xius.com/SubscriberManagement.xsd}LangIdType" minOccurs="0"/&gt;
 *         &lt;element name="USSDNotifPref" type="{http://billing.xius.com/SubscriberManagement.xsd}LangIdType" minOccurs="0"/&gt;
 *         &lt;element name="IVRNotifPref" type="{http://billing.xius.com/SubscriberManagement.xsd}LangIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationData", propOrder = {
    "emailId",
    "emailNotifPref",
    "smsNotifPref",
    "ussdNotifPref",
    "ivrNotifPref"
})
public class NotificationData {

    protected String emailId;
    protected Integer emailNotifPref;
    @XmlElement(name = "SMSNotifPref")
    protected Integer smsNotifPref;
    @XmlElement(name = "USSDNotifPref")
    protected Integer ussdNotifPref;
    @XmlElement(name = "IVRNotifPref")
    protected Integer ivrNotifPref;

    /**
     * Gets the value of the emailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * Gets the value of the emailNotifPref property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmailNotifPref() {
        return emailNotifPref;
    }

    /**
     * Sets the value of the emailNotifPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmailNotifPref(Integer value) {
        this.emailNotifPref = value;
    }

    /**
     * Gets the value of the smsNotifPref property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSMSNotifPref() {
        return smsNotifPref;
    }

    /**
     * Sets the value of the smsNotifPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSMSNotifPref(Integer value) {
        this.smsNotifPref = value;
    }

    /**
     * Gets the value of the ussdNotifPref property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUSSDNotifPref() {
        return ussdNotifPref;
    }

    /**
     * Sets the value of the ussdNotifPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUSSDNotifPref(Integer value) {
        this.ussdNotifPref = value;
    }

    /**
     * Gets the value of the ivrNotifPref property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIVRNotifPref() {
        return ivrNotifPref;
    }

    /**
     * Sets the value of the ivrNotifPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIVRNotifPref(Integer value) {
        this.ivrNotifPref = value;
    }

}
