
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBundleDtlsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBundleDtlsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bucketDtls" type="{http://billing.xius.com/SubscriberManagement.xsd}BucketListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBundleDtlsResponse", propOrder = {
    "bucketDtls"
})
public class GetBundleDtlsResponse {

    protected BucketListType bucketDtls;

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

}
