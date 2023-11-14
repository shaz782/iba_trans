
package com.xius.billing.subscribermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscribeOptionalServicesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscribeOptionalServicesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="acctId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Subscribed" type="{http://billing.xius.com/SubscriberManagement.xsd}SubscribedType" minOccurs="0"/&gt;
 *         &lt;element name="UnSubscribed" type="{http://billing.xius.com/SubscriberManagement.xsd}UnSubscribedType" minOccurs="0"/&gt;
 *         &lt;element name="InvalidServices" type="{http://billing.xius.com/SubscriberManagement.xsd}InvalidServicesType" minOccurs="0"/&gt;
 *         &lt;element name="VMSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servicesInfo" type="{http://billing.xius.com/SubscriberManagement.xsd}ServicesInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serv_sub_fail_act_fee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribeOptionalServicesResponse", propOrder = {
    "networkId",
    "acctId",
    "msisdn",
    "subscribed",
    "unSubscribed",
    "invalidServices",
    "vmsNumber",
    "servicesInfo",
    "servSubFailActFee"
})
public class SubscribeOptionalServicesResponse {

    protected Long networkId;
    protected Long acctId;
    protected Long msisdn;
    @XmlElement(name = "Subscribed")
    protected SubscribedType subscribed;
    @XmlElement(name = "UnSubscribed")
    protected UnSubscribedType unSubscribed;
    @XmlElement(name = "InvalidServices")
    protected InvalidServicesType invalidServices;
    @XmlElement(name = "VMSNumber")
    protected String vmsNumber;
    protected List<ServicesInfoType> servicesInfo;
    @XmlElement(name = "serv_sub_fail_act_fee")
    protected String servSubFailActFee;

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetworkId(Long value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcctId(Long value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMsisdn(Long value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the subscribed property.
     * 
     * @return
     *     possible object is
     *     {@link SubscribedType }
     *     
     */
    public SubscribedType getSubscribed() {
        return subscribed;
    }

    /**
     * Sets the value of the subscribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscribedType }
     *     
     */
    public void setSubscribed(SubscribedType value) {
        this.subscribed = value;
    }

    /**
     * Gets the value of the unSubscribed property.
     * 
     * @return
     *     possible object is
     *     {@link UnSubscribedType }
     *     
     */
    public UnSubscribedType getUnSubscribed() {
        return unSubscribed;
    }

    /**
     * Sets the value of the unSubscribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnSubscribedType }
     *     
     */
    public void setUnSubscribed(UnSubscribedType value) {
        this.unSubscribed = value;
    }

    /**
     * Gets the value of the invalidServices property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidServicesType }
     *     
     */
    public InvalidServicesType getInvalidServices() {
        return invalidServices;
    }

    /**
     * Sets the value of the invalidServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidServicesType }
     *     
     */
    public void setInvalidServices(InvalidServicesType value) {
        this.invalidServices = value;
    }

    /**
     * Gets the value of the vmsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVMSNumber() {
        return vmsNumber;
    }

    /**
     * Sets the value of the vmsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVMSNumber(String value) {
        this.vmsNumber = value;
    }

    /**
     * Gets the value of the servicesInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicesInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicesInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicesInfoType }
     * 
     * 
     */
    public List<ServicesInfoType> getServicesInfo() {
        if (servicesInfo == null) {
            servicesInfo = new ArrayList<ServicesInfoType>();
        }
        return this.servicesInfo;
    }

    /**
     * Gets the value of the servSubFailActFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServSubFailActFee() {
        return servSubFailActFee;
    }

    /**
     * Sets the value of the servSubFailActFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServSubFailActFee(String value) {
        this.servSubFailActFee = value;
    }

}
