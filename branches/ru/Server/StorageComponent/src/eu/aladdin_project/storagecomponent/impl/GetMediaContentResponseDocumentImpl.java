/*
 * An XML document type.
 * Localname: GetMediaContentResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetMediaContentResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetMediaContentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument
{
    
    public GetMediaContentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMEDIACONTENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetMediaContentResponse");
    
    
    /**
     * Gets the "GetMediaContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument.GetMediaContentResponse getGetMediaContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument.GetMediaContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument.GetMediaContentResponse)get_store().find_element_user(GETMEDIACONTENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMediaContentResponse" element
     */
    public void setGetMediaContentResponse(eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument.GetMediaContentResponse getMediaContentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument.GetMediaContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument.GetMediaContentResponse)get_store().find_element_user(GETMEDIACONTENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument.GetMediaContentResponse)get_store().add_element_user(GETMEDIACONTENTRESPONSE$0);
            }
            target.set(getMediaContentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMediaContentResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument.GetMediaContentResponse addNewGetMediaContentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument.GetMediaContentResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument.GetMediaContentResponse)get_store().add_element_user(GETMEDIACONTENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetMediaContentResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetMediaContentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetMediaContentResponseDocument.GetMediaContentResponse
    {
        
        public GetMediaContentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets array of all "out" elements
         */
        public eu.aladdin_project.xsd.MediaContent[] getOutArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUT$0, targetList);
                eu.aladdin_project.xsd.MediaContent[] result = new eu.aladdin_project.xsd.MediaContent[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out" element
         */
        public eu.aladdin_project.xsd.MediaContent getOutArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.MediaContent target = null;
                target = (eu.aladdin_project.xsd.MediaContent)get_store().find_element_user(OUT$0, i);
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
        public void setOutArray(eu.aladdin_project.xsd.MediaContent[] outArray)
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
        public void setOutArray(int i, eu.aladdin_project.xsd.MediaContent out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.MediaContent target = null;
                target = (eu.aladdin_project.xsd.MediaContent)get_store().find_element_user(OUT$0, i);
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
        public eu.aladdin_project.xsd.MediaContent insertNewOut(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.MediaContent target = null;
                target = (eu.aladdin_project.xsd.MediaContent)get_store().insert_element_user(OUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out" element
         */
        public eu.aladdin_project.xsd.MediaContent addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.MediaContent target = null;
                target = (eu.aladdin_project.xsd.MediaContent)get_store().add_element_user(OUT$0);
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
