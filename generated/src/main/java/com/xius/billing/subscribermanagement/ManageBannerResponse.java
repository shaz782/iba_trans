
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageBannerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageBannerResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messge" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageBannerResponse", propOrder = {
    "messge"
})
public class ManageBannerResponse {

    @XmlElement(required = true)
    protected String messge;

    /**
     * Gets the value of the messge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessge() {
        return messge;
    }

    /**
     * Sets the value of the messge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessge(String value) {
        this.messge = value;
    }

}
