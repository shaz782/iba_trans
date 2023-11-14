
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberServicesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberServicesItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicServiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="basicServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="derivedServiceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="derivedServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberServicesItem", propOrder = {
    "basicServiceId",
    "basicServiceName",
    "derivedServiceId",
    "derivedServiceName",
    "status"
})
public class SubscriberServicesItem {

    protected Long basicServiceId;
    protected String basicServiceName;
    protected Long derivedServiceId;
    protected String derivedServiceName;
    protected String status;

    /**
     * Gets the value of the basicServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBasicServiceId() {
        return basicServiceId;
    }

    /**
     * Sets the value of the basicServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBasicServiceId(Long value) {
        this.basicServiceId = value;
    }

    /**
     * Gets the value of the basicServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicServiceName() {
        return basicServiceName;
    }

    /**
     * Sets the value of the basicServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicServiceName(String value) {
        this.basicServiceName = value;
    }

    /**
     * Gets the value of the derivedServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDerivedServiceId() {
        return derivedServiceId;
    }

    /**
     * Sets the value of the derivedServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDerivedServiceId(Long value) {
        this.derivedServiceId = value;
    }

    /**
     * Gets the value of the derivedServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedServiceName() {
        return derivedServiceName;
    }

    /**
     * Sets the value of the derivedServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedServiceName(String value) {
        this.derivedServiceName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
