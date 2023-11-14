
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageNoteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageNoteRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flag" type="{http://billing.xius.com/SubscriberManagement.xsd}ActionFlagType"/&gt;
 *         &lt;element name="account" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountType"/&gt;
 *         &lt;element name="note" type="{http://billing.xius.com/SubscriberManagement.xsd}NotesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageNoteRequest", propOrder = {
    "flag",
    "account",
    "note"
})
public class ManageNoteRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ActionFlagType flag;
    @XmlElement(required = true)
    protected AccountType account;
    @XmlElement(required = true)
    protected NotesType note;

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link ActionFlagType }
     *     
     */
    public ActionFlagType getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionFlagType }
     *     
     */
    public void setFlag(ActionFlagType value) {
        this.flag = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccount(AccountType value) {
        this.account = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link NotesType }
     *     
     */
    public NotesType getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotesType }
     *     
     */
    public void setNote(NotesType value) {
        this.note = value;
    }

}
