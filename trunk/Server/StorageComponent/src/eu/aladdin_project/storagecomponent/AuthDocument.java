/*
 * An XML document type.
 * Localname: Auth
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.AuthDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent;


/**
 * A document containing one Auth(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public interface AuthDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuthDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1E4F270EA568D21B33A568F12249625F").resolveHandle("auth6d08doctype");
    
    /**
     * Gets the "Auth" element
     */
    eu.aladdin_project.storagecomponent.AuthDocument.Auth getAuth();
    
    /**
     * Sets the "Auth" element
     */
    void setAuth(eu.aladdin_project.storagecomponent.AuthDocument.Auth auth);
    
    /**
     * Appends and returns a new empty "Auth" element
     */
    eu.aladdin_project.storagecomponent.AuthDocument.Auth addNewAuth();
    
    /**
     * An XML Auth(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public interface Auth extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Auth.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1E4F270EA568D21B33A568F12249625F").resolveHandle("authac24elemtype");
        
        /**
         * Gets the "login" element
         */
        java.lang.String getLogin();
        
        /**
         * Gets (as xml) the "login" element
         */
        org.apache.xmlbeans.XmlString xgetLogin();
        
        /**
         * Sets the "login" element
         */
        void setLogin(java.lang.String login);
        
        /**
         * Sets (as xml) the "login" element
         */
        void xsetLogin(org.apache.xmlbeans.XmlString login);
        
        /**
         * Gets the "password" element
         */
        java.lang.String getPassword();
        
        /**
         * Gets (as xml) the "password" element
         */
        org.apache.xmlbeans.XmlString xgetPassword();
        
        /**
         * Sets the "password" element
         */
        void setPassword(java.lang.String password);
        
        /**
         * Sets (as xml) the "password" element
         */
        void xsetPassword(org.apache.xmlbeans.XmlString password);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.aladdin_project.storagecomponent.AuthDocument.Auth newInstance() {
              return (eu.aladdin_project.storagecomponent.AuthDocument.Auth) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.storagecomponent.AuthDocument.Auth newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.storagecomponent.AuthDocument.Auth) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.storagecomponent.AuthDocument newInstance() {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.AuthDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.AuthDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
