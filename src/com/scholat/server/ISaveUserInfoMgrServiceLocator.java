/**
 * ISaveUserInfoMgrServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scholat.server;

public class ISaveUserInfoMgrServiceLocator extends org.apache.axis.client.Service implements com.scholat.server.ISaveUserInfoMgrService {

    public ISaveUserInfoMgrServiceLocator() {
    }


    public ISaveUserInfoMgrServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ISaveUserInfoMgrServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for saveUser
    private java.lang.String saveUser_address = "http://122.228.202.163:7080/UserWebService/services/saveUser";

    public java.lang.String getsaveUserAddress() {
        return saveUser_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String saveUserWSDDServiceName = "saveUser";

    public java.lang.String getsaveUserWSDDServiceName() {
        return saveUserWSDDServiceName;
    }

    public void setsaveUserWSDDServiceName(java.lang.String name) {
        saveUserWSDDServiceName = name;
    }

    public com.scholat.server.ISaveUserInfoMgr getsaveUser() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(saveUser_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsaveUser(endpoint);
    }

    public com.scholat.server.ISaveUserInfoMgr getsaveUser(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.scholat.server.SaveUserSoapBindingStub _stub = new com.scholat.server.SaveUserSoapBindingStub(portAddress, this);
            _stub.setPortName(getsaveUserWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsaveUserEndpointAddress(java.lang.String address) {
        saveUser_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.scholat.server.ISaveUserInfoMgr.class.isAssignableFrom(serviceEndpointInterface)) {
                com.scholat.server.SaveUserSoapBindingStub _stub = new com.scholat.server.SaveUserSoapBindingStub(new java.net.URL(saveUser_address), this);
                _stub.setPortName(getsaveUserWSDDServiceName());
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
        if ("saveUser".equals(inputPortName)) {
            return getsaveUser();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:saveUser", "ISaveUserInfoMgrService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:saveUser", "saveUser"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("saveUser".equals(portName)) {
            setsaveUserEndpointAddress(address);
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
