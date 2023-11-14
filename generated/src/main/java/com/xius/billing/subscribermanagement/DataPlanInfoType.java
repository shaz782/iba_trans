
package com.xius.billing.subscribermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataPlanInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataPlanInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicityId" type="{http://billing.xius.com/SubscriberManagement.xsd}PublicityIdType" minOccurs="0"/&gt;
 *         &lt;element name="planId" type="{http://billing.xius.com/SubscriberManagement.xsd}DataPlanIdType" minOccurs="0"/&gt;
 *         &lt;element name="planName" type="{http://billing.xius.com/SubscriberManagement.xsd}DataPlanNameType" minOccurs="0"/&gt;
 *         &lt;element name="planCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="planPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remaingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usedBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actualBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activationFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataPlanInfoType", propOrder = {
    "publicityId",
    "planId",
    "planName",
    "planCharge",
    "planPeriod",
    "expiryDate",
    "remaingBalance",
    "usedBalance",
    "actualBalance",
    "activationFee"
})
public class DataPlanInfoType {

    protected String publicityId;
    protected Long planId;
    protected String planName;
    protected BigDecimal planCharge;
    protected String planPeriod;
    protected String expiryDate;
    protected String remaingBalance;
    protected String usedBalance;
    protected String actualBalance;
    protected BigDecimal activationFee;

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
     * Gets the value of the planId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlanId() {
        return planId;
    }

    /**
     * Sets the value of the planId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlanId(Long value) {
        this.planId = value;
    }

    /**
     * Gets the value of the planName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * Sets the value of the planName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanName(String value) {
        this.planName = value;
    }

    /**
     * Gets the value of the planCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlanCharge() {
        return planCharge;
    }

    /**
     * Sets the value of the planCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlanCharge(BigDecimal value) {
        this.planCharge = value;
    }

    /**
     * Gets the value of the planPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanPeriod() {
        return planPeriod;
    }

    /**
     * Sets the value of the planPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanPeriod(String value) {
        this.planPeriod = value;
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
     * Gets the value of the remaingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemaingBalance() {
        return remaingBalance;
    }

    /**
     * Sets the value of the remaingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemaingBalance(String value) {
        this.remaingBalance = value;
    }

    /**
     * Gets the value of the usedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedBalance() {
        return usedBalance;
    }

    /**
     * Sets the value of the usedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedBalance(String value) {
        this.usedBalance = value;
    }

    /**
     * Gets the value of the actualBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualBalance() {
        return actualBalance;
    }

    /**
     * Sets the value of the actualBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualBalance(String value) {
        this.actualBalance = value;
    }

    /**
     * Gets the value of the activationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActivationFee() {
        return activationFee;
    }

    /**
     * Sets the value of the activationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActivationFee(BigDecimal value) {
        this.activationFee = value;
    }

}
