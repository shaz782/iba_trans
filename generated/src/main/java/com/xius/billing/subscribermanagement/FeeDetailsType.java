
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activationFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rentalFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDetailsType", propOrder = {
    "activationFee",
    "rentalFee"
})
public class FeeDetailsType {

    protected String activationFee;
    protected String rentalFee;

    /**
     * Gets the value of the activationFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationFee() {
        return activationFee;
    }

    /**
     * Sets the value of the activationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationFee(String value) {
        this.activationFee = value;
    }

    /**
     * Gets the value of the rentalFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalFee() {
        return rentalFee;
    }

    /**
     * Sets the value of the rentalFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalFee(String value) {
        this.rentalFee = value;
    }

}
