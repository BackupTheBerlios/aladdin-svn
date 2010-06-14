/*
 * An XML document type.
 * Localname: ListOfPossibleTasksResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one ListOfPossibleTasksResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class ListOfPossibleTasksResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument
{
    
    public ListOfPossibleTasksResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFPOSSIBLETASKSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "ListOfPossibleTasksResponse");
    
    
    /**
     * Gets the "ListOfPossibleTasksResponse" element
     */
    public eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse getListOfPossibleTasksResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse target = null;
            target = (eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse)get_store().find_element_user(LISTOFPOSSIBLETASKSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfPossibleTasksResponse" element
     */
    public void setListOfPossibleTasksResponse(eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse listOfPossibleTasksResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse target = null;
            target = (eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse)get_store().find_element_user(LISTOFPOSSIBLETASKSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse)get_store().add_element_user(LISTOFPOSSIBLETASKSRESPONSE$0);
            }
            target.set(listOfPossibleTasksResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ListOfPossibleTasksResponse" element
     */
    public eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse addNewListOfPossibleTasksResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse target = null;
            target = (eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse)get_store().add_element_user(LISTOFPOSSIBLETASKSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfPossibleTasksResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class ListOfPossibleTasksResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ListOfPossibleTasksResponseDocument.ListOfPossibleTasksResponse
    {
        
        public ListOfPossibleTasksResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
