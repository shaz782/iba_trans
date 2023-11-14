
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigureServicesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigureServicesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MSISDN" type="{http://billing.xius.com/SubscriberManagement.xsd}MSISDNType"/&gt;
 *         &lt;element name="specialNumbers" type="{http://billing.xius.com/SubscriberManagement.xsd}SpecialNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigureServicesRequest", propOrder = {
    "msisdn",
    "specialNumbers"
})
public class ConfigureServicesRequest {

    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    protected SpecialNumberType specialNumbers;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the specialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialNumberType }
     *     
     */
    public SpecialNumberType getSpecialNumbers() {
        return specialNumbers;
    }

    /**
     * Sets the value of the specialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialNumberType }
     *     
     */
    public void setSpecialNumbers(SpecialNumberType value) {
        this.specialNumbers = value;
    }

}
