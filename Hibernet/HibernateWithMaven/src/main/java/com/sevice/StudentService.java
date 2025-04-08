package com.sevice;

import com.dao.StudentDao;

public class StudentService {
public void insertdata() {
	StudentDao sd=new StudentDao();
	sd.insertData();
}
}
