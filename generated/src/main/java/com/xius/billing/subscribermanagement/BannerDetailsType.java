
package com.xius.billing.subscribermanagement;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BannerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BannerDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://billing.xius.com/SubscriberManagement.xsd}IdType" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://billing.xius.com/SubscriberManagement.xsd}Type" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://billing.xius.com/SubscriberManagement.xsd}TitleType" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://billing.xius.com/SubscriberManagement.xsd}DateType" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://billing.xius.com/SubscriberManagement.xsd}DateType" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://billing.xius.com/SubscriberManagement.xsd}StatusType" minOccurs="0"/&gt;
 *         &lt;element name="createdOn" type="{http://billing.xius.com/SubscriberManagement.xsd}DateType" minOccurs="0"/&gt;
 *         &lt;element name="updatedOn" type="{http://billing.xius.com/SubscriberManagement.xsd}DateType" minOccurs="0"/&gt;
 *         &lt;element name="updatedBy" type="{http://billing.xius.com/SubscriberManagement.xsd}UpdatedByType" minOccurs="0"/&gt;
 *         &lt;element name="approvedBy" type="{http://billing.xius.com/SubscriberManagement.xsd}ApprovedBy30Type" minOccurs="0"/&gt;
 *         &lt;element name="size" type="{http://billing.xius.com/SubscriberManagement.xsd}SizeType" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://billing.xius.com/SubscriberManagement.xsd}ContentType" minOccurs="0"/&gt;
 *         &lt;element name="robjname" type="{http://billing.xius.com/SubscriberManagement.xsd}RobjnameType" minOccurs="0"/&gt;
 *         &lt;element name="oojbjname" type="{http://billing.xius.com/SubscriberManagement.xsd}OojbjnameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BannerDetailsType", propOrder = {
    "id",
    "type",
    "title",
    "startDate",
    "endDate",
    "status",
    "createdOn",
    "updatedOn",
    "updatedBy",
    "approvedBy",
    "size",
    "content",
    "robjname",
    "oojbjname"
})
public class BannerDetailsType {

    @XmlElement(name = "Id")
    protected BigInteger id;
    protected String type;
    protected String title;
    protected String startDate;
    protected String endDate;
    protected String status;
    protected String createdOn;
    protected String updatedOn;
    protected String updatedBy;
    protected String approvedBy;
    protected String size;
    protected String content;
    protected String robjname;
    protected String oojbjname;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedOn(String value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the updatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Sets the value of the updatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedOn(String value) {
        this.updatedOn = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the approvedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedBy() {
        return approvedBy;
    }

    /**
     * Sets the value of the approvedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedBy(String value) {
        this.approvedBy = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the robjname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRobjname() {
        return robjname;
    }

    /**
     * Sets the value of the robjname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRobjname(String value) {
        this.robjname = value;
    }

    /**
     * Gets the value of the oojbjname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOojbjname() {
        return oojbjname;
    }

    /**
     * Sets the value of the oojbjname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOojbjname(String value) {
        this.oojbjname = value;
    }

}
