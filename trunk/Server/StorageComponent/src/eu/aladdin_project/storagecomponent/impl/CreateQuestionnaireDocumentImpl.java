/*
 * An XML document type.
 * Localname: CreateQuestionnaire
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent.impl;
/**
 * A document containing one CreateQuestionnaire(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public class CreateQuestionnaireDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument
{
    
    public CreateQuestionnaireDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEQUESTIONNAIRE$0 = 
        new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "CreateQuestionnaire");
    
    
    /**
     * Gets the "CreateQuestionnaire" element
     */
    public eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument.CreateQuestionnaire getCreateQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument.CreateQuestionnaire target = null;
            target = (eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument.CreateQuestionnaire)get_store().find_element_user(CREATEQUESTIONNAIRE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateQuestionnaire" element
     */
    public void setCreateQuestionnaire(eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument.CreateQuestionnaire createQuestionnaire)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument.CreateQuestionnaire target = null;
            target = (eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument.CreateQuestionnaire)get_store().find_element_user(CREATEQUESTIONNAIRE$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument.CreateQuestionnaire)get_store().add_element_user(CREATEQUESTIONNAIRE$0);
            }
            target.set(createQuestionnaire);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateQuestionnaire" element
     */
    public eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument.CreateQuestionnaire addNewCreateQuestionnaire()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument.CreateQuestionnaire target = null;
            target = (eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument.CreateQuestionnaire)get_store().add_element_user(CREATEQUESTIONNAIRE$0);
            return target;
        }
    }
    /**
     * An XML CreateQuestionnaire(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public static class CreateQuestionnaireImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.storagecomponent.CreateQuestionnaireDocument.CreateQuestionnaire
    {
        
        public CreateQuestionnaireImpl(org.apache.xmlbeans.SchemaType sType)
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
        public eu.aladdin_project.xsd.Questionnaire getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Questionnaire target = null;
                target = (eu.aladdin_project.xsd.Questionnaire)get_store().find_element_user(DATA$0, 0);
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
        public void setData(eu.aladdin_project.xsd.Questionnaire data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Questionnaire target = null;
                target = (eu.aladdin_project.xsd.Questionnaire)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    target = (eu.aladdin_project.xsd.Questionnaire)get_store().add_element_user(DATA$0);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public eu.aladdin_project.xsd.Questionnaire addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Questionnaire target = null;
                target = (eu.aladdin_project.xsd.Questionnaire)get_store().add_element_user(DATA$0);
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
