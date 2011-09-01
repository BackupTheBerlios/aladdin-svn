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
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SocioDemographicData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE76D02AA29B6DBC90ECEEE7F8EA551D9").resolveHandle("sociodemographicdata4e8etype");
    
    /**
     * Gets the "Gender" element
     */
    eu.aladdin_project.xsd.SystemParameter getGender();
    
    /**
     * True if has "Gender" element
     */
    boolean isSetGender();
    
    /**
     * Sets the "Gender" element
     */
    void setGender(eu.aladdin_project.xsd.SystemParameter gender);
    
    /**
     * Appends and returns a new empty "Gender" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewGender();
    
    /**
     * Unsets the "Gender" element
     */
    void unsetGender();
    
    /**
     * Gets the "MaritalStatus" element
     */
    eu.aladdin_project.xsd.SystemParameter getMaritalStatus();
    
    /**
     * True if has "MaritalStatus" element
     */
    boolean isSetMaritalStatus();
    
    /**
     * Sets the "MaritalStatus" element
     */
    void setMaritalStatus(eu.aladdin_project.xsd.SystemParameter maritalStatus);
    
    /**
     * Appends and returns a new empty "MaritalStatus" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewMaritalStatus();
    
    /**
     * Unsets the "MaritalStatus" element
     */
    void unsetMaritalStatus();
    
    /**
     * Gets the "Children" element
     */
    short getChildren();
    
    /**
     * Gets (as xml) the "Children" element
     */
    org.apache.xmlbeans.XmlUnsignedByte xgetChildren();
    
    /**
     * True if has "Children" element
     */
    boolean isSetChildren();
    
    /**
     * Sets the "Children" element
     */
    void setChildren(short children);
    
    /**
     * Sets (as xml) the "Children" element
     */
    void xsetChildren(org.apache.xmlbeans.XmlUnsignedByte children);
    
    /**
     * Unsets the "Children" element
     */
    void unsetChildren();
    
    /**
     * Gets the "LivingWith" element
     */
    eu.aladdin_project.xsd.SystemParameter getLivingWith();
    
    /**
     * True if has "LivingWith" element
     */
    boolean isSetLivingWith();
    
    /**
     * Sets the "LivingWith" element
     */
    void setLivingWith(eu.aladdin_project.xsd.SystemParameter livingWith);
    
    /**
     * Appends and returns a new empty "LivingWith" element
     */
    eu.aladdin_project.xsd.SystemParameter addNewLivingWith();
    
    /**
     * Unsets the "LivingWith" element
     */
    void unsetLivingWith();
    
    /**
     * Gets the "birthday" element
     */
    java.util.Calendar getBirthday();
    
    /**
     * Gets (as xml) the "birthday" element
     */
    org.apache.xmlbeans.XmlDate xgetBirthday();
    
    /**
     * Sets the "birthday" element
     */
    void setBirthday(java.util.Calendar birthday);
    
    /**
     * Sets (as xml) the "birthday" element
     */
    void xsetBirthday(org.apache.xmlbeans.XmlDate birthday);
    
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
