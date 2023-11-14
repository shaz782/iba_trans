
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostPaidPreInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostPaidPreInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billCycleDay" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tariffPackId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tarrifPakageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostPaidPreInfoResponse", propOrder = {
    "billCycleDay",
    "tariffPackId",
    "creditLimit",
    "priceGroupId",
    "tarrifPakageName"
})
public class PostPaidPreInfoResponse {

    protected Long billCycleDay;
    protected String tariffPackId;
    protected String creditLimit;
    protected String priceGroupId;
    protected String tarrifPakageName;

    /**
     * Gets the value of the billCycleDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillCycleDay() {
        return billCycleDay;
    }

    /**
     * Sets the value of the billCycleDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillCycleDay(Long value) {
        this.billCycleDay = value;
    }

    /**
     * Gets the value of the tariffPackId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPackId() {
        return tariffPackId;
    }

    /**
     * Sets the value of the tariffPackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPackId(String value) {
        this.tariffPackId = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimit(String value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the priceGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceGroupId() {
        return priceGroupId;
    }

    /**
     * Sets the value of the priceGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceGroupId(String value) {
        this.priceGroupId = value;
    }

    /**
     * Gets the value of the tarrifPakageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarrifPakageName() {
        return tarrifPakageName;
    }

    /**
     * Sets the value of the tarrifPakageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarrifPakageName(String value) {
        this.tarrifPakageName = value;
    }

}
