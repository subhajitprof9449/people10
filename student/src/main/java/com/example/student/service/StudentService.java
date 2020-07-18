package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.Repo.StudentRepo;
import com.example.student.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public List<Student> getStudentList(){
		return studentRepo.findAll();
	}

}
