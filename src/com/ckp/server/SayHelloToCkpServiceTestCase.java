/**
 * SayHelloToCkpServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ckp.server;

public class SayHelloToCkpServiceTestCase extends junit.framework.TestCase {
    public SayHelloToCkpServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testckpWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.ckp.server.SayHelloToCkpServiceLocator().getckpAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.ckp.server.SayHelloToCkpServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1ckpSayHello() throws Exception {
        com.ckp.server.CkpSoapBindingStub binding;
        try {
            binding = (com.ckp.server.CkpSoapBindingStub)
                          new com.ckp.server.SayHelloToCkpServiceLocator().getckp();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.sayHello();
        // TBD - validate results
    }

}
