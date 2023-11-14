
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBndlBucketsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBndlBucketsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AsgndBundlesList" type="{http://billing.xius.com/SubscriberManagement.xsd}BundleListType" minOccurs="0"/&gt;
 *         &lt;element name="AsgndBucketsList" type="{http://billing.xius.com/SubscriberManagement.xsd}BucketListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBndlBucketsResponse", propOrder = {
    "asgndBundlesList",
    "asgndBucketsList"
})
public class GetBndlBucketsResponse {

    @XmlElement(name = "AsgndBundlesList")
    protected BundleListType asgndBundlesList;
    @XmlElement(name = "AsgndBucketsList")
    protected BucketListType asgndBucketsList;

    /**
     * Gets the value of the asgndBundlesList property.
     * 
     * @return
     *     possible object is
     *     {@link BundleListType }
     *     
     */
    public BundleListType getAsgndBundlesList() {
        return asgndBundlesList;
    }

    /**
     * Sets the value of the asgndBundlesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleListType }
     *     
     */
    public void setAsgndBundlesList(BundleListType value) {
        this.asgndBundlesList = value;
    }

    /**
     * Gets the value of the asgndBucketsList property.
     * 
     * @return
     *     possible object is
     *     {@link BucketListType }
     *     
     */
    public BucketListType getAsgndBucketsList() {
        return asgndBucketsList;
    }

    /**
     * Sets the value of the asgndBucketsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BucketListType }
     *     
     */
    public void setAsgndBucketsList(BucketListType value) {
        this.asgndBucketsList = value;
    }

}
