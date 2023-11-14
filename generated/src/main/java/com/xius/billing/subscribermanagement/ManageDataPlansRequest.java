
package com.xius.billing.subscribermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageDataPlansRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageDataPlansRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="msisdnsData" type="{http://billing.xius.com/SubscriberManagement.xsd}MSISDNDataType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="simsData" type="{http://billing.xius.com/SubscriberManagement.xsd}SIMDataType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="imsisData" type="{http://billing.xius.com/SubscriberManagement.xsd}IMSIDataType" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageDataPlansRequest", propOrder = {
    "msisdnsData",
    "simsData",
    "imsisData"
})
public class ManageDataPlansRequest {

    protected List<MSISDNDataType> msisdnsData;
    protected List<SIMDataType> simsData;
    protected List<IMSIDataType> imsisData;

    /**
     * Gets the value of the msisdnsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msisdnsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsisdnsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MSISDNDataType }
     * 
     * 
     */
    public List<MSISDNDataType> getMsisdnsData() {
        if (msisdnsData == null) {
            msisdnsData = new ArrayList<MSISDNDataType>();
        }
        return this.msisdnsData;
    }

    /**
     * Gets the value of the simsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SIMDataType }
     * 
     * 
     */
    public List<SIMDataType> getSimsData() {
        if (simsData == null) {
            simsData = new ArrayList<SIMDataType>();
        }
        return this.simsData;
    }

    /**
     * Gets the value of the imsisData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imsisData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImsisData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IMSIDataType }
     * 
     * 
     */
    public List<IMSIDataType> getImsisData() {
        if (imsisData == null) {
            imsisData = new ArrayList<IMSIDataType>();
        }
        return this.imsisData;
    }

}
