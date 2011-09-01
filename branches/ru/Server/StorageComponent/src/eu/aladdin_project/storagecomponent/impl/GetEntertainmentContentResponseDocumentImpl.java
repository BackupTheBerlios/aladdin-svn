/*
 * An XML document type.
 * Localname: GetEntertainmentContentResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetEntertainmentContentResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetEntertainmentContentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument
{
    
    public GetEntertainmentContentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETENTERTAINMENTCONTENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetEntertainmentContentResponse");
    
    
    /**
     * Gets the "GetEntertainmentContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument.GetEntertainmentContentResponse getGetEntertainmentContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument.GetEntertainmentContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument.GetEntertainmentContentResponse)get_store().find_element_user(GETENTERTAINMENTCONTENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetEntertainmentContentResponse" element
     */
    public void setGetEntertainmentContentResponse(eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument.GetEntertainmentContentResponse getEntertainmentContentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument.GetEntertainmentContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument.GetEntertainmentContentResponse)get_store().find_element_user(GETENTERTAINMENTCONTENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument.GetEntertainmentContentResponse)get_store().add_element_user(GETENTERTAINMENTCONTENTRESPONSE$0);
            }
            target.set(getEntertainmentContentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetEntertainmentContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument.GetEntertainmentContentResponse addNewGetEntertainmentContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument.GetEntertainmentContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument.GetEntertainmentContentResponse)get_store().add_element_user(GETENTERTAINMENTCONTENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetEntertainmentContentResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetEntertainmentContentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetEntertainmentContentResponseDocument.GetEntertainmentContentResponse
    {
        
        public GetEntertainmentContentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.EntertainmentContent[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.EntertainmentContent[] result = new eu.aladdin_project.xsd.EntertainmentContent[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.EntertainmentContent getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.EntertainmentContent target = null;
                target = (eu.aladdin_project.xsd.EntertainmentContent)get_store().find_element_user(OUT$0, i);
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
        public void setOutArray(eu.aladdin_project.xsd.EntertainmentContent[] outArray)
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
        public void setOutArray(int i, eu.aladdin_project.xsd.EntertainmentContent out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.EntertainmentContent target = null;
                target = (eu.aladdin_project.xsd.EntertainmentContent)get_store().find_element_user(OUT$0, i);
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
        public eu.aladdin_project.xsd.EntertainmentContent insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.EntertainmentContent target = null;
                target = (eu.aladdin_project.xsd.EntertainmentContent)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        public eu.aladdin_project.xsd.EntertainmentContent addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.EntertainmentContent target = null;
                target = (eu.aladdin_project.xsd.EntertainmentContent)get_store().add_element_user(OUT$0);
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
