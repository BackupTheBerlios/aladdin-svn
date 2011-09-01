/*
 * XML Type:  PatientCarerList
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.PatientCarerList
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd.impl;
/**
 * An XML PatientCarerList(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public class PatientCarerListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.xsd.PatientCarerList
{
    
    public PatientCarerListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATIENTCARER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/xsd", "PatientCarer");
    
    
    /**
     * Gets array of all "PatientCarer" elements
     */
    public eu.aladdin_project.xsd.PatientCarer[] getPatientCarerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PATIENTCARER$0, targetList);
            eu.aladdin_project.xsd.PatientCarer[] result = new eu.aladdin_project.xsd.PatientCarer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PatientCarer" element
     */
    public eu.aladdin_project.xsd.PatientCarer getPatientCarerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.PatientCarer target = null;
            target = (eu.aladdin_project.xsd.PatientCarer)get_store().find_element_user(PATIENTCARER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PatientCarer" element
     */
    public int sizeOfPatientCarerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENTCARER$0);
        }
    }
    
    /**
     * Sets array of all "PatientCarer" element
     */
    public void setPatientCarerArray(eu.aladdin_project.xsd.PatientCarer[] patientCarerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(patientCarerArray, PATIENTCARER$0);
        }
    }
    
    /**
     * Sets ith "PatientCarer" element
     */
    public void setPatientCarerArray(int i, eu.aladdin_project.xsd.PatientCarer patientCarer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.PatientCarer target = null;
            target = (eu.aladdin_project.xsd.PatientCarer)get_store().find_element_user(PATIENTCARER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(patientCarer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PatientCarer" element
     */
    public eu.aladdin_project.xsd.PatientCarer insertNewPatientCarer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.PatientCarer target = null;
            target = (eu.aladdin_project.xsd.PatientCarer)get_store().insert_element_user(PATIENTCARER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PatientCarer" element
     */
    public eu.aladdin_project.xsd.PatientCarer addNewPatientCarer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.xsd.PatientCarer target = null;
            target = (eu.aladdin_project.xsd.PatientCarer)get_store().add_element_user(PATIENTCARER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PatientCarer" element
     */
    public void removePatientCarer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENTCARER$0, i);
        }
    }
}
