
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTariffServicePackDtlsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTariffServicePackDtlsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="servicePlansList" type="{http://billing.xius.com/SubscriberManagement.xsd}ServicePlansListType" minOccurs="0"/&gt;
 *         &lt;element name="bucketDtls" type="{http://billing.xius.com/SubscriberManagement.xsd}BucketListType" minOccurs="0"/&gt;
 *         &lt;element name="discountDtls" type="{http://billing.xius.com/SubscriberManagement.xsd}DiscountListType" minOccurs="0"/&gt;
 *         &lt;element name="caDtls" type="{http://billing.xius.com/SubscriberManagement.xsd}CAListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTariffServicePackDtlsResponse", propOrder = {
    "servicePlansList",
    "bucketDtls",
    "discountDtls",
    "caDtls"
})
public class GetTariffServicePackDtlsResponse {

    protected ServicePlansListType servicePlansList;
    protected BucketListType bucketDtls;
    protected DiscountListType discountDtls;
    protected CAListType caDtls;

    /**
     * Gets the value of the servicePlansList property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePlansListType }
     *     
     */
    public ServicePlansListType getServicePlansList() {
        return servicePlansList;
    }

    /**
     * Sets the value of the servicePlansList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePlansListType }
     *     
     */
    public void setServicePlansList(ServicePlansListType value) {
        this.servicePlansList = value;
    }

    /**
     * Gets the value of the bucketDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BucketListType }
     *     
     */
    public BucketListType getBucketDtls() {
        return bucketDtls;
    }

    /**
     * Sets the value of the bucketDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BucketListType }
     *     
     */
    public void setBucketDtls(BucketListType value) {
        this.bucketDtls = value;
    }

    /**
     * Gets the value of the discountDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountListType }
     *     
     */
    public DiscountListType getDiscountDtls() {
        return discountDtls;
    }

    /**
     * Sets the value of the discountDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountListType }
     *     
     */
    public void setDiscountDtls(DiscountListType value) {
        this.discountDtls = value;
    }

    /**
     * Gets the value of the caDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CAListType }
     *     
     */
    public CAListType getCaDtls() {
        return caDtls;
    }

    /**
     * Sets the value of the caDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAListType }
     *     
     */
    public void setCaDtls(CAListType value) {
        this.caDtls = value;
    }

}
