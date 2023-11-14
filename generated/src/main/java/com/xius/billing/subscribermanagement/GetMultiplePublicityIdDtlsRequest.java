
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMultiplePublicityIdDtlsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMultiplePublicityIdDtlsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicityIds" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msisdn" type="{http://billing.xius.com/SubscriberManagement.xsd}MSISDNType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMultiplePublicityIdDtlsRequest", propOrder = {
    "publicityIds",
    "msisdn"
})
public class GetMultiplePublicityIdDtlsRequest {

    @XmlElement(required = true)
    protected String publicityIds;
    @XmlElement(required = true)
    protected String msisdn;

    /**
     * Gets the value of the publicityIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicityIds() {
        return publicityIds;
    }

    /**
     * Sets the value of the publicityIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicityIds(String value) {
        this.publicityIds = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
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
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

}
