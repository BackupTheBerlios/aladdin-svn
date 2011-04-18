/*
 * An XML document type.
 * Localname: getAvailableCarersResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one getAvailableCarersResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetAvailableCarersResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument
{
    
    public GetAvailableCarersResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAVAILABLECARERSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "getAvailableCarersResponse");
    
    
    /**
     * Gets the "getAvailableCarersResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument.GetAvailableCarersResponse getGetAvailableCarersResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument.GetAvailableCarersResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument.GetAvailableCarersResponse)get_store().find_element_user(GETAVAILABLECARERSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAvailableCarersResponse" element
     */
    public void setGetAvailableCarersResponse(eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument.GetAvailableCarersResponse getAvailableCarersResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument.GetAvailableCarersResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument.GetAvailableCarersResponse)get_store().find_element_user(GETAVAILABLECARERSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument.GetAvailableCarersResponse)get_store().add_element_user(GETAVAILABLECARERSRESPONSE$0);
            }
            target.set(getAvailableCarersResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getAvailableCarersResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument.GetAvailableCarersResponse addNewGetAvailableCarersResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument.GetAvailableCarersResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument.GetAvailableCarersResponse)get_store().add_element_user(GETAVAILABLECARERSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getAvailableCarersResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetAvailableCarersResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetAvailableCarersResponseDocument.GetAvailableCarersResponse
    {
        
        public GetAvailableCarersResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.Carer[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.Carer[] result = new eu.aladdin_project.xsd.Carer[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.Carer getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Carer target = null;
                target = (eu.aladdin_project.xsd.Carer)get_store().find_element_user(OUT$0, i);
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
        public void setOutArray(eu.aladdin_project.xsd.Carer[] outArray)
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
        public void setOutArray(int i, eu.aladdin_project.xsd.Carer out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Carer target = null;
                target = (eu.aladdin_project.xsd.Carer)get_store().find_element_user(OUT$0, i);
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
        public eu.aladdin_project.xsd.Carer insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Carer target = null;
                target = (eu.aladdin_project.xsd.Carer)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        public eu.aladdin_project.xsd.Carer addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Carer target = null;
                target = (eu.aladdin_project.xsd.Carer)get_store().add_element_user(OUT$0);
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
