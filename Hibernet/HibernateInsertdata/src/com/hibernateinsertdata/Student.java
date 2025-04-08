package com.hibernateinsertdata;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name ="studentRecord")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int s_id;
	private String s_name ;
	@Column(name="Address")
	private String city;
	
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", city=" + city + "]";
	}
	public Student(int s_id, String s_name, String city) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.city = city;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
