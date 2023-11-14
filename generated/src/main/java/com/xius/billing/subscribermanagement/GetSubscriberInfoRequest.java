
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSubscriberInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSubscriberInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="option" type="{http://billing.xius.com/SubscriberManagement.xsd}OptionType"/&gt;
 *         &lt;element name="VMS" type="{http://billing.xius.com/SubscriberManagement.xsd}VMSType" minOccurs="0"/&gt;
 *         &lt;element name="IVR" type="{http://billing.xius.com/SubscriberManagement.xsd}IVRType" minOccurs="0"/&gt;
 *         &lt;element name="requestFrom" type="{http://billing.xius.com/SubscriberManagement.xsd}RequestFromType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubscriberInfoRequest", propOrder = {
    "option",
    "vms",
    "ivr",
    "requestFrom"
})
public class GetSubscriberInfoRequest {

    @XmlElement(required = true)
    protected OptionType option;
    @XmlElement(name = "VMS")
    protected String vms;
    @XmlElement(name = "IVR")
    protected String ivr;
    protected String requestFrom;

    /**
     * Gets the value of the option property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType }
     *     
     */
    public OptionType getOption() {
        return option;
    }

    /**
     * Sets the value of the option property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType }
     *     
     */
    public void setOption(OptionType value) {
        this.option = value;
    }

    /**
     * Gets the value of the vms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVMS() {
        return vms;
    }

    /**
     * Sets the value of the vms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVMS(String value) {
        this.vms = value;
    }

    /**
     * Gets the value of the ivr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVR() {
        return ivr;
    }

    /**
     * Sets the value of the ivr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVR(String value) {
        this.ivr = value;
    }

    /**
     * Gets the value of the requestFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestFrom() {
        return requestFrom;
    }

    /**
     * Sets the value of the requestFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestFrom(String value) {
        this.requestFrom = value;
    }

}
