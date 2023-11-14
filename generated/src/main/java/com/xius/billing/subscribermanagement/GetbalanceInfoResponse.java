
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetbalanceInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetbalanceInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResultDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MainBalance" type="{http://billing.xius.com/SubscriberManagement.xsd}MainBalanceType" minOccurs="0"/&gt;
 *         &lt;element name="PromoBalance" type="{http://billing.xius.com/SubscriberManagement.xsd}PromoBalanceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetbalanceInfoResponse", propOrder = {
    "result",
    "resultCode",
    "resultDescription",
    "mainBalance",
    "promoBalance"
})
public class GetbalanceInfoResponse {

    @XmlElement(name = "Result", required = true)
    protected String result;
    @XmlElement(name = "ResultCode", required = true)
    protected String resultCode;
    @XmlElement(name = "ResultDescription", required = true)
    protected String resultDescription;
    @XmlElement(name = "MainBalance")
    protected MainBalanceType mainBalance;
    @XmlElement(name = "PromoBalance")
    protected PromoBalanceType promoBalance;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /**
     * Sets the value of the resultDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDescription(String value) {
        this.resultDescription = value;
    }

    /**
     * Gets the value of the mainBalance property.
     * 
     * @return
     *     possible object is
     *     {@link MainBalanceType }
     *     
     */
    public MainBalanceType getMainBalance() {
        return mainBalance;
    }

    /**
     * Sets the value of the mainBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainBalanceType }
     *     
     */
    public void setMainBalance(MainBalanceType value) {
        this.mainBalance = value;
    }

    /**
     * Gets the value of the promoBalance property.
     * 
     * @return
     *     possible object is
     *     {@link PromoBalanceType }
     *     
     */
    public PromoBalanceType getPromoBalance() {
        return promoBalance;
    }

    /**
     * Sets the value of the promoBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromoBalanceType }
     *     
     */
    public void setPromoBalance(PromoBalanceType value) {
        this.promoBalance = value;
    }

}
