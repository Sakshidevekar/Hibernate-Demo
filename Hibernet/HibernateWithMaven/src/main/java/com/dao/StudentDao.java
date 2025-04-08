package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class StudentDao {
   public void insertData() {
	 Configuration cfg= new Configuration(); 
	 cfg.configure("hibernate.cfg.xml");
	 cfg.addAnnotatedClass(Student.class);
	 
	 SessionFactory sf=cfg.buildSessionFactory();
	 Session ss=sf.openSession();
	 Transaction tr=ss.beginTransaction();
	 Student s=new Student();
	 s.setS_id(1);
	 s.setS_name("Aniket");
	 s.setCity("pune");
	 ss.persist(s);
	 tr.commit();
	 ss.close();
	 
	 
   }
}
 