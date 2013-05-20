package bean;

import java.util.Date;

/**
 * Mailbox entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Mailbox implements java.io.Serializable {

	// Fields

	private String username;
	private String password;
	private String name;
	private String maildir;
	private Long quota;
	private String localPart;
	private String domain;
	private Date created;
	private Date modified;
	private Byte active;

	// Constructors

	/** default constructor */
	public Mailbox() {
	}

	/** full constructor */
	public Mailbox(String username, String password, String name,
			String maildir, Long quota, String localPart, String domain,
			Date created, Date modified, Byte active) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.maildir = maildir;
		this.quota = quota;
		this.localPart = localPart;
		this.domain = domain;
		this.created = created;
		this.modified = modified;
		this.active = active;
	}

	// Property accessors

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaildir() {
		return this.maildir;
	}

	public void setMaildir(String maildir) {
		this.maildir = maildir;
	}

	public Long getQuota() {
		return this.quota;
	}

	public void setQuota(Long quota) {
		this.quota = quota;
	}

	public String getLocalPart() {
		return this.localPart;
	}

	public void setLocalPart(String localPart) {
		this.localPart = localPart;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Byte getActive() {
		return this.active;
	}

	public void setActive(Byte active) {
		this.active = active;
	}

}