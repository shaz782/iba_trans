
package com.xius.billing.subscribermanagement;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubOptServicesPreInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubOptServicesPreInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="accountID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *           &lt;element name="tariffPlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="SubOptServicesPreInfoSuccessService" type="{http://billing.xius.com/SubscriberManagement.xsd}SubscribeServiceSuccessType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubOptServicesPreInfoResponse", propOrder = {
    "accountID",
    "tariffPlanName",
    "subOptServicesPreInfoSuccessService"
})
public class SubOptServicesPreInfoResponse {

    protected BigInteger accountID;
    protected String tariffPlanName;
    @XmlElement(name = "SubOptServicesPreInfoSuccessService")
    protected List<SubscribeServiceSuccessType> subOptServicesPreInfoSuccessService;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountID(BigInteger value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the tariffPlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffPlanName() {
        return tariffPlanName;
    }

    /**
     * Sets the value of the tariffPlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffPlanName(String value) {
        this.tariffPlanName = value;
    }

    /**
     * Gets the value of the subOptServicesPreInfoSuccessService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subOptServicesPreInfoSuccessService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubOptServicesPreInfoSuccessService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscribeServiceSuccessType }
     * 
     * 
     */
    public List<SubscribeServiceSuccessType> getSubOptServicesPreInfoSuccessService() {
        if (subOptServicesPreInfoSuccessService == null) {
            subOptServicesPreInfoSuccessService = new ArrayList<SubscribeServiceSuccessType>();
        }
        return this.subOptServicesPreInfoSuccessService;
    }

}
