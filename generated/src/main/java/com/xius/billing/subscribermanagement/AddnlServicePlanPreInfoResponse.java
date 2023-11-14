
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddnlServicePlanPreInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddnlServicePlanPreInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="servicePlansList" type="{http://billing.xius.com/SubscriberManagement.xsd}ServicePlansListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddnlServicePlanPreInfoResponse", propOrder = {
    "servicePlansList"
})
public class AddnlServicePlanPreInfoResponse {

    protected ServicePlansListType servicePlansList;

    /**
     * Gets the value of the servicePlansList property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePlansListType }
     *     
     */
    public ServicePlansListType getServicePlansList() {
        return servicePlansList;
    }

    /**
     * Sets the value of the servicePlansList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePlansListType }
     *     
     */
    public void setServicePlansList(ServicePlansListType value) {
        this.servicePlansList = value;
    }

}
