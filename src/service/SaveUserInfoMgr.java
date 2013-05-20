package service;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import bean.Mailbox;
import dao.MailboxDAL;
import dao.MailboxDAO;

public class SaveUserInfoMgr {

	public boolean saveUserInfo(String username, String password,String name){
		MailboxDAO mailboxDAO = new MailboxDAL();

		String domain = "scholat.com";
		Mailbox mailbox = new Mailbox();	
		mailbox.setMaildir(domain + "/" + username + "/");
		mailbox.setName(name);
		System.out.println("name:" + name);
		mailbox.setQuota(new Long(102400000));
		mailbox.setLocalPart(username);
		mailbox.setDomain(domain);
		mailbox.setCreated(new Date());
		mailbox.setModified(new Date());
		mailbox.setActive(new Byte("1"));
		mailbox.setPassword(password);
		mailbox.setUsername(username + "@scholat.com");

		try {
			boolean flag1 = mailboxDAO.saveMailbox(mailbox);
			
			File maildir = new File("/var/vmail/scholat.com");
			if(maildir.isDirectory()){
				File mydir = new File("/var/vmail/scholat.com/" + username);
				Boolean flag = mydir.mkdir();
				System.out.println("create the directory:" + flag);
			}
			return flag1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
