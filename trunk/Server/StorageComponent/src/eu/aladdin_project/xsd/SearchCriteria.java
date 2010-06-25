/*
 * XML Type:  SearchCriteria
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.SearchCriteria
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd;


/**
 * An XML SearchCriteria(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public interface SearchCriteria extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchCriteria.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB878E303EE9393334F52EB68B360A72").resolveHandle("searchcriteria9773type");
    
    /**
     * Gets the "FieldName" element
     */
    java.lang.String getFieldName();
    
    /**
     * Gets (as xml) the "FieldName" element
     */
    org.apache.xmlbeans.XmlString xgetFieldName();
    
    /**
     * Sets the "FieldName" element
     */
    void setFieldName(java.lang.String fieldName);
    
    /**
     * Sets (as xml) the "FieldName" element
     */
    void xsetFieldName(org.apache.xmlbeans.XmlString fieldName);
    
    /**
     * Gets the "CompareOp" element
     */
    eu.aladdin_project.xsd.SystemParameter getCompareOp();
    
    /**
     * Sets the "CompareOp" element
     */
    void setCompareOp(eu.aladdin_project.xsd.SystemParameter compareOp);
    
    /**
     * Appends and returns a new empty "CompareOp" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewCompareOp();
    
    /**
     * Gets the "FieldValue1" element
     */
    java.lang.String getFieldValue1();
    
    /**
     * Gets (as xml) the "FieldValue1" element
     */
    org.apache.xmlbeans.XmlString xgetFieldValue1();
    
    /**
     * Sets the "FieldValue1" element
     */
    void setFieldValue1(java.lang.String fieldValue1);
    
    /**
     * Sets (as xml) the "FieldValue1" element
     */
    void xsetFieldValue1(org.apache.xmlbeans.XmlString fieldValue1);
    
    /**
     * Gets the "FieldValue2" element
     */
    java.lang.String getFieldValue2();
    
    /**
     * Gets (as xml) the "FieldValue2" element
     */
    org.apache.xmlbeans.XmlString xgetFieldValue2();
    
    /**
     * True if has "FieldValue2" element
     */
    boolean isSetFieldValue2();
    
    /**
     * Sets the "FieldValue2" element
     */
    void setFieldValue2(java.lang.String fieldValue2);
    
    /**
     * Sets (as xml) the "FieldValue2" element
     */
    void xsetFieldValue2(org.apache.xmlbeans.XmlString fieldValue2);
    
    /**
     * Unsets the "FieldValue2" element
     */
    void unsetFieldValue2();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.xsd.SearchCriteria newInstance() {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.xsd.SearchCriteria parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.xsd.SearchCriteria parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.xsd.SearchCriteria parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.SearchCriteria parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.SearchCriteria parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.SearchCriteria) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
