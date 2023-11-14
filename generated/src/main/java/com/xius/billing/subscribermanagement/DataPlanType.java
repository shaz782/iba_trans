
package com.xius.billing.subscribermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataPlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assignedPlan" type="{http://billing.xius.com/SubscriberManagement.xsd}DataPlanInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="availablePlan" type="{http://billing.xius.com/SubscriberManagement.xsd}DataPlanInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataPlanType", propOrder = {
    "assignedPlan",
    "availablePlan"
})
public class DataPlanType {

    protected List<DataPlanInfoType> assignedPlan;
    protected List<DataPlanInfoType> availablePlan;

    /**
     * Gets the value of the assignedPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataPlanInfoType }
     * 
     * 
     */
    public List<DataPlanInfoType> getAssignedPlan() {
        if (assignedPlan == null) {
            assignedPlan = new ArrayList<DataPlanInfoType>();
        }
        return this.assignedPlan;
    }

    /**
     * Gets the value of the availablePlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availablePlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailablePlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataPlanInfoType }
     * 
     * 
     */
    public List<DataPlanInfoType> getAvailablePlan() {
        if (availablePlan == null) {
            availablePlan = new ArrayList<DataPlanInfoType>();
        }
        return this.availablePlan;
    }

}
