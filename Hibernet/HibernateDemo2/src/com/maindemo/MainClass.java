package com.maindemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hibernatedemo.Student;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Transaction tr=ss.beginTransaction();
		
		Student s=new Student();
		
		s.setS_id(1);
		s.setS_name("Aniket");
		s.setCity("Pune");
	
		
		ss.persist(s);
		System.out.print(s);
		tr.commit();
		ss.close();
	
		System.out.println("Application run sccessfully...");
	}

}
