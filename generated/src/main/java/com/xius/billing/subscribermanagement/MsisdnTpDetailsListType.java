
package com.xius.billing.subscribermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for msisdnTpDetailsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="msisdnTpDetailsListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="msisdnTpDetailsList" type="{http://billing.xius.com/SubscriberManagement.xsd}msisdnTpDetailsInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msisdnTpDetailsListType", propOrder = {
    "msisdnTpDetailsList"
})
public class MsisdnTpDetailsListType {

    @XmlElement(required = true)
    protected List<MsisdnTpDetailsInfoType> msisdnTpDetailsList;

    /**
     * Gets the value of the msisdnTpDetailsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msisdnTpDetailsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsisdnTpDetailsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MsisdnTpDetailsInfoType }
     * 
     * 
     */
    public List<MsisdnTpDetailsInfoType> getMsisdnTpDetailsList() {
        if (msisdnTpDetailsList == null) {
            msisdnTpDetailsList = new ArrayList<MsisdnTpDetailsInfoType>();
        }
        return this.msisdnTpDetailsList;
    }

}
