package com.example.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import com.example.student.util.StudentUtil;

import net.sf.jasperreports.engine.JRException;

@RestController
public class StudentController {

	@Autowired
	public StudentService studSer;
	
	@Autowired
	public StudentUtil studUtil;

	@RequestMapping("/getStudentReport")
	public void getStudentReport() throws JRException {
		List<Student> studentListForReport = new ArrayList();
		studentListForReport = studSer.getStudentList();
		studUtil.getReport(studentListForReport);
	}
	
	@RequestMapping("/test")
	public String test() {
		return "Test Measage";
	}

}
