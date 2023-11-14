
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for atpDtlsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atpDtlsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="servicePackageDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servicePackageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="publicityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atpDtlsType", propOrder = {
    "servicePackageDesc",
    "servicePackageId",
    "publicityId"
})
public class AtpDtlsType {

    protected String servicePackageDesc;
    protected String servicePackageId;
    protected String publicityId;

    /**
     * Gets the value of the servicePackageDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePackageDesc() {
        return servicePackageDesc;
    }

    /**
     * Sets the value of the servicePackageDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePackageDesc(String value) {
        this.servicePackageDesc = value;
    }

    /**
     * Gets the value of the servicePackageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePackageId() {
        return servicePackageId;
    }

    /**
     * Sets the value of the servicePackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePackageId(String value) {
        this.servicePackageId = value;
    }

    /**
     * Gets the value of the publicityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicityId() {
        return publicityId;
    }

    /**
     * Sets the value of the publicityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicityId(String value) {
        this.publicityId = value;
    }

}
