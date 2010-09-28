/*
 * An XML document type.
 * Localname: CreateAdministratorResponse
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent;


/**
 * A document containing one CreateAdministratorResponse(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public interface CreateAdministratorResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateAdministratorResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1E4F270EA568D21B33A568F12249625F").resolveHandle("createadministratorresponse51a0doctype");
    
    /**
     * Gets the "CreateAdministratorResponse" element
     */
    eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse getCreateAdministratorResponse();
    
    /**
     * Sets the "CreateAdministratorResponse" element
     */
    void setCreateAdministratorResponse(eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse createAdministratorResponse);
    
    /**
     * Appends and returns a new empty "CreateAdministratorResponse" element
     */
    eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse addNewCreateAdministratorResponse();
    
    /**
     * An XML CreateAdministratorResponse(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public interface CreateAdministratorResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateAdministratorResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1E4F270EA568D21B33A568F12249625F").resolveHandle("createadministratorresponsea6feelemtype");
        
        /**
         * Gets the "out" element
         */
        eu.aladdin_project.xsd.OperationResult getOut();
        
        /**
         * Sets the "out" element
         */
        void setOut(eu.aladdin_project.xsd.OperationResult out);
        
        /**
         * Appends and returns a new empty "out" element
         */
        eu.aladdin_project.xsd.OperationResult addNewOut();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse newInstance() {
              return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument.CreateAdministratorResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument newInstance() {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.CreateAdministratorResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
