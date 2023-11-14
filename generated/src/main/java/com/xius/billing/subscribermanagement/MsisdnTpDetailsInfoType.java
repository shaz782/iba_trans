
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for msisdnTpDetailsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="msisdnTpDetailsInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariff_package_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tariff_package_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msisdnTpDetailsInfoType", propOrder = {
    "tariffPackageDesc",
    "tariffPackageId"
})
public class MsisdnTpDetailsInfoType {

    @XmlElement(name = "tariff_package_desc")
    protected String tariffPackageDesc;
    @XmlElement(name = "tariff_package_id")
    protected Long tariffPackageId;

    /**
     * Gets the value of the tariffPackageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPackageDesc() {
        return tariffPackageDesc;
    }

    /**
     * Sets the value of the tariffPackageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPackageDesc(String value) {
        this.tariffPackageDesc = value;
    }

    /**
     * Gets the value of the tariffPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTariffPackageId() {
        return tariffPackageId;
    }

    /**
     * Sets the value of the tariffPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTariffPackageId(Long value) {
        this.tariffPackageId = value;
    }

}
