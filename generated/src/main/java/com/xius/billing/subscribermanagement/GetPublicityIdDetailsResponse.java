
package com.xius.billing.subscribermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPublicityIdDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPublicityIdDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ATPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChargeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Charge" type="{http://billing.xius.com/SubscriberManagement.xsd}BalanceType" minOccurs="0"/&gt;
 *         &lt;element name="planName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plantype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="planDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPublicityIdDetailsResponse", propOrder = {
    "atpId",
    "chargeId",
    "charge",
    "planName",
    "plantype",
    "planDescription"
})
public class GetPublicityIdDetailsResponse {

    @XmlElement(name = "ATPId")
    protected String atpId;
    @XmlElement(name = "ChargeId")
    protected String chargeId;
    @XmlElement(name = "Charge")
    protected BigDecimal charge;
    protected String planName;
    protected String plantype;
    protected String planDescription;

    /**
     * Gets the value of the atpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATPId() {
        return atpId;
    }

    /**
     * Sets the value of the atpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATPId(String value) {
        this.atpId = value;
    }

    /**
     * Gets the value of the chargeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeId() {
        return chargeId;
    }

    /**
     * Sets the value of the chargeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeId(String value) {
        this.chargeId = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCharge(BigDecimal value) {
        this.charge = value;
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
     * Gets the value of the plantype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantype() {
        return plantype;
    }

    /**
     * Sets the value of the plantype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantype(String value) {
        this.plantype = value;
    }

    /**
     * Gets the value of the planDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanDescription() {
        return planDescription;
    }

    /**
     * Sets the value of the planDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanDescription(String value) {
        this.planDescription = value;
    }

}
