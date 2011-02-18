/*
 * An XML document type.
 * Localname: RemoveTaskMassively
 * Namespace: http://aladdin-project.eu/StorageComponent/
 * Java type: eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument
 *
 * Automatically generated - do not modify.
 */
package eu.aladdin_project.storagecomponent;


/**
 * A document containing one RemoveTaskMassively(@http://aladdin-project.eu/StorageComponent/) element.
 *
 * This is a complex type.
 */
public interface RemoveTaskMassivelyDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RemoveTaskMassivelyDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E6AEF51E01EC245AB15E23DD1E77FA1").resolveHandle("removetaskmassively0cd6doctype");
    
    /**
     * Gets the "RemoveTaskMassively" element
     */
    eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively getRemoveTaskMassively();
    
    /**
     * Sets the "RemoveTaskMassively" element
     */
    void setRemoveTaskMassively(eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively removeTaskMassively);
    
    /**
     * Appends and returns a new empty "RemoveTaskMassively" element
     */
    eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively addNewRemoveTaskMassively();
    
    /**
     * An XML RemoveTaskMassively(@http://aladdin-project.eu/StorageComponent/).
     *
     * This is a complex type.
     */
    public interface RemoveTaskMassively extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RemoveTaskMassively.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E6AEF51E01EC245AB15E23DD1E77FA1").resolveHandle("removetaskmassively3feaelemtype");
        
        /**
         * Gets the "patientId" element
         */
        java.lang.String getPatientId();
        
        /**
         * Gets (as xml) the "patientId" element
         */
        org.apache.xmlbeans.XmlString xgetPatientId();
        
        /**
         * Sets the "patientId" element
         */
        void setPatientId(java.lang.String patientId);
        
        /**
         * Sets (as xml) the "patientId" element
         */
        void xsetPatientId(org.apache.xmlbeans.XmlString patientId);
        
        /**
         * Gets the "typeOfTask" element
         */
        java.math.BigInteger getTypeOfTask();
        
        /**
         * Gets (as xml) the "typeOfTask" element
         */
        org.apache.xmlbeans.XmlInteger xgetTypeOfTask();
        
        /**
         * Sets the "typeOfTask" element
         */
        void setTypeOfTask(java.math.BigInteger typeOfTask);
        
        /**
         * Sets (as xml) the "typeOfTask" element
         */
        void xsetTypeOfTask(org.apache.xmlbeans.XmlInteger typeOfTask);
        
        /**
         * Gets the "startDate" element
         */
        java.util.Calendar getStartDate();
        
        /**
         * Gets (as xml) the "startDate" element
         */
        org.apache.xmlbeans.XmlDate xgetStartDate();
        
        /**
         * Sets the "startDate" element
         */
        void setStartDate(java.util.Calendar startDate);
        
        /**
         * Sets (as xml) the "startDate" element
         */
        void xsetStartDate(org.apache.xmlbeans.XmlDate startDate);
        
        /**
         * Gets the "endDate" element
         */
        java.util.Calendar getEndDate();
        
        /**
         * Gets (as xml) the "endDate" element
         */
        org.apache.xmlbeans.XmlDate xgetEndDate();
        
        /**
         * Sets the "endDate" element
         */
        void setEndDate(java.util.Calendar endDate);
        
        /**
         * Sets (as xml) the "endDate" element
         */
        void xsetEndDate(org.apache.xmlbeans.XmlDate endDate);
        
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
            public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively newInstance() {
              return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument.RemoveTaskMassively) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument newInstance() {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (eu.aladdin_project.storagecomponent.RemoveTaskMassivelyDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
