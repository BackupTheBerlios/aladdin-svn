/*
 * XML Type:  Task
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Task
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd;


/**
 * An XML Task(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public interface Task extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Task.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4CE0FE1EBB82DAF11A1CC1AED6A153A8").resolveHandle("taskda91type");
    
    /**
     * Gets the "ID" element
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" element
     */
    org.apache.xmlbeans.XmlString xgetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.apache.xmlbeans.XmlString id);
    
    /**
     * Gets the "TaskType" element
     */
    eu.aladdin_project.xsd.SystemParameter getTaskType();
    
    /**
     * Sets the "TaskType" element
     */
    void setTaskType(eu.aladdin_project.xsd.SystemParameter taskType);
    
    /**
     * Appends and returns a new empty "TaskType" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewTaskType();
    
    /**
     * Gets the "DateTimeAssigned" element
     */
    java.util.Calendar getDateTimeAssigned();
    
    /**
     * Gets (as xml) the "DateTimeAssigned" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDateTimeAssigned();
    
    /**
     * Sets the "DateTimeAssigned" element
     */
    void setDateTimeAssigned(java.util.Calendar dateTimeAssigned);
    
    /**
     * Sets (as xml) the "DateTimeAssigned" element
     */
    void xsetDateTimeAssigned(org.apache.xmlbeans.XmlDateTime dateTimeAssigned);
    
    /**
     * Gets the "DateTimeFulfilled" element
     */
    java.util.Calendar getDateTimeFulfilled();
    
    /**
     * Gets (as xml) the "DateTimeFulfilled" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDateTimeFulfilled();
    
    /**
     * Sets the "DateTimeFulfilled" element
     */
    void setDateTimeFulfilled(java.util.Calendar dateTimeFulfilled);
    
    /**
     * Sets (as xml) the "DateTimeFulfilled" element
     */
    void xsetDateTimeFulfilled(org.apache.xmlbeans.XmlDateTime dateTimeFulfilled);
    
    /**
     * Gets the "TaskStatus" element
     */
    eu.aladdin_project.xsd.SystemParameter getTaskStatus();
    
    /**
     * Sets the "TaskStatus" element
     */
    void setTaskStatus(eu.aladdin_project.xsd.SystemParameter taskStatus);
    
    /**
     * Appends and returns a new empty "TaskStatus" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewTaskStatus();
    
    /**
     * Gets the "URL" element
     */
    java.lang.String getURL();
    
    /**
     * Gets (as xml) the "URL" element
     */
    org.apache.xmlbeans.XmlString xgetURL();
    
    /**
     * True if has "URL" element
     */
    boolean isSetURL();
    
    /**
     * Sets the "URL" element
     */
    void setURL(java.lang.String url);
    
    /**
     * Sets (as xml) the "URL" element
     */
    void xsetURL(org.apache.xmlbeans.XmlString url);
    
    /**
     * Unsets the "URL" element
     */
    void unsetURL();
    
    /**
     * Gets the "Questionnaire" element
     */
    eu.aladdin_project.xsd.Questionnaire getQuestionnaire();
    
    /**
     * True if has "Questionnaire" element
     */
    boolean isSetQuestionnaire();
    
    /**
     * Sets the "Questionnaire" element
     */
    void setQuestionnaire(eu.aladdin_project.xsd.Questionnaire questionnaire);
    
    /**
     * Appends and returns a new empty "Questionnaire" element
     */
    eu.aladdin_project.xsd.Questionnaire addNewQuestionnaire();
    
    /**
     * Unsets the "Questionnaire" element
     */
    void unsetQuestionnaire();
    
    /**
     * Gets the "ExecutorID" element
     */
    java.lang.String getExecutorID();
    
    /**
     * Gets (as xml) the "ExecutorID" element
     */
    org.apache.xmlbeans.XmlString xgetExecutorID();
    
    /**
     * Sets the "ExecutorID" element
     */
    void setExecutorID(java.lang.String executorID);
    
    /**
     * Sets (as xml) the "ExecutorID" element
     */
    void xsetExecutorID(org.apache.xmlbeans.XmlString executorID);
    
    /**
     * Gets the "AssignerID" element
     */
    java.lang.String getAssignerID();
    
    /**
     * Gets (as xml) the "AssignerID" element
     */
    org.apache.xmlbeans.XmlString xgetAssignerID();
    
    /**
     * Sets the "AssignerID" element
     */
    void setAssignerID(java.lang.String assignerID);
    
    /**
     * Sets (as xml) the "AssignerID" element
     */
    void xsetAssignerID(org.apache.xmlbeans.XmlString assignerID);
    
    /**
     * Gets the "ObjectID" element
     */
    java.lang.String getObjectID();
    
    /**
     * Gets (as xml) the "ObjectID" element
     */
    org.apache.xmlbeans.XmlString xgetObjectID();
    
    /**
     * Sets the "ObjectID" element
     */
    void setObjectID(java.lang.String objectID);
    
    /**
     * Sets (as xml) the "ObjectID" element
     */
    void xsetObjectID(org.apache.xmlbeans.XmlString objectID);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.xsd.Task newInstance() {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.xsd.Task newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.xsd.Task parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.xsd.Task parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.xsd.Task parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.xsd.Task parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.xsd.Task parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.xsd.Task parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.xsd.Task parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.xsd.Task parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.xsd.Task parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.xsd.Task parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.xsd.Task parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.xsd.Task parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.xsd.Task parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.xsd.Task parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.Task parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.Task parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.Task) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
