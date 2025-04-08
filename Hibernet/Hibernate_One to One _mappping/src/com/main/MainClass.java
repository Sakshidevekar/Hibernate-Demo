package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Laptop;
import com.entity.Student;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		Laptop l=new Laptop();
		l.setL_id(120000);
		l.setL_name("Hp");
		ss.persist(l);
		
		Student s=new Student();
		s.setS_id(1);
		s.setS_name("Aniket");
		s.setLaptop(l);
		ss.persist(s);
		System.out.println("entites map sccuessfuly");
		tr.commit();
		ss.close();
	}

}
