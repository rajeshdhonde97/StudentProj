package com.example.stud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stud.model.Student;
import com.example.stud.repositiory.StudentRepository;



@Service
public class StudentImpl implements StudentService{
	
	@Autowired
	private StudentRepository  studentRepo;

	@Override
	public Student saveStudentData(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getStudentData() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student updateStudentData(Student st, int id) {
		// TODO Auto-generated method stub
		  Student s=studentRepo.findById(id).orElseThrow();
		  s.setFirstname(st.getFirstname());
		  s.setLastname(st.getLastname());
		  s.setCity(st.getCity());
		  s.setMarks(st.getMarks());
		  return st;
	}

	@Override
	public Student deleteStudentData(int id) {
		// TODO Auto-generated method stub
		studentRepo.findById(id).orElseThrow();
		studentRepo.deleteById(id);
		return null;
	}
	

}
