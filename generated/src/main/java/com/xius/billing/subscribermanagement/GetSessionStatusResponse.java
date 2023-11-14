
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSessionStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSessionStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataSessionStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="voiceSessionStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSessionStatusResponse", propOrder = {
    "dataSessionStatus",
    "voiceSessionStatus"
})
public class GetSessionStatusResponse {

    protected Integer dataSessionStatus;
    protected Integer voiceSessionStatus;

    /**
     * Gets the value of the dataSessionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataSessionStatus() {
        return dataSessionStatus;
    }

    /**
     * Sets the value of the dataSessionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataSessionStatus(Integer value) {
        this.dataSessionStatus = value;
    }

    /**
     * Gets the value of the voiceSessionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVoiceSessionStatus() {
        return voiceSessionStatus;
    }

    /**
     * Sets the value of the voiceSessionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVoiceSessionStatus(Integer value) {
        this.voiceSessionStatus = value;
    }

}
