package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int e_id;
	private String name;
	private String role;
	private int salary;
	
	
	public Employee() {
		
	}
	
	
	public Employee(int e_id, String name, String role, int salary) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}


	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	

}
