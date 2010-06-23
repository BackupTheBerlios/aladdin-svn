/*
 * XML Type:  Address
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.Address
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd;


/**
 * An XML Address(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public interface Address extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Address.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7EF2E24E41D60F56AF6EE0ED32245BA7").resolveHandle("addresseb8etype");
    
    /**
     * Gets the "Street" element
     */
    java.lang.String getStreet();
    
    /**
     * Gets (as xml) the "Street" element
     */
    org.apache.xmlbeans.XmlString xgetStreet();
    
    /**
     * Sets the "Street" element
     */
    void setStreet(java.lang.String street);
    
    /**
     * Sets (as xml) the "Street" element
     */
    void xsetStreet(org.apache.xmlbeans.XmlString street);
    
    /**
     * Gets the "StreetNo" element
     */
    java.lang.String getStreetNo();
    
    /**
     * Gets (as xml) the "StreetNo" element
     */
    org.apache.xmlbeans.XmlString xgetStreetNo();
    
    /**
     * True if has "StreetNo" element
     */
    boolean isSetStreetNo();
    
    /**
     * Sets the "StreetNo" element
     */
    void setStreetNo(java.lang.String streetNo);
    
    /**
     * Sets (as xml) the "StreetNo" element
     */
    void xsetStreetNo(org.apache.xmlbeans.XmlString streetNo);
    
    /**
     * Unsets the "StreetNo" element
     */
    void unsetStreetNo();
    
    /**
     * Gets the "City" element
     */
    java.lang.String getCity();
    
    /**
     * Gets (as xml) the "City" element
     */
    org.apache.xmlbeans.XmlString xgetCity();
    
    /**
     * Sets the "City" element
     */
    void setCity(java.lang.String city);
    
    /**
     * Sets (as xml) the "City" element
     */
    void xsetCity(org.apache.xmlbeans.XmlString city);
    
    /**
     * Gets the "County" element
     */
    java.lang.String getCounty();
    
    /**
     * Gets (as xml) the "County" element
     */
    org.apache.xmlbeans.XmlString xgetCounty();
    
    /**
     * True if has "County" element
     */
    boolean isSetCounty();
    
    /**
     * Sets the "County" element
     */
    void setCounty(java.lang.String county);
    
    /**
     * Sets (as xml) the "County" element
     */
    void xsetCounty(org.apache.xmlbeans.XmlString county);
    
    /**
     * Unsets the "County" element
     */
    void unsetCounty();
    
    /**
     * Gets the "Country" element
     */
    java.lang.String getCountry();
    
    /**
     * Gets (as xml) the "Country" element
     */
    org.apache.xmlbeans.XmlString xgetCountry();
    
    /**
     * Sets the "Country" element
     */
    void setCountry(java.lang.String country);
    
    /**
     * Sets (as xml) the "Country" element
     */
    void xsetCountry(org.apache.xmlbeans.XmlString country);
    
    /**
     * Gets the "ZipCode" element
     */
    java.lang.String getZipCode();
    
    /**
     * Gets (as xml) the "ZipCode" element
     */
    org.apache.xmlbeans.XmlString xgetZipCode();
    
    /**
     * True if has "ZipCode" element
     */
    boolean isSetZipCode();
    
    /**
     * Sets the "ZipCode" element
     */
    void setZipCode(java.lang.String zipCode);
    
    /**
     * Sets (as xml) the "ZipCode" element
     */
    void xsetZipCode(org.apache.xmlbeans.XmlString zipCode);
    
    /**
     * Unsets the "ZipCode" element
     */
    void unsetZipCode();
    
    /**
     * Gets the "Notes" element
     */
    java.lang.String getNotes();
    
    /**
     * Gets (as xml) the "Notes" element
     */
    org.apache.xmlbeans.XmlString xgetNotes();
    
    /**
     * True if has "Notes" element
     */
    boolean isSetNotes();
    
    /**
     * Sets the "Notes" element
     */
    void setNotes(java.lang.String notes);
    
    /**
     * Sets (as xml) the "Notes" element
     */
    void xsetNotes(org.apache.xmlbeans.XmlString notes);
    
    /**
     * Unsets the "Notes" element
     */
    void unsetNotes();
    
    /**
     * Gets the "IsPrimary" element
     */
    boolean getIsPrimary();
    
    /**
     * Gets (as xml) the "IsPrimary" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsPrimary();
    
    /**
     * Sets the "IsPrimary" element
     */
    void setIsPrimary(boolean isPrimary);
    
    /**
     * Sets (as xml) the "IsPrimary" element
     */
    void xsetIsPrimary(org.apache.xmlbeans.XmlBoolean isPrimary);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.xsd.Address newInstance() {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.xsd.Address newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.xsd.Address parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.xsd.Address parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.xsd.Address parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.xsd.Address parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.xsd.Address parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.xsd.Address parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.xsd.Address parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.xsd.Address parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.xsd.Address parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.xsd.Address parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.xsd.Address parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.xsd.Address parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.xsd.Address parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.xsd.Address parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.Address parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.Address parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
