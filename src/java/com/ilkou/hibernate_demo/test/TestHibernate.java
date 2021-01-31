package com.ilkou.hibernate_demo.test;

import org.hibernate.Session;

import com.ilkou.hibernate_demo.dao.Client;
import com.ilkou.hibernate_demo.dao.HibernateUtil;


public class TestHibernate {
	/*
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
        session.beginTransaction();
		
		Client client1 = new Client((long) 1, "Ouklich", "Oussama", 21, "KHOURIBGA");
		Client client2 = new Client((long) 2, "Rahimi", "Mehdi", 22, "KHOURIBGA");
		
		session.save(client1);
		session.save(client2);
        
        Client cl = (Client)session.load(Client.class, (long)1);
        cl.setNom("OUKLICH");
        session.save(cl);
        
        Client cl2 = (Client)session.load(Client.class, (long)2);
        session.delete(cl2);
        
        session.getTransaction().commit();
	}*/
}
