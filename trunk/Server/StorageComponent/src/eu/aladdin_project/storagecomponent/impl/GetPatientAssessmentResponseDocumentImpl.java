/*
 * An XML document type.
 * Localname: GetPatientAssessmentResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetPatientAssessmentResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetPatientAssessmentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument
{
    
    public GetPatientAssessmentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPATIENTASSESSMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetPatientAssessmentResponse");
    
    
    /**
     * Gets the "GetPatientAssessmentResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument.GetPatientAssessmentResponse getGetPatientAssessmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument.GetPatientAssessmentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument.GetPatientAssessmentResponse)get_store().find_element_user(GETPATIENTASSESSMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPatientAssessmentResponse" element
     */
    public void setGetPatientAssessmentResponse(eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument.GetPatientAssessmentResponse getPatientAssessmentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument.GetPatientAssessmentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument.GetPatientAssessmentResponse)get_store().find_element_user(GETPATIENTASSESSMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument.GetPatientAssessmentResponse)get_store().add_element_user(GETPATIENTASSESSMENTRESPONSE$0);
            }
            target.set(getPatientAssessmentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPatientAssessmentResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument.GetPatientAssessmentResponse addNewGetPatientAssessmentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument.GetPatientAssessmentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument.GetPatientAssessmentResponse)get_store().add_element_user(GETPATIENTASSESSMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetPatientAssessmentResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetPatientAssessmentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientAssessmentResponseDocument.GetPatientAssessmentResponse
    {
        
        public GetPatientAssessmentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.PatientAssessment[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.PatientAssessment[] result = new eu.aladdin_project.xsd.PatientAssessment[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.PatientAssessment getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.PatientAssessment target = null;
                target = (eu.aladdin_project.xsd.PatientAssessment)get_store().find_element_user(OUT$0, i);
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
        public void setOutArray(eu.aladdin_project.xsd.PatientAssessment[] outArray)
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
        public void setOutArray(int i, eu.aladdin_project.xsd.PatientAssessment out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.PatientAssessment target = null;
                target = (eu.aladdin_project.xsd.PatientAssessment)get_store().find_element_user(OUT$0, i);
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
        public eu.aladdin_project.xsd.PatientAssessment insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.PatientAssessment target = null;
                target = (eu.aladdin_project.xsd.PatientAssessment)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        public eu.aladdin_project.xsd.PatientAssessment addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.PatientAssessment target = null;
                target = (eu.aladdin_project.xsd.PatientAssessment)get_store().add_element_user(OUT$0);
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
