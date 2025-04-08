package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Employee;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();

		String hqlQuery="Update  Employee set name=:myname where e_id= :e_id ";
		MutationQuery  query=ss.createMutationQuery(hqlQuery);
		query.setParameter("myname", "aniket");
		query.setParameter("e_id", 4);
		query.executeUpdate();
		tr.commit();
		ss.close();
		System.out.println("zala update");
	}

}
