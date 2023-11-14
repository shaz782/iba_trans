
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppendBulkIMSIsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppendBulkIMSIsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="msisdnIMSIRecFlagArr" type="{http://billing.xius.com/SubscriberManagement.xsd}MSISDNRecFlagArrType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppendBulkIMSIsResponse", propOrder = {
    "msisdnIMSIRecFlagArr"
})
public class AppendBulkIMSIsResponse {

    protected MSISDNRecFlagArrType msisdnIMSIRecFlagArr;

    /**
     * Gets the value of the msisdnIMSIRecFlagArr property.
     * 
     * @return
     *     possible object is
     *     {@link MSISDNRecFlagArrType }
     *     
     */
    public MSISDNRecFlagArrType getMsisdnIMSIRecFlagArr() {
        return msisdnIMSIRecFlagArr;
    }

    /**
     * Sets the value of the msisdnIMSIRecFlagArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSISDNRecFlagArrType }
     *     
     */
    public void setMsisdnIMSIRecFlagArr(MSISDNRecFlagArrType value) {
        this.msisdnIMSIRecFlagArr = value;
    }

}
