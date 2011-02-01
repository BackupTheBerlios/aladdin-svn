/*
 * An XML document type.
 * Localname: GetPatientResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetPatientResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetPatientResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetPatientResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientResponseDocument
{
    
    public GetPatientResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPATIENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetPatientResponse");
    
    
    /**
     * Gets the "GetPatientResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse getGetPatientResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse)get_store().find_element_user(GETPATIENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetPatientResponse" element
     */
    public void setGetPatientResponse(eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse getPatientResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse)get_store().find_element_user(GETPATIENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse)get_store().add_element_user(GETPATIENTRESPONSE$0);
            }
            target.set(getPatientResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetPatientResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse addNewGetPatientResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse)get_store().add_element_user(GETPATIENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetPatientResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetPatientResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetPatientResponseDocument.GetPatientResponse
    {
        
        public GetPatientResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public eu.aladdin_project.xsd.Patient getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Patient target = null;
                target = (eu.aladdin_project.xsd.Patient)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "out" element
         */
        public void setOut(eu.aladdin_project.xsd.Patient out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Patient target = null;
                target = (eu.aladdin_project.xsd.Patient)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Patient)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public eu.aladdin_project.xsd.Patient addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Patient target = null;
                target = (eu.aladdin_project.xsd.Patient)get_store().add_element_user(OUT$0);
                return target;
            }
        }
    }
}
