//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.10 at 04:21:50 PM CEST 
//


package iface;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Question complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Question">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="answer" type="{http://aladdin.com/xsd}QuestionAnswerListType"/>
 *         &lt;element name="questions" type="{http://aladdin.com/xsd}QuestionnaireQuestionAnswer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="verision" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Question", propOrder = {
    "answer",
    "questions"
})
public class Question {

    @XmlElement(required = true)
    protected QuestionAnswerListType answer;
    @XmlElement(required = true)
    protected QuestionnaireQuestionAnswer questions;
    @XmlAttribute
    protected BigDecimal verision;
    @XmlAttribute
    protected String id;
    @XmlAttribute
    protected String title;

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionAnswerListType }
     *     
     */
    public QuestionAnswerListType getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionAnswerListType }
     *     
     */
    public void setAnswer(QuestionAnswerListType value) {
        this.answer = value;
    }

    /**
     * Gets the value of the questions property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionnaireQuestionAnswer }
     *     
     */
    public QuestionnaireQuestionAnswer getQuestions() {
        return questions;
    }

    /**
     * Sets the value of the questions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionnaireQuestionAnswer }
     *     
     */
    public void setQuestions(QuestionnaireQuestionAnswer value) {
        this.questions = value;
    }

    /**
     * Gets the value of the verision property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVerision() {
        return verision;
    }

    /**
     * Sets the value of the verision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVerision(BigDecimal value) {
        this.verision = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
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

}
