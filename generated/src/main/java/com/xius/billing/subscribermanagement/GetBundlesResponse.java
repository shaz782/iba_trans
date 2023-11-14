
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBundlesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBundlesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvlblBundlesList" type="{http://billing.xius.com/SubscriberManagement.xsd}BundleListType" minOccurs="0"/&gt;
 *         &lt;element name="AsgndBundlesList" type="{http://billing.xius.com/SubscriberManagement.xsd}BundleListType" minOccurs="0"/&gt;
 *         &lt;element name="ImmedAvlblBundlesList" type="{http://billing.xius.com/SubscriberManagement.xsd}BundleListType" minOccurs="0"/&gt;
 *         &lt;element name="ImmedAsgndBundlesList" type="{http://billing.xius.com/SubscriberManagement.xsd}BundleListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBundlesResponse", propOrder = {
    "avlblBundlesList",
    "asgndBundlesList",
    "immedAvlblBundlesList",
    "immedAsgndBundlesList"
})
public class GetBundlesResponse {

    @XmlElement(name = "AvlblBundlesList")
    protected BundleListType avlblBundlesList;
    @XmlElement(name = "AsgndBundlesList")
    protected BundleListType asgndBundlesList;
    @XmlElement(name = "ImmedAvlblBundlesList")
    protected BundleListType immedAvlblBundlesList;
    @XmlElement(name = "ImmedAsgndBundlesList")
    protected BundleListType immedAsgndBundlesList;

    /**
     * Gets the value of the avlblBundlesList property.
     * 
     * @return
     *     possible object is
     *     {@link BundleListType }
     *     
     */
    public BundleListType getAvlblBundlesList() {
        return avlblBundlesList;
    }

    /**
     * Sets the value of the avlblBundlesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleListType }
     *     
     */
    public void setAvlblBundlesList(BundleListType value) {
        this.avlblBundlesList = value;
    }

    /**
     * Gets the value of the asgndBundlesList property.
     * 
     * @return
     *     possible object is
     *     {@link BundleListType }
     *     
     */
    public BundleListType getAsgndBundlesList() {
        return asgndBundlesList;
    }

    /**
     * Sets the value of the asgndBundlesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleListType }
     *     
     */
    public void setAsgndBundlesList(BundleListType value) {
        this.asgndBundlesList = value;
    }

    /**
     * Gets the value of the immedAvlblBundlesList property.
     * 
     * @return
     *     possible object is
     *     {@link BundleListType }
     *     
     */
    public BundleListType getImmedAvlblBundlesList() {
        return immedAvlblBundlesList;
    }

    /**
     * Sets the value of the immedAvlblBundlesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleListType }
     *     
     */
    public void setImmedAvlblBundlesList(BundleListType value) {
        this.immedAvlblBundlesList = value;
    }

    /**
     * Gets the value of the immedAsgndBundlesList property.
     * 
     * @return
     *     possible object is
     *     {@link BundleListType }
     *     
     */
    public BundleListType getImmedAsgndBundlesList() {
        return immedAsgndBundlesList;
    }

    /**
     * Sets the value of the immedAsgndBundlesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleListType }
     *     
     */
    public void setImmedAsgndBundlesList(BundleListType value) {
        this.immedAsgndBundlesList = value;
    }

}
