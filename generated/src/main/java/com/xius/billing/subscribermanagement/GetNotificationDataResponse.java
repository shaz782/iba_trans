
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNotificationDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNotificationDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDNo" type="{http://billing.xius.com/SubscriberManagement.xsd}IDNoType" minOccurs="0"/&gt;
 *         &lt;element name="notificationDataList" type="{http://billing.xius.com/SubscriberManagement.xsd}NotificatioDataListType" minOccurs="0"/&gt;
 *         &lt;element name="availableLanguages" type="{http://billing.xius.com/SubscriberManagement.xsd}AvablLanguagesListType" minOccurs="0"/&gt;
 *         &lt;element name="defaultLanguage" type="{http://billing.xius.com/SubscriberManagement.xsd}LanguageDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNotificationDataResponse", propOrder = {
    "idNo",
    "notificationDataList",
    "availableLanguages",
    "defaultLanguage"
})
public class GetNotificationDataResponse {

    @XmlElement(name = "IDNo")
    protected String idNo;
    protected NotificatioDataListType notificationDataList;
    protected AvablLanguagesListType availableLanguages;
    protected LanguageDataType defaultLanguage;

    /**
     * Gets the value of the idNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNo() {
        return idNo;
    }

    /**
     * Sets the value of the idNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNo(String value) {
        this.idNo = value;
    }

    /**
     * Gets the value of the notificationDataList property.
     * 
     * @return
     *     possible object is
     *     {@link NotificatioDataListType }
     *     
     */
    public NotificatioDataListType getNotificationDataList() {
        return notificationDataList;
    }

    /**
     * Sets the value of the notificationDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificatioDataListType }
     *     
     */
    public void setNotificationDataList(NotificatioDataListType value) {
        this.notificationDataList = value;
    }

    /**
     * Gets the value of the availableLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link AvablLanguagesListType }
     *     
     */
    public AvablLanguagesListType getAvailableLanguages() {
        return availableLanguages;
    }

    /**
     * Sets the value of the availableLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvablLanguagesListType }
     *     
     */
    public void setAvailableLanguages(AvablLanguagesListType value) {
        this.availableLanguages = value;
    }

    /**
     * Gets the value of the defaultLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDataType }
     *     
     */
    public LanguageDataType getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Sets the value of the defaultLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDataType }
     *     
     */
    public void setDefaultLanguage(LanguageDataType value) {
        this.defaultLanguage = value;
    }

}
