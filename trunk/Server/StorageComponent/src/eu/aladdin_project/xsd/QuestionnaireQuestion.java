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
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QuestionnaireQuestion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9B11522ADB9A0B3D3AED631FE243F900").resolveHandle("questionnairequestion0b43type");
    
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
     * Gets array of all "answer" elements
     */
    eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] getAnswerArray();
    
    /**
     * Gets ith "answer" element
     */
    eu.aladdin_project.xsd.QuestionnaireQuestionAnswer getAnswerArray(int i);
    
    /**
     * Returns number of "answer" element
     */
    int sizeOfAnswerArray();
    
    /**
     * Sets array of all "answer" element
     */
    void setAnswerArray(eu.aladdin_project.xsd.QuestionnaireQuestionAnswer[] answerArray);
    
    /**
     * Sets ith "answer" element
     */
    void setAnswerArray(int i, eu.aladdin_project.xsd.QuestionnaireQuestionAnswer answer);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "answer" element
     */
    eu.aladdin_project.xsd.QuestionnaireQuestionAnswer insertNewAnswer(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "answer" element
     */
    eu.aladdin_project.xsd.QuestionnaireQuestionAnswer addNewAnswer();
    
    /**
     * Removes the ith "answer" element
     */
    void removeAnswer(int i);
    
    /**
     * Gets array of all "questions" elements
     */
    eu.aladdin_project.xsd.QuestionnaireQuestion[] getQuestionsArray();
    
    /**
     * Gets ith "questions" element
     */
    eu.aladdin_project.xsd.QuestionnaireQuestion getQuestionsArray(int i);
    
    /**
     * Returns number of "questions" element
     */
    int sizeOfQuestionsArray();
    
    /**
     * Sets array of all "questions" element
     */
    void setQuestionsArray(eu.aladdin_project.xsd.QuestionnaireQuestion[] questionsArray);
    
    /**
     * Sets ith "questions" element
     */
    void setQuestionsArray(int i, eu.aladdin_project.xsd.QuestionnaireQuestion questions);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "questions" element
     */
    eu.aladdin_project.xsd.QuestionnaireQuestion insertNewQuestions(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "questions" element
     */
    eu.aladdin_project.xsd.QuestionnaireQuestion addNewQuestions();
    
    /**
     * Removes the ith "questions" element
     */
    void removeQuestions(int i);
    
    /**
     * Gets the "verision" attribute
     */
    java.math.BigDecimal getVerision();
    
    /**
     * Gets (as xml) the "verision" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetVerision();
    
    /**
     * True if has "verision" attribute
     */
    boolean isSetVerision();
    
    /**
     * Sets the "verision" attribute
     */
    void setVerision(java.math.BigDecimal verision);
    
    /**
     * Sets (as xml) the "verision" attribute
     */
    void xsetVerision(org.apache.xmlbeans.XmlDecimal verision);
    
    /**
     * Unsets the "verision" attribute
     */
    void unsetVerision();
    
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
