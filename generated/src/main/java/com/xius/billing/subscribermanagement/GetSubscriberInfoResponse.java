
package com.xius.billing.subscribermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSubscriberInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSubscriberInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="validityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gracePeriod1EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thresholdBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="accntBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promoBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="promoValidityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastCallDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastCallCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="subscriberTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VMSServiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalEarnedCredits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="earnedCreditsinLast30Days" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="usedCreditsinLast30Days" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="freeSMSCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="freeSMSRuppes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="promoDataBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="promoDataExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GPRSServStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastReloadTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastReloadAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="imsiNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="latestTarrifPlanID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="simSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tarrifName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalUsedCredits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="lastTransAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastTransCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lastTransTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availableCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubscriberInfoResponse", propOrder = {
    "accountId",
    "msisdn",
    "validityDate",
    "activationDate",
    "gracePeriod1EndDate",
    "expiryDate",
    "thresholdBalance",
    "accntBalance",
    "status",
    "statusDate",
    "language",
    "promoBalance",
    "promoValidityDate",
    "dataExpiryDate",
    "lastCallDate",
    "lastCallCharge",
    "totalBalance",
    "subscriberTimeZone",
    "pin",
    "vmsServiceStatus",
    "totalEarnedCredits",
    "earnedCreditsinLast30Days",
    "usedCreditsinLast30Days",
    "freeSMSCount",
    "freeSMSRuppes",
    "promoDataBytes",
    "promoDataExpiryDate",
    "gprsServStatus",
    "lastReloadTimeStamp",
    "lastReloadAmount",
    "imsiNo",
    "latestTarrifPlanID",
    "simSerialNo",
    "tarrifName",
    "totalUsedCredits",
    "lastTransAction",
    "lastTransCharge",
    "lastTransTimestamp",
    "availableCredit"
})
public class GetSubscriberInfoResponse {

