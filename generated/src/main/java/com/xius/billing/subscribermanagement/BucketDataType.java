
package com.xius.billing.subscribermanagement;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BucketDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BucketDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BucketId" type="{http://billing.xius.com/SubscriberManagement.xsd}BucketIdType" minOccurs="0"/&gt;
 *         &lt;element name="BucketName" type="{http://billing.xius.com/SubscriberManagement.xsd}BucketNameType" minOccurs="0"/&gt;
 *         &lt;element name="Buckettype" type="{http://billing.xius.com/SubscriberManagement.xsd}BucketType" minOccurs="0"/&gt;
 *         &lt;element name="Currentbalance" type="{http://billing.xius.com/SubscriberManagement.xsd}BalanceType" minOccurs="0"/&gt;
 *         &lt;element name="Expirationdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AssignedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Balancecategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="bundleId" type="{http://billing.xius.com/SubscriberManagement.xsd}bundleIdType" minOccurs="0"/&gt;
 *         &lt;element name="validityDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iterativeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iterativeCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rollOverFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extendValidityFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bundleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deviceGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="deviceGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataZoneGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dataZoneGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unlimitedYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accumulatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ispromo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remaining_iterative_count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="units_credited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="units_consumed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BucketDataType", propOrder = {
    "bucketId",
    "bucketName",
    "buckettype",
    "currentbalance",
    "expirationdate",
    "assignedDate",
    "balancecategory",
    "duration",
    "bundleId",
    "validityDays",
    "iterativeFlag",
    "iterativeCount",
    "rollOverFlag",
    "extendValidityFlag",
    "bundleName",
    "priority",
    "deviceGroupId",
    "deviceGroupName",
    "dataZoneGroupId",
    "dataZoneGroupName",
    "unlimitedYN",
    "accumulatorName",
    "ispromo",
    "remainingIterativeCount",
    "unitsCredited",
    "unitsConsumed"
})
public class BucketDataType {

    @XmlElement(name = "BucketId")
    protected String bucketId;
    @XmlElement(name = "BucketName")
    protected String bucketName;
    @XmlElement(name = "Buckettype")
    protected String buckettype;
    @XmlElement(name = "Currentbalance")
    protected BigDecimal currentbalance;
    @XmlElement(name = "Expirationdate")
    protected String expirationdate;
    @XmlElement(name = "AssignedDate")
    protected String assignedDate;
    @XmlElement(name = "Balancecategory")
    protected String balancecategory;
    protected Long duration;
    protected BigInteger bundleId;
    protected String validityDays;
    protected String iterativeFlag;
    protected String iterativeCount;
    protected String rollOverFlag;
    protected String extendValidityFlag;
    protected String bundleName;
    protected String priority;
    protected Long deviceGroupId;
    protected String deviceGroupName;
    protected Long dataZoneGroupId;
    protected String dataZoneGroupName;
    protected String unlimitedYN;
    protected String accumulatorName;
    @XmlElement(name = "Ispromo")
    protected String ispromo;
    @XmlElement(name = "remaining_iterative_count")
    protected String remainingIterativeCount;
    @XmlElement(name = "units_credited")
    protected String unitsCredited;
    @XmlElement(name = "units_consumed")
    protected String unitsConsumed;

    /**
     * Gets the value of the bucketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBucketId() {
        return bucketId;
    }

    /**
     * Sets the value of the bucketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBucketId(String value) {
        this.bucketId = value;
    }

    /**
     * Gets the value of the bucketName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the value of the bucketName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBucketName(String value) {
        this.bucketName = value;
    }

    /**
     * Gets the value of the buckettype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuckettype() {
        return buckettype;
    }

    /**
     * Sets the value of the buckettype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuckettype(String value) {
        this.buckettype = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDuration(Long value) {
        this.duration = value;
    }

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
     * Gets the value of the validityDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityDays() {
        return validityDays;
    }

    /**
     * Sets the value of the validityDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityDays(String value) {
        this.validityDays = value;
    }

    /**
     * Gets the value of the iterativeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterativeFlag() {
        return iterativeFlag;
    }

    /**
     * Sets the value of the iterativeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterativeFlag(String value) {
        this.iterativeFlag = value;
    }

    /**
     * Gets the value of the iterativeCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterativeCount() {
        return iterativeCount;
    }

    /**
     * Sets the value of the iterativeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterativeCount(String value) {
        this.iterativeCount = value;
    }

    /**
     * Gets the value of the rollOverFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollOverFlag() {
        return rollOverFlag;
    }

    /**
     * Sets the value of the rollOverFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollOverFlag(String value) {
        this.rollOverFlag = value;
    }

    /**
     * Gets the value of the extendValidityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendValidityFlag() {
        return extendValidityFlag;
    }

    /**
     * Sets the value of the extendValidityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendValidityFlag(String value) {
        this.extendValidityFlag = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the deviceGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviceGroupId() {
        return deviceGroupId;
    }

    /**
     * Sets the value of the deviceGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviceGroupId(Long value) {
        this.deviceGroupId = value;
    }

    /**
     * Gets the value of the deviceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceGroupName() {
        return deviceGroupName;
    }

    /**
     * Sets the value of the deviceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceGroupName(String value) {
        this.deviceGroupName = value;
    }

    /**
     * Gets the value of the dataZoneGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDataZoneGroupId() {
        return dataZoneGroupId;
    }

    /**
     * Sets the value of the dataZoneGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDataZoneGroupId(Long value) {
        this.dataZoneGroupId = value;
    }

    /**
     * Gets the value of the dataZoneGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataZoneGroupName() {
        return dataZoneGroupName;
    }

    /**
     * Sets the value of the dataZoneGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataZoneGroupName(String value) {
        this.dataZoneGroupName = value;
    }

    /**
     * Gets the value of the unlimitedYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnlimitedYN() {
        return unlimitedYN;
    }

    /**
     * Sets the value of the unlimitedYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnlimitedYN(String value) {
        this.unlimitedYN = value;
    }

    /**
     * Gets the value of the accumulatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulatorName() {
        return accumulatorName;
    }

    /**
     * Sets the value of the accumulatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulatorName(String value) {
        this.accumulatorName = value;
    }

    /**
     * Gets the value of the ispromo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIspromo() {
        return ispromo;
    }

    /**
     * Sets the value of the ispromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIspromo(String value) {
        this.ispromo = value;
    }

    /**
     * Gets the value of the remainingIterativeCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainingIterativeCount() {
        return remainingIterativeCount;
    }

    /**
     * Sets the value of the remainingIterativeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainingIterativeCount(String value) {
        this.remainingIterativeCount = value;
    }

    /**
     * Gets the value of the unitsCredited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitsCredited() {
        return unitsCredited;
    }

    /**
     * Sets the value of the unitsCredited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitsCredited(String value) {
        this.unitsCredited = value;
    }

    /**
     * Gets the value of the unitsConsumed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitsConsumed() {
        return unitsConsumed;
    }

    /**
     * Sets the value of the unitsConsumed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitsConsumed(String value) {
        this.unitsConsumed = value;
    }

}
