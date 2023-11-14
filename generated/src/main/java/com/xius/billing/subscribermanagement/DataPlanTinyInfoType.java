
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataPlanTinyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataPlanTinyInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicityId" type="{http://billing.xius.com/SubscriberManagement.xsd}PublicityIdType"/&gt;
 *         &lt;element name="subscriptionType" type="{http://billing.xius.com/SubscriberManagement.xsd}SubUnSubType"/&gt;
 *         &lt;element name="isChargeDebited" type="{http://billing.xius.com/SubscriberManagement.xsd}ChargeDebitedType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataPlanTinyInfoType", propOrder = {
    "publicityId",
    "subscriptionType",
    "isChargeDebited"
})
public class DataPlanTinyInfoType {

    @XmlElement(required = true)
    protected String publicityId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SubUnSubType subscriptionType;
    protected int isChargeDebited;

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
     * Gets the value of the subscriptionType property.
     * 
     * @return
     *     possible object is
     *     {@link SubUnSubType }
     *     
     */
    public SubUnSubType getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * Sets the value of the subscriptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubUnSubType }
     *     
     */
    public void setSubscriptionType(SubUnSubType value) {
        this.subscriptionType = value;
    }

    /**
     * Gets the value of the isChargeDebited property.
     * 
     */
    public int getIsChargeDebited() {
        return isChargeDebited;
    }

    /**
     * Sets the value of the isChargeDebited property.
     * 
     */
    public void setIsChargeDebited(int value) {
        this.isChargeDebited = value;
    }

}
