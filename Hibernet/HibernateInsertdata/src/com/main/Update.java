package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateinsertdata.Student;

public class Update {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		int s_id=2;
		Student s=ss.get(Student.class, s_id);
		
		s.setS_name("Samiksha Aniket Patil");
		s.setCity("Aralgundi");
		
		ss.update(s);
		tr.commit();
		ss.close();
		

	}

}
