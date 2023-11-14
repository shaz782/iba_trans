
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tpDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tpName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpDetailsType", propOrder = {
    "tpID",
    "tpName",
    "endDate"
})
public class TpDetailsType {

    @XmlElement(required = true)
    protected String tpID;
    @XmlElement(required = true)
    protected String tpName;
    @XmlElement(required = true)
    protected String endDate;

    /**
     * Gets the value of the tpID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpID() {
        return tpID;
    }

    /**
     * Sets the value of the tpID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpID(String value) {
        this.tpID = value;
    }

    /**
     * Gets the value of the tpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpName() {
        return tpName;
    }

    /**
     * Sets the value of the tpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpName(String value) {
        this.tpName = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

}
