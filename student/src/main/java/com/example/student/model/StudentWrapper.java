package com.example.student.model;

import java.util.List;

public class StudentWrapper {

	private List<Student> studList;
	
	

	public StudentWrapper(List<Student> studList) {
		this.studList = studList;
	}

	public List<Student> getStudList() {
		return studList;
	}

	public void setStudList(List<Student> studList) {
		this.studList = studList;
	}
	
	
}
