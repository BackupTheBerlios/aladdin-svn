/*
 * An XML document type.
 * Localname: GetQuestionnaire
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.GetQuestionnaireDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen.impl;
/**
 * A document containing one GetQuestionnaire(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public class GetQuestionnaireDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetQuestionnaireDocument
{
    
    public GetQuestionnaireDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETQUESTIONNAIRE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/SCGen/", "GetQuestionnaire");
    
    
    /**
     * Gets the "GetQuestionnaire" element
     */
    public eu.aladdin_project.scgen.GetQuestionnaireDocument.GetQuestionnaire getGetQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetQuestionnaireDocument.GetQuestionnaire target = null;
            target = (eu.aladdin_project.scgen.GetQuestionnaireDocument.GetQuestionnaire)get_store().find_element_user(GETQUESTIONNAIRE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetQuestionnaire" element
     */
    public void setGetQuestionnaire(eu.aladdin_project.scgen.GetQuestionnaireDocument.GetQuestionnaire getQuestionnaire)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetQuestionnaireDocument.GetQuestionnaire target = null;
            target = (eu.aladdin_project.scgen.GetQuestionnaireDocument.GetQuestionnaire)get_store().find_element_user(GETQUESTIONNAIRE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.scgen.GetQuestionnaireDocument.GetQuestionnaire)get_store().add_element_user(GETQUESTIONNAIRE$0);
            }
            target.set(getQuestionnaire);
        }
    }
    
    /**
     * Appends and returns a new empty "GetQuestionnaire" element
     */
    public eu.aladdin_project.scgen.GetQuestionnaireDocument.GetQuestionnaire addNewGetQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.scgen.GetQuestionnaireDocument.GetQuestionnaire target = null;
            target = (eu.aladdin_project.scgen.GetQuestionnaireDocument.GetQuestionnaire)get_store().add_element_user(GETQUESTIONNAIRE$0);
            return target;
        }
    }
    /**
     * An XML GetQuestionnaire(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public static class GetQuestionnaireImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.scgen.GetQuestionnaireDocument.GetQuestionnaire
    {
        
        public GetQuestionnaireImpl(org.apache.xmlbeans.SchemaType sType)
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
