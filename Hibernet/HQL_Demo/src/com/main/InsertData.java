package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;

import com.entity.Employee;

public class InsertData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		String hqlQuery="insert into Employee(name ,role,salary) values(:myname,:myrole,:salary)";
		MutationQuery  query=ss.createNativeQuery(hqlQuery);
		query.setParameter("myname", "sakshi");
		query.setParameter("myrole", "web devloper");
		query.setParameter("salary", 4568904);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("data inserted.....");
		

	}

}
