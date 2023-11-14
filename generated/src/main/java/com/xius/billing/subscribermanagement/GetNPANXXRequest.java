
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNPANXXRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNPANXXRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SIM" type="{http://billing.xius.com/SubscriberManagement.xsd}SIMType"/&gt;
 *         &lt;element name="activationCode" type="{http://billing.xius.com/SubscriberManagement.xsd}ActivationCodeType"/&gt;
 *         &lt;element name="IMSI" type="{http://billing.xius.com/SubscriberManagement.xsd}IMSIType" minOccurs="0"/&gt;
 *         &lt;element name="IMEI" type="{http://billing.xius.com/SubscriberManagement.xsd}IMEIType" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{http://billing.xius.com/SubscriberManagement.xsd}ZipCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNPANXXRequest", propOrder = {
    "sim",
    "activationCode",
    "imsi",
    "imei",
    "zipCode"
})
public class GetNPANXXRequest {

    @XmlElement(name = "SIM", required = true)
    protected String sim;
    @XmlElement(required = true)
    protected String activationCode;
    @XmlElement(name = "IMSI")
    protected String imsi;
    @XmlElement(name = "IMEI")
    protected String imei;
    protected long zipCode;

    /**
     * Gets the value of the sim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIM() {
        return sim;
    }

    /**
     * Sets the value of the sim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIM(String value) {
        this.sim = value;
    }

    /**
     * Gets the value of the activationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * Sets the value of the activationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationCode(String value) {
        this.activationCode = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSI() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSI(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     */
    public long getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     */
    public void setZipCode(long value) {
        this.zipCode = value;
    }

}
