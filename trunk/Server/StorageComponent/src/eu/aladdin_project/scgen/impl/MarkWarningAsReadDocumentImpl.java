/*
 * An XML document type.
 * Localname: MarkWarningAsRead
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.MarkWarningAsReadDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one MarkWarningAsRead(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class MarkWarningAsReadDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.MarkWarningAsReadDocument
{
    
    public MarkWarningAsReadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MARKWARNINGASREAD$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "MarkWarningAsRead");
    
    
    /**
     * Gets the "MarkWarningAsRead" element
     */
    public eu.aladdin_project.scgen.MarkWarningAsReadDocument.MarkWarningAsRead getMarkWarningAsRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.MarkWarningAsReadDocument.MarkWarningAsRead target = null;
            target = (eu.aladdin_project.scgen.MarkWarningAsReadDocument.MarkWarningAsRead)get_store().find_element_user(MARKWARNINGASREAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MarkWarningAsRead" element
     */
    public void setMarkWarningAsRead(eu.aladdin_project.scgen.MarkWarningAsReadDocument.MarkWarningAsRead markWarningAsRead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.MarkWarningAsReadDocument.MarkWarningAsRead target = null;
            target = (eu.aladdin_project.scgen.MarkWarningAsReadDocument.MarkWarningAsRead)get_store().find_element_user(MARKWARNINGASREAD$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.MarkWarningAsReadDocument.MarkWarningAsRead)get_store().add_element_user(MARKWARNINGASREAD$0);
            }
            target.set(markWarningAsRead);
        }
    }
    
    /**
     * Appends and returns a new empty "MarkWarningAsRead" element
     */
    public eu.aladdin_project.scgen.MarkWarningAsReadDocument.MarkWarningAsRead addNewMarkWarningAsRead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.MarkWarningAsReadDocument.MarkWarningAsRead target = null;
            target = (eu.aladdin_project.scgen.MarkWarningAsReadDocument.MarkWarningAsRead)get_store().add_element_user(MARKWARNINGASREAD$0);
            return target;
        }
    }
    /**
     * An XML MarkWarningAsRead(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class MarkWarningAsReadImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.MarkWarningAsReadDocument.MarkWarningAsRead
    {
        
        public MarkWarningAsReadImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "id" element
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "userId" element
         */
        public java.lang.String getUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "userId" element
         */
        public org.apache.xmlbeans.XmlString xgetUserId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "userId" element
         */
        public void setUserId(java.lang.String userId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$2);
                }
                target.setStringValue(userId);
            }
        }
        
        /**
         * Sets (as xml) the "userId" element
         */
        public void xsetUserId(org.apache.xmlbeans.XmlString userId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$2);
                }
                target.set(userId);
            }
        }
    }
}
