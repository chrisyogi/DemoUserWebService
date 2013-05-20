/**
 * SayHelloToCkpService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ckp.server;

public interface SayHelloToCkpService extends javax.xml.rpc.Service {
    public java.lang.String getckpAddress();

    public com.ckp.server.SayHelloToCkp getckp() throws javax.xml.rpc.ServiceException;

    public com.ckp.server.SayHelloToCkp getckp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
