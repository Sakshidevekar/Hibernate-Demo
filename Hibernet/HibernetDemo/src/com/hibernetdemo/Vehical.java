package com.hibernetdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehical {
	@Id
	private int Vehical_no;
	private String v_brand;
	private String v_type;
	
	public Vehical() {
		
	}

	public Vehical(int vehical_no, String v_brand, String v_type) {
		super();
		Vehical_no = vehical_no;
		this.v_brand = v_brand;
		this.v_type = v_type;
	}

	public int getVehical_no() {
		return Vehical_no;
	}

	public void setVehical_no(int vehical_no) {
		Vehical_no = vehical_no;
	}

	public String getV_brand() {
		return v_brand;
	}

	public void setV_brand(String v_brand) {
		this.v_brand = v_brand;
	}

	public String getV_type() {
		return v_type;
	}

	public void setV_type(String v_type) {
		this.v_type = v_type;
	}

	@Override
	public String toString() {
		return "Vehical [Vehical_no=" + Vehical_no + ", v_brand=" + v_brand + ", v_type=" + v_type + "]";
	}
	

}
