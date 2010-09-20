/**
 * StorageComponent_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.StorageComponent;

public class StorageComponent_ServiceLocator extends org.apache.axis.client.Service implements eu.aladdin_project.StorageComponent.StorageComponent_Service {

    public StorageComponent_ServiceLocator() {
    }


    public StorageComponent_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StorageComponent_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StorageComponentSOAP
    private java.lang.String StorageComponentSOAP_address = "http://193.174.152.114:28080/axis2/services/StorageComponent/";

    public java.lang.String getStorageComponentSOAPAddress() {
        return StorageComponentSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StorageComponentSOAPWSDDServiceName = "StorageComponentSOAP";

    public java.lang.String getStorageComponentSOAPWSDDServiceName() {
        return StorageComponentSOAPWSDDServiceName;
    }

    public void setStorageComponentSOAPWSDDServiceName(java.lang.String name) {
        StorageComponentSOAPWSDDServiceName = name;
    }

    public eu.aladdin_project.StorageComponent.StorageComponent_PortType getStorageComponentSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StorageComponentSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStorageComponentSOAP(endpoint);
    }

    public eu.aladdin_project.StorageComponent.StorageComponent_PortType getStorageComponentSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            eu.aladdin_project.StorageComponent.StorageComponentSOAPStub _stub = new eu.aladdin_project.StorageComponent.StorageComponentSOAPStub(portAddress, this);
            _stub.setPortName(getStorageComponentSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStorageComponentSOAPEndpointAddress(java.lang.String address) {
        StorageComponentSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (eu.aladdin_project.StorageComponent.StorageComponent_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                eu.aladdin_project.StorageComponent.StorageComponentSOAPStub _stub = new eu.aladdin_project.StorageComponent.StorageComponentSOAPStub(new java.net.URL(StorageComponentSOAP_address), this);
                _stub.setPortName(getStorageComponentSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StorageComponentSOAP".equals(inputPortName)) {
            return getStorageComponentSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "StorageComponent");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://aladdin-project.eu/StorageComponent/", "StorageComponentSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StorageComponentSOAP".equals(portName)) {
            setStorageComponentSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
