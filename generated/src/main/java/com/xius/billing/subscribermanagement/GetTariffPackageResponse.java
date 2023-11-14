
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTariffPackageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTariffPackageResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffPackageDetailsList" type="{http://billing.xius.com/SubscriberManagement.xsd}tariffPackageDetailsListType" minOccurs="0"/&gt;
 *         &lt;element name="msisdnTpDetails" type="{http://billing.xius.com/SubscriberManagement.xsd}msisdnTpDetailsListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTariffPackageResponse", propOrder = {
    "tariffPackageDetailsList",
    "msisdnTpDetails"
})
public class GetTariffPackageResponse {

    protected TariffPackageDetailsListType tariffPackageDetailsList;
    protected MsisdnTpDetailsListType msisdnTpDetails;

    /**
     * Gets the value of the tariffPackageDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link TariffPackageDetailsListType }
     *     
     */
    public TariffPackageDetailsListType getTariffPackageDetailsList() {
        return tariffPackageDetailsList;
    }

    /**
     * Sets the value of the tariffPackageDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffPackageDetailsListType }
     *     
     */
    public void setTariffPackageDetailsList(TariffPackageDetailsListType value) {
        this.tariffPackageDetailsList = value;
    }

    /**
     * Gets the value of the msisdnTpDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MsisdnTpDetailsListType }
     *     
     */
    public MsisdnTpDetailsListType getMsisdnTpDetails() {
        return msisdnTpDetails;
    }

    /**
     * Sets the value of the msisdnTpDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsisdnTpDetailsListType }
     *     
     */
    public void setMsisdnTpDetails(MsisdnTpDetailsListType value) {
        this.msisdnTpDetails = value;
    }

}
