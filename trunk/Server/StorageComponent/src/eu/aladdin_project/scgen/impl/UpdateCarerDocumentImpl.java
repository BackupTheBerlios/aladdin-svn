/*
 * An XML document type.
 * Localname: UpdateCarer
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.UpdateCarerDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one UpdateCarer(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class UpdateCarerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdateCarerDocument
{
    
    public UpdateCarerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECARER$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "UpdateCarer");
    
    
    /**
     * Gets the "UpdateCarer" element
     */
    public eu.aladdin_project.scgen.UpdateCarerDocument.UpdateCarer getUpdateCarer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateCarerDocument.UpdateCarer target = null;
            target = (eu.aladdin_project.scgen.UpdateCarerDocument.UpdateCarer)get_store().find_element_user(UPDATECARER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateCarer" element
     */
    public void setUpdateCarer(eu.aladdin_project.scgen.UpdateCarerDocument.UpdateCarer updateCarer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateCarerDocument.UpdateCarer target = null;
            target = (eu.aladdin_project.scgen.UpdateCarerDocument.UpdateCarer)get_store().find_element_user(UPDATECARER$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.UpdateCarerDocument.UpdateCarer)get_store().add_element_user(UPDATECARER$0);
            }
            target.set(updateCarer);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateCarer" element
     */
    public eu.aladdin_project.scgen.UpdateCarerDocument.UpdateCarer addNewUpdateCarer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.UpdateCarerDocument.UpdateCarer target = null;
            target = (eu.aladdin_project.scgen.UpdateCarerDocument.UpdateCarer)get_store().add_element_user(UPDATECARER$0);
            return target;
        }
    }
    /**
     * An XML UpdateCarer(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class UpdateCarerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.UpdateCarerDocument.UpdateCarer
    {
        
        public UpdateCarerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATA$0 = 
            new javax.xml.namespace.QName("", "data");
        private static final javax.xml.namespace.QName USERID$2 = 
            new javax.xml.namespace.QName("", "userId");
        
        
        /**
         * Gets the "data" element
         */
        public eu.aladdin_project.xsd.Carer getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Carer target = null;
                target = (eu.aladdin_project.xsd.Carer)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "data" element
         */
        public void setData(eu.aladdin_project.xsd.Carer data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Carer target = null;
                target = (eu.aladdin_project.xsd.Carer)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Carer)get_store().add_element_user(DATA$0);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public eu.aladdin_project.xsd.Carer addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Carer target = null;
                target = (eu.aladdin_project.xsd.Carer)get_store().add_element_user(DATA$0);
                return target;
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
