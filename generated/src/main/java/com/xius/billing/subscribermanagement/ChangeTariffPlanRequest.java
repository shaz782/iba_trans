
package com.xius.billing.subscribermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeTariffPlanRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeTariffPlanRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountType"/&gt;
 *         &lt;element name="newTariffPlanId" type="{http://billing.xius.com/SubscriberManagement.xsd}TariffPlanIdType"/&gt;
 *         &lt;element name="operator" type="{http://billing.xius.com/SubscriberManagement.xsd}OperatorType" minOccurs="0"/&gt;
 *         &lt;element name="charges" type="{http://billing.xius.com/SubscriberManagement.xsd}BalanceType" minOccurs="0"/&gt;
 *         &lt;element name="internalTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeTariffPlanRequest", propOrder = {
    "account",
    "newTariffPlanId",
    "operator",
    "charges",
    "internalTransId",
    "externalTransId"
})
public class ChangeTariffPlanRequest {

    @XmlElement(required = true)
    protected AccountType account;
    protected int newTariffPlanId;
    protected String operator;
    protected BigDecimal charges;
    protected String internalTransId;
    protected String externalTransId;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccount(AccountType value) {
        this.account = value;
    }

    /**
     * Gets the value of the newTariffPlanId property.
     * 
     */
    public int getNewTariffPlanId() {
        return newTariffPlanId;
    }

    /**
     * Sets the value of the newTariffPlanId property.
     * 
     */
    public void setNewTariffPlanId(int value) {
        this.newTariffPlanId = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCharges(BigDecimal value) {
        this.charges = value;
    }

    /**
     * Gets the value of the internalTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalTransId() {
        return internalTransId;
    }

    /**
     * Sets the value of the internalTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalTransId(String value) {
        this.internalTransId = value;
    }

    /**
     * Gets the value of the externalTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTransId() {
        return externalTransId;
    }

    /**
     * Sets the value of the externalTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTransId(String value) {
        this.externalTransId = value;
    }

}
