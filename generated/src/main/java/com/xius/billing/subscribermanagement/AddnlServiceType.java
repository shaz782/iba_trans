
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addnlServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addnlServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="svcPlanId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="typeOfService" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="chargeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="svcStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="svcEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actDeactFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="atpUniqueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addnlServiceType", propOrder = {
    "svcPlanId",
    "typeOfService",
    "chargeId",
    "svcStartDate",
    "svcEndDate",
    "actDeactFlag",
    "serviceFlag",
    "atpUniqueId"
})
public class AddnlServiceType {

    protected Long svcPlanId;
    protected Long typeOfService;
    protected String chargeId;
    protected String svcStartDate;
    protected String svcEndDate;
    protected String actDeactFlag;
    protected String serviceFlag;
    protected Long atpUniqueId;

    /**
     * Gets the value of the svcPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSvcPlanId() {
        return svcPlanId;
    }

    /**
     * Sets the value of the svcPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSvcPlanId(Long value) {
        this.svcPlanId = value;
    }

    /**
     * Gets the value of the typeOfService property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTypeOfService() {
        return typeOfService;
    }

    /**
     * Sets the value of the typeOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTypeOfService(Long value) {
        this.typeOfService = value;
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
     * Gets the value of the svcStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcStartDate() {
        return svcStartDate;
    }

    /**
     * Sets the value of the svcStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcStartDate(String value) {
        this.svcStartDate = value;
    }

    /**
     * Gets the value of the svcEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcEndDate() {
        return svcEndDate;
    }

    /**
     * Sets the value of the svcEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcEndDate(String value) {
        this.svcEndDate = value;
    }

    /**
     * Gets the value of the actDeactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActDeactFlag() {
        return actDeactFlag;
    }

    /**
     * Sets the value of the actDeactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActDeactFlag(String value) {
        this.actDeactFlag = value;
    }

    /**
     * Gets the value of the serviceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFlag() {
        return serviceFlag;
    }

    /**
     * Sets the value of the serviceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFlag(String value) {
        this.serviceFlag = value;
    }

    /**
     * Gets the value of the atpUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAtpUniqueId() {
        return atpUniqueId;
    }

    /**
     * Sets the value of the atpUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAtpUniqueId(Long value) {
        this.atpUniqueId = value;
    }

}
