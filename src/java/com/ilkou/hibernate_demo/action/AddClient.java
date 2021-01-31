package com.ilkou.hibernate_demo.action;

import org.hibernate.Session;

import com.ilkou.hibernate_demo.dao.Client;
import com.ilkou.hibernate_demo.dao.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;

public class AddClient extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Client client;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	@Override
	public String execute() throws Exception {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
		 
			session.beginTransaction();

			session.save(client);
        
			session.getTransaction().commit();
		} catch (Throwable ex) {
			System.err.println("Adding User failed: " + ex);
            return "error";
		}
		return "success";
	}
}