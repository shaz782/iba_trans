
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAccountSummaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountSummaryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriberInfoType" type="{http://billing.xius.com/SubscriberManagement.xsd}SubscriberInfoType" minOccurs="0"/&gt;
 *         &lt;element name="accountInfo" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountInfoType" minOccurs="0"/&gt;
 *         &lt;element name="tariffPlanDetails" type="{http://billing.xius.com/SubscriberManagement.xsd}TariffPlanDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountSummaryResponse", propOrder = {
    "subscriberInfoType",
    "accountInfo",
    "tariffPlanDetails"
})
public class GetAccountSummaryResponse {

    protected SubscriberInfoType subscriberInfoType;
    protected AccountInfoType accountInfo;
    protected TariffPlanDetailsType tariffPlanDetails;

    /**
     * Gets the value of the subscriberInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberInfoType }
     *     
     */
    public SubscriberInfoType getSubscriberInfoType() {
        return subscriberInfoType;
    }

    /**
     * Sets the value of the subscriberInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberInfoType }
     *     
     */
    public void setSubscriberInfoType(SubscriberInfoType value) {
        this.subscriberInfoType = value;
    }

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfoType }
     *     
     */
    public AccountInfoType getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfoType }
     *     
     */
    public void setAccountInfo(AccountInfoType value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the tariffPlanDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TariffPlanDetailsType }
     *     
     */
    public TariffPlanDetailsType getTariffPlanDetails() {
        return tariffPlanDetails;
    }

    /**
     * Sets the value of the tariffPlanDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffPlanDetailsType }
     *     
     */
    public void setTariffPlanDetails(TariffPlanDetailsType value) {
        this.tariffPlanDetails = value;
    }

}
