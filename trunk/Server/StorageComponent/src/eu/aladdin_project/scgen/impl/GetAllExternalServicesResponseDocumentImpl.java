/*
 * An XML document type.
 * Localname: GetAllExternalServicesResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetAllExternalServicesResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetAllExternalServicesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument
{
    
    public GetAllExternalServicesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALLEXTERNALSERVICESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetAllExternalServicesResponse");
    
    
    /**
     * Gets the "GetAllExternalServicesResponse" element
     */
    public eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse getGetAllExternalServicesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse target = null;
            target = (eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse)get_store().find_element_user(GETALLEXTERNALSERVICESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAllExternalServicesResponse" element
     */
    public void setGetAllExternalServicesResponse(eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse getAllExternalServicesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse target = null;
            target = (eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse)get_store().find_element_user(GETALLEXTERNALSERVICESRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse)get_store().add_element_user(GETALLEXTERNALSERVICESRESPONSE$0);
            }
            target.set(getAllExternalServicesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAllExternalServicesResponse" element
     */
    public eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse addNewGetAllExternalServicesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse target = null;
            target = (eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse)get_store().add_element_user(GETALLEXTERNALSERVICESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetAllExternalServicesResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetAllExternalServicesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetAllExternalServicesResponseDocument.GetAllExternalServicesResponse
    {
        
        public GetAllExternalServicesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.ExternalService[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.ExternalService[] result = new eu.aladdin_project.xsd.ExternalService[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.ExternalService getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.ExternalService target = null;
                target = (eu.aladdin_project.xsd.ExternalService)get_store().find_element_user(OUT$0, i);
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
        public void setOutArray(eu.aladdin_project.xsd.ExternalService[] outArray)
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
        public void setOutArray(int i, eu.aladdin_project.xsd.ExternalService out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.ExternalService target = null;
                target = (eu.aladdin_project.xsd.ExternalService)get_store().find_element_user(OUT$0, i);
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
        public eu.aladdin_project.xsd.ExternalService insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.ExternalService target = null;
                target = (eu.aladdin_project.xsd.ExternalService)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        public eu.aladdin_project.xsd.ExternalService addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.ExternalService target = null;
                target = (eu.aladdin_project.xsd.ExternalService)get_store().add_element_user(OUT$0);
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
