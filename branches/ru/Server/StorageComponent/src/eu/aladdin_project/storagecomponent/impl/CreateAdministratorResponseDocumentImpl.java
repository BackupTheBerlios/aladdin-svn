/*
 * An XML document type.
 * Localname: CreateAdministratorResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one CreateAdministratorResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class CreateAdministratorResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument
{
    
    public CreateAdministratorResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEADMINISTRATORRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "CreateAdministratorResponse");
    
    
    /**
     * Gets the "CreateAdministratorResponse" element
     */
    public eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse getCreateAdministratorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse target = null;
            target = (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse)get_store().find_element_user(CREATEADMINISTRATORRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateAdministratorResponse" element
     */
    public void setCreateAdministratorResponse(eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse createAdministratorResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse target = null;
            target = (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse)get_store().find_element_user(CREATEADMINISTRATORRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse)get_store().add_element_user(CREATEADMINISTRATORRESPONSE$0);
            }
            target.set(createAdministratorResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateAdministratorResponse" element
     */
    public eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse addNewCreateAdministratorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse target = null;
            target = (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse)get_store().add_element_user(CREATEADMINISTRATORRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateAdministratorResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class CreateAdministratorResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse
    {
        
        public CreateAdministratorResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OUT$0 = 
            new javax.xml.namespace.QName("", "out");
        
        
        /**
         * Gets the "out" element
         */
        public eu.aladdin_project.xsd.OperationResult getOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.OperationResult target = null;
                target = (eu.aladdin_project.xsd.OperationResult)get_store().find_element_user(OUT$0, 0);
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
        public void setOut(eu.aladdin_project.xsd.OperationResult out)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.OperationResult target = null;
                target = (eu.aladdin_project.xsd.OperationResult)get_store().find_element_user(OUT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.OperationResult)get_store().add_element_user(OUT$0);
                }
                target.set(out);
            }
        }
        
        /**
         * Appends and returns a new empty "out" element
         */
        public eu.aladdin_project.xsd.OperationResult addNewOut()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.OperationResult target = null;
                target = (eu.aladdin_project.xsd.OperationResult)get_store().add_element_user(OUT$0);
                return target;
            }
        }
    }
}
