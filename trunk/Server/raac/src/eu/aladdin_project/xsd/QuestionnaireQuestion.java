/*
 * XML Type:  QuestionnaireQuestion
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.QuestionnaireQuestion
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd;


/**
 * An XML QuestionnaireQuestion(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public interface QuestionnaireQuestion extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QuestionnaireQuestion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E6AEF51E01EC245AB15E23DD1E77FA1").resolveHandle("questionnairequestion0b43type");
    
    /**
     * Gets the "title" element
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Gets the "GlobalID" element
     */
    int getGlobalID();
    
    /**
     * Gets (as xml) the "GlobalID" element
     */
    org.apache.xmlbeans.XmlInt xgetGlobalID();
    
    /**
     * Sets the "GlobalID" element
     */
    void setGlobalID(int globalID);
    
    /**
     * Sets (as xml) the "GlobalID" element
     */
    void xsetGlobalID(org.apache.xmlbeans.XmlInt globalID);
    
    /**
     * Gets the "answers" element
     */
    eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList getAnswers();
    
    /**
     * Sets the "answers" element
     */
    void setAnswers(eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList answers);
    
    /**
     * Appends and returns a new empty "answers" element
     */
    eu.aladdin_project.xsd.QuestionnaireQuestionAnswerList addNewAnswers();
    
    /**
     * Gets the "questions" element
     */
    eu.aladdin_project.xsd.QuestionnaireQuestionList getQuestions();
    
    /**
     * Sets the "questions" element
     */
    void setQuestions(eu.aladdin_project.xsd.QuestionnaireQuestionList questions);
    
    /**
     * Appends and returns a new empty "questions" element
     */
    eu.aladdin_project.xsd.QuestionnaireQuestionList addNewQuestions();
    
    /**
     * Gets the "position" element
     */
    int getPosition();
    
    /**
     * Gets (as xml) the "position" element
     */
    org.apache.xmlbeans.XmlInt xgetPosition();
    
    /**
     * Sets the "position" element
     */
    void setPosition(int position);
    
    /**
     * Sets (as xml) the "position" element
     */
    void xsetPosition(org.apache.xmlbeans.XmlInt position);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * Gets the "type" attribute
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "condition" attribute
     */
    short getCondition();
    
    /**
     * Gets (as xml) the "condition" attribute
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetCondition();
    
    /**
     * True if has "condition" attribute
     */
    boolean isSetCondition();
    
    /**
     * Sets the "condition" attribute
     */
    void setCondition(short condition);
    
    /**
     * Sets (as xml) the "condition" attribute
     */
    void xsetCondition(org.apache.xmlbeans.XmlUnsignedByte condition);
    
    /**
     * Unsets the "condition" attribute
     */
    void unsetCondition();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.xsd.QuestionnaireQuestion newInstance() {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.QuestionnaireQuestion parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.QuestionnaireQuestion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
