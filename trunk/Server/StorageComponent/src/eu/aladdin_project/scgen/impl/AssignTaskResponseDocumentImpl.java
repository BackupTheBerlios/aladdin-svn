/*
 * An XML document type.
 * Localname: AssignTaskResponse
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.AssignTaskResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one AssignTaskResponse(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class AssignTaskResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.AssignTaskResponseDocument
{
    
    public AssignTaskResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSIGNTASKRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "AssignTaskResponse");
    
    
    /**
     * Gets the "AssignTaskResponse" element
     */
    public eu.aladdin_project.scgen.AssignTaskResponseDocument.AssignTaskResponse getAssignTaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.AssignTaskResponseDocument.AssignTaskResponse target = null;
            target = (eu.aladdin_project.scgen.AssignTaskResponseDocument.AssignTaskResponse)get_store().find_element_user(ASSIGNTASKRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AssignTaskResponse" element
     */
    public void setAssignTaskResponse(eu.aladdin_project.scgen.AssignTaskResponseDocument.AssignTaskResponse assignTaskResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.AssignTaskResponseDocument.AssignTaskResponse target = null;
            target = (eu.aladdin_project.scgen.AssignTaskResponseDocument.AssignTaskResponse)get_store().find_element_user(ASSIGNTASKRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.AssignTaskResponseDocument.AssignTaskResponse)get_store().add_element_user(ASSIGNTASKRESPONSE$0);
            }
            target.set(assignTaskResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AssignTaskResponse" element
     */
    public eu.aladdin_project.scgen.AssignTaskResponseDocument.AssignTaskResponse addNewAssignTaskResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.AssignTaskResponseDocument.AssignTaskResponse target = null;
            target = (eu.aladdin_project.scgen.AssignTaskResponseDocument.AssignTaskResponse)get_store().add_element_user(ASSIGNTASKRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AssignTaskResponse(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class AssignTaskResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.AssignTaskResponseDocument.AssignTaskResponse
    {
        
        public AssignTaskResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
