
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VoiceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VoiceCalls" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VoiceSeconds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SMSAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataKbyte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MMSAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GlobalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceCategoryType", propOrder = {
    "voiceAmount",
    "voiceCalls",
    "voiceSeconds",
    "smsAmount",
    "sms",
    "dataAmount",
    "dataKbyte",
    "mmsAmount",
    "mms",
    "globalAmount"
})
public class BalanceCategoryType {

    @XmlElement(name = "VoiceAmount")
    protected String voiceAmount;
    @XmlElement(name = "VoiceCalls")
    protected String voiceCalls;
    @XmlElement(name = "VoiceSeconds")
    protected String voiceSeconds;
    @XmlElement(name = "SMSAmount")
    protected String smsAmount;
    @XmlElement(name = "SMS")
    protected String sms;
    @XmlElement(name = "DataAmount")
    protected String dataAmount;
    @XmlElement(name = "DataKbyte")
    protected String dataKbyte;
    @XmlElement(name = "MMSAmount")
    protected String mmsAmount;
    @XmlElement(name = "MMS")
    protected String mms;
    @XmlElement(name = "GlobalAmount")
    protected String globalAmount;

    /**
     * Gets the value of the voiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceAmount() {
        return voiceAmount;
    }

    /**
     * Sets the value of the voiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceAmount(String value) {
        this.voiceAmount = value;
    }

    /**
     * Gets the value of the voiceCalls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceCalls() {
        return voiceCalls;
    }

    /**
     * Sets the value of the voiceCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceCalls(String value) {
        this.voiceCalls = value;
    }

    /**
     * Gets the value of the voiceSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceSeconds() {
        return voiceSeconds;
    }

    /**
     * Sets the value of the voiceSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceSeconds(String value) {
        this.voiceSeconds = value;
    }

    /**
     * Gets the value of the smsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSAmount() {
        return smsAmount;
    }

    /**
     * Sets the value of the smsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSAmount(String value) {
        this.smsAmount = value;
    }

    /**
     * Gets the value of the sms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMS() {
        return sms;
    }

    /**
     * Sets the value of the sms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMS(String value) {
        this.sms = value;
    }

    /**
     * Gets the value of the dataAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAmount() {
        return dataAmount;
    }

    /**
     * Sets the value of the dataAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAmount(String value) {
        this.dataAmount = value;
    }

    /**
     * Gets the value of the dataKbyte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataKbyte() {
        return dataKbyte;
    }

    /**
     * Sets the value of the dataKbyte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataKbyte(String value) {
        this.dataKbyte = value;
    }

    /**
     * Gets the value of the mmsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMSAmount() {
        return mmsAmount;
    }

    /**
     * Sets the value of the mmsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMSAmount(String value) {
        this.mmsAmount = value;
    }

    /**
     * Gets the value of the mms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMMS() {
        return mms;
    }

    /**
     * Sets the value of the mms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMMS(String value) {
        this.mms = value;
    }

    /**
     * Gets the value of the globalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalAmount() {
        return globalAmount;
    }

    /**
     * Sets the value of the globalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalAmount(String value) {
        this.globalAmount = value;
    }

}
