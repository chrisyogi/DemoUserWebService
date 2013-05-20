package service;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import bean.Mailbox;
import dao.MailboxDAL;
import dao.MailboxDAO;

public class UpdateUserInfoMgr {
	
	public boolean updateUserInfo(String username,String password,String name){
		MailboxDAO mailboxDAO = new MailboxDAL();
		String domain = "scholat.com";
		Mailbox mailbox = mailboxDAO.getMailboxById(username + "@" +domain);
		if(mailbox.getUsername() == null) return false;
		
		mailbox.setName(new String(name)); 
		mailbox.setModified(new Date());
		mailbox.setPassword(password);
		
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
