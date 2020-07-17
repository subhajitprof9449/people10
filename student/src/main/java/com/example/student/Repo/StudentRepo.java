package com.example.student.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
	
	public List<Student> findAll();

}
