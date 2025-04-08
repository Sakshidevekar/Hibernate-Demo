package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employee;

public class DelectData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlQuery="delete from Employee where e_id=:e_id";
		Query<Employee> query=ss.createQuery(hqlQuery);
		int e_id=3;
		query.setParameter("e_id", e_id);
		
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("delete sccessfully");
		
		//System.out.println(e);
		
		

	}

}
