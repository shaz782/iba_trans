
package com.xius.billing.subscribermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBannerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBannerResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="banner" type="{http://billing.xius.com/SubscriberManagement.xsd}BannerType" minOccurs="0"/&gt;
 *         &lt;element name="bannerList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBannerResponse", propOrder = {
    "banner",
    "bannerList"
})
public class GetBannerResponse {

    protected BannerType banner;
    protected List<String> bannerList;

    /**
     * Gets the value of the banner property.
     * 
     * @return
     *     possible object is
     *     {@link BannerType }
     *     
     */
    public BannerType getBanner() {
        return banner;
    }

    /**
     * Sets the value of the banner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BannerType }
     *     
     */
    public void setBanner(BannerType value) {
        this.banner = value;
    }

    /**
     * Gets the value of the bannerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bannerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBannerList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBannerList() {
        if (bannerList == null) {
            bannerList = new ArrayList<String>();
        }
        return this.bannerList;
    }

}
