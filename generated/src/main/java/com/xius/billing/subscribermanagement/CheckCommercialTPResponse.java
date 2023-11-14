
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkCommercialTPResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkCommercialTPResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vaildityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gracePeriod1Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gracePeriod2Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gracePeriod3Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkCommercialTPResponse", propOrder = {
    "tpCategory",
    "vaildityDate",
    "gracePeriod1Date",
    "gracePeriod2Date",
    "gracePeriod3Date",
    "expiryDate"
})
public class CheckCommercialTPResponse {

    protected String tpCategory;
    protected String vaildityDate;
    protected String gracePeriod1Date;
    protected String gracePeriod2Date;
    protected String gracePeriod3Date;
    protected String expiryDate;

    /**
     * Gets the value of the tpCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpCategory() {
        return tpCategory;
    }

    /**
     * Sets the value of the tpCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpCategory(String value) {
        this.tpCategory = value;
    }

    /**
     * Gets the value of the vaildityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVaildityDate() {
        return vaildityDate;
    }

    /**
     * Sets the value of the vaildityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVaildityDate(String value) {
        this.vaildityDate = value;
    }

    /**
     * Gets the value of the gracePeriod1Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGracePeriod1Date() {
        return gracePeriod1Date;
    }

    /**
     * Sets the value of the gracePeriod1Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGracePeriod1Date(String value) {
        this.gracePeriod1Date = value;
    }

    /**
     * Gets the value of the gracePeriod2Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGracePeriod2Date() {
        return gracePeriod2Date;
    }

    /**
     * Sets the value of the gracePeriod2Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGracePeriod2Date(String value) {
        this.gracePeriod2Date = value;
    }

    /**
     * Gets the value of the gracePeriod3Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGracePeriod3Date() {
        return gracePeriod3Date;
    }

    /**
     * Sets the value of the gracePeriod3Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGracePeriod3Date(String value) {
        this.gracePeriod3Date = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

}
