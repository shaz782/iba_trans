
package com.xius.billing.subscribermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNotesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNotesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="notesList" type="{http://billing.xius.com/SubscriberManagement.xsd}NotesListType" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://billing.xius.com/SubscriberManagement.xsd}MessageType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNotesResponse", propOrder = {
    "notesList",
    "message"
})
public class GetNotesResponse {

    protected NotesListType notesList;
    protected String message;

    /**
     * Gets the value of the notesList property.
     * 
     * @return
     *     possible object is
     *     {@link NotesListType }
     *     
     */
    public NotesListType getNotesList() {
        return notesList;
    }

    /**
     * Sets the value of the notesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotesListType }
     *     
     */
    public void setNotesList(NotesListType value) {
        this.notesList = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
