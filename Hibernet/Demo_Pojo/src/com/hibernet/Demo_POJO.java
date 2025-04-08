package com.hibernet;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Demo_POJO {
   private String S_name;
   @Id
   private int S_id;
   private int S_age;
public String getS_name() {
	return S_name;
}
public void setS_name(String s_name) {
	S_name = s_name;
}
public int getS_id() {
	return S_id;
}
public void setS_id(int s_id) {
	S_id = s_id;
}
public int getS_age() {
	return S_age;
}
public void setS_age(int s_age) {
	S_age = s_age;
}
@Override
public String toString() {
	return "Demo_POJO [S_name=" + S_name + ", S_id=" + S_id + ", S_age=" + S_age + "]";
}
public Demo_POJO(String s_name, int s_id, int s_age) {
	super();
	S_name = s_name;
	S_id = s_id;
	S_age = s_age;
}
public Demo_POJO() {
	
}
   
}
