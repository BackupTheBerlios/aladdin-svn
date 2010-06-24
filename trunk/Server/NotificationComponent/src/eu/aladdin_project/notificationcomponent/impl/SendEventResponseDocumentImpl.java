/*
 * An XML document type.
 * Localname: sendEventResponse
 * Namespace: http://aladdin-project.eu/NotificationComponent/
 * Java type: eu.aladdin_project.notificationcomponent.SendEventResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.notificationcomponent.impl;
/**
 * A document containing one sendEventResponse(@http://aladdin-project.eu/NotificationComponent/) element.
 *
 * This is a complex type.
 */
public class SendEventResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.notificationcomponent.SendEventResponseDocument
{
    
    public SendEventResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDEVENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/NotificationComponent/", "sendEventResponse");
    
    
    /**
     * Gets the "sendEventResponse" element
     */
    public eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse getSendEventResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse target = null;
            target = (eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse)get_store().find_element_user(SENDEVENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendEventResponse" element
     */
    public void setSendEventResponse(eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse sendEventResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse target = null;
            target = (eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse)get_store().find_element_user(SENDEVENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse)get_store().add_element_user(SENDEVENTRESPONSE$0);
            }
            target.set(sendEventResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "sendEventResponse" element
     */
    public eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse addNewSendEventResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse target = null;
            target = (eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse)get_store().add_element_user(SENDEVENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML sendEventResponse(@http://aladdin-project.eu/NotificationComponent/).
     *
     * This is a complex type.
     */
    public static class SendEventResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.notificationcomponent.SendEventResponseDocument.SendEventResponse
    {
        
        public SendEventResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
