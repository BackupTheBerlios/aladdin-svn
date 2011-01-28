/*
 * An XML document type.
 * Localname: ListOfSupportedLocalesResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one ListOfSupportedLocalesResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class ListOfSupportedLocalesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument
{
    
    public ListOfSupportedLocalesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFSUPPORTEDLOCALESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "ListOfSupportedLocalesResponse");
    
    
    /**
     * Gets the "ListOfSupportedLocalesResponse" element
     */
    public eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument.ListOfSupportedLocalesResponse getListOfSupportedLocalesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument.ListOfSupportedLocalesResponse target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument.ListOfSupportedLocalesResponse)get_store().find_element_user(LISTOFSUPPORTEDLOCALESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfSupportedLocalesResponse" element
     */
    public void setListOfSupportedLocalesResponse(eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument.ListOfSupportedLocalesResponse listOfSupportedLocalesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument.ListOfSupportedLocalesResponse target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument.ListOfSupportedLocalesResponse)get_store().find_element_user(LISTOFSUPPORTEDLOCALESRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument.ListOfSupportedLocalesResponse)get_store().add_element_user(LISTOFSUPPORTEDLOCALESRESPONSE$0);
            }
            target.set(listOfSupportedLocalesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ListOfSupportedLocalesResponse" element
     */
    public eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument.ListOfSupportedLocalesResponse addNewListOfSupportedLocalesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument.ListOfSupportedLocalesResponse target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument.ListOfSupportedLocalesResponse)get_store().add_element_user(LISTOFSUPPORTEDLOCALESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfSupportedLocalesResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class ListOfSupportedLocalesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ListOfSupportedLocalesResponseDocument.ListOfSupportedLocalesResponse
    {
        
        public ListOfSupportedLocalesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.SystemParameter[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.SystemParameter[] result = new eu.aladdin_project.xsd.SystemParameter[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.SystemParameter getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(OUT$0, i);
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
        public void setOutArray(eu.aladdin_project.xsd.SystemParameter[] outArray)
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
        public void setOutArray(int i, eu.aladdin_project.xsd.SystemParameter out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().find_element_user(OUT$0, i);
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
        public eu.aladdin_project.xsd.SystemParameter insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        public eu.aladdin_project.xsd.SystemParameter addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.SystemParameter target = null;
                target = (eu.aladdin_project.xsd.SystemParameter)get_store().add_element_user(OUT$0);
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
