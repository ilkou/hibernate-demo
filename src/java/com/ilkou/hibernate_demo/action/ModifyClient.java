package com.ilkou.hibernate_demo.action;

import org.hibernate.Session;

import com.ilkou.hibernate_demo.dao.Client;
import com.ilkou.hibernate_demo.dao.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;

public class ModifyClient extends ActionSupport{
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

			Client cl = (Client)session.load(Client.class, client.getCode());
	        cl.setNom(client.getNom());
	        cl.setPrenom(client.getPrenom());
	        cl.setVille(client.getVille());
	        cl.setAge(client.getAge());

	        session.save(cl);
        
			session.getTransaction().commit();
		} catch (Throwable ex) {
			System.err.println("Modifying User failed: " + ex);
            return "error";
		}
		return "success";
	}
}
