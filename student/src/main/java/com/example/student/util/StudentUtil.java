package com.example.student.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Configuration;

import com.example.student.model.Student;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Configuration
public class StudentUtil {

	public void getReport(List<Student> listOfStudents) throws JRException {
		
		// Jasper compilation
		JasperReport jasperReport = null;
		jasperReport = JasperCompileManager.compileReport("D:\\Home_Work\\Java\\Jasper\\StudentReport.jrxml");
		
		//Adding data to the report
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(listOfStudents);
		
		//mapping parameter to the param map
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("Report_Desc_Param","Custom Description Param");
		
		//exporting pdf
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);
		JasperExportManager.exportReportToPdfFile(jasperPrint,"D:\\Home_Work\\Java\\Jasper\\report.pdf");

	}
}
