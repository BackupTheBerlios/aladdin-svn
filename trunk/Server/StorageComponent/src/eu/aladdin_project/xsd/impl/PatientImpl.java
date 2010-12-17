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
    private static final javax.xml.namespace.QName SOCIALWORKER$10 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "SocialWorker");
    private static final javax.xml.namespace.QName CONSULTERINCHARGE$12 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "ConsulterInCharge");
    private static final javax.xml.namespace.QName GENERALPRACTITIONER$14 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "GeneralPractitioner");
    
    
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
    
    /**
     * Gets the "SocialWorker" element
     */
    public eu.aladdin_project.xsd.SocialWorker getSocialWorker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SocialWorker target = null;
            target = (eu.aladdin_project.xsd.SocialWorker)get_store().find_element_user(SOCIALWORKER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SocialWorker" element
     */
    public void setSocialWorker(eu.aladdin_project.xsd.SocialWorker socialWorker)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SocialWorker target = null;
            target = (eu.aladdin_project.xsd.SocialWorker)get_store().find_element_user(SOCIALWORKER$10, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.SocialWorker)get_store().add_element_user(SOCIALWORKER$10);
            }
            target.set(socialWorker);
        }
    }
    
    /**
     * Appends and returns a new empty "SocialWorker" element
     */
    public eu.aladdin_project.xsd.SocialWorker addNewSocialWorker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.SocialWorker target = null;
            target = (eu.aladdin_project.xsd.SocialWorker)get_store().add_element_user(SOCIALWORKER$10);
            return target;
        }
    }
    
    /**
     * Gets the "ConsulterInCharge" element
     */
    public eu.aladdin_project.xsd.Consulter getConsulterInCharge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Consulter target = null;
            target = (eu.aladdin_project.xsd.Consulter)get_store().find_element_user(CONSULTERINCHARGE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConsulterInCharge" element
     */
    public void setConsulterInCharge(eu.aladdin_project.xsd.Consulter consulterInCharge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Consulter target = null;
            target = (eu.aladdin_project.xsd.Consulter)get_store().find_element_user(CONSULTERINCHARGE$12, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.Consulter)get_store().add_element_user(CONSULTERINCHARGE$12);
            }
            target.set(consulterInCharge);
        }
    }
    
    /**
     * Appends and returns a new empty "ConsulterInCharge" element
     */
    public eu.aladdin_project.xsd.Consulter addNewConsulterInCharge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.Consulter target = null;
            target = (eu.aladdin_project.xsd.Consulter)get_store().add_element_user(CONSULTERINCHARGE$12);
            return target;
        }
    }
    
    /**
     * Gets the "GeneralPractitioner" element
     */
    public eu.aladdin_project.xsd.GeneralPractitioner getGeneralPractitioner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.GeneralPractitioner target = null;
            target = (eu.aladdin_project.xsd.GeneralPractitioner)get_store().find_element_user(GENERALPRACTITIONER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeneralPractitioner" element
     */
    public void setGeneralPractitioner(eu.aladdin_project.xsd.GeneralPractitioner generalPractitioner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.GeneralPractitioner target = null;
            target = (eu.aladdin_project.xsd.GeneralPractitioner)get_store().find_element_user(GENERALPRACTITIONER$14, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.xsd.GeneralPractitioner)get_store().add_element_user(GENERALPRACTITIONER$14);
            }
            target.set(generalPractitioner);
        }
    }
    
    /**
     * Appends and returns a new empty "GeneralPractitioner" element
     */
    public eu.aladdin_project.xsd.GeneralPractitioner addNewGeneralPractitioner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.GeneralPractitioner target = null;
            target = (eu.aladdin_project.xsd.GeneralPractitioner)get_store().add_element_user(GENERALPRACTITIONER$14);
            return target;
        }
    }
}
