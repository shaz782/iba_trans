
package com.xius.billing.subscribermanagement;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeTariffPlanPreInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeTariffPlanPreInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountID" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountIdType" minOccurs="0"/&gt;
 *         &lt;element name="currentTariffPlan" type="{http://billing.xius.com/SubscriberManagement.xsd}TariffPlanDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="availableTariffPlan" type="{http://billing.xius.com/SubscriberManagement.xsd}TariffPlanDetailsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="administrativeCharges" type="{http://billing.xius.com/SubscriberManagement.xsd}BalanceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeTariffPlanPreInfoResponse", propOrder = {
    "accountID",
    "currentTariffPlan",
    "availableTariffPlan",
    "administrativeCharges"
})
public class ChangeTariffPlanPreInfoResponse {

    protected Long accountID;
    protected TariffPlanDetailsType currentTariffPlan;
    protected List<TariffPlanDetailsType> availableTariffPlan;
    protected BigDecimal administrativeCharges;

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
     * Gets the value of the currentTariffPlan property.
     * 
     * @return
     *     possible object is
     *     {@link TariffPlanDetailsType }
     *     
     */
    public TariffPlanDetailsType getCurrentTariffPlan() {
        return currentTariffPlan;
    }

    /**
     * Sets the value of the currentTariffPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffPlanDetailsType }
     *     
     */
    public void setCurrentTariffPlan(TariffPlanDetailsType value) {
        this.currentTariffPlan = value;
    }

    /**
     * Gets the value of the availableTariffPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableTariffPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableTariffPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffPlanDetailsType }
     * 
     * 
     */
    public List<TariffPlanDetailsType> getAvailableTariffPlan() {
        if (availableTariffPlan == null) {
            availableTariffPlan = new ArrayList<TariffPlanDetailsType>();
        }
        return this.availableTariffPlan;
    }

    /**
     * Gets the value of the administrativeCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdministrativeCharges() {
        return administrativeCharges;
    }

    /**
     * Sets the value of the administrativeCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdministrativeCharges(BigDecimal value) {
        this.administrativeCharges = value;
    }

}
