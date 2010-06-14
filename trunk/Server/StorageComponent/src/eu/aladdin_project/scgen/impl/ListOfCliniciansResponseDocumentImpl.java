/*
 * An XML document type.
 * Localname: ListOfCliniciansResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.ListOfCliniciansResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one ListOfCliniciansResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class ListOfCliniciansResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ListOfCliniciansResponseDocument
{
    
    public ListOfCliniciansResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCLINICIANSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "ListOfCliniciansResponse");
    
    
    /**
     * Gets the "ListOfCliniciansResponse" element
     */
    public eu.aladdin_project.scgen.ListOfCliniciansResponseDocument.ListOfCliniciansResponse getListOfCliniciansResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfCliniciansResponseDocument.ListOfCliniciansResponse target = null;
            target = (eu.aladdin_project.scgen.ListOfCliniciansResponseDocument.ListOfCliniciansResponse)get_store().find_element_user(LISTOFCLINICIANSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfCliniciansResponse" element
     */
    public void setListOfCliniciansResponse(eu.aladdin_project.scgen.ListOfCliniciansResponseDocument.ListOfCliniciansResponse listOfCliniciansResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfCliniciansResponseDocument.ListOfCliniciansResponse target = null;
            target = (eu.aladdin_project.scgen.ListOfCliniciansResponseDocument.ListOfCliniciansResponse)get_store().find_element_user(LISTOFCLINICIANSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.ListOfCliniciansResponseDocument.ListOfCliniciansResponse)get_store().add_element_user(LISTOFCLINICIANSRESPONSE$0);
            }
            target.set(listOfCliniciansResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ListOfCliniciansResponse" element
     */
    public eu.aladdin_project.scgen.ListOfCliniciansResponseDocument.ListOfCliniciansResponse addNewListOfCliniciansResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ListOfCliniciansResponseDocument.ListOfCliniciansResponse target = null;
            target = (eu.aladdin_project.scgen.ListOfCliniciansResponseDocument.ListOfCliniciansResponse)get_store().add_element_user(LISTOFCLINICIANSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ListOfCliniciansResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class ListOfCliniciansResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ListOfCliniciansResponseDocument.ListOfCliniciansResponse
    {
        
        public ListOfCliniciansResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.ClinicianInfo[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.ClinicianInfo[] result = new eu.aladdin_project.xsd.ClinicianInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.ClinicianInfo getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.ClinicianInfo target = null;
                target = (eu.aladdin_project.xsd.ClinicianInfo)get_store().find_element_user(OUT$0, i);
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
        public void setOutArray(eu.aladdin_project.xsd.ClinicianInfo[] outArray)
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
        public void setOutArray(int i, eu.aladdin_project.xsd.ClinicianInfo out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.ClinicianInfo target = null;
                target = (eu.aladdin_project.xsd.ClinicianInfo)get_store().find_element_user(OUT$0, i);
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
        public eu.aladdin_project.xsd.ClinicianInfo insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.ClinicianInfo target = null;
                target = (eu.aladdin_project.xsd.ClinicianInfo)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        public eu.aladdin_project.xsd.ClinicianInfo addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.ClinicianInfo target = null;
                target = (eu.aladdin_project.xsd.ClinicianInfo)get_store().add_element_user(OUT$0);
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
