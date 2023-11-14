
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tariffPackageDetailsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tariffPackageDetailsInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariff_package_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tariff_package_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="rentalFee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="activationFee" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
@XmlType(name = "tariffPackageDetailsInfoType", propOrder = {
    "tariffPackageDesc",
    "tariffPackageId",
    "rentalFee",
    "activationFee",
    "rentalPeriod"
})
public class TariffPackageDetailsInfoType {

    @XmlElement(name = "tariff_package_desc")
    protected String tariffPackageDesc;
    @XmlElement(name = "tariff_package_id")
    protected Long tariffPackageId;
    protected Long rentalFee;
    protected Long activationFee;
    protected Long rentalPeriod;

    /**
     * Gets the value of the tariffPackageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPackageDesc() {
        return tariffPackageDesc;
    }

    /**
     * Sets the value of the tariffPackageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPackageDesc(String value) {
        this.tariffPackageDesc = value;
    }

    /**
     * Gets the value of the tariffPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTariffPackageId() {
        return tariffPackageId;
    }

    /**
     * Sets the value of the tariffPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTariffPackageId(Long value) {
        this.tariffPackageId = value;
    }

    /**
     * Gets the value of the rentalFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRentalFee() {
        return rentalFee;
    }

    /**
     * Sets the value of the rentalFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRentalFee(Long value) {
        this.rentalFee = value;
    }

    /**
     * Gets the value of the activationFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActivationFee() {
        return activationFee;
    }

    /**
     * Sets the value of the activationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActivationFee(Long value) {
        this.activationFee = value;
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
