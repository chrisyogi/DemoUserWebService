package dao;

import hibernate.HibernateSessionFactory;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.Mailbox;

public class MailboxDAL implements MailboxDAO{

	private static Log log = LogFactory.getLog(MailboxDAL.class);
	public boolean deleteMailboxByID(String username) {
		// TODO Auto-generated method stub
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction tx = session.beginTransaction();
			Mailbox mailbox = (Mailbox) session.load(Mailbox.class, username);
			tx.commit();
			tx = session.beginTransaction();
			session.delete(mailbox);
			tx.commit();
			session.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			log.fatal(e);
		}
		return false;
	}

	public List<Mailbox> getMailbox() {
		// TODO Auto-generated method stub
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction tx = session.beginTransaction();
			List<Mailbox> results = session.createQuery("from Mailbox").list();
			tx.commit();
			session.close();
			if(results != null && results.size() > 0)
				return results;
		}catch(Exception e){
			e.printStackTrace();
			log.fatal(e);
		}
		return null;
	}

	public boolean saveMailbox(Mailbox mailbox) {
		// TODO Auto-generated method stub
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction tx = session.beginTransaction();
			session.save(mailbox);
			tx.commit();
			session.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			log.fatal(e);
		}
		return false;
	}

	public boolean updateMailbox(Mailbox mailbox) {
		// TODO Auto-generated method stub
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction tx = session.beginTransaction();
			session.update(mailbox);
			tx.commit();
			session.close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			log.fatal(e);
		}
		return false;
	}

	public Mailbox getMailboxById(String username) {
		// TODO Auto-generated method stub
		try{
			Session session = HibernateSessionFactory.getSession();
			Transaction tx = session.beginTransaction();
			List results = session.createQuery("from Mailbox m where m.username = '" + username +"'").list();
			tx.commit();
			session.close();
			if(results != null && results.size() > 0)
				return (Mailbox)results.get(0);
		}catch(Exception e){
			e.printStackTrace();
			log.fatal(e);
		}
		return null;
	}

}
