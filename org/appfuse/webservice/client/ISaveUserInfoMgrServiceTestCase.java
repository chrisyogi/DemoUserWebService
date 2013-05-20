/**
 * ISaveUserInfoMgrServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.appfuse.webservice.client;

public class ISaveUserInfoMgrServiceTestCase extends junit.framework.TestCase {
    public ISaveUserInfoMgrServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testsaveUserWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new org.appfuse.webservice.client.ISaveUserInfoMgrServiceLocator().getsaveUserAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new org.appfuse.webservice.client.ISaveUserInfoMgrServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1saveUserSaveUserInfo() throws Exception {
        org.appfuse.webservice.client.SaveUserSoapBindingStub binding;
        try {
            binding = (org.appfuse.webservice.client.SaveUserSoapBindingStub)
                          new org.appfuse.webservice.client.ISaveUserInfoMgrServiceLocator().getsaveUser();
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
        boolean value = false;
        value = binding.saveUserInfo(new java.lang.String(), new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

}
