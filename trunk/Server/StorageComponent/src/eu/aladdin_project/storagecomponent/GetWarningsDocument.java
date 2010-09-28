/*
 * An XML document type.
 * Localname: GetWarnings
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.GetWarningsDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent;


/**
 * A document containing one GetWarnings(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public interface GetWarningsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetWarningsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1E4F270EA568D21B33A568F12249625F").resolveHandle("getwarnings125bdoctype");
    
    /**
     * Gets the "GetWarnings" element
     */
    eu.aladdin_project.storagecomponent.GetWarningsDocument.GetWarnings getGetWarnings();
    
    /**
     * Sets the "GetWarnings" element
     */
    void setGetWarnings(eu.aladdin_project.storagecomponent.GetWarningsDocument.GetWarnings getWarnings);
    
    /**
     * Appends and returns a new empty "GetWarnings" element
     */
    eu.aladdin_project.storagecomponent.GetWarningsDocument.GetWarnings addNewGetWarnings();
    
    /**
     * An XML GetWarnings(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public interface GetWarnings extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetWarnings.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1E4F270EA568D21B33A568F12249625F").resolveHandle("getwarningse334elemtype");
        
        /**
         * Gets array of all "warn" elements
         */
        eu.aladdin_project.xsd.SearchCriteria[] getWarnArray();
        
        /**
         * Gets ith "warn" element
         */
        eu.aladdin_project.xsd.SearchCriteria getWarnArray(int i);
        
        /**
         * Returns number of "warn" element
         */
        int sizeOfWarnArray();
        
        /**
         * Sets array of all "warn" element
         */
        void setWarnArray(eu.aladdin_project.xsd.SearchCriteria[] warnArray);
        
        /**
         * Sets ith "warn" element
         */
        void setWarnArray(int i, eu.aladdin_project.xsd.SearchCriteria warn);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "warn" element
         */
        eu.aladdin_project.xsd.SearchCriteria insertNewWarn(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "warn" element
         */
        eu.aladdin_project.xsd.SearchCriteria addNewWarn();
        
        /**
         * Removes the ith "warn" element
         */
        void removeWarn(int i);
        
        /**
         * Gets the "userId" element
         */
        java.lang.String getUserId();
        
        /**
         * Gets (as xml) the "userId" element
         */
        org.apache.xmlbeans.XmlString xgetUserId();
        
        /**
         * Sets the "userId" element
         */
        void setUserId(java.lang.String userId);
        
        /**
         * Sets (as xml) the "userId" element
         */
        void xsetUserId(org.apache.xmlbeans.XmlString userId);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.aladdin_project.storagecomponent.GetWarningsDocument.GetWarnings newInstance() {
              return (eu.aladdin_project.storagecomponent.GetWarningsDocument.GetWarnings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.storagecomponent.GetWarningsDocument.GetWarnings newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.storagecomponent.GetWarningsDocument.GetWarnings) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument newInstance() {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.GetWarningsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.GetWarningsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
