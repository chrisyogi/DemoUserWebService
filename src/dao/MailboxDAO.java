package dao;

import java.util.List;

import bean.Mailbox;

public interface MailboxDAO {

	public Mailbox getMailboxById(String username);
	
	public boolean saveMailbox(Mailbox mailbox);
	
	public boolean updateMailbox(Mailbox mailbox);
	
	public boolean deleteMailboxByID(String username);
	
	public List<Mailbox> getMailbox();
}
