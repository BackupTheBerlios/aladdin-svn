/*
 * An XML document type.
 * Localname: AnalyzeMeaseurements
 * Namespace: http://www.aladdin-project.eu/raac/
 * Java type: eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.www.raac.impl;
/**
 * A document containing one AnalyzeMeaseurements(@http://www.aladdin-project.eu/raac/) element.
 *
 * This is a complex type.
 */
public class AnalyzeMeaseurementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument
{
    
    public AnalyzeMeaseurementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANALYZEMEASEUREMENTS$0 = 
        new javax.xml.namespace.QName("http://www.aladdin-project.eu/raac/", "AnalyzeMeaseurements");
    
    
    /**
     * Gets the "AnalyzeMeaseurements" element
     */
    public eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements getAnalyzeMeaseurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements)get_store().find_element_user(ANALYZEMEASEUREMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AnalyzeMeaseurements" element
     */
    public void setAnalyzeMeaseurements(eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements analyzeMeaseurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements)get_store().find_element_user(ANALYZEMEASEUREMENTS$0, 0);
            if (target == null)
            {
                target = (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements)get_store().add_element_user(ANALYZEMEASEUREMENTS$0);
            }
            target.set(analyzeMeaseurements);
        }
    }
    
    /**
     * Appends and returns a new empty "AnalyzeMeaseurements" element
     */
    public eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements addNewAnalyzeMeaseurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements target = null;
            target = (eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements)get_store().add_element_user(ANALYZEMEASEUREMENTS$0);
            return target;
        }
    }
    /**
     * An XML AnalyzeMeaseurements(@http://www.aladdin-project.eu/raac/).
     *
     * This is a complex type.
     */
    public static class AnalyzeMeaseurementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements eu.aladdin_project.www.raac.AnalyzeMeaseurementsDocument.AnalyzeMeaseurements
    {
        
        public AnalyzeMeaseurementsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IN$0 = 
            new javax.xml.namespace.QName("", "in");
        
        
        /**
         * Gets array of all "in" elements
         */
        public eu.aladdin_project.xsd.Measurement[] getInArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IN$0, targetList);
                eu.aladdin_project.xsd.Measurement[] result = new eu.aladdin_project.xsd.Measurement[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "in" element
         */
        public eu.aladdin_project.xsd.Measurement getInArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().find_element_user(IN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "in" element
         */
        public int sizeOfInArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IN$0);
            }
        }
        
        /**
         * Sets array of all "in" element
         */
        public void setInArray(eu.aladdin_project.xsd.Measurement[] inArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(inArray, IN$0);
            }
        }
        
        /**
         * Sets ith "in" element
         */
        public void setInArray(int i, eu.aladdin_project.xsd.Measurement in)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().find_element_user(IN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(in);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "in" element
         */
        public eu.aladdin_project.xsd.Measurement insertNewIn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().insert_element_user(IN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "in" element
         */
        public eu.aladdin_project.xsd.Measurement addNewIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                eu.aladdin_project.xsd.Measurement target = null;
                target = (eu.aladdin_project.xsd.Measurement)get_store().add_element_user(IN$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "in" element
         */
        public void removeIn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IN$0, i);
            }
        }
    }
}
