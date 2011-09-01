/**
 * StorageComponent_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.aladdin_project.StorageComponent;

public interface StorageComponent_Service extends javax.xml.rpc.Service {
    public java.lang.String getStorageComponentSOAPAddress();

    public eu.aladdin_project.StorageComponent.StorageComponent_PortType getStorageComponentSOAP() throws javax.xml.rpc.ServiceException;

    public eu.aladdin_project.StorageComponent.StorageComponent_PortType getStorageComponentSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
