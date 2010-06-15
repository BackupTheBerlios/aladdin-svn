/*
 * XML Type:  PersonData
 * Namespace: http://aladdin-project.eu/xsd
 * Java type: eu.aladdin_project.xsd.PersonData
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.xsd;


/**
 * An XML PersonData(@http://aladdin-project.eu/xsd).
 *
 * This is a complex type.
 */
public interface PersonData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersonData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2C3C7FA15BB27D3206A345B01D8BBF16").resolveHandle("persondataed6btype");
    
    /**
     * Gets the "Surname" element
     */
    java.lang.String getSurname();
    
    /**
     * Gets (as xml) the "Surname" element
     */
    org.apache.xmlbeans.XmlString xgetSurname();
    
    /**
     * Sets the "Surname" element
     */
    void setSurname(java.lang.String surname);
    
    /**
     * Sets (as xml) the "Surname" element
     */
    void xsetSurname(org.apache.xmlbeans.XmlString surname);
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets array of all "IdentifierList" elements
     */
    eu.aladdin_project.xsd.Identifier[] getIdentifierListArray();
    
    /**
     * Gets ith "IdentifierList" element
     */
    eu.aladdin_project.xsd.Identifier getIdentifierListArray(int i);
    
    /**
     * Returns number of "IdentifierList" element
     */
    int sizeOfIdentifierListArray();
    
    /**
     * Sets array of all "IdentifierList" element
     */
    void setIdentifierListArray(eu.aladdin_project.xsd.Identifier[] identifierListArray);
    
    /**
     * Sets ith "IdentifierList" element
     */
    void setIdentifierListArray(int i, eu.aladdin_project.xsd.Identifier identifierList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentifierList" element
     */
    eu.aladdin_project.xsd.Identifier insertNewIdentifierList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentifierList" element
     */
    eu.aladdin_project.xsd.Identifier addNewIdentifierList();
    
    /**
     * Removes the ith "IdentifierList" element
     */
    void removeIdentifierList(int i);
    
    /**
     * Gets array of all "AddressList" elements
     */
    eu.aladdin_project.xsd.Address[] getAddressListArray();
    
    /**
     * Gets ith "AddressList" element
     */
    eu.aladdin_project.xsd.Address getAddressListArray(int i);
    
    /**
     * Returns number of "AddressList" element
     */
    int sizeOfAddressListArray();
    
    /**
     * Sets array of all "AddressList" element
     */
    void setAddressListArray(eu.aladdin_project.xsd.Address[] addressListArray);
    
    /**
     * Sets ith "AddressList" element
     */
    void setAddressListArray(int i, eu.aladdin_project.xsd.Address addressList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AddressList" element
     */
    eu.aladdin_project.xsd.Address insertNewAddressList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AddressList" element
     */
    eu.aladdin_project.xsd.Address addNewAddressList();
    
    /**
     * Removes the ith "AddressList" element
     */
    void removeAddressList(int i);
    
    /**
     * Gets array of all "CommunicationList" elements
     */
    eu.aladdin_project.xsd.Communication[] getCommunicationListArray();
    
    /**
     * Gets ith "CommunicationList" element
     */
    eu.aladdin_project.xsd.Communication getCommunicationListArray(int i);
    
    /**
     * Returns number of "CommunicationList" element
     */
    int sizeOfCommunicationListArray();
    
    /**
     * Sets array of all "CommunicationList" element
     */
    void setCommunicationListArray(eu.aladdin_project.xsd.Communication[] communicationListArray);
    
    /**
     * Sets ith "CommunicationList" element
     */
    void setCommunicationListArray(int i, eu.aladdin_project.xsd.Communication communicationList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CommunicationList" element
     */
    eu.aladdin_project.xsd.Communication insertNewCommunicationList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CommunicationList" element
     */
    eu.aladdin_project.xsd.Communication addNewCommunicationList();
    
    /**
     * Removes the ith "CommunicationList" element
     */
    void removeCommunicationList(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.xsd.PersonData newInstance() {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.xsd.PersonData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.xsd.PersonData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.xsd.PersonData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.xsd.PersonData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.xsd.PersonData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.xsd.PersonData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.xsd.PersonData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.xsd.PersonData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.xsd.PersonData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.xsd.PersonData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.xsd.PersonData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.xsd.PersonData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.xsd.PersonData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.xsd.PersonData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.xsd.PersonData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.PersonData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.xsd.PersonData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.xsd.PersonData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
