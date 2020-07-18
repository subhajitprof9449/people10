package com.example.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.model.StudentWrapper;
import com.example.student.service.StudentService;
import com.example.student.util.StudentUtil;

import net.sf.jasperreports.engine.JRException;

@RestController
public class StudentController {

	@Autowired
	private StudentService studSer;
	
	@Autowired
	private StudentUtil studUtil;

	public StudentWrapper students;
	
	@RequestMapping("/getStudentReport")
	public StudentWrapper getStudentReport() throws JRException {
		List<Student> studentListForReport = new ArrayList();
		studentListForReport = studSer.getStudentList();
		students= new StudentWrapper(studentListForReport);
		studUtil.getReport(studentListForReport);
		return students;
		
	}
	
	@RequestMapping("/test")
	public String test() {
		return "Test Measage";
	}

}
