
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceSuccessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSuccessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rentalAmount" type="{http://billing.xius.com/SubscriberManagement.xsd}RentalAmountType" minOccurs="0"/&gt;
 *         &lt;element name="rentalPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSuccessType", propOrder = {
    "name",
    "rentalAmount",
    "rentalPeriod"
})
public class ServiceSuccessType {

    protected String name;
    protected String rentalAmount;
    protected Long rentalPeriod;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the rentalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalAmount() {
        return rentalAmount;
    }

    /**
     * Sets the value of the rentalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalAmount(String value) {
        this.rentalAmount = value;
    }

    /**
     * Gets the value of the rentalPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRentalPeriod() {
        return rentalPeriod;
    }

    /**
     * Sets the value of the rentalPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRentalPeriod(Long value) {
        this.rentalPeriod = value;
    }

}
