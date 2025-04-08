package com.hibernatedemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int S_id;
	private String S_name;
	private String city;
	
	
	public Student() {
		
		}
	
	public Student(int s_id, String s_name, String city) {
		super();
		S_id = s_id;
		S_name = s_name;
		this.city = city;
	}

	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [S_id=" + S_id + ", S_name=" + S_name + ", city=" + city + "]";
	}
	
	
	

}
