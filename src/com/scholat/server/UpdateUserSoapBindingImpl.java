/**
 * UpdateUserSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scholat.server;

import java.util.Date;

import bean.Mailbox;
import dao.MailboxDAL;
import dao.MailboxDAO;

public class UpdateUserSoapBindingImpl implements com.scholat.server.IUpdateUserInfoMgr{
    public boolean updateUserInfo(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException {
    	MailboxDAO mailboxDAO = new MailboxDAL();
		String domain = "scholat.com";
		Mailbox mailbox = mailboxDAO.getMailboxById(in0 + "@" +domain);
		if(mailbox.getUsername() == null) return false;
		
		mailbox.setName(new String(in2)); 
		mailbox.setModified(new Date());
		mailbox.setPassword(in1);
		
		try{
			Boolean flag = mailboxDAO.updateMailbox(mailbox);
			if(flag) return true;
			else return false;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
    }

}
