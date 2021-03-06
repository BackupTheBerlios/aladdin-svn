/*
 * XML Type:  Patient
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Patient
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML Patient(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class PatientImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.Patient
{
    
    public PatientImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ID");
    private static final javax.xml.namespace.QName PERSONDATA$2 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PersonData");
    private static final javax.xml.namespace.QName SDDATA$4 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SD_Data");
    private static final javax.xml.namespace.QName RESPONSIBLECLINICIANID$6 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ResponsibleClinicianID");
    private static final javax.xml.namespace.QName PATIENTCARERLIST$8 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientCarerList");
    
    
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
     * Gets the "PersonData" element
     */
    public eu.aladdin_project.xsd.PersonData getPersonData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.PersonData target = null;
            target = (eu.aladdin_project.xsd.PersonData)get_store().find_element_user(PERSONDATA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PersonData" element
     */
    public void setPersonData(eu.aladdin_project.xsd.PersonData personData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.PersonData target = null;
            target = (eu.aladdin_project.xsd.PersonData)get_store().find_element_user(PERSONDATA$2, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.PersonData)get_store().add_element_user(PERSONDATA$2);
            }
            target.set(personData);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonData" element
     */
    public eu.aladdin_project.xsd.PersonData addNewPersonData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.PersonData target = null;
            target = (eu.aladdin_project.xsd.PersonData)get_store().add_element_user(PERSONDATA$2);
            return target;
        }
    }
    
    /**
     * Gets the "SD_Data" element
     */
    public eu.aladdin_project.xsd.SocioDemographicData getSDData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SocioDemographicData target = null;
            target = (eu.aladdin_project.xsd.SocioDemographicData)get_store().find_element_user(SDDATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SD_Data" element
     */
    public void setSDData(eu.aladdin_project.xsd.SocioDemographicData sdData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SocioDemographicData target = null;
            target = (eu.aladdin_project.xsd.SocioDemographicData)get_store().find_element_user(SDDATA$4, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SocioDemographicData)get_store().add_element_user(SDDATA$4);
            }
            target.set(sdData);
        }
    }
    
    /**
     * Appends and returns a new empty "SD_Data" element
     */
    public eu.aladdin_project.xsd.SocioDemographicData addNewSDData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SocioDemographicData target = null;
            target = (eu.aladdin_project.xsd.SocioDemographicData)get_store().add_element_user(SDDATA$4);
            return target;
        }
    }
    
    /**
     * Gets the "ResponsibleClinicianID" element
     */
    public java.lang.String getResponsibleClinicianID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSIBLECLINICIANID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResponsibleClinicianID" element
     */
    public org.apache.xmlbeans.XmlString xgetResponsibleClinicianID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSIBLECLINICIANID$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ResponsibleClinicianID" element
     */
    public void setResponsibleClinicianID(java.lang.String responsibleClinicianID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSIBLECLINICIANID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSIBLECLINICIANID$6);
            }
            target.setStringValue(responsibleClinicianID);
        }
    }
    
    /**
     * Sets (as xml) the "ResponsibleClinicianID" element
     */
    public void xsetResponsibleClinicianID(org.apache.xmlbeans.XmlString responsibleClinicianID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSIBLECLINICIANID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSIBLECLINICIANID$6);
            }
            target.set(responsibleClinicianID);
        }
    }
    
    /**
     * Gets the "PatientCarerList" element
     */
    public eu.aladdin_project.xsd.PatientCarerList getPatientCarerList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.PatientCarerList target = null;
            target = (eu.aladdin_project.xsd.PatientCarerList)get_store().find_element_user(PATIENTCARERLIST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PatientCarerList" element
     */
    public void setPatientCarerList(eu.aladdin_project.xsd.PatientCarerList patientCarerList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.PatientCarerList target = null;
            target = (eu.aladdin_project.xsd.PatientCarerList)get_store().find_element_user(PATIENTCARERLIST$8, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.PatientCarerList)get_store().add_element_user(PATIENTCARERLIST$8);
            }
            target.set(patientCarerList);
        }
    }
    
    /**
     * Appends and returns a new empty "PatientCarerList" element
     */
    public eu.aladdin_project.xsd.PatientCarerList addNewPatientCarerList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.PatientCarerList target = null;
            target = (eu.aladdin_project.xsd.PatientCarerList)get_store().add_element_user(PATIENTCARERLIST$8);
            return target;
        }
    }
}
