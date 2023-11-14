
package com.xius.billing.subscribermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNPANXXForExResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNPANXXForExResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message" type="{http://billing.xius.com/SubscriberManagement.xsd}MessageType" minOccurs="0"/&gt;
 *         &lt;element name="NPANXXList" type="{http://billing.xius.com/SubscriberManagement.xsd}NPANXXListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNPANXXForExResponse", propOrder = {
    "message",
    "npanxxList"
})
public class GetNPANXXForExResponse {

    protected String message;
    @XmlElement(name = "NPANXXList")
    protected List<NPANXXListType> npanxxList;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the npanxxList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the npanxxList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNPANXXList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NPANXXListType }
     * 
     * 
     */
    public List<NPANXXListType> getNPANXXList() {
        if (npanxxList == null) {
            npanxxList = new ArrayList<NPANXXListType>();
        }
        return this.npanxxList;
    }

}
