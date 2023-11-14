
package com.xius.billing.subscribermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tariffPackageDetailsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tariffPackageDetailsListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffPackageDetails" type="{http://billing.xius.com/SubscriberManagement.xsd}tariffPackageDetailsInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tariffPackageDetailsListType", propOrder = {
    "tariffPackageDetails"
})
public class TariffPackageDetailsListType {

    @XmlElement(required = true)
    protected List<TariffPackageDetailsInfoType> tariffPackageDetails;

    /**
     * Gets the value of the tariffPackageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffPackageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffPackageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffPackageDetailsInfoType }
     * 
     * 
     */
    public List<TariffPackageDetailsInfoType> getTariffPackageDetails() {
        if (tariffPackageDetails == null) {
            tariffPackageDetails = new ArrayList<TariffPackageDetailsInfoType>();
        }
        return this.tariffPackageDetails;
    }

}
