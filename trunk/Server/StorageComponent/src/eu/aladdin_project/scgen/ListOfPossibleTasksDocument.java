/*
 * An XML document type.
 * Localname: ListOfPossibleTasks
 * Namespace: http://aladdin-project.eu/SCGen/
 * Java type: eu.aladdin_project.scgen.ListOfPossibleTasksDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.scgen;


/**
 * A document containing one ListOfPossibleTasks(@http://aladdin-project.eu/SCGen/) element.
 *
 * This is a complex type.
 */
public interface ListOfPossibleTasksDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListOfPossibleTasksDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s63797E7E0B2ADD7DB39E2536A3333547").resolveHandle("listofpossibletaskse3e6doctype");
    
    /**
     * Gets the "ListOfPossibleTasks" element
     */
    eu.aladdin_project.scgen.ListOfPossibleTasksDocument.ListOfPossibleTasks getListOfPossibleTasks();
    
    /**
     * Sets the "ListOfPossibleTasks" element
     */
    void setListOfPossibleTasks(eu.aladdin_project.scgen.ListOfPossibleTasksDocument.ListOfPossibleTasks listOfPossibleTasks);
    
    /**
     * Appends and returns a new empty "ListOfPossibleTasks" element
     */
    eu.aladdin_project.scgen.ListOfPossibleTasksDocument.ListOfPossibleTasks addNewListOfPossibleTasks();
    
    /**
     * An XML ListOfPossibleTasks(@http://aladdin-project.eu/SCGen/).
     *
     * This is a complex type.
     */
    public interface ListOfPossibleTasks extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListOfPossibleTasks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s63797E7E0B2ADD7DB39E2536A3333547").resolveHandle("listofpossibletasksad92elemtype");
        
        /**
         * Gets the "userType" element
         */
        int getUserType();
        
        /**
         * Gets (as xml) the "userType" element
         */
        org.apache.xmlbeans.XmlInt xgetUserType();
        
        /**
         * Sets the "userType" element
         */
        void setUserType(int userType);
        
        /**
         * Sets (as xml) the "userType" element
         */
        void xsetUserType(org.apache.xmlbeans.XmlInt userType);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument.ListOfPossibleTasks newInstance() {
              return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument.ListOfPossibleTasks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument.ListOfPossibleTasks newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument.ListOfPossibleTasks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument newInstance() {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.scgen.ListOfPossibleTasksDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.scgen.ListOfPossibleTasksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
