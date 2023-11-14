
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppendBulkIMSIsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppendBulkIMSIsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="msisdnRecFlagArr" type="{http://billing.xius.com/SubscriberManagement.xsd}MSISDNRecFlagArrType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppendBulkIMSIsRequest", propOrder = {
    "msisdnRecFlagArr"
})
public class AppendBulkIMSIsRequest {

    @XmlElement(required = true)
    protected MSISDNRecFlagArrType msisdnRecFlagArr;

    /**
     * Gets the value of the msisdnRecFlagArr property.
     * 
     * @return
     *     possible object is
     *     {@link MSISDNRecFlagArrType }
     *     
     */
    public MSISDNRecFlagArrType getMsisdnRecFlagArr() {
        return msisdnRecFlagArr;
    }

    /**
     * Sets the value of the msisdnRecFlagArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSISDNRecFlagArrType }
     *     
     */
    public void setMsisdnRecFlagArr(MSISDNRecFlagArrType value) {
        this.msisdnRecFlagArr = value;
    }

}
