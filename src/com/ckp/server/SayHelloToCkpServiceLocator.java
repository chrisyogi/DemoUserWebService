/**
 * SayHelloToCkpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ckp.server;

public class SayHelloToCkpServiceLocator extends org.apache.axis.client.Service implements com.ckp.server.SayHelloToCkpService {

    public SayHelloToCkpServiceLocator() {
    }


    public SayHelloToCkpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SayHelloToCkpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ckp
    private java.lang.String ckp_address = "http://localhost:8080/UserWebService/services/ckp";

    public java.lang.String getckpAddress() {
        return ckp_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ckpWSDDServiceName = "ckp";

    public java.lang.String getckpWSDDServiceName() {
        return ckpWSDDServiceName;
    }

    public void setckpWSDDServiceName(java.lang.String name) {
        ckpWSDDServiceName = name;
    }

    public com.ckp.server.SayHelloToCkp getckp() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ckp_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getckp(endpoint);
    }

    public com.ckp.server.SayHelloToCkp getckp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ckp.server.CkpSoapBindingStub _stub = new com.ckp.server.CkpSoapBindingStub(portAddress, this);
            _stub.setPortName(getckpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setckpEndpointAddress(java.lang.String address) {
        ckp_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ckp.server.SayHelloToCkp.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ckp.server.CkpSoapBindingStub _stub = new com.ckp.server.CkpSoapBindingStub(new java.net.URL(ckp_address), this);
                _stub.setPortName(getckpWSDDServiceName());
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
        if ("ckp".equals(inputPortName)) {
            return getckp();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:ckp", "sayHelloToCkpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:ckp", "ckp"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ckp".equals(portName)) {
            setckpEndpointAddress(address);
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
