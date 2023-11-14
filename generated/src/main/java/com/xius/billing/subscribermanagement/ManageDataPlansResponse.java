
package com.xius.billing.subscribermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageDataPlansResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageDataPlansResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subSuccessActsData" type="{http://billing.xius.com/SubscriberManagement.xsd}PlanDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subFailureActsData" type="{http://billing.xius.com/SubscriberManagement.xsd}PlanDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unSubSuccessActsData" type="{http://billing.xius.com/SubscriberManagement.xsd}PlanDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unSubFailureActsData" type="{http://billing.xius.com/SubscriberManagement.xsd}PlanDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageDataPlansResponse", propOrder = {
    "message",
    "subSuccessActsData",
    "subFailureActsData",
    "unSubSuccessActsData",
    "unSubFailureActsData"
})
public class ManageDataPlansResponse {

    protected String message;
    protected List<PlanDataType> subSuccessActsData;
    protected List<PlanDataType> subFailureActsData;
    protected List<PlanDataType> unSubSuccessActsData;
    protected List<PlanDataType> unSubFailureActsData;

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
     * Gets the value of the subSuccessActsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSuccessActsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSuccessActsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanDataType }
     * 
     * 
     */
    public List<PlanDataType> getSubSuccessActsData() {
        if (subSuccessActsData == null) {
            subSuccessActsData = new ArrayList<PlanDataType>();
        }
        return this.subSuccessActsData;
    }

    /**
     * Gets the value of the subFailureActsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subFailureActsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubFailureActsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanDataType }
     * 
     * 
     */
    public List<PlanDataType> getSubFailureActsData() {
        if (subFailureActsData == null) {
            subFailureActsData = new ArrayList<PlanDataType>();
        }
        return this.subFailureActsData;
    }

    /**
     * Gets the value of the unSubSuccessActsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unSubSuccessActsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnSubSuccessActsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanDataType }
     * 
     * 
     */
    public List<PlanDataType> getUnSubSuccessActsData() {
        if (unSubSuccessActsData == null) {
            unSubSuccessActsData = new ArrayList<PlanDataType>();
        }
        return this.unSubSuccessActsData;
    }

    /**
     * Gets the value of the unSubFailureActsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unSubFailureActsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnSubFailureActsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanDataType }
     * 
     * 
     */
    public List<PlanDataType> getUnSubFailureActsData() {
        if (unSubFailureActsData == null) {
            unSubFailureActsData = new ArrayList<PlanDataType>();
        }
        return this.unSubFailureActsData;
    }

}
