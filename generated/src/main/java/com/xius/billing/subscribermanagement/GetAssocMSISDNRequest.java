
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAssocMSISDNRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAssocMSISDNRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDInformationList" type="{http://billing.xius.com/SubscriberManagement.xsd}IDInformationListType"/&gt;
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAssocMSISDNRequest", propOrder = {
    "idInformationList",
    "userType"
})
public class GetAssocMSISDNRequest {

    @XmlElement(name = "IDInformationList", required = true)
    protected IDInformationListType idInformationList;
    protected String userType;

    /**
     * Gets the value of the idInformationList property.
     * 
     * @return
     *     possible object is
     *     {@link IDInformationListType }
     *     
     */
    public IDInformationListType getIDInformationList() {
        return idInformationList;
    }

    /**
     * Sets the value of the idInformationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDInformationListType }
     *     
     */
    public void setIDInformationList(IDInformationListType value) {
        this.idInformationList = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

}
