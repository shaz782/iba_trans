
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSubDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSubDataResponse"&gt;
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
 *         &lt;element name="USSDLangId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USSDLangName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IVRLangId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IVRLangName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPorted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostpaidAccountBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lowBalThreshold1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lowBalThreshold2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lowBalThreshold3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lowBalThreshold4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubDataResponse", propOrder = {
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
    "ussdLangId",
    "ussdLangName",
    "ivrLangId",
    "ivrLangName",
    "validityDate",
    "isPorted",
    "postpaidAccountBalance",
    "idValue",
    "networkId",
    "lowBalThreshold1",
    "lowBalThreshold2",
    "lowBalThreshold3",
    "lowBalThreshold4",
    "accountType",
    "creditLimit",
    "availableCredit",
    "accountID",
    "tpName"
})
public class GetSubDataResponse {

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
    @XmlElement(name = "USSDLangId")
    protected String ussdLangId;
    @XmlElement(name = "USSDLangName")
    protected String ussdLangName;
    @XmlElement(name = "IVRLangId")
    protected String ivrLangId;
    @XmlElement(name = "IVRLangName")
    protected String ivrLangName;
    protected String validityDate;
    protected String isPorted;
    @XmlElement(name = "PostpaidAccountBalance")
    protected String postpaidAccountBalance;
    @XmlElement(name = "IdValue")
    protected String idValue;
    protected String networkId;
    protected String lowBalThreshold1;
    protected String lowBalThreshold2;
    protected String lowBalThreshold3;
    protected String lowBalThreshold4;
    protected String accountType;
    protected String creditLimit;
    protected String availableCredit;
    protected Long accountID;
    protected String tpName;

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
     * Gets the value of the ussdLangId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSSDLangId() {
        return ussdLangId;
    }

    /**
     * Sets the value of the ussdLangId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSSDLangId(String value) {
        this.ussdLangId = value;
    }

    /**
     * Gets the value of the ussdLangName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSSDLangName() {
        return ussdLangName;
    }

    /**
     * Sets the value of the ussdLangName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSSDLangName(String value) {
        this.ussdLangName = value;
    }

    /**
     * Gets the value of the ivrLangId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVRLangId() {
        return ivrLangId;
    }

    /**
     * Sets the value of the ivrLangId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVRLangId(String value) {
        this.ivrLangId = value;
    }

    /**
     * Gets the value of the ivrLangName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVRLangName() {
        return ivrLangName;
    }

    /**
     * Sets the value of the ivrLangName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVRLangName(String value) {
        this.ivrLangName = value;
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

    /**
     * Gets the value of the postpaidAccountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostpaidAccountBalance() {
        return postpaidAccountBalance;
    }

    /**
     * Sets the value of the postpaidAccountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostpaidAccountBalance(String value) {
        this.postpaidAccountBalance = value;
    }

    /**
     * Gets the value of the idValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdValue() {
        return idValue;
    }

    /**
     * Sets the value of the idValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdValue(String value) {
        this.idValue = value;
    }

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkId(String value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the lowBalThreshold1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowBalThreshold1() {
        return lowBalThreshold1;
    }

    /**
     * Sets the value of the lowBalThreshold1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowBalThreshold1(String value) {
        this.lowBalThreshold1 = value;
    }

    /**
     * Gets the value of the lowBalThreshold2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowBalThreshold2() {
        return lowBalThreshold2;
    }

    /**
     * Sets the value of the lowBalThreshold2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowBalThreshold2(String value) {
        this.lowBalThreshold2 = value;
    }

    /**
     * Gets the value of the lowBalThreshold3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowBalThreshold3() {
        return lowBalThreshold3;
    }

    /**
     * Sets the value of the lowBalThreshold3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowBalThreshold3(String value) {
        this.lowBalThreshold3 = value;
    }

    /**
     * Gets the value of the lowBalThreshold4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowBalThreshold4() {
        return lowBalThreshold4;
    }

    /**
     * Sets the value of the lowBalThreshold4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowBalThreshold4(String value) {
        this.lowBalThreshold4 = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimit(String value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the availableCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableCredit() {
        return availableCredit;
    }

    /**
     * Sets the value of the availableCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableCredit(String value) {
        this.availableCredit = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountID(Long value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the tpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpName() {
        return tpName;
    }

    /**
     * Sets the value of the tpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpName(String value) {
        this.tpName = value;
    }

}
