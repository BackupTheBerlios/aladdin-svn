//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.11 at 11:39:38 AM CEST 
//


package com.aladdin.xsd.iface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CompareOp" type="{http://aladdin.com/xsd}SystemParameter"/>
 *         &lt;element name="FieldValue1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FieldValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria", propOrder = {
    "fieldName",
    "compareOp",
    "fieldValue1",
    "fieldValue2"
})
public class SearchCriteria {

    @XmlElement(name = "FieldName", required = true)
    protected String fieldName;
    @XmlElement(name = "CompareOp", required = true)
    protected SystemParameter compareOp;
    @XmlElement(name = "FieldValue1", required = true)
    protected String fieldValue1;
    @XmlElement(name = "FieldValue2")
    protected String fieldValue2;

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the compareOp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemParameter }
     *     
     */
    public SystemParameter getCompareOp() {
        return compareOp;
    }

    /**
     * Sets the value of the compareOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemParameter }
     *     
     */
    public void setCompareOp(SystemParameter value) {
        this.compareOp = value;
    }

    /**
     * Gets the value of the fieldValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue1() {
        return fieldValue1;
    }

    /**
     * Sets the value of the fieldValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue1(String value) {
        this.fieldValue1 = value;
    }

    /**
     * Gets the value of the fieldValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue2() {
        return fieldValue2;
    }

    /**
     * Sets the value of the fieldValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue2(String value) {
        this.fieldValue2 = value;
    }

}
