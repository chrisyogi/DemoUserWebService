/**
 * IUpdateUserInfoMgrServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scholat.server;

public class IUpdateUserInfoMgrServiceLocator extends org.apache.axis.client.Service implements com.scholat.server.IUpdateUserInfoMgrService {

    public IUpdateUserInfoMgrServiceLocator() {
    }


    public IUpdateUserInfoMgrServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IUpdateUserInfoMgrServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for updateUser
    private java.lang.String updateUser_address = "http://122.228.202.163:8080/UserWebService/services/updateUser";

    public java.lang.String getupdateUserAddress() {
        return updateUser_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String updateUserWSDDServiceName = "updateUser";

    public java.lang.String getupdateUserWSDDServiceName() {
        return updateUserWSDDServiceName;
    }

    public void setupdateUserWSDDServiceName(java.lang.String name) {
        updateUserWSDDServiceName = name;
    }

    public com.scholat.server.IUpdateUserInfoMgr getupdateUser() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(updateUser_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getupdateUser(endpoint);
    }

    public com.scholat.server.IUpdateUserInfoMgr getupdateUser(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.scholat.server.UpdateUserSoapBindingStub _stub = new com.scholat.server.UpdateUserSoapBindingStub(portAddress, this);
            _stub.setPortName(getupdateUserWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setupdateUserEndpointAddress(java.lang.String address) {
        updateUser_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.scholat.server.IUpdateUserInfoMgr.class.isAssignableFrom(serviceEndpointInterface)) {
                com.scholat.server.UpdateUserSoapBindingStub _stub = new com.scholat.server.UpdateUserSoapBindingStub(new java.net.URL(updateUser_address), this);
                _stub.setPortName(getupdateUserWSDDServiceName());
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
        if ("updateUser".equals(inputPortName)) {
            return getupdateUser();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:updateUser", "IUpdateUserInfoMgrService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:updateUser", "updateUser"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("updateUser".equals(portName)) {
            setupdateUserEndpointAddress(address);
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
