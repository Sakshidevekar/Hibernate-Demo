package com.hibernetdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
	
	Configuration cfg= new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Vehical.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr=ss.beginTransaction();
	
	Vehical v=new Vehical();
	System.out.println("Application run successfully");

	}

}
