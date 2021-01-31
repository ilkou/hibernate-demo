package com.ilkou.hibernate_demo.action;

import com.ilkou.hibernate_demo.dao.Client;
import com.ilkou.hibernate_demo.dao.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

import java.util.ArrayList;

import org.hibernate.Session;

public class ListClient extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Client client;
	private List<Client> clients = new ArrayList<Client>();
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		clients = clients;
	}
	
	public String execute() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			 
			session.beginTransaction();

			clients = session.createQuery("from Client").list();
	    
			session.getTransaction().commit();
		} catch (Throwable ex) {
			System.err.println("Deleting User failed: " + ex);
            return "error";
		}
		return "success";
	}
}