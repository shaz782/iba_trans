
package com.xius.billing.subscribermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IMSIDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMSIDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imsi" type="{http://billing.xius.com/SubscriberManagement.xsd}IMSIType"/&gt;
 *         &lt;element name="plansList" type="{http://billing.xius.com/SubscriberManagement.xsd}DataPlanTinyInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMSIDataType", propOrder = {
    "imsi",
    "plansList"
})
public class IMSIDataType {

    @XmlElement(required = true)
    protected String imsi;
    @XmlElement(required = true)
    protected List<DataPlanTinyInfoType> plansList;

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the plansList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plansList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlansList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataPlanTinyInfoType }
     * 
     * 
     */
    public List<DataPlanTinyInfoType> getPlansList() {
        if (plansList == null) {
            plansList = new ArrayList<DataPlanTinyInfoType>();
        }
        return this.plansList;
    }

}
