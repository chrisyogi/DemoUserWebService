/**
 * IDeleteUserInfoMgrServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.appfuse.webservice.client;

public class IDeleteUserInfoMgrServiceLocator extends org.apache.axis.client.Service implements org.appfuse.webservice.client.IDeleteUserInfoMgrService {

    public IDeleteUserInfoMgrServiceLocator() {
    }


    public IDeleteUserInfoMgrServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IDeleteUserInfoMgrServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for deleteUser
    private java.lang.String deleteUser_address = "http://122.228.202.163:8080/UserWebService/services/deleteUser";

    public java.lang.String getdeleteUserAddress() {
        return deleteUser_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String deleteUserWSDDServiceName = "deleteUser";

    public java.lang.String getdeleteUserWSDDServiceName() {
        return deleteUserWSDDServiceName;
    }

    public void setdeleteUserWSDDServiceName(java.lang.String name) {
        deleteUserWSDDServiceName = name;
    }

    public org.appfuse.webservice.client.IDeleteUserInfoMgr getdeleteUser() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(deleteUser_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getdeleteUser(endpoint);
    }

    public org.appfuse.webservice.client.IDeleteUserInfoMgr getdeleteUser(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.appfuse.webservice.client.DeleteUserSoapBindingStub _stub = new org.appfuse.webservice.client.DeleteUserSoapBindingStub(portAddress, this);
            _stub.setPortName(getdeleteUserWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setdeleteUserEndpointAddress(java.lang.String address) {
        deleteUser_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.appfuse.webservice.client.IDeleteUserInfoMgr.class.isAssignableFrom(serviceEndpointInterface)) {
                org.appfuse.webservice.client.DeleteUserSoapBindingStub _stub = new org.appfuse.webservice.client.DeleteUserSoapBindingStub(new java.net.URL(deleteUser_address), this);
                _stub.setPortName(getdeleteUserWSDDServiceName());
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
        if ("deleteUser".equals(inputPortName)) {
            return getdeleteUser();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:deleteUser", "IDeleteUserInfoMgrService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:deleteUser", "deleteUser"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("deleteUser".equals(portName)) {
            setdeleteUserEndpointAddress(address);
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
