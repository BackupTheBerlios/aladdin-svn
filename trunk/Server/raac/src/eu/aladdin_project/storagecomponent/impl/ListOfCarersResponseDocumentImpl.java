/*
 * An XML document type.
 * Localname: ListOfCarersResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one ListOfCarersResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class ListOfCarersResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument
{
    
    public ListOfCarersResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCARERSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "ListOfCarersResponse");
    
    
    /**
     * Gets the "ListOfCarersResponse" element
     */
    public eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse getListOfCarersResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse)get_store().find_element_user(LISTOFCARERSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfCarersResponse" element
     */
    public void setListOfCarersResponse(eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse listOfCarersResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse)get_store().find_element_user(LISTOFCARERSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse)get_store().add_element_user(LISTOFCARERSRESPONSE$0);
            }
            target.set(listOfCarersResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ListOfCarersResponse" element
     */
    public eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse addNewListOfCarersResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse target = null;
            target = (eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse)get_store().add_element_user(LISTOFCARERSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfCarersResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class ListOfCarersResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.ListOfCarersResponseDocument.ListOfCarersResponse
    {
        
        public ListOfCarersResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.CarerInfo[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.CarerInfo[] result = new eu.aladdin_project.xsd.CarerInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.CarerInfo getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerInfo target = null;
                target = (eu.aladdin_project.xsd.CarerInfo)get_store().find_element_user(OUT$0, i);
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
        public void setOutArray(eu.aladdin_project.xsd.CarerInfo[] outArray)
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
        public void setOutArray(int i, eu.aladdin_project.xsd.CarerInfo out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerInfo target = null;
                target = (eu.aladdin_project.xsd.CarerInfo)get_store().find_element_user(OUT$0, i);
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
        public eu.aladdin_project.xsd.CarerInfo insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerInfo target = null;
                target = (eu.aladdin_project.xsd.CarerInfo)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        public eu.aladdin_project.xsd.CarerInfo addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.CarerInfo target = null;
                target = (eu.aladdin_project.xsd.CarerInfo)get_store().add_element_user(OUT$0);
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
