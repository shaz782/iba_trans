
package com.xius.billing.subscribermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRCPreInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRCPreInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffPackDtls" type="{http://billing.xius.com/SubscriberManagement.xsd}tariffPackDtlsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subsCategoryDtls" type="{http://billing.xius.com/SubscriberManagement.xsd}subsCategoryDtlsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rcCategoryDtls" type="{http://billing.xius.com/SubscriberManagement.xsd}rcCategoryDtlsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="balanceIdDtls" type="{http://billing.xius.com/SubscriberManagement.xsd}balanceIdDtlsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="atpDtls" type="{http://billing.xius.com/SubscriberManagement.xsd}atpDtlsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="channelDtls" type="{http://billing.xius.com/SubscriberManagement.xsd}channelDtlsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRCPreInfoResponse", propOrder = {
    "tariffPackDtls",
    "subsCategoryDtls",
    "rcCategoryDtls",
    "balanceIdDtls",
    "atpDtls",
    "channelDtls"
})
public class GetRCPreInfoResponse {

    protected List<TariffPackDtlsType> tariffPackDtls;
    protected List<SubsCategoryDtlsType> subsCategoryDtls;
    protected List<RcCategoryDtlsType> rcCategoryDtls;
    protected List<BalanceIdDtlsType> balanceIdDtls;
    protected List<AtpDtlsType> atpDtls;
    protected List<ChannelDtlsType> channelDtls;

    /**
     * Gets the value of the tariffPackDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffPackDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffPackDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffPackDtlsType }
     * 
     * 
     */
    public List<TariffPackDtlsType> getTariffPackDtls() {
        if (tariffPackDtls == null) {
            tariffPackDtls = new ArrayList<TariffPackDtlsType>();
        }
        return this.tariffPackDtls;
    }

    /**
     * Gets the value of the subsCategoryDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsCategoryDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsCategoryDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubsCategoryDtlsType }
     * 
     * 
     */
    public List<SubsCategoryDtlsType> getSubsCategoryDtls() {
        if (subsCategoryDtls == null) {
            subsCategoryDtls = new ArrayList<SubsCategoryDtlsType>();
        }
        return this.subsCategoryDtls;
    }

    /**
     * Gets the value of the rcCategoryDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcCategoryDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcCategoryDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RcCategoryDtlsType }
     * 
     * 
     */
    public List<RcCategoryDtlsType> getRcCategoryDtls() {
        if (rcCategoryDtls == null) {
            rcCategoryDtls = new ArrayList<RcCategoryDtlsType>();
        }
        return this.rcCategoryDtls;
    }

    /**
     * Gets the value of the balanceIdDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceIdDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceIdDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceIdDtlsType }
     * 
     * 
     */
    public List<BalanceIdDtlsType> getBalanceIdDtls() {
        if (balanceIdDtls == null) {
            balanceIdDtls = new ArrayList<BalanceIdDtlsType>();
        }
        return this.balanceIdDtls;
    }

    /**
     * Gets the value of the atpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtpDtlsType }
     * 
     * 
     */
    public List<AtpDtlsType> getAtpDtls() {
        if (atpDtls == null) {
            atpDtls = new ArrayList<AtpDtlsType>();
        }
        return this.atpDtls;
    }

    /**
     * Gets the value of the channelDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannelDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelDtlsType }
     * 
     * 
     */
    public List<ChannelDtlsType> getChannelDtls() {
        if (channelDtls == null) {
            channelDtls = new ArrayList<ChannelDtlsType>();
        }
        return this.channelDtls;
    }

}
