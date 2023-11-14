
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDataPlansResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDataPlansResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="volumePlans" type="{http://billing.xius.com/SubscriberManagement.xsd}DataPlanType" minOccurs="0"/&gt;
 *         &lt;element name="payAsGoPlans" type="{http://billing.xius.com/SubscriberManagement.xsd}DataPlanType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDataPlansResponse", propOrder = {
    "volumePlans",
    "payAsGoPlans"
})
public class GetDataPlansResponse {

    protected DataPlanType volumePlans;
    protected DataPlanType payAsGoPlans;

    /**
     * Gets the value of the volumePlans property.
     * 
     * @return
     *     possible object is
     *     {@link DataPlanType }
     *     
     */
    public DataPlanType getVolumePlans() {
        return volumePlans;
    }

    /**
     * Sets the value of the volumePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPlanType }
     *     
     */
    public void setVolumePlans(DataPlanType value) {
        this.volumePlans = value;
    }

    /**
     * Gets the value of the payAsGoPlans property.
     * 
     * @return
     *     possible object is
     *     {@link DataPlanType }
     *     
     */
    public DataPlanType getPayAsGoPlans() {
        return payAsGoPlans;
    }

    /**
     * Sets the value of the payAsGoPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPlanType }
     *     
     */
    public void setPayAsGoPlans(DataPlanType value) {
        this.payAsGoPlans = value;
    }

}
