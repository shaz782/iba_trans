
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTPDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTPDetailsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTPDetailsRequest", propOrder = {
    "tpID",
    "tpName"
})
public class GetTPDetailsRequest {

    protected String tpID;
    protected String tpName;

    /**
     * Gets the value of the tpID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpID() {
        return tpID;
    }

    /**
     * Sets the value of the tpID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpID(String value) {
        this.tpID = value;
    }

    /**
     * Gets the value of the tpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpName() {
        return tpName;
    }

    /**
     * Sets the value of the tpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpName(String value) {
        this.tpName = value;
    }

}
