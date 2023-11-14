
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeLanguagePreInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeLanguagePreInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentLanguage" type="{http://billing.xius.com/SubscriberManagement.xsd}LanguageType" minOccurs="0"/&gt;
 *         &lt;element name="availableLanguagesList" type="{http://billing.xius.com/SubscriberManagement.xsd}AvailableLanguagesListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeLanguagePreInfoResponse", propOrder = {
    "currentLanguage",
    "availableLanguagesList"
})
public class ChangeLanguagePreInfoResponse {

    protected String currentLanguage;
    protected AvailableLanguagesListType availableLanguagesList;

    /**
     * Gets the value of the currentLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLanguage() {
        return currentLanguage;
    }

    /**
     * Sets the value of the currentLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLanguage(String value) {
        this.currentLanguage = value;
    }

    /**
     * Gets the value of the availableLanguagesList property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableLanguagesListType }
     *     
     */
    public AvailableLanguagesListType getAvailableLanguagesList() {
        return availableLanguagesList;
    }

    /**
     * Sets the value of the availableLanguagesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableLanguagesListType }
     *     
     */
    public void setAvailableLanguagesList(AvailableLanguagesListType value) {
        this.availableLanguagesList = value;
    }

}
