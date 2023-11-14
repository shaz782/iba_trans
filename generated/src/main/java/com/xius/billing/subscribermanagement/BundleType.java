
package com.xius.billing.subscribermanagement;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BundleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bundleId" type="{http://billing.xius.com/SubscriberManagement.xsd}bundleIdType" minOccurs="0"/&gt;
 *         &lt;element name="bundleName" type="{http://billing.xius.com/SubscriberManagement.xsd}bundleNameType" minOccurs="0"/&gt;
 *         &lt;element name="Currentbalance" type="{http://billing.xius.com/SubscriberManagement.xsd}BalanceType" minOccurs="0"/&gt;
 *         &lt;element name="Expirationdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssignedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Balancecategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BundlecategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BundlecategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bundlecharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activationFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundleType", propOrder = {
    "bundleId",
    "bundleName",
    "currentbalance",
    "expirationdate",
    "assignedDate",
    "balancecategory",
    "bundlecategoryId",
    "bundlecategoryName",
    "bundlecharge",
    "activationFee"
})
public class BundleType {

    protected BigInteger bundleId;
    protected String bundleName;
    @XmlElement(name = "Currentbalance")
    protected BigDecimal currentbalance;
    @XmlElement(name = "Expirationdate")
    protected String expirationdate;
    @XmlElement(name = "AssignedDate")
    protected String assignedDate;
    @XmlElement(name = "Balancecategory")
    protected String balancecategory;
    @XmlElement(name = "BundlecategoryId")
    protected String bundlecategoryId;
    @XmlElement(name = "BundlecategoryName")
    protected String bundlecategoryName;
    @XmlElement(name = "Bundlecharge")
    protected String bundlecharge;
    protected BigDecimal activationFee;

    /**
     * Gets the value of the bundleId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBundleId() {
        return bundleId;
    }

    /**
     * Sets the value of the bundleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBundleId(BigInteger value) {
        this.bundleId = value;
    }

    /**
     * Gets the value of the bundleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleName() {
        return bundleName;
    }

    /**
     * Sets the value of the bundleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleName(String value) {
        this.bundleName = value;
    }

    /**
     * Gets the value of the currentbalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentbalance() {
        return currentbalance;
    }

    /**
     * Sets the value of the currentbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentbalance(BigDecimal value) {
        this.currentbalance = value;
    }

    /**
     * Gets the value of the expirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationdate() {
        return expirationdate;
    }

    /**
     * Sets the value of the expirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationdate(String value) {
        this.expirationdate = value;
    }

    /**
     * Gets the value of the assignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedDate() {
        return assignedDate;
    }

    /**
     * Sets the value of the assignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedDate(String value) {
        this.assignedDate = value;
    }

    /**
     * Gets the value of the balancecategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalancecategory() {
        return balancecategory;
    }

    /**
     * Sets the value of the balancecategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalancecategory(String value) {
        this.balancecategory = value;
    }

    /**
     * Gets the value of the bundlecategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundlecategoryId() {
        return bundlecategoryId;
    }

    /**
     * Sets the value of the bundlecategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundlecategoryId(String value) {
        this.bundlecategoryId = value;
    }

    /**
     * Gets the value of the bundlecategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundlecategoryName() {
        return bundlecategoryName;
    }

    /**
     * Sets the value of the bundlecategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundlecategoryName(String value) {
        this.bundlecategoryName = value;
    }

    /**
     * Gets the value of the bundlecharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundlecharge() {
        return bundlecharge;
    }

    /**
     * Sets the value of the bundlecharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundlecharge(String value) {
        this.bundlecharge = value;
    }

    /**
     * Gets the value of the activationFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActivationFee() {
        return activationFee;
    }

    /**
     * Sets the value of the activationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActivationFee(BigDecimal value) {
        this.activationFee = value;
    }

}
