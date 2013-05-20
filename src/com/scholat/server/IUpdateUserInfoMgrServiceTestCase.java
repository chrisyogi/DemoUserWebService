/**
 * IUpdateUserInfoMgrServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scholat.server;

public class IUpdateUserInfoMgrServiceTestCase extends junit.framework.TestCase {
    public IUpdateUserInfoMgrServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testupdateUserWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new com.scholat.server.IUpdateUserInfoMgrServiceLocator().getupdateUserAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.scholat.server.IUpdateUserInfoMgrServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1updateUserUpdateUserInfo() throws Exception {
        com.scholat.server.UpdateUserSoapBindingStub binding;
        try {
            binding = (com.scholat.server.UpdateUserSoapBindingStub)
                          new com.scholat.server.IUpdateUserInfoMgrServiceLocator().getupdateUser();
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
        value = binding.updateUserInfo(new java.lang.String(), new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

}
