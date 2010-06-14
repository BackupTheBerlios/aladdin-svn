/*
 * An XML document type.
 * Localname: UpdateAdministratorResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.UpdateAdministratorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one UpdateAdministratorResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class UpdateAdministratorResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdateAdministratorResponseDocument
{
    
    public UpdateAdministratorResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEADMINISTRATORRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "UpdateAdministratorResponse");
    
    
    /**
     * Gets the "UpdateAdministratorResponse" element
     */
    public eu.aladdin_project.scgen.UpdateAdministratorResponseDocument.UpdateAdministratorResponse getUpdateAdministratorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateAdministratorResponseDocument.UpdateAdministratorResponse target = null;
            target = (eu.aladdin_project.scgen.UpdateAdministratorResponseDocument.UpdateAdministratorResponse)get_store().find_element_user(UPDATEADMINISTRATORRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateAdministratorResponse" element
     */
    public void setUpdateAdministratorResponse(eu.aladdin_project.scgen.UpdateAdministratorResponseDocument.UpdateAdministratorResponse updateAdministratorResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateAdministratorResponseDocument.UpdateAdministratorResponse target = null;
            target = (eu.aladdin_project.scgen.UpdateAdministratorResponseDocument.UpdateAdministratorResponse)get_store().find_element_user(UPDATEADMINISTRATORRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.UpdateAdministratorResponseDocument.UpdateAdministratorResponse)get_store().add_element_user(UPDATEADMINISTRATORRESPONSE$0);
            }
            target.set(updateAdministratorResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateAdministratorResponse" element
     */
    public eu.aladdin_project.scgen.UpdateAdministratorResponseDocument.UpdateAdministratorResponse addNewUpdateAdministratorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateAdministratorResponseDocument.UpdateAdministratorResponse target = null;
            target = (eu.aladdin_project.scgen.UpdateAdministratorResponseDocument.UpdateAdministratorResponse)get_store().add_element_user(UPDATEADMINISTRATORRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateAdministratorResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class UpdateAdministratorResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdateAdministratorResponseDocument.UpdateAdministratorResponse
    {
        
        public UpdateAdministratorResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
