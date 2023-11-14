
package com.xius.billing.subscribermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberServicesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberServicesList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subsServicesList" type="{http://billing.xius.com/SubscriberManagement.xsd}SubscriberServicesItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberServicesList", propOrder = {
    "subsServicesList"
})
public class SubscriberServicesList {

    protected List<SubscriberServicesItem> subsServicesList;

    /**
     * Gets the value of the subsServicesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsServicesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsServicesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberServicesItem }
     * 
     * 
     */
    public List<SubscriberServicesItem> getSubsServicesList() {
        if (subsServicesList == null) {
            subsServicesList = new ArrayList<SubscriberServicesItem>();
        }
        return this.subsServicesList;
    }

}
