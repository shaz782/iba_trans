
package com.xius.billing.subscribermanagement;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prepaidAccountBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="bucketAccountBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="airTimeMinutes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="smsMessages" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="mmsMessages" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postPaidBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="airTimeUnlimitedYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smsUnlimitedYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mmsUnlimitedYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataUnlimitedYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceDetailsType", propOrder = {
    "prepaidAccountBalance",
    "bucketAccountBalance",
    "airTimeMinutes",
    "smsMessages",
    "mmsMessages",
    "data",
    "calls",
    "postPaidBalance",
    "airTimeUnlimitedYN",
    "smsUnlimitedYN",
    "mmsUnlimitedYN",
    "dataUnlimitedYN"
})
public class BalanceDetailsType {

    protected Double prepaidAccountBalance;
    protected BigDecimal bucketAccountBalance;
    protected BigInteger airTimeMinutes;
    protected BigInteger smsMessages;
    protected BigInteger mmsMessages;
    protected String data;
    protected String calls;
    protected BigDecimal postPaidBalance;
    protected String airTimeUnlimitedYN;
    protected String smsUnlimitedYN;
    protected String mmsUnlimitedYN;
    protected String dataUnlimitedYN;

    /**
     * Gets the value of the prepaidAccountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrepaidAccountBalance() {
        return prepaidAccountBalance;
    }

    /**
     * Sets the value of the prepaidAccountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrepaidAccountBalance(Double value) {
        this.prepaidAccountBalance = value;
    }

    /**
     * Gets the value of the bucketAccountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBucketAccountBalance() {
        return bucketAccountBalance;
    }

    /**
     * Sets the value of the bucketAccountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBucketAccountBalance(BigDecimal value) {
        this.bucketAccountBalance = value;
    }

    /**
     * Gets the value of the airTimeMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAirTimeMinutes() {
        return airTimeMinutes;
    }

    /**
     * Sets the value of the airTimeMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAirTimeMinutes(BigInteger value) {
        this.airTimeMinutes = value;
    }

    /**
     * Gets the value of the smsMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSmsMessages() {
        return smsMessages;
    }

    /**
     * Sets the value of the smsMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSmsMessages(BigInteger value) {
        this.smsMessages = value;
    }

    /**
     * Gets the value of the mmsMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMmsMessages() {
        return mmsMessages;
    }

    /**
     * Sets the value of the mmsMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMmsMessages(BigInteger value) {
        this.mmsMessages = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the calls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalls() {
        return calls;
    }

    /**
     * Sets the value of the calls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalls(String value) {
        this.calls = value;
    }

    /**
     * Gets the value of the postPaidBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostPaidBalance() {
        return postPaidBalance;
    }

    /**
     * Sets the value of the postPaidBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostPaidBalance(BigDecimal value) {
        this.postPaidBalance = value;
    }

    /**
     * Gets the value of the airTimeUnlimitedYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirTimeUnlimitedYN() {
        return airTimeUnlimitedYN;
    }

    /**
     * Sets the value of the airTimeUnlimitedYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirTimeUnlimitedYN(String value) {
        this.airTimeUnlimitedYN = value;
    }

    /**
     * Gets the value of the smsUnlimitedYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsUnlimitedYN() {
        return smsUnlimitedYN;
    }

    /**
     * Sets the value of the smsUnlimitedYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsUnlimitedYN(String value) {
        this.smsUnlimitedYN = value;
    }

    /**
     * Gets the value of the mmsUnlimitedYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmsUnlimitedYN() {
        return mmsUnlimitedYN;
    }

    /**
     * Sets the value of the mmsUnlimitedYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmsUnlimitedYN(String value) {
        this.mmsUnlimitedYN = value;
    }

    /**
     * Gets the value of the dataUnlimitedYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUnlimitedYN() {
        return dataUnlimitedYN;
    }

    /**
     * Sets the value of the dataUnlimitedYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUnlimitedYN(String value) {
        this.dataUnlimitedYN = value;
    }

}
