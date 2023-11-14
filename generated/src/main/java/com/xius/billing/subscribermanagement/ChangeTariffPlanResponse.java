
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeTariffPlanResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeTariffPlanResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message" type="{http://billing.xius.com/SubscriberManagement.xsd}MessageType" minOccurs="0"/&gt;
 *         &lt;element name="oldTariffPlanName" type="{http://billing.xius.com/SubscriberManagement.xsd}TariffPlanType" minOccurs="0"/&gt;
 *         &lt;element name="newTariffPlan" type="{http://billing.xius.com/SubscriberManagement.xsd}TariffPlanType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeTariffPlanResponse", propOrder = {
    "message",
    "oldTariffPlanName",
    "newTariffPlan"
})
public class ChangeTariffPlanResponse {

    protected String message;
    protected String oldTariffPlanName;
    protected String newTariffPlan;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the oldTariffPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldTariffPlanName() {
        return oldTariffPlanName;
    }

    /**
     * Sets the value of the oldTariffPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldTariffPlanName(String value) {
        this.oldTariffPlanName = value;
    }

    /**
     * Gets the value of the newTariffPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewTariffPlan() {
        return newTariffPlan;
    }

    /**
     * Sets the value of the newTariffPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewTariffPlan(String value) {
        this.newTariffPlan = value;
    }

}
