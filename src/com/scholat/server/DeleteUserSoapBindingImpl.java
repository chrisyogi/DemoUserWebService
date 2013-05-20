/**
 * DeleteUserSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scholat.server;

import dao.MailboxDAL;
import dao.MailboxDAO;

public class DeleteUserSoapBindingImpl implements
		com.scholat.server.IDeleteUserInfoMgr {
	public boolean deleteUserInfo(java.lang.String in0)
			throws java.rmi.RemoteException {
		MailboxDAO mailboxDAO = new MailboxDAL();

		try {
			Boolean flag = mailboxDAO.deleteMailboxByID(in0);
			if (flag)
				return true;
			else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
