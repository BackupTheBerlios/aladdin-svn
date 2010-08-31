/*
 * XML Type:  PatientAssessment
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.PatientAssessment
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML PatientAssessment(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class PatientAssessmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.PatientAssessment
{
    
    public PatientAssessmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ID");
    private static final javax.xml.namespace.QName PATIENTID$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientID");
    private static final javax.xml.namespace.QName DATEOFASSESSMENT$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "DateOfAssessment");
    private static final javax.xml.namespace.QName AETOLOGY$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Aetology");
    private static final javax.xml.namespace.QName TIMEELLAPSEDSINCEDIAGNOSED$8 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "TimeEllapsedSinceDiagnosed");
    private static final javax.xml.namespace.QName SEVERITY$10 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Severity");
    private static final javax.xml.namespace.QName RELEVANTPATHOLOGYANTECEDENTS$12 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "RelevantPathologyAntecedents");
    private static final javax.xml.namespace.QName COMORBIDITY$14 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Comorbidity");
    private static final javax.xml.namespace.QName CHARLSONCOMORBIDITYINDEX$16 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "CharlsonComorbidityIndex");
    private static final javax.xml.namespace.QName BARTHELINDEX$18 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "BarthelIndex");
    private static final javax.xml.namespace.QName LAWTONINDEX$20 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "LawtonIndex");
    private static final javax.xml.namespace.QName MMSE$22 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "MMSE");
    private static final javax.xml.namespace.QName MDRS$24 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "MDRS");
    private static final javax.xml.namespace.QName BLESSEDSCALEPART1$26 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "BlessedScalePart1");
    private static final javax.xml.namespace.QName BLESSEDSCALEPART2$28 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "BlessedScalePart2");
    private static final javax.xml.namespace.QName BLESSEDSCALEPART3$30 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "BlessedScalePart3");
    private static final javax.xml.namespace.QName CHECKLISTMBP$32 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ChecklistMBP");
    private static final javax.xml.namespace.QName NPQISEVERITY$34 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "NPQI_Severity");
    private static final javax.xml.namespace.QName NPQISTRESS$36 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "NPQI_Stress");
    private static final javax.xml.namespace.QName GDS$38 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "GDS");
    private static final javax.xml.namespace.QName FALLS$40 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Falls");
    private static final javax.xml.namespace.QName INCONTINENCE$42 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Incontinence");
    private static final javax.xml.namespace.QName DELIRIUM$44 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Delirium");
    private static final javax.xml.namespace.QName IMMOBILITY$46 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "Immobility");
    private static final javax.xml.namespace.QName SENSORIALDEFICITS$48 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SensorialDeficits");
    private static final javax.xml.namespace.QName PHARMACOLOGICALTREATMENT$50 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PharmacologicalTreatment");
    private static final javax.xml.namespace.QName CLINICALDATA$52 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ClinicalData");
    
    
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
     * Gets the "PatientID" element
     */
    public java.lang.String getPatientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PatientID" element
     */
    public org.apache.xmlbeans.XmlString xgetPatientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PatientID" element
     */
    public void setPatientID(java.lang.String patientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATIENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATIENTID$2);
            }
            target.setStringValue(patientID);
        }
    }
    
    /**
     * Sets (as xml) the "PatientID" element
     */
    public void xsetPatientID(org.apache.xmlbeans.XmlString patientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATIENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATIENTID$2);
            }
            target.set(patientID);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOFASSESSMENT$4, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEOFASSESSMENT$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEOFASSESSMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEOFASSESSMENT$4);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEOFASSESSMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATEOFASSESSMENT$4);
            }
            target.set(dateOfAssessment);
        }
    }
    
    /**
     * Gets the "Aetology" element
     */
    public eu.aladdin_project.xsd.SystemParameter getAetology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(AETOLOGY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Aetology" element
     */
    public void setAetology(eu.aladdin_project.xsd.SystemParameter aetology)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(AETOLOGY$6, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(AETOLOGY$6);
            }
            target.set(aetology);
        }
    }
    
    /**
     * Appends and returns a new empty "Aetology" element
     */
    public eu.aladdin_project.xsd.SystemParameter addNewAetology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SystemParameter target = null;
            target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(AETOLOGY$6);
            return target;
        }
    }
    
    /**
     * Gets the "TimeEllapsedSinceDiagnosed" element
     */
    public short getTimeEllapsedSinceDiagnosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEELLAPSEDSINCEDIAGNOSED$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "TimeEllapsedSinceDiagnosed" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetTimeEllapsedSinceDiagnosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(TIMEELLAPSEDSINCEDIAGNOSED$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TimeEllapsedSinceDiagnosed" element
     */
    public void setTimeEllapsedSinceDiagnosed(short timeEllapsedSinceDiagnosed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEELLAPSEDSINCEDIAGNOSED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEELLAPSEDSINCEDIAGNOSED$8);
            }
            target.setShortValue(timeEllapsedSinceDiagnosed);
        }
    }
    
    /**
     * Sets (as xml) the "TimeEllapsedSinceDiagnosed" element
     */
    public void xsetTimeEllapsedSinceDiagnosed(org.apache.xmlbeans.XmlUnsignedByte timeEllapsedSinceDiagnosed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(TIMEELLAPSEDSINCEDIAGNOSED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(TIMEELLAPSEDSINCEDIAGNOSED$8);
            }
            target.set(timeEllapsedSinceDiagnosed);
        }
    }
    
    /**
     * Gets the "Severity" element
     */
    public short getSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITY$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "Severity" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(SEVERITY$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Severity" element
     */
    public void setSeverity(short severity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEVERITY$10);
            }
            target.setShortValue(severity);
        }
    }
    
    /**
     * Sets (as xml) the "Severity" element
     */
    public void xsetSeverity(org.apache.xmlbeans.XmlUnsignedByte severity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(SEVERITY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(SEVERITY$10);
            }
            target.set(severity);
        }
    }
    
    /**
     * Gets the "RelevantPathologyAntecedents" element
     */
    public java.lang.String getRelevantPathologyAntecedents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEVANTPATHOLOGYANTECEDENTS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RelevantPathologyAntecedents" element
     */
    public org.apache.xmlbeans.XmlString xgetRelevantPathologyAntecedents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEVANTPATHOLOGYANTECEDENTS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "RelevantPathologyAntecedents" element
     */
    public boolean isSetRelevantPathologyAntecedents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELEVANTPATHOLOGYANTECEDENTS$12) != 0;
        }
    }
    
    /**
     * Sets the "RelevantPathologyAntecedents" element
     */
    public void setRelevantPathologyAntecedents(java.lang.String relevantPathologyAntecedents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELEVANTPATHOLOGYANTECEDENTS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELEVANTPATHOLOGYANTECEDENTS$12);
            }
            target.setStringValue(relevantPathologyAntecedents);
        }
    }
    
    /**
     * Sets (as xml) the "RelevantPathologyAntecedents" element
     */
    public void xsetRelevantPathologyAntecedents(org.apache.xmlbeans.XmlString relevantPathologyAntecedents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELEVANTPATHOLOGYANTECEDENTS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELEVANTPATHOLOGYANTECEDENTS$12);
            }
            target.set(relevantPathologyAntecedents);
        }
    }
    
    /**
     * Unsets the "RelevantPathologyAntecedents" element
     */
    public void unsetRelevantPathologyAntecedents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELEVANTPATHOLOGYANTECEDENTS$12, 0);
        }
    }
    
    /**
     * Gets the "Comorbidity" element
     */
    public java.lang.String getComorbidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMORBIDITY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Comorbidity" element
     */
    public org.apache.xmlbeans.XmlString xgetComorbidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMORBIDITY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "Comorbidity" element
     */
    public boolean isSetComorbidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMORBIDITY$14) != 0;
        }
    }
    
    /**
     * Sets the "Comorbidity" element
     */
    public void setComorbidity(java.lang.String comorbidity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMORBIDITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMORBIDITY$14);
            }
            target.setStringValue(comorbidity);
        }
    }
    
    /**
     * Sets (as xml) the "Comorbidity" element
     */
    public void xsetComorbidity(org.apache.xmlbeans.XmlString comorbidity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMORBIDITY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMORBIDITY$14);
            }
            target.set(comorbidity);
        }
    }
    
    /**
     * Unsets the "Comorbidity" element
     */
    public void unsetComorbidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMORBIDITY$14, 0);
        }
    }
    
    /**
     * Gets the "CharlsonComorbidityIndex" element
     */
    public short getCharlsonComorbidityIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARLSONCOMORBIDITYINDEX$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "CharlsonComorbidityIndex" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetCharlsonComorbidityIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CHARLSONCOMORBIDITYINDEX$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "CharlsonComorbidityIndex" element
     */
    public boolean isSetCharlsonComorbidityIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARLSONCOMORBIDITYINDEX$16) != 0;
        }
    }
    
    /**
     * Sets the "CharlsonComorbidityIndex" element
     */
    public void setCharlsonComorbidityIndex(short charlsonComorbidityIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARLSONCOMORBIDITYINDEX$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARLSONCOMORBIDITYINDEX$16);
            }
            target.setShortValue(charlsonComorbidityIndex);
        }
    }
    
    /**
     * Sets (as xml) the "CharlsonComorbidityIndex" element
     */
    public void xsetCharlsonComorbidityIndex(org.apache.xmlbeans.XmlUnsignedByte charlsonComorbidityIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CHARLSONCOMORBIDITYINDEX$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(CHARLSONCOMORBIDITYINDEX$16);
            }
            target.set(charlsonComorbidityIndex);
        }
    }
    
    /**
     * Unsets the "CharlsonComorbidityIndex" element
     */
    public void unsetCharlsonComorbidityIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARLSONCOMORBIDITYINDEX$16, 0);
        }
    }
    
    /**
     * Gets the "BarthelIndex" element
     */
    public short getBarthelIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BARTHELINDEX$18, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "BarthelIndex" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetBarthelIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(BARTHELINDEX$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "BarthelIndex" element
     */
    public boolean isSetBarthelIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BARTHELINDEX$18) != 0;
        }
    }
    
    /**
     * Sets the "BarthelIndex" element
     */
    public void setBarthelIndex(short barthelIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BARTHELINDEX$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BARTHELINDEX$18);
            }
            target.setShortValue(barthelIndex);
        }
    }
    
    /**
     * Sets (as xml) the "BarthelIndex" element
     */
    public void xsetBarthelIndex(org.apache.xmlbeans.XmlUnsignedByte barthelIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(BARTHELINDEX$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(BARTHELINDEX$18);
            }
            target.set(barthelIndex);
        }
    }
    
    /**
     * Unsets the "BarthelIndex" element
     */
    public void unsetBarthelIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BARTHELINDEX$18, 0);
        }
    }
    
    /**
     * Gets the "LawtonIndex" element
     */
    public short getLawtonIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAWTONINDEX$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "LawtonIndex" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetLawtonIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(LAWTONINDEX$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "LawtonIndex" element
     */
    public boolean isSetLawtonIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAWTONINDEX$20) != 0;
        }
    }
    
    /**
     * Sets the "LawtonIndex" element
     */
    public void setLawtonIndex(short lawtonIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAWTONINDEX$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAWTONINDEX$20);
            }
            target.setShortValue(lawtonIndex);
        }
    }
    
    /**
     * Sets (as xml) the "LawtonIndex" element
     */
    public void xsetLawtonIndex(org.apache.xmlbeans.XmlUnsignedByte lawtonIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(LAWTONINDEX$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(LAWTONINDEX$20);
            }
            target.set(lawtonIndex);
        }
    }
    
    /**
     * Unsets the "LawtonIndex" element
     */
    public void unsetLawtonIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAWTONINDEX$20, 0);
        }
    }
    
    /**
     * Gets the "MMSE" element
     */
    public short getMMSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MMSE$22, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "MMSE" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetMMSE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(MMSE$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MMSE" element
     */
    public void setMMSE(short mmse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MMSE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MMSE$22);
            }
            target.setShortValue(mmse);
        }
    }
    
    /**
     * Sets (as xml) the "MMSE" element
     */
    public void xsetMMSE(org.apache.xmlbeans.XmlUnsignedByte mmse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(MMSE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(MMSE$22);
            }
            target.set(mmse);
        }
    }
    
    /**
     * Gets the "MDRS" element
     */
    public short getMDRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MDRS$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "MDRS" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetMDRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(MDRS$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "MDRS" element
     */
    public boolean isSetMDRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MDRS$24) != 0;
        }
    }
    
    /**
     * Sets the "MDRS" element
     */
    public void setMDRS(short mdrs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MDRS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MDRS$24);
            }
            target.setShortValue(mdrs);
        }
    }
    
    /**
     * Sets (as xml) the "MDRS" element
     */
    public void xsetMDRS(org.apache.xmlbeans.XmlUnsignedByte mdrs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(MDRS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(MDRS$24);
            }
            target.set(mdrs);
        }
    }
    
    /**
     * Unsets the "MDRS" element
     */
    public void unsetMDRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MDRS$24, 0);
        }
    }
    
    /**
     * Gets the "BlessedScalePart1" element
     */
    public double getBlessedScalePart1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLESSEDSCALEPART1$26, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "BlessedScalePart1" element
     */
    public org.apache.xmlbeans.XmlDouble xgetBlessedScalePart1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BLESSEDSCALEPART1$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "BlessedScalePart1" element
     */
    public boolean isSetBlessedScalePart1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLESSEDSCALEPART1$26) != 0;
        }
    }
    
    /**
     * Sets the "BlessedScalePart1" element
     */
    public void setBlessedScalePart1(double blessedScalePart1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLESSEDSCALEPART1$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLESSEDSCALEPART1$26);
            }
            target.setDoubleValue(blessedScalePart1);
        }
    }
    
    /**
     * Sets (as xml) the "BlessedScalePart1" element
     */
    public void xsetBlessedScalePart1(org.apache.xmlbeans.XmlDouble blessedScalePart1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BLESSEDSCALEPART1$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(BLESSEDSCALEPART1$26);
            }
            target.set(blessedScalePart1);
        }
    }
    
    /**
     * Unsets the "BlessedScalePart1" element
     */
    public void unsetBlessedScalePart1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLESSEDSCALEPART1$26, 0);
        }
    }
    
    /**
     * Gets the "BlessedScalePart2" element
     */
    public short getBlessedScalePart2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLESSEDSCALEPART2$28, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "BlessedScalePart2" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetBlessedScalePart2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(BLESSEDSCALEPART2$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "BlessedScalePart2" element
     */
    public boolean isSetBlessedScalePart2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLESSEDSCALEPART2$28) != 0;
        }
    }
    
    /**
     * Sets the "BlessedScalePart2" element
     */
    public void setBlessedScalePart2(short blessedScalePart2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLESSEDSCALEPART2$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLESSEDSCALEPART2$28);
            }
            target.setShortValue(blessedScalePart2);
        }
    }
    
    /**
     * Sets (as xml) the "BlessedScalePart2" element
     */
    public void xsetBlessedScalePart2(org.apache.xmlbeans.XmlUnsignedByte blessedScalePart2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(BLESSEDSCALEPART2$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(BLESSEDSCALEPART2$28);
            }
            target.set(blessedScalePart2);
        }
    }
    
    /**
     * Unsets the "BlessedScalePart2" element
     */
    public void unsetBlessedScalePart2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLESSEDSCALEPART2$28, 0);
        }
    }
    
    /**
     * Gets the "BlessedScalePart3" element
     */
    public short getBlessedScalePart3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLESSEDSCALEPART3$30, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "BlessedScalePart3" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetBlessedScalePart3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(BLESSEDSCALEPART3$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "BlessedScalePart3" element
     */
    public boolean isSetBlessedScalePart3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BLESSEDSCALEPART3$30) != 0;
        }
    }
    
    /**
     * Sets the "BlessedScalePart3" element
     */
    public void setBlessedScalePart3(short blessedScalePart3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BLESSEDSCALEPART3$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BLESSEDSCALEPART3$30);
            }
            target.setShortValue(blessedScalePart3);
        }
    }
    
    /**
     * Sets (as xml) the "BlessedScalePart3" element
     */
    public void xsetBlessedScalePart3(org.apache.xmlbeans.XmlUnsignedByte blessedScalePart3)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(BLESSEDSCALEPART3$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(BLESSEDSCALEPART3$30);
            }
            target.set(blessedScalePart3);
        }
    }
    
    /**
     * Unsets the "BlessedScalePart3" element
     */
    public void unsetBlessedScalePart3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BLESSEDSCALEPART3$30, 0);
        }
    }
    
    /**
     * Gets the "ChecklistMBP" element
     */
    public short getChecklistMBP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKLISTMBP$32, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChecklistMBP" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetChecklistMBP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CHECKLISTMBP$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "ChecklistMBP" element
     */
    public boolean isSetChecklistMBP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHECKLISTMBP$32) != 0;
        }
    }
    
    /**
     * Sets the "ChecklistMBP" element
     */
    public void setChecklistMBP(short checklistMBP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHECKLISTMBP$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHECKLISTMBP$32);
            }
            target.setShortValue(checklistMBP);
        }
    }
    
    /**
     * Sets (as xml) the "ChecklistMBP" element
     */
    public void xsetChecklistMBP(org.apache.xmlbeans.XmlUnsignedByte checklistMBP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(CHECKLISTMBP$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(CHECKLISTMBP$32);
            }
            target.set(checklistMBP);
        }
    }
    
    /**
     * Unsets the "ChecklistMBP" element
     */
    public void unsetChecklistMBP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHECKLISTMBP$32, 0);
        }
    }
    
    /**
     * Gets the "NPQI_Severity" element
     */
    public short getNPQISeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NPQISEVERITY$34, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "NPQI_Severity" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetNPQISeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(NPQISEVERITY$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "NPQI_Severity" element
     */
    public boolean isSetNPQISeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NPQISEVERITY$34) != 0;
        }
    }
    
    /**
     * Sets the "NPQI_Severity" element
     */
    public void setNPQISeverity(short npqiSeverity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NPQISEVERITY$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NPQISEVERITY$34);
            }
            target.setShortValue(npqiSeverity);
        }
    }
    
    /**
     * Sets (as xml) the "NPQI_Severity" element
     */
    public void xsetNPQISeverity(org.apache.xmlbeans.XmlUnsignedByte npqiSeverity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(NPQISEVERITY$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(NPQISEVERITY$34);
            }
            target.set(npqiSeverity);
        }
    }
    
    /**
     * Unsets the "NPQI_Severity" element
     */
    public void unsetNPQISeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NPQISEVERITY$34, 0);
        }
    }
    
    /**
     * Gets the "NPQI_Stress" element
     */
    public short getNPQIStress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NPQISTRESS$36, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "NPQI_Stress" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetNPQIStress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(NPQISTRESS$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "NPQI_Stress" element
     */
    public boolean isSetNPQIStress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NPQISTRESS$36) != 0;
        }
    }
    
    /**
     * Sets the "NPQI_Stress" element
     */
    public void setNPQIStress(short npqiStress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NPQISTRESS$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NPQISTRESS$36);
            }
            target.setShortValue(npqiStress);
        }
    }
    
    /**
     * Sets (as xml) the "NPQI_Stress" element
     */
    public void xsetNPQIStress(org.apache.xmlbeans.XmlUnsignedByte npqiStress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(NPQISTRESS$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(NPQISTRESS$36);
            }
            target.set(npqiStress);
        }
    }
    
    /**
     * Unsets the "NPQI_Stress" element
     */
    public void unsetNPQIStress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NPQISTRESS$36, 0);
        }
    }
    
    /**
     * Gets the "GDS" element
     */
    public short getGDS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GDS$38, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "GDS" element
     */
    public org.apache.xmlbeans.XmlUnsignedByte xgetGDS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(GDS$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "GDS" element
     */
    public boolean isSetGDS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GDS$38) != 0;
        }
    }
    
    /**
     * Sets the "GDS" element
     */
    public void setGDS(short gds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GDS$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GDS$38);
            }
            target.setShortValue(gds);
        }
    }
    
    /**
     * Sets (as xml) the "GDS" element
     */
    public void xsetGDS(org.apache.xmlbeans.XmlUnsignedByte gds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(GDS$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(GDS$38);
            }
            target.set(gds);
        }
    }
    
    /**
     * Unsets the "GDS" element
     */
    public void unsetGDS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GDS$38, 0);
        }
    }
    
    /**
     * Gets the "Falls" element
     */
    public boolean getFalls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FALLS$40, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Falls" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetFalls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FALLS$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "Falls" element
     */
    public boolean isSetFalls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FALLS$40) != 0;
        }
    }
    
    /**
     * Sets the "Falls" element
     */
    public void setFalls(boolean falls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FALLS$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FALLS$40);
            }
            target.setBooleanValue(falls);
        }
    }
    
    /**
     * Sets (as xml) the "Falls" element
     */
    public void xsetFalls(org.apache.xmlbeans.XmlBoolean falls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FALLS$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FALLS$40);
            }
            target.set(falls);
        }
    }
    
    /**
     * Unsets the "Falls" element
     */
    public void unsetFalls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FALLS$40, 0);
        }
    }
    
    /**
     * Gets the "Incontinence" element
     */
    public boolean getIncontinence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCONTINENCE$42, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Incontinence" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncontinence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCONTINENCE$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "Incontinence" element
     */
    public boolean isSetIncontinence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCONTINENCE$42) != 0;
        }
    }
    
    /**
     * Sets the "Incontinence" element
     */
    public void setIncontinence(boolean incontinence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCONTINENCE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCONTINENCE$42);
            }
            target.setBooleanValue(incontinence);
        }
    }
    
    /**
     * Sets (as xml) the "Incontinence" element
     */
    public void xsetIncontinence(org.apache.xmlbeans.XmlBoolean incontinence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCONTINENCE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCONTINENCE$42);
            }
            target.set(incontinence);
        }
    }
    
    /**
     * Unsets the "Incontinence" element
     */
    public void unsetIncontinence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCONTINENCE$42, 0);
        }
    }
    
    /**
     * Gets the "Delirium" element
     */
    public boolean getDelirium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIRIUM$44, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Delirium" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDelirium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELIRIUM$44, 0);
            return target;
        }
    }
    
    /**
     * True if has "Delirium" element
     */
    public boolean isSetDelirium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIRIUM$44) != 0;
        }
    }
    
    /**
     * Sets the "Delirium" element
     */
    public void setDelirium(boolean delirium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIRIUM$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIRIUM$44);
            }
            target.setBooleanValue(delirium);
        }
    }
    
    /**
     * Sets (as xml) the "Delirium" element
     */
    public void xsetDelirium(org.apache.xmlbeans.XmlBoolean delirium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELIRIUM$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DELIRIUM$44);
            }
            target.set(delirium);
        }
    }
    
    /**
     * Unsets the "Delirium" element
     */
    public void unsetDelirium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIRIUM$44, 0);
        }
    }
    
    /**
     * Gets the "Immobility" element
     */
    public boolean getImmobility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMMOBILITY$46, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Immobility" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetImmobility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(IMMOBILITY$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "Immobility" element
     */
    public boolean isSetImmobility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMMOBILITY$46) != 0;
        }
    }
    
    /**
     * Sets the "Immobility" element
     */
    public void setImmobility(boolean immobility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMMOBILITY$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMMOBILITY$46);
            }
            target.setBooleanValue(immobility);
        }
    }
    
    /**
     * Sets (as xml) the "Immobility" element
     */
    public void xsetImmobility(org.apache.xmlbeans.XmlBoolean immobility)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(IMMOBILITY$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(IMMOBILITY$46);
            }
            target.set(immobility);
        }
    }
    
    /**
     * Unsets the "Immobility" element
     */
    public void unsetImmobility()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMMOBILITY$46, 0);
        }
    }
    
    /**
     * Gets the "SensorialDeficits" element
     */
    public boolean getSensorialDeficits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENSORIALDEFICITS$48, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SensorialDeficits" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSensorialDeficits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENSORIALDEFICITS$48, 0);
            return target;
        }
    }
    
    /**
     * True if has "SensorialDeficits" element
     */
    public boolean isSetSensorialDeficits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENSORIALDEFICITS$48) != 0;
        }
    }
    
    /**
     * Sets the "SensorialDeficits" element
     */
    public void setSensorialDeficits(boolean sensorialDeficits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENSORIALDEFICITS$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENSORIALDEFICITS$48);
            }
            target.setBooleanValue(sensorialDeficits);
        }
    }
    
    /**
     * Sets (as xml) the "SensorialDeficits" element
     */
    public void xsetSensorialDeficits(org.apache.xmlbeans.XmlBoolean sensorialDeficits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENSORIALDEFICITS$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SENSORIALDEFICITS$48);
            }
            target.set(sensorialDeficits);
        }
    }
    
    /**
     * Unsets the "SensorialDeficits" element
     */
    public void unsetSensorialDeficits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENSORIALDEFICITS$48, 0);
        }
    }
    
    /**
     * Gets the "PharmacologicalTreatment" element
     */
    public java.lang.String getPharmacologicalTreatment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHARMACOLOGICALTREATMENT$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PharmacologicalTreatment" element
     */
    public org.apache.xmlbeans.XmlString xgetPharmacologicalTreatment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHARMACOLOGICALTREATMENT$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "PharmacologicalTreatment" element
     */
    public boolean isSetPharmacologicalTreatment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHARMACOLOGICALTREATMENT$50) != 0;
        }
    }
    
    /**
     * Sets the "PharmacologicalTreatment" element
     */
    public void setPharmacologicalTreatment(java.lang.String pharmacologicalTreatment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHARMACOLOGICALTREATMENT$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHARMACOLOGICALTREATMENT$50);
            }
            target.setStringValue(pharmacologicalTreatment);
        }
    }
    
    /**
     * Sets (as xml) the "PharmacologicalTreatment" element
     */
    public void xsetPharmacologicalTreatment(org.apache.xmlbeans.XmlString pharmacologicalTreatment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHARMACOLOGICALTREATMENT$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHARMACOLOGICALTREATMENT$50);
            }
            target.set(pharmacologicalTreatment);
        }
    }
    
    /**
     * Unsets the "PharmacologicalTreatment" element
     */
    public void unsetPharmacologicalTreatment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHARMACOLOGICALTREATMENT$50, 0);
        }
    }
    
    /**
     * Gets array of all "ClinicalData" elements
     */
    public eu.aladdin_project.xsd.Measurement[] getClinicalDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLINICALDATA$52, targetList);
            eu.aladdin_project.xsd.Measurement[] result = new eu.aladdin_project.xsd.Measurement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ClinicalData" element
     */
    public eu.aladdin_project.xsd.Measurement getClinicalDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Measurement target = null;
            target = (eu.aladdin_project.xsd.Measurement)get_store().find_element_user(CLINICALDATA$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ClinicalData" element
     */
    public int sizeOfClinicalDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALDATA$52);
        }
    }
    
    /**
     * Sets array of all "ClinicalData" element
     */
    public void setClinicalDataArray(eu.aladdin_project.xsd.Measurement[] clinicalDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clinicalDataArray, CLINICALDATA$52);
        }
    }
    
    /**
     * Sets ith "ClinicalData" element
     */
    public void setClinicalDataArray(int i, eu.aladdin_project.xsd.Measurement clinicalData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Measurement target = null;
            target = (eu.aladdin_project.xsd.Measurement)get_store().find_element_user(CLINICALDATA$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(clinicalData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClinicalData" element
     */
    public eu.aladdin_project.xsd.Measurement insertNewClinicalData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Measurement target = null;
            target = (eu.aladdin_project.xsd.Measurement)get_store().insert_element_user(CLINICALDATA$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ClinicalData" element
     */
    public eu.aladdin_project.xsd.Measurement addNewClinicalData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Measurement target = null;
            target = (eu.aladdin_project.xsd.Measurement)get_store().add_element_user(CLINICALDATA$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "ClinicalData" element
     */
    public void removeClinicalData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALDATA$52, i);
        }
    }
}
