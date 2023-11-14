
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iccidtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iccidtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iccid_from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iccid_to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iccidtype", propOrder = {
    "iccidFrom",
    "iccidTo"
})
public class Iccidtype {

    @XmlElement(name = "iccid_from")
    protected String iccidFrom;
    @XmlElement(name = "iccid_to")
    protected String iccidTo;

    /**
     * Gets the value of the iccidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccidFrom() {
        return iccidFrom;
    }

    /**
     * Sets the value of the iccidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccidFrom(String value) {
        this.iccidFrom = value;
    }

    /**
     * Gets the value of the iccidTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccidTo() {
        return iccidTo;
    }

    /**
     * Sets the value of the iccidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccidTo(String value) {
        this.iccidTo = value;
    }

}
