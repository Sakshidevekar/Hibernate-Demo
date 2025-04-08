package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;



public class MainClass {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Transaction tr=ss.beginTransaction();
		
		Department d=new Department();
		d.setD_id(3);
		d.setD_name(" product engi");
		ss.persist(d);
		
		Employee e1=new Employee();
		e1.setEmp_id(124);
	    e1.setE_name("Aniket");
	    e1.setDept(d);
	    ss.persist(e1);
		Employee e2=new Employee();
	   e2.setEmp_id(235);
		e2.setE_name("Sakshi");
		e2.setDept(d);
		ss.persist(e2);
		Employee e3=new Employee();
		e3.setEmp_id(346);
	   e3.setE_name("Praji");
	   e3.setDept(d);
		ss.persist(e3);
	//List<Employee>list=new ArrayList<Employee>();
	//	list.add(e1);
	//	list.add(e2);
	//list.add(e3);
	//ss.persist(list);
		tr.commit();
		ss.close();


	}

}
