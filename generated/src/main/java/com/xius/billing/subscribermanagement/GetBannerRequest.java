
package com.xius.billing.subscribermanagement;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBannerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBannerRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="option" type="{http://billing.xius.com/SubscriberManagement.xsd}OptType"/&gt;
 *         &lt;element name="Id" type="{http://billing.xius.com/SubscriberManagement.xsd}IdType" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://billing.xius.com/SubscriberManagement.xsd}Type" minOccurs="0"/&gt;
 *         &lt;element name="maxRecords" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBannerRequest", propOrder = {
    "option",
    "id",
    "type",
    "maxRecords"
})
public class GetBannerRequest {

    @XmlElement(required = true)
    protected OptType option;
    @XmlElement(name = "Id")
    protected BigInteger id;
    protected String type;
    protected Long maxRecords;

    /**
     * Gets the value of the option property.
     * 
     * @return
     *     possible object is
     *     {@link OptType }
     *     
     */
    public OptType getOption() {
        return option;
    }

    /**
     * Sets the value of the option property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptType }
     *     
     */
    public void setOption(OptType value) {
        this.option = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the maxRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxRecords() {
        return maxRecords;
    }

    /**
     * Sets the value of the maxRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxRecords(Long value) {
        this.maxRecords = value;
    }

}