    protected Long accountId;
    @XmlElement(name = "MSISDN")
    protected Long msisdn;
    protected String validityDate;
    protected String activationDate;
    protected String gracePeriod1EndDate;
    protected String expiryDate;
    protected BigDecimal thresholdBalance;
    protected BigDecimal accntBalance;
    protected String status;
    protected String statusDate;
    protected String language;
    protected BigDecimal promoBalance;
    protected String promoValidityDate;
    protected String dataExpiryDate;
    protected String lastCallDate;
    protected BigDecimal lastCallCharge;
    protected BigDecimal totalBalance;
    protected String subscriberTimeZone;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "VMSServiceStatus")
    protected String vmsServiceStatus;
    protected Long totalEarnedCredits;
    protected Long earnedCreditsinLast30Days;
    protected Long usedCreditsinLast30Days;
    protected Long freeSMSCount;
    protected BigDecimal freeSMSRuppes;
    protected Long promoDataBytes;
    protected String promoDataExpiryDate;
    @XmlElement(name = "GPRSServStatus")
    protected String gprsServStatus;
    protected String lastReloadTimeStamp;
    protected BigDecimal lastReloadAmount;
    protected Long imsiNo;
    protected Long latestTarrifPlanID;
    protected String simSerialNo;
    protected String tarrifName;
    protected Long totalUsedCredits;
    protected String lastTransAction;
    protected BigDecimal lastTransCharge;
    protected String lastTransTimestamp;
    protected BigDecimal availableCredit;

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
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMSISDN() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMSISDN(Long value) {
        this.msisdn = value;
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
     * Gets the value of the gracePeriod1EndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGracePeriod1EndDate() {
        return gracePeriod1EndDate;
    }

    /**
     * Sets the value of the gracePeriod1EndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGracePeriod1EndDate(String value) {
        this.gracePeriod1EndDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the thresholdBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThresholdBalance() {
        return thresholdBalance;
    }

    /**
     * Sets the value of the thresholdBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThresholdBalance(BigDecimal value) {
        this.thresholdBalance = value;
    }

    /**
     * Gets the value of the accntBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccntBalance() {
        return accntBalance;
    }

    /**
     * Sets the value of the accntBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccntBalance(BigDecimal value) {
        this.accntBalance = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDate(String value) {
        this.statusDate = value;
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
     * Gets the value of the promoBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromoBalance() {
        return promoBalance;
    }

    /**
     * Sets the value of the promoBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromoBalance(BigDecimal value) {
        this.promoBalance = value;
    }

    /**
     * Gets the value of the promoValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoValidityDate() {
        return promoValidityDate;
    }

    /**
     * Sets the value of the promoValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoValidityDate(String value) {
        this.promoValidityDate = value;
    }

    /**
     * Gets the value of the dataExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataExpiryDate() {
        return dataExpiryDate;
    }

    /**
     * Sets the value of the dataExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataExpiryDate(String value) {
        this.dataExpiryDate = value;
    }

    /**
     * Gets the value of the lastCallDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCallDate() {
        return lastCallDate;
    }

    /**
     * Sets the value of the lastCallDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCallDate(String value) {
        this.lastCallDate = value;
    }

    /**
     * Gets the value of the lastCallCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastCallCharge() {
        return lastCallCharge;
    }

    /**
     * Sets the value of the lastCallCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastCallCharge(BigDecimal value) {
        this.lastCallCharge = value;
    }

    /**
     * Gets the value of the totalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalBalance() {
        return totalBalance;
    }

    /**
     * Sets the value of the totalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalBalance(BigDecimal value) {
        this.totalBalance = value;
    }

    /**
     * Gets the value of the subscriberTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberTimeZone() {
        return subscriberTimeZone;
    }

    /**
     * Sets the value of the subscriberTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberTimeZone(String value) {
        this.subscriberTimeZone = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the vmsServiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVMSServiceStatus() {
        return vmsServiceStatus;
    }

    /**
     * Sets the value of the vmsServiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVMSServiceStatus(String value) {
        this.vmsServiceStatus = value;
    }

    /**
     * Gets the value of the totalEarnedCredits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalEarnedCredits() {
        return totalEarnedCredits;
    }

    /**
     * Sets the value of the totalEarnedCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalEarnedCredits(Long value) {
        this.totalEarnedCredits = value;
    }

    /**
     * Gets the value of the earnedCreditsinLast30Days property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEarnedCreditsinLast30Days() {
        return earnedCreditsinLast30Days;
    }

    /**
     * Sets the value of the earnedCreditsinLast30Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEarnedCreditsinLast30Days(Long value) {
        this.earnedCreditsinLast30Days = value;
    }

    /**
     * Gets the value of the usedCreditsinLast30Days property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUsedCreditsinLast30Days() {
        return usedCreditsinLast30Days;
    }

    /**
     * Sets the value of the usedCreditsinLast30Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUsedCreditsinLast30Days(Long value) {
        this.usedCreditsinLast30Days = value;
    }

    /**
     * Gets the value of the freeSMSCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeSMSCount() {
        return freeSMSCount;
    }

    /**
     * Sets the value of the freeSMSCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeSMSCount(Long value) {
        this.freeSMSCount = value;
    }

    /**
     * Gets the value of the freeSMSRuppes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreeSMSRuppes() {
        return freeSMSRuppes;
    }

    /**
     * Sets the value of the freeSMSRuppes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreeSMSRuppes(BigDecimal value) {
        this.freeSMSRuppes = value;
    }

    /**
     * Gets the value of the promoDataBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromoDataBytes() {
        return promoDataBytes;
    }

    /**
     * Sets the value of the promoDataBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromoDataBytes(Long value) {
        this.promoDataBytes = value;
    }

    /**
     * Gets the value of the promoDataExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDataExpiryDate() {
        return promoDataExpiryDate;
    }

    /**
     * Sets the value of the promoDataExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDataExpiryDate(String value) {
        this.promoDataExpiryDate = value;
    }

    /**
     * Gets the value of the gprsServStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPRSServStatus() {
        return gprsServStatus;
    }

    /**
     * Sets the value of the gprsServStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPRSServStatus(String value) {
        this.gprsServStatus = value;
    }

    /**
     * Gets the value of the lastReloadTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastReloadTimeStamp() {
        return lastReloadTimeStamp;
    }

    /**
     * Sets the value of the lastReloadTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastReloadTimeStamp(String value) {
        this.lastReloadTimeStamp = value;
    }

    /**
     * Gets the value of the lastReloadAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastReloadAmount() {
        return lastReloadAmount;
    }

    /**
     * Sets the value of the lastReloadAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastReloadAmount(BigDecimal value) {
        this.lastReloadAmount = value;
    }

    /**
     * Gets the value of the imsiNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImsiNo() {
        return imsiNo;
    }

    /**
     * Sets the value of the imsiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImsiNo(Long value) {
        this.imsiNo = value;
    }

    /**
     * Gets the value of the latestTarrifPlanID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLatestTarrifPlanID() {
        return latestTarrifPlanID;
    }

    /**
     * Sets the value of the latestTarrifPlanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLatestTarrifPlanID(Long value) {
        this.latestTarrifPlanID = value;
    }

    /**
     * Gets the value of the simSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimSerialNo() {
        return simSerialNo;
    }

    /**
     * Sets the value of the simSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimSerialNo(String value) {
        this.simSerialNo = value;
    }

    /**
     * Gets the value of the tarrifName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarrifName() {
        return tarrifName;
    }

    /**
     * Sets the value of the tarrifName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarrifName(String value) {
        this.tarrifName = value;
    }

    /**
     * Gets the value of the totalUsedCredits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalUsedCredits() {
        return totalUsedCredits;
    }

    /**
     * Sets the value of the totalUsedCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalUsedCredits(Long value) {
        this.totalUsedCredits = value;
    }

    /**
     * Gets the value of the lastTransAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTransAction() {
        return lastTransAction;
    }

    /**
     * Sets the value of the lastTransAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTransAction(String value) {
        this.lastTransAction = value;
    }

    /**
     * Gets the value of the lastTransCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastTransCharge() {
        return lastTransCharge;
    }

    /**
     * Sets the value of the lastTransCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastTransCharge(BigDecimal value) {
        this.lastTransCharge = value;
    }

    /**
     * Gets the value of the lastTransTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTransTimestamp() {
        return lastTransTimestamp;
    }

    /**
     * Sets the value of the lastTransTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTransTimestamp(String value) {
        this.lastTransTimestamp = value;
    }

    /**
     * Gets the value of the availableCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableCredit() {
        return availableCredit;
    }

    /**
     * Sets the value of the availableCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableCredit(BigDecimal value) {
        this.availableCredit = value;
    }

}
