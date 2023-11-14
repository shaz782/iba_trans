
package com.xius.billing.subscribermanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CADataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CADataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caPkgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="caPkgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chargeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CADataType", propOrder = {
    "caPkgId",
    "caPkgName",
    "chargeId",
    "charge"
})
public class CADataType {

    protected Long caPkgId;
    protected String caPkgName;
    protected String chargeId;
    protected BigDecimal charge;

    /**
     * Gets the value of the caPkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCaPkgId() {
        return caPkgId;
    }

    /**
     * Sets the value of the caPkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCaPkgId(Long value) {
        this.caPkgId = value;
    }

    /**
     * Gets the value of the caPkgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaPkgName() {
        return caPkgName;
    }

    /**
     * Sets the value of the caPkgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaPkgName(String value) {
        this.caPkgName = value;
    }

    /**
     * Gets the value of the chargeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeId() {
        return chargeId;
    }

    /**
     * Sets the value of the chargeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeId(String value) {
        this.chargeId = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCharge(BigDecimal value) {
        this.charge = value;
    }

}
