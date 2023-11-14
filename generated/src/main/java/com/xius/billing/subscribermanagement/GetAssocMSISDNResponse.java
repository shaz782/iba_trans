
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAssocMSISDNResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAssocMSISDNResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDInfoList" type="{http://billing.xius.com/SubscriberManagement.xsd}IDInfoListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAssocMSISDNResponse", propOrder = {
    "idInfoList"
})
public class GetAssocMSISDNResponse {

    @XmlElement(name = "IDInfoList")
    protected IDInfoListType idInfoList;

    /**
     * Gets the value of the idInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link IDInfoListType }
     *     
     */
    public IDInfoListType getIDInfoList() {
        return idInfoList;
    }

    /**
     * Sets the value of the idInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDInfoListType }
     *     
     */
    public void setIDInfoList(IDInfoListType value) {
        this.idInfoList = value;
    }

}
