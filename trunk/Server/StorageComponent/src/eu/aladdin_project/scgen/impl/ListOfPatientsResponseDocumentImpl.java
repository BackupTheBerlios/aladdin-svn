/*
 * An XML document type.
 * Localname: ListOfPatientsResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.ListOfPatientsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one ListOfPatientsResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class ListOfPatientsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ListOfPatientsResponseDocument
{
    
    public ListOfPatientsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFPATIENTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "ListOfPatientsResponse");
    
    
    /**
     * Gets the "ListOfPatientsResponse" element
     */
    public eu.aladdin_project.scgen.ListOfPatientsResponseDocument.ListOfPatientsResponse getListOfPatientsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfPatientsResponseDocument.ListOfPatientsResponse target = null;
            target = (eu.aladdin_project.scgen.ListOfPatientsResponseDocument.ListOfPatientsResponse)get_store().find_element_user(LISTOFPATIENTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfPatientsResponse" element
     */
    public void setListOfPatientsResponse(eu.aladdin_project.scgen.ListOfPatientsResponseDocument.ListOfPatientsResponse listOfPatientsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfPatientsResponseDocument.ListOfPatientsResponse target = null;
            target = (eu.aladdin_project.scgen.ListOfPatientsResponseDocument.ListOfPatientsResponse)get_store().find_element_user(LISTOFPATIENTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.ListOfPatientsResponseDocument.ListOfPatientsResponse)get_store().add_element_user(LISTOFPATIENTSRESPONSE$0);
            }
            target.set(listOfPatientsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ListOfPatientsResponse" element
     */
    public eu.aladdin_project.scgen.ListOfPatientsResponseDocument.ListOfPatientsResponse addNewListOfPatientsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfPatientsResponseDocument.ListOfPatientsResponse target = null;
            target = (eu.aladdin_project.scgen.ListOfPatientsResponseDocument.ListOfPatientsResponse)get_store().add_element_user(LISTOFPATIENTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfPatientsResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class ListOfPatientsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ListOfPatientsResponseDocument.ListOfPatientsResponse
    {
        
        public ListOfPatientsResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
