/*
 * XML Type:  CarerAssessment
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.CarerAssessment
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML CarerAssessment(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class CarerAssessmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.CarerAssessment
{
    
    public CarerAssessmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ID");
    private static final javax.xml.namespace.QName CARERID$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "CarerID");
    private static final javax.xml.namespace.QName CLINICIANID$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ClinicianID");
    private static final javax.xml.namespace.QName DATEOFASSESSMENT$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "DateOfAssessment");
    private static final javax.xml.namespace.QName RELEVANTHEALTHPROBLEM$8 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "RelevantHealthProblem");
    private static final javax.xml.namespace.QName SEVERITYOFBURDEN$10 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SeverityOfBurden");
    private static final javax.xml.namespace.QName EMOTIONALORMENTALDISORDERS$12 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "EmotionalOrMentalDisorders");
    private static final javax.xml.namespace.QName PSYCHOACTIVEDRUGS$14 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PsychoactiveDrugs");
    private static final javax.xml.namespace.QName QUALITYOFLIFE$16 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "QualityOfLife");
    
    
    /**
     * Gets the "ID" element
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.apache.xmlbeans.XmlString xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "CarerID" element
     */
    public java.lang.String getCarerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CarerID" element
     */
    public org.apache.xmlbeans.XmlString xgetCarerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARERID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CarerID" element
     */
    public void setCarerID(java.lang.String carerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARERID$2);
            }
            target.setStringValue(carerID);
        }
    }
    
    /**
     * Sets (as xml) the "CarerID" element
     */
    public void xsetCarerID(org.apache.xmlbeans.XmlString carerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARERID$2);
            }
            target.set(carerID);
        }
    }
    
    /**
     * Gets the "ClinicianID" element
     */
    public java.lang.String getClinicianID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLINICIANID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClinicianID" element
     */
    public org.apache.xmlbeans.XmlString xgetClinicianID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLINICIANID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ClinicianID" element
     */
    public void setClinicianID(java.lang.String clinicianID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLINICIANID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLINICIANID$4);
            }
            target.setStringValue(clinicianID);
        }
    }
    
    /**
     * Sets (as xml) the "ClinicianID" element
     */
    public void xsetClinicianID(org.apache.xmlbeans.XmlString clinicianID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLINICIANID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLINICIANID$4);
            }
            target.set(clinicianID);
        }
    }
    
    /**
     * Gets the "DateOfAssessment" element
     */
    public java.util.Calendar getDateOfAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOFASSESSMENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateOfAssessment" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateOfAssessment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEOFASSESSMENT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DateOfAssessment" element
     */
    public void setDateOfAssessment(java.util.Calendar dateOfAssessment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOFASSESSMENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEOFASSESSMENT$6);
            }
            target.setCalendarValue(dateOfAssessment);
        }
    }
    
    /**
     * Sets (as xml) the "DateOfAssessment" element
     */
    public void xsetDateOfAssessment(org.apache.xmlbeans.XmlDateTime dateOfAssessment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEOFASSESSMENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATEOFASSESSMENT$6);
            }
            target.set(dateOfAssessment);
        }
    }
    
    /**
     * Gets the "RelevantHealthProblem" element
     */
    public java.lang.String getRelevantHealthProblem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEVANTHEALTHPROBLEM$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelevantHealthProblem" element
     */
    public org.apache.xmlbeans.XmlString xgetRelevantHealthProblem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEVANTHEALTHPROBLEM$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "RelevantHealthProblem" element
     */
    public boolean isSetRelevantHealthProblem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELEVANTHEALTHPROBLEM$8) != 0;
        }
    }
    
    /**
     * Sets the "RelevantHealthProblem" element
     */
    public void setRelevantHealthProblem(java.lang.String relevantHealthProblem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEVANTHEALTHPROBLEM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELEVANTHEALTHPROBLEM$8);
            }
            target.setStringValue(relevantHealthProblem);
        }
    }
    
    /**
     * Sets (as xml) the "RelevantHealthProblem" element
     */
    public void xsetRelevantHealthProblem(org.apache.xmlbeans.XmlString relevantHealthProblem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEVANTHEALTHPROBLEM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELEVANTHEALTHPROBLEM$8);
            }
            target.set(relevantHealthProblem);
        }
    }
    
    /**
     * Unsets the "RelevantHealthProblem" element
     */
    public void unsetRelevantHealthProblem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELEVANTHEALTHPROBLEM$8, 0);
        }
    }
    
    /**
     * Gets the "SeverityOfBurden" element
     */
    public short getSeverityOfBurden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITYOFBURDEN$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "SeverityOfBurden" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetSeverityOfBurden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(SEVERITYOFBURDEN$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SeverityOfBurden" element
     */
    public void setSeverityOfBurden(short severityOfBurden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITYOFBURDEN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEVERITYOFBURDEN$10);
            }
            target.setShortValue(severityOfBurden);
        }
    }
    
    /**
     * Sets (as xml) the "SeverityOfBurden" element
     */
    public void xsetSeverityOfBurden(org.apache.xmlbeans.XmlUnsignedByte severityOfBurden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(SEVERITYOFBURDEN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(SEVERITYOFBURDEN$10);
            }
            target.set(severityOfBurden);
        }
    }
    
    /**
     * Gets the "EmotionalOrMentalDisorders" element
     */
    public java.lang.String getEmotionalOrMentalDisorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMOTIONALORMENTALDISORDERS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmotionalOrMentalDisorders" element
     */
    public org.apache.xmlbeans.XmlString xgetEmotionalOrMentalDisorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMOTIONALORMENTALDISORDERS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmotionalOrMentalDisorders" element
     */
    public boolean isSetEmotionalOrMentalDisorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMOTIONALORMENTALDISORDERS$12) != 0;
        }
    }
    
    /**
     * Sets the "EmotionalOrMentalDisorders" element
     */
    public void setEmotionalOrMentalDisorders(java.lang.String emotionalOrMentalDisorders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMOTIONALORMENTALDISORDERS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMOTIONALORMENTALDISORDERS$12);
            }
            target.setStringValue(emotionalOrMentalDisorders);
        }
    }
    
    /**
     * Sets (as xml) the "EmotionalOrMentalDisorders" element
     */
    public void xsetEmotionalOrMentalDisorders(org.apache.xmlbeans.XmlString emotionalOrMentalDisorders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMOTIONALORMENTALDISORDERS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMOTIONALORMENTALDISORDERS$12);
            }
            target.set(emotionalOrMentalDisorders);
        }
    }
    
    /**
     * Unsets the "EmotionalOrMentalDisorders" element
     */
    public void unsetEmotionalOrMentalDisorders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMOTIONALORMENTALDISORDERS$12, 0);
        }
    }
    
    /**
     * Gets the "PsychoactiveDrugs" element
     */
    public java.lang.String getPsychoactiveDrugs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSYCHOACTIVEDRUGS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PsychoactiveDrugs" element
     */
    public org.apache.xmlbeans.XmlString xgetPsychoactiveDrugs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PSYCHOACTIVEDRUGS$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "PsychoactiveDrugs" element
     */
    public boolean isSetPsychoactiveDrugs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PSYCHOACTIVEDRUGS$14) != 0;
        }
    }
    
    /**
     * Sets the "PsychoactiveDrugs" element
     */
    public void setPsychoactiveDrugs(java.lang.String psychoactiveDrugs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSYCHOACTIVEDRUGS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PSYCHOACTIVEDRUGS$14);
            }
            target.setStringValue(psychoactiveDrugs);
        }
    }
    
    /**
     * Sets (as xml) the "PsychoactiveDrugs" element
     */
    public void xsetPsychoactiveDrugs(org.apache.xmlbeans.XmlString psychoactiveDrugs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PSYCHOACTIVEDRUGS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PSYCHOACTIVEDRUGS$14);
            }
            target.set(psychoactiveDrugs);
        }
    }
    
    /**
     * Unsets the "PsychoactiveDrugs" element
     */
    public void unsetPsychoactiveDrugs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PSYCHOACTIVEDRUGS$14, 0);
        }
    }
    
    /**
     * Gets the "QualityOfLife" element
     */
    public short getQualityOfLife()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALITYOFLIFE$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "QualityOfLife" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetQualityOfLife()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(QUALITYOFLIFE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "QualityOfLife" element
     */
    public boolean isSetQualityOfLife()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUALITYOFLIFE$16) != 0;
        }
    }
    
    /**
     * Sets the "QualityOfLife" element
     */
    public void setQualityOfLife(short qualityOfLife)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALITYOFLIFE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUALITYOFLIFE$16);
            }
            target.setShortValue(qualityOfLife);
        }
    }
    
    /**
     * Sets (as xml) the "QualityOfLife" element
     */
    public void xsetQualityOfLife(org.apache.xmlbeans.XmlUnsignedByte qualityOfLife)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(QUALITYOFLIFE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(QUALITYOFLIFE$16);
            }
            target.set(qualityOfLife);
        }
    }
    
    /**
     * Unsets the "QualityOfLife" element
     */
    public void unsetQualityOfLife()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUALITYOFLIFE$16, 0);
        }
    }
}
