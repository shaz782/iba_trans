
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountIdType" minOccurs="0"/&gt;
 *         &lt;element name="SIMNo" type="{http://billing.xius.com/SubscriberManagement.xsd}SIMType" minOccurs="0"/&gt;
 *         &lt;element name="IMSINo" type="{http://billing.xius.com/SubscriberManagement.xsd}IMSIType" minOccurs="0"/&gt;
 *         &lt;element name="MSISDN" type="{http://billing.xius.com/SubscriberManagement.xsd}MSISDNType" minOccurs="0"/&gt;
 *         &lt;element name="notificationData" type="{http://billing.xius.com/SubscriberManagement.xsd}NotificationData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationDataType", propOrder = {
    "accountId",
    "simNo",
    "imsiNo",
    "msisdn",
    "notificationData"
})
public class NotificationDataType {

    protected Long accountId;
    @XmlElement(name = "SIMNo")
    protected String simNo;
    @XmlElement(name = "IMSINo")
    protected String imsiNo;
    @XmlElement(name = "MSISDN")
    protected String msisdn;
    protected NotificationData notificationData;

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
     * Gets the value of the simNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIMNo() {
        return simNo;
    }

    /**
     * Sets the value of the simNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIMNo(String value) {
        this.simNo = value;
    }

    /**
     * Gets the value of the imsiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSINo() {
        return imsiNo;
    }

    /**
     * Sets the value of the imsiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSINo(String value) {
        this.imsiNo = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
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
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the notificationData property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationData }
     *     
     */
    public NotificationData getNotificationData() {
        return notificationData;
    }

    /**
     * Sets the value of the notificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationData }
     *     
     */
    public void setNotificationData(NotificationData value) {
        this.notificationData = value;
    }

}
