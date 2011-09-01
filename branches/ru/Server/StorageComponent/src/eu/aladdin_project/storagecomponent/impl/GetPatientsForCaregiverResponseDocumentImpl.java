/*
 * An XML document type.
 * Localname: GetPatientsForCaregiverResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetPatientsForCaregiverResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetPatientsForCaregiverResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument
{
    
    public GetPatientsForCaregiverResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPATIENTSFORCAREGIVERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetPatientsForCaregiverResponse");
    
    
    /**
     * Gets the "GetPatientsForCaregiverResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse getGetPatientsForCaregiverResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse)get_store().find_element_user(GETPATIENTSFORCAREGIVERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPatientsForCaregiverResponse" element
     */
    public void setGetPatientsForCaregiverResponse(eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse getPatientsForCaregiverResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse)get_store().find_element_user(GETPATIENTSFORCAREGIVERRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse)get_store().add_element_user(GETPATIENTSFORCAREGIVERRESPONSE$0);
            }
            target.set(getPatientsForCaregiverResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPatientsForCaregiverResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse addNewGetPatientsForCaregiverResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse)get_store().add_element_user(GETPATIENTSFORCAREGIVERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetPatientsForCaregiverResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetPatientsForCaregiverResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientsForCaregiverResponseDocument.GetPatientsForCaregiverResponse
    {
        
        public GetPatientsForCaregiverResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.PatientInfo[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.PatientInfo[] result = new eu.aladdin_project.xsd.PatientInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.PatientInfo getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.PatientInfo target = null;
                target = (eu.aladdin_project.xsd.PatientInfo)get_store().find_element_user(OUT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "out" element
         */
        public int sizeOfOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUT$0);
            }
        }
        
        /**
         * Sets array of all "out" element
         */
        public void setOutArray(eu.aladdin_project.xsd.PatientInfo[] outArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(outArray, OUT$0);
            }
        }
        
        /**
         * Sets ith "out" element
         */
        public void setOutArray(int i, eu.aladdin_project.xsd.PatientInfo out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.PatientInfo target = null;
                target = (eu.aladdin_project.xsd.PatientInfo)get_store().find_element_user(OUT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(out);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "out" element
         */
        public eu.aladdin_project.xsd.PatientInfo insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.PatientInfo target = null;
                target = (eu.aladdin_project.xsd.PatientInfo)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        public eu.aladdin_project.xsd.PatientInfo addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.PatientInfo target = null;
                target = (eu.aladdin_project.xsd.PatientInfo)get_store().add_element_user(OUT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "out" element
         */
        public void removeOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUT$0, i);
            }
        }
    }
}
