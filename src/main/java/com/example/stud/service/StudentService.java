package com.example.stud.service;

import java.util.List;

import com.example.stud.model.Student;

public interface StudentService {
	
	//save student data in Database 
	public Student saveStudentData(Student student);
	
	//get All Student Data 
	public List<Student> getStudentData();
	
	//update the Student Data
	public Student updateStudentData(Student st, int id);
	
	//Delete the Student Data
	public Student deleteStudentData(int id);

}
