
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDNo" type="{http://billing.xius.com/SubscriberManagement.xsd}IDNoType" minOccurs="0"/&gt;
 *         &lt;element name="IDType" type="{http://billing.xius.com/SubscriberManagement.xsd}IDType" minOccurs="0"/&gt;
 *         &lt;element name="MSISDNInfoList" type="{http://billing.xius.com/SubscriberManagement.xsd}MSISDNInfoListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDInfoType", propOrder = {
    "idNo",
    "idType",
    "msisdnInfoList"
})
public class IDInfoType {

    @XmlElement(name = "IDNo")
    protected String idNo;
    @XmlElement(name = "IDType")
    protected String idType;
    @XmlElement(name = "MSISDNInfoList", required = true)
    protected MSISDNInfoListType msisdnInfoList;

    /**
     * Gets the value of the idNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNo() {
        return idNo;
    }

    /**
     * Sets the value of the idNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNo(String value) {
        this.idNo = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the msisdnInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link MSISDNInfoListType }
     *     
     */
    public MSISDNInfoListType getMSISDNInfoList() {
        return msisdnInfoList;
    }

    /**
     * Sets the value of the msisdnInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSISDNInfoListType }
     *     
     */
    public void setMSISDNInfoList(MSISDNInfoListType value) {
        this.msisdnInfoList = value;
    }

}
