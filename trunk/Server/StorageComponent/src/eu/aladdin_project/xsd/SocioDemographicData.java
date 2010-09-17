/*
 * XML Type:  SocioDemographicData
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.SocioDemographicData
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd;


/**
 * An XML SocioDemographicData(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public interface SocioDemographicData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SocioDemographicData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4205CCDBCDECC51961AD0D38A138281D").resolveHandle("sociodemographicdata4e8etype");
    
    /**
     * Gets the "Age" element
     */
    short getAge();
    
    /**
     * Gets (as xml) the "Age" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetAge();
    
    /**
     * Sets the "Age" element
     */
    void setAge(short age);
    
    /**
     * Sets (as xml) the "Age" element
     */
    void xsetAge(org.apache.xmlbeans.XmlUnsignedByte age);
    
    /**
     * Gets the "Gender" element
     */
    eu.aladdin_project.xsd.SystemParameter getGender();
    
    /**
     * Sets the "Gender" element
     */
    void setGender(eu.aladdin_project.xsd.SystemParameter gender);
    
    /**
     * Appends and returns a new empty "Gender" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewGender();
    
    /**
     * Gets the "MaritalStatus" element
     */
    eu.aladdin_project.xsd.SystemParameter getMaritalStatus();
    
    /**
     * Sets the "MaritalStatus" element
     */
    void setMaritalStatus(eu.aladdin_project.xsd.SystemParameter maritalStatus);
    
    /**
     * Appends and returns a new empty "MaritalStatus" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewMaritalStatus();
    
    /**
     * Gets the "Children" element
     */
    short getChildren();
    
    /**
     * Gets (as xml) the "Children" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetChildren();
    
    /**
     * Sets the "Children" element
     */
    void setChildren(short children);
    
    /**
     * Sets (as xml) the "Children" element
     */
    void xsetChildren(org.apache.xmlbeans.XmlUnsignedByte children);
    
    /**
     * Gets the "LivingWith" element
     */
    eu.aladdin_project.xsd.SystemParameter getLivingWith();
    
    /**
     * Sets the "LivingWith" element
     */
    void setLivingWith(eu.aladdin_project.xsd.SystemParameter livingWith);
    
    /**
     * Appends and returns a new empty "LivingWith" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewLivingWith();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.xsd.SocioDemographicData newInstance() {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.xsd.SocioDemographicData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.xsd.SocioDemographicData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.xsd.SocioDemographicData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.SocioDemographicData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.SocioDemographicData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.SocioDemographicData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
