/*
 * An XML document type.
 * Localname: sendEvent
 * Namespace: http://aladdin-project.eu/NotificationComponent/
 * Java type: eu.aladdin_project.notificationcomponent.SendEventDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.notificationcomponent.impl;
/**
 * A document containing one sendEvent(@http://aladdin-project.eu/NotificationComponent/) element.
 *
 * This is a complex type.
 */
public class SendEventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.notificationcomponent.SendEventDocument
{
    
    public SendEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDEVENT$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/NotificationComponent/", "sendEvent");
    
    
    /**
     * Gets the "sendEvent" element
     */
    public eu.aladdin_project.notificationcomponent.SendEventDocument.SendEvent getSendEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.notificationcomponent.SendEventDocument.SendEvent target = null;
            target = (eu.aladdin_project.notificationcomponent.SendEventDocument.SendEvent)get_store().find_element_user(SENDEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sendEvent" element
     */
    public void setSendEvent(eu.aladdin_project.notificationcomponent.SendEventDocument.SendEvent sendEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.notificationcomponent.SendEventDocument.SendEvent target = null;
            target = (eu.aladdin_project.notificationcomponent.SendEventDocument.SendEvent)get_store().find_element_user(SENDEVENT$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.notificationcomponent.SendEventDocument.SendEvent)get_store().add_element_user(SENDEVENT$0);
            }
            target.set(sendEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "sendEvent" element
     */
    public eu.aladdin_project.notificationcomponent.SendEventDocument.SendEvent addNewSendEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.notificationcomponent.SendEventDocument.SendEvent target = null;
            target = (eu.aladdin_project.notificationcomponent.SendEventDocument.SendEvent)get_store().add_element_user(SENDEVENT$0);
            return target;
        }
    }
    /**
     * An XML sendEvent(@http://aladdin-project.eu/NotificationComponent/).
     *
     * This is a complex type.
     */
    public static class SendEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.notificationcomponent.SendEventDocument.SendEvent
    {
        
        public SendEventImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENT$0 = 
            new javax.xml.namespace.QName("", "event");
        
        
        /**
         * Gets the "event" element
         */
        public eu.aladdin_project.xsd.Event getEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Event target = null;
                target = (eu.aladdin_project.xsd.Event)get_store().find_element_user(EVENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "event" element
         */
        public void setEvent(eu.aladdin_project.xsd.Event event)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Event target = null;
                target = (eu.aladdin_project.xsd.Event)get_store().find_element_user(EVENT$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Event)get_store().add_element_user(EVENT$0);
                }
                target.set(event);
            }
        }
        
        /**
         * Appends and returns a new empty "event" element
         */
        public eu.aladdin_project.xsd.Event addNewEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Event target = null;
                target = (eu.aladdin_project.xsd.Event)get_store().add_element_user(EVENT$0);
                return target;
            }
        }
    }
}
