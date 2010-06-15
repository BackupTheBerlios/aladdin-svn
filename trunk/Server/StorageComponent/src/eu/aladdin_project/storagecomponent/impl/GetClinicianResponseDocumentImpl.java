/*
 * An XML document type.
 * Localname: GetClinicianResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetClinicianResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one GetClinicianResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class GetClinicianResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetClinicianResponseDocument
{
    
    public GetClinicianResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCLINICIANRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "GetClinicianResponse");
    
    
    /**
     * Gets the "GetClinicianResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse getGetClinicianResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse)get_store().find_element_user(GETCLINICIANRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetClinicianResponse" element
     */
    public void setGetClinicianResponse(eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse getClinicianResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse)get_store().find_element_user(GETCLINICIANRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse)get_store().add_element_user(GETCLINICIANRESPONSE$0);
            }
            target.set(getClinicianResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetClinicianResponse" element
     */
    public eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse addNewGetClinicianResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse target = null;
            target = (eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse)get_store().add_element_user(GETCLINICIANRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetClinicianResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class GetClinicianResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.GetClinicianResponseDocument.GetClinicianResponse
    {
        
        public GetClinicianResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public eu.aladdin_project.xsd.Clinician getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Clinician target = null;
                target = (eu.aladdin_project.xsd.Clinician)get_store().find_element_user(OUT$0, 0);
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
        public void setOut(eu.aladdin_project.xsd.Clinician out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Clinician target = null;
                target = (eu.aladdin_project.xsd.Clinician)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Clinician)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public eu.aladdin_project.xsd.Clinician addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Clinician target = null;
                target = (eu.aladdin_project.xsd.Clinician)get_store().add_element_user(OUT$0);
                return target;
            }
        }
    }
}
