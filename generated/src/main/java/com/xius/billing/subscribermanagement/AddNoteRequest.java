
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddNoteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddNoteRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flag" type="{http://billing.xius.com/SubscriberManagement.xsd}ActionFlagType"/&gt;
 *         &lt;element name="accountId" type="{http://billing.xius.com/SubscriberManagement.xsd}AccountIdType"/&gt;
 *         &lt;element name="addNote" type="{http://billing.xius.com/SubscriberManagement.xsd}NotesListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddNoteRequest", propOrder = {
    "flag",
    "accountId",
    "addNote"
})
public class AddNoteRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ActionFlagType flag;
    protected long accountId;
    @XmlElement(required = true)
    protected NotesListType addNote;

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
     * Gets the value of the accountId property.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the addNote property.
     * 
     * @return
     *     possible object is
     *     {@link NotesListType }
     *     
     */
    public NotesListType getAddNote() {
        return addNote;
    }

    /**
     * Sets the value of the addNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotesListType }
     *     
     */
    public void setAddNote(NotesListType value) {
        this.addNote = value;
    }

}
