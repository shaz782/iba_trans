
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetChngeTpRecquiredRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetChngeTpRecquiredRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SIMNo" type="{http://billing.xius.com/SubscriberManagement.xsd}SIMType"/&gt;
 *         &lt;element name="idValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetChngeTpRecquiredRequest", propOrder = {
    "simNo",
    "idValue"
})
public class GetChngeTpRecquiredRequest {

    @XmlElement(name = "SIMNo", required = true)
    protected String simNo;
    @XmlElement(required = true)
    protected String idValue;

    /**
     * Gets the value of the simNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIMNo() {
        return simNo;
    }

    /**
     * Sets the value of the simNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIMNo(String value) {
        this.simNo = value;
    }

    /**
     * Gets the value of the idValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdValue() {
        return idValue;
    }

    /**
     * Sets the value of the idValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdValue(String value) {
        this.idValue = value;
    }

}
