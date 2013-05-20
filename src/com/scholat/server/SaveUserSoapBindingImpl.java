/**
 * SaveUserSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scholat.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

import bean.Mailbox;
import dao.MailboxDAL;
import dao.MailboxDAO;

public class SaveUserSoapBindingImpl implements com.scholat.server.ISaveUserInfoMgr{
    public boolean saveUserInfo(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException {
    	MailboxDAO mailboxDAO = new MailboxDAL();

		String domain = "scholat.com";
		Mailbox mailbox = new Mailbox();	
		mailbox.setMaildir(domain + "/" + in0 + "/");
		mailbox.setName(in2);
		System.out.println("name:" + in2);
		mailbox.setQuota(new Long(102400000));
		mailbox.setLocalPart(in0);
		mailbox.setDomain(domain);
		mailbox.setCreated(new Date());
		mailbox.setModified(new Date());
		mailbox.setActive(new Byte("1"));
		mailbox.setPassword(in1);
		mailbox.setUsername(in0 + "@scholat.com");

		try {
			Boolean flag1 = mailboxDAO.saveMailbox(mailbox);
			
			execShell("/tmp/createdir.sh");
//			File maildir = new File("/var/vmail/scholat.com");
//			if(maildir.isDirectory()){
//				File mydir = new File("/var/vmail/scholat.com/" + in0);
//				Boolean flag = mydir.mkdir();
//				System.out.println("create the directory:" + flag);
//			}
			if(flag1) return true;
			else return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
    }
    
    public void execShell(String shFile){
    	try{
    		Process process = Runtime.getRuntime().exec(shFile);
    		StreamThread errorThread = new StreamThread(process.getErrorStream(),"Error");
    		StreamThread outputThread = new StreamThread(process.getInputStream(),"Output");
    		errorThread.start();
    		outputThread.start();
    		
    		process.waitFor();
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    class StreamThread extends Thread{
    	InputStream is;
    	String type;
    	
    	StreamThread(InputStream is,String type){
    		this.is = is;
    		this.type = type;
    	}
    	
    	public void run(){
    		try{
    			InputStreamReader isr = new InputStreamReader(is);
    			BufferedReader br = new BufferedReader(isr);
    			String line= null;
    			while((line= br.readLine())!=null){
    				if(type.equals("Error"))
    					System.out.println("Error:"+line);
    				else
    					System.out.println(line);
    			}
    		}catch(IOException e){
    			e.printStackTrace();
    		}
    	}
    	
    }

}
