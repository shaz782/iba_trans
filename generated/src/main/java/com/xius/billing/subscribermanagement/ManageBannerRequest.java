
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageBannerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageBannerRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionFlag" type="{http://billing.xius.com/SubscriberManagement.xsd}OptionFlagType"/&gt;
 *         &lt;element name="bannerDetails" type="{http://billing.xius.com/SubscriberManagement.xsd}BannerDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageBannerRequest", propOrder = {
    "actionFlag",
    "bannerDetails"
})
public class ManageBannerRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OptionFlagType actionFlag;
    protected BannerDetailsType bannerDetails;

    /**
     * Gets the value of the actionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link OptionFlagType }
     *     
     */
    public OptionFlagType getActionFlag() {
        return actionFlag;
    }

    /**
     * Sets the value of the actionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionFlagType }
     *     
     */
    public void setActionFlag(OptionFlagType value) {
        this.actionFlag = value;
    }

    /**
     * Gets the value of the bannerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BannerDetailsType }
     *     
     */
    public BannerDetailsType getBannerDetails() {
        return bannerDetails;
    }

    /**
     * Sets the value of the bannerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BannerDetailsType }
     *     
     */
    public void setBannerDetails(BannerDetailsType value) {
        this.bannerDetails = value;
    }

}
