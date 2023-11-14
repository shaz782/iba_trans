
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSubViewDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSubViewDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrepaidAccountBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IMSI" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CancelationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Graceperiod1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Graceperiod2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IVRPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPorted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubViewDataResponse", propOrder = {
    "activationDate",
    "accountStatus",
    "prepaidAccountBalance",
    "sim",
    "imsi",
    "msisdn",
    "expirationDate",
    "cancelationDate",
    "graceperiod1",
    "graceperiod2",
    "language",
    "ivrPin",
    "validityDate",
    "isPorted"
})
public class GetSubViewDataResponse {

    @XmlElement(name = "ActivationDate")
    protected String activationDate;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "PrepaidAccountBalance")
    protected String prepaidAccountBalance;
    @XmlElement(name = "SIM")
    protected String sim;
    @XmlElement(name = "IMSI")
    protected Long imsi;
    @XmlElement(name = "MSISDN")
    protected String msisdn;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "CancelationDate")
    protected String cancelationDate;
    @XmlElement(name = "Graceperiod1")
    protected String graceperiod1;
    @XmlElement(name = "Graceperiod2")
    protected String graceperiod2;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "IVRPin")
    protected String ivrPin;
    protected String validityDate;
    protected String isPorted;

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationDate(String value) {
        this.activationDate = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the prepaidAccountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidAccountBalance() {
        return prepaidAccountBalance;
    }

    /**
     * Sets the value of the prepaidAccountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidAccountBalance(String value) {
        this.prepaidAccountBalance = value;
    }

    /**
     * Gets the value of the sim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIM() {
        return sim;
    }

    /**
     * Sets the value of the sim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIM(String value) {
        this.sim = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIMSI() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIMSI(Long value) {
        this.imsi = value;
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
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the cancelationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelationDate() {
        return cancelationDate;
    }

    /**
     * Sets the value of the cancelationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelationDate(String value) {
        this.cancelationDate = value;
    }

    /**
     * Gets the value of the graceperiod1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraceperiod1() {
        return graceperiod1;
    }

    /**
     * Sets the value of the graceperiod1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraceperiod1(String value) {
        this.graceperiod1 = value;
    }

    /**
     * Gets the value of the graceperiod2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraceperiod2() {
        return graceperiod2;
    }

    /**
     * Sets the value of the graceperiod2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraceperiod2(String value) {
        this.graceperiod2 = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the ivrPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVRPin() {
        return ivrPin;
    }

    /**
     * Sets the value of the ivrPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVRPin(String value) {
        this.ivrPin = value;
    }

    /**
     * Gets the value of the validityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityDate() {
        return validityDate;
    }

    /**
     * Sets the value of the validityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityDate(String value) {
        this.validityDate = value;
    }

    /**
     * Gets the value of the isPorted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPorted() {
        return isPorted;
    }

    /**
     * Sets the value of the isPorted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPorted(String value) {
        this.isPorted = value;
    }

}
