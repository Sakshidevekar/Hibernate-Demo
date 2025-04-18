package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.hibernateinsertdata.Student;
import java.util.List;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;


public class Fetchdata {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		CriteriaBuilder hcb=ss.getCriteriaBuilder();
		CriteriaQuery<Object> cq=hcb.createQuery();
		Root<Student> root=cq.from(Student.class);
		cq.select(root);
		Query query=ss.createQuery(cq);
		List<Student>  list=query.getResultList();
		
		for(Student student :list ) {
			System.out.println(student);
		}

	}
	

}
