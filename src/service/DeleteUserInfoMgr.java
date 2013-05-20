package service;

import dao.MailboxDAL;
import dao.MailboxDAO;

public class DeleteUserInfoMgr {

	public boolean deleteUserInfo(String username){
		MailboxDAO mailboxDAO = new MailboxDAL();
		
		try{
			Boolean flag = mailboxDAO.deleteMailboxByID(username);
			if(flag) return true;
			else return false;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
}
