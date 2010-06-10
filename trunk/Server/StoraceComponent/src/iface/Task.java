//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.10 at 04:21:50 PM CEST 
//


package iface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Task complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Task">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaskType" type="{http://aladdin.com/xsd}SystemParameter"/>
 *         &lt;element name="DateTimeAssigned" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateTimeFulfilled" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TaskStatus" type="{http://aladdin.com/xsd}SystemParameter"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Questionnaire" type="{http://aladdin.com/xsd}Questionnaire"/>
 *         &lt;element name="ExecutorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AssignerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ObjectID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Task", propOrder = {
    "id",
    "taskType",
    "dateTimeAssigned",
    "dateTimeFulfilled",
    "taskStatus",
    "url",
    "questionnaire",
    "executorID",
    "assignerID",
    "objectID"
})
public class Task {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "TaskType", required = true)
    protected SystemParameter taskType;
    @XmlElement(name = "DateTimeAssigned", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeAssigned;
    @XmlElement(name = "DateTimeFulfilled", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeFulfilled;
    @XmlElement(name = "TaskStatus", required = true)
    protected SystemParameter taskStatus;
    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "Questionnaire", required = true)
    protected Questionnaire questionnaire;
    @XmlElement(name = "ExecutorID", required = true)
    protected String executorID;
    @XmlElement(name = "AssignerID", required = true)
    protected String assignerID;
    @XmlElement(name = "ObjectID", required = true)
    protected String objectID;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the taskType property.
     * 
     * @return
     *     possible object is
     *     {@link SystemParameter }
     *     
     */
    public SystemParameter getTaskType() {
        return taskType;
    }

    /**
     * Sets the value of the taskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemParameter }
     *     
     */
    public void setTaskType(SystemParameter value) {
        this.taskType = value;
    }

    /**
     * Gets the value of the dateTimeAssigned property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeAssigned() {
        return dateTimeAssigned;
    }

    /**
     * Sets the value of the dateTimeAssigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeAssigned(XMLGregorianCalendar value) {
        this.dateTimeAssigned = value;
    }

    /**
     * Gets the value of the dateTimeFulfilled property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeFulfilled() {
        return dateTimeFulfilled;
    }

    /**
     * Sets the value of the dateTimeFulfilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeFulfilled(XMLGregorianCalendar value) {
        this.dateTimeFulfilled = value;
    }

    /**
     * Gets the value of the taskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SystemParameter }
     *     
     */
    public SystemParameter getTaskStatus() {
        return taskStatus;
    }

    /**
     * Sets the value of the taskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemParameter }
     *     
     */
    public void setTaskStatus(SystemParameter value) {
        this.taskStatus = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the questionnaire property.
     * 
     * @return
     *     possible object is
     *     {@link Questionnaire }
     *     
     */
    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    /**
     * Sets the value of the questionnaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Questionnaire }
     *     
     */
    public void setQuestionnaire(Questionnaire value) {
        this.questionnaire = value;
    }

    /**
     * Gets the value of the executorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutorID() {
        return executorID;
    }

    /**
     * Sets the value of the executorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutorID(String value) {
        this.executorID = value;
    }

    /**
     * Gets the value of the assignerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignerID() {
        return assignerID;
    }

    /**
     * Sets the value of the assignerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignerID(String value) {
        this.assignerID = value;
    }

    /**
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectID(String value) {
        this.objectID = value;
    }

}
