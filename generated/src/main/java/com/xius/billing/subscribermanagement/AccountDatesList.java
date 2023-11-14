
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountDatesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountDatesList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validitydate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="G1date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="G2date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="G3date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expirydate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountDatesList", propOrder = {
    "validitydate",
    "g1Date",
    "g2Date",
    "g3Date",
    "expirydate"
})
public class AccountDatesList {

    protected String validitydate;
    @XmlElement(name = "G1date")
    protected String g1Date;
    @XmlElement(name = "G2date")
    protected String g2Date;
    @XmlElement(name = "G3date")
    protected String g3Date;
    protected String expirydate;

    /**
     * Gets the value of the validitydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValiditydate() {
        return validitydate;
    }

    /**
     * Sets the value of the validitydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValiditydate(String value) {
        this.validitydate = value;
    }

    /**
     * Gets the value of the g1Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getG1Date() {
        return g1Date;
    }

    /**
     * Sets the value of the g1Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setG1Date(String value) {
        this.g1Date = value;
    }

    /**
     * Gets the value of the g2Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getG2Date() {
        return g2Date;
    }

    /**
     * Sets the value of the g2Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setG2Date(String value) {
        this.g2Date = value;
    }

    /**
     * Gets the value of the g3Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getG3Date() {
        return g3Date;
    }

    /**
     * Sets the value of the g3Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setG3Date(String value) {
        this.g3Date = value;
    }

    /**
     * Gets the value of the expirydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirydate() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirydate(String value) {
        this.expirydate = value;
    }

}
