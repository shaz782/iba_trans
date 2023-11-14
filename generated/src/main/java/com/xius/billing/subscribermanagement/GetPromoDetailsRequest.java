
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPromoDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPromoDetailsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="promoType" type="{http://billing.xius.com/SubscriberManagement.xsd}PromoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPromoDetailsRequest", propOrder = {
    "promoType"
})
public class GetPromoDetailsRequest {

    protected PromoType promoType;

    /**
     * Gets the value of the promoType property.
     * 
     * @return
     *     possible object is
     *     {@link PromoType }
     *     
     */
    public PromoType getPromoType() {
        return promoType;
    }

    /**
     * Sets the value of the promoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromoType }
     *     
     */
    public void setPromoType(PromoType value) {
        this.promoType = value;
    }

}
