/*
 * XML Type:  User
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.User
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd;


/**
 * An XML User(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public interface User extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(User.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1E4F270EA568D21B33A568F12249625F").resolveHandle("userd257type");
    
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
     * Gets the "Type" element
     */
    eu.aladdin_project.xsd.SystemParameter getType();
    
    /**
     * Sets the "Type" element
     */
    void setType(eu.aladdin_project.xsd.SystemParameter type);
    
    /**
     * Appends and returns a new empty "Type" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewType();
    
    /**
     * Gets the "PersonID" element
     */
    java.lang.String getPersonID();
    
    /**
     * Gets (as xml) the "PersonID" element
     */
    org.apache.xmlbeans.XmlString xgetPersonID();
    
    /**
     * Sets the "PersonID" element
     */
    void setPersonID(java.lang.String personID);
    
    /**
     * Sets (as xml) the "PersonID" element
     */
    void xsetPersonID(org.apache.xmlbeans.XmlString personID);
    
    /**
     * Gets the "Username" element
     */
    java.lang.String getUsername();
    
    /**
     * Gets (as xml) the "Username" element
     */
    org.apache.xmlbeans.XmlString xgetUsername();
    
    /**
     * Sets the "Username" element
     */
    void setUsername(java.lang.String username);
    
    /**
     * Sets (as xml) the "Username" element
     */
    void xsetUsername(org.apache.xmlbeans.XmlString username);
    
    /**
     * Gets the "Password" element
     */
    java.lang.String getPassword();
    
    /**
     * Gets (as xml) the "Password" element
     */
    org.apache.xmlbeans.XmlString xgetPassword();
    
    /**
     * Sets the "Password" element
     */
    void setPassword(java.lang.String password);
    
    /**
     * Sets (as xml) the "Password" element
     */
    void xsetPassword(org.apache.xmlbeans.XmlString password);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.xsd.User newInstance() {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.xsd.User newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.xsd.User parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.xsd.User parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.xsd.User parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.xsd.User parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.xsd.User parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.xsd.User parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.xsd.User parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.xsd.User parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.xsd.User parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.xsd.User parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.xsd.User parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.xsd.User parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.xsd.User parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.xsd.User parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.User parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.User parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
