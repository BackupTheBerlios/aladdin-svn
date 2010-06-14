/*
 * An XML document type.
 * Localname: GetAdministratorResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetAdministratorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetAdministratorResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetAdministratorResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetAdministratorResponseDocument
{
    
    public GetAdministratorResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETADMINISTRATORRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetAdministratorResponse");
    
    
    /**
     * Gets the "GetAdministratorResponse" element
     */
    public eu.aladdin_project.scgen.GetAdministratorResponseDocument.GetAdministratorResponse getGetAdministratorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetAdministratorResponseDocument.GetAdministratorResponse target = null;
            target = (eu.aladdin_project.scgen.GetAdministratorResponseDocument.GetAdministratorResponse)get_store().find_element_user(GETADMINISTRATORRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAdministratorResponse" element
     */
    public void setGetAdministratorResponse(eu.aladdin_project.scgen.GetAdministratorResponseDocument.GetAdministratorResponse getAdministratorResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetAdministratorResponseDocument.GetAdministratorResponse target = null;
            target = (eu.aladdin_project.scgen.GetAdministratorResponseDocument.GetAdministratorResponse)get_store().find_element_user(GETADMINISTRATORRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetAdministratorResponseDocument.GetAdministratorResponse)get_store().add_element_user(GETADMINISTRATORRESPONSE$0);
            }
            target.set(getAdministratorResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAdministratorResponse" element
     */
    public eu.aladdin_project.scgen.GetAdministratorResponseDocument.GetAdministratorResponse addNewGetAdministratorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetAdministratorResponseDocument.GetAdministratorResponse target = null;
            target = (eu.aladdin_project.scgen.GetAdministratorResponseDocument.GetAdministratorResponse)get_store().add_element_user(GETADMINISTRATORRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetAdministratorResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetAdministratorResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetAdministratorResponseDocument.GetAdministratorResponse
    {
        
        public GetAdministratorResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
