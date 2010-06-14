/*
 * An XML document type.
 * Localname: GetWarningsResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetWarningsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetWarningsResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetWarningsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetWarningsResponseDocument
{
    
    public GetWarningsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWARNINGSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetWarningsResponse");
    
    
    /**
     * Gets the "GetWarningsResponse" element
     */
    public eu.aladdin_project.scgen.GetWarningsResponseDocument.GetWarningsResponse getGetWarningsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetWarningsResponseDocument.GetWarningsResponse target = null;
            target = (eu.aladdin_project.scgen.GetWarningsResponseDocument.GetWarningsResponse)get_store().find_element_user(GETWARNINGSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetWarningsResponse" element
     */
    public void setGetWarningsResponse(eu.aladdin_project.scgen.GetWarningsResponseDocument.GetWarningsResponse getWarningsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetWarningsResponseDocument.GetWarningsResponse target = null;
            target = (eu.aladdin_project.scgen.GetWarningsResponseDocument.GetWarningsResponse)get_store().find_element_user(GETWARNINGSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetWarningsResponseDocument.GetWarningsResponse)get_store().add_element_user(GETWARNINGSRESPONSE$0);
            }
            target.set(getWarningsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetWarningsResponse" element
     */
    public eu.aladdin_project.scgen.GetWarningsResponseDocument.GetWarningsResponse addNewGetWarningsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetWarningsResponseDocument.GetWarningsResponse target = null;
            target = (eu.aladdin_project.scgen.GetWarningsResponseDocument.GetWarningsResponse)get_store().add_element_user(GETWARNINGSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetWarningsResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetWarningsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetWarningsResponseDocument.GetWarningsResponse
    {
        
        public GetWarningsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.Warning[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.Warning[] result = new eu.aladdin_project.xsd.Warning[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.Warning getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Warning target = null;
                target = (eu.aladdin_project.xsd.Warning)get_store().find_element_user(OUT$0, i);
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
        public void setOutArray(eu.aladdin_project.xsd.Warning[] outArray)
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
        public void setOutArray(int i, eu.aladdin_project.xsd.Warning out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Warning target = null;
                target = (eu.aladdin_project.xsd.Warning)get_store().find_element_user(OUT$0, i);
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
        public eu.aladdin_project.xsd.Warning insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Warning target = null;
                target = (eu.aladdin_project.xsd.Warning)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        public eu.aladdin_project.xsd.Warning addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Warning target = null;
                target = (eu.aladdin_project.xsd.Warning)get_store().add_element_user(OUT$0);
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
