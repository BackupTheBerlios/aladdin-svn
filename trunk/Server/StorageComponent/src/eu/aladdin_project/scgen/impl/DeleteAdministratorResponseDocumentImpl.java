/*
 * An XML document type.
 * Localname: DeleteAdministratorResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.DeleteAdministratorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one DeleteAdministratorResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class DeleteAdministratorResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeleteAdministratorResponseDocument
{
    
    public DeleteAdministratorResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEADMINISTRATORRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "DeleteAdministratorResponse");
    
    
    /**
     * Gets the "DeleteAdministratorResponse" element
     */
    public eu.aladdin_project.scgen.DeleteAdministratorResponseDocument.DeleteAdministratorResponse getDeleteAdministratorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteAdministratorResponseDocument.DeleteAdministratorResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteAdministratorResponseDocument.DeleteAdministratorResponse)get_store().find_element_user(DELETEADMINISTRATORRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteAdministratorResponse" element
     */
    public void setDeleteAdministratorResponse(eu.aladdin_project.scgen.DeleteAdministratorResponseDocument.DeleteAdministratorResponse deleteAdministratorResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteAdministratorResponseDocument.DeleteAdministratorResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteAdministratorResponseDocument.DeleteAdministratorResponse)get_store().find_element_user(DELETEADMINISTRATORRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.DeleteAdministratorResponseDocument.DeleteAdministratorResponse)get_store().add_element_user(DELETEADMINISTRATORRESPONSE$0);
            }
            target.set(deleteAdministratorResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteAdministratorResponse" element
     */
    public eu.aladdin_project.scgen.DeleteAdministratorResponseDocument.DeleteAdministratorResponse addNewDeleteAdministratorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.DeleteAdministratorResponseDocument.DeleteAdministratorResponse target = null;
            target = (eu.aladdin_project.scgen.DeleteAdministratorResponseDocument.DeleteAdministratorResponse)get_store().add_element_user(DELETEADMINISTRATORRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DeleteAdministratorResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class DeleteAdministratorResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.DeleteAdministratorResponseDocument.DeleteAdministratorResponse
    {
        
        public DeleteAdministratorResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
