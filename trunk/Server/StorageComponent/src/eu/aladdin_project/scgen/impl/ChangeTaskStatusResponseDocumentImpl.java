/*
 * An XML document type.
 * Localname: ChangeTaskStatusResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one ChangeTaskStatusResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class ChangeTaskStatusResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument
{
    
    public ChangeTaskStatusResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHANGETASKSTATUSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "ChangeTaskStatusResponse");
    
    
    /**
     * Gets the "ChangeTaskStatusResponse" element
     */
    public eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse getChangeTaskStatusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse target = null;
            target = (eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse)get_store().find_element_user(CHANGETASKSTATUSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ChangeTaskStatusResponse" element
     */
    public void setChangeTaskStatusResponse(eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse changeTaskStatusResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse target = null;
            target = (eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse)get_store().find_element_user(CHANGETASKSTATUSRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse)get_store().add_element_user(CHANGETASKSTATUSRESPONSE$0);
            }
            target.set(changeTaskStatusResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ChangeTaskStatusResponse" element
     */
    public eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse addNewChangeTaskStatusResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse target = null;
            target = (eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse)get_store().add_element_user(CHANGETASKSTATUSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ChangeTaskStatusResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class ChangeTaskStatusResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.ChangeTaskStatusResponseDocument.ChangeTaskStatusResponse
    {
        
        public ChangeTaskStatusResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
