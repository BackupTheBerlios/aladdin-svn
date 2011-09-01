/*
 * An XML document type.
 * Localname: GetCarerAssessmentsResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetCarerAssessmentsResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetCarerAssessmentsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument
{
    
    public GetCarerAssessmentsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARERASSESSMENTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetCarerAssessmentsResponse");
    
    
    /**
     * Gets the "GetCarerAssessmentsResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse getGetCarerAssessmentsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse)get_store().find_element_user(GETCARERASSESSMENTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCarerAssessmentsResponse" element
     */
    public void setGetCarerAssessmentsResponse(eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse getCarerAssessmentsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse)get_store().find_element_user(GETCARERASSESSMENTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse)get_store().add_element_user(GETCARERASSESSMENTSRESPONSE$0);
            }
            target.set(getCarerAssessmentsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCarerAssessmentsResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse addNewGetCarerAssessmentsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse)get_store().add_element_user(GETCARERASSESSMENTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetCarerAssessmentsResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetCarerAssessmentsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetCarerAssessmentsResponseDocument.GetCarerAssessmentsResponse
    {
        
        public GetCarerAssessmentsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.CarerAssessment[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.CarerAssessment[] result = new eu.aladdin_project.xsd.CarerAssessment[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.CarerAssessment getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerAssessment target = null;
                target = (eu.aladdin_project.xsd.CarerAssessment)get_store().find_element_user(OUT$0, i);
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
        public void setOutArray(eu.aladdin_project.xsd.CarerAssessment[] outArray)
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
        public void setOutArray(int i, eu.aladdin_project.xsd.CarerAssessment out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerAssessment target = null;
                target = (eu.aladdin_project.xsd.CarerAssessment)get_store().find_element_user(OUT$0, i);
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
        public eu.aladdin_project.xsd.CarerAssessment insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerAssessment target = null;
                target = (eu.aladdin_project.xsd.CarerAssessment)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        public eu.aladdin_project.xsd.CarerAssessment addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerAssessment target = null;
                target = (eu.aladdin_project.xsd.CarerAssessment)get_store().add_element_user(OUT$0);
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
