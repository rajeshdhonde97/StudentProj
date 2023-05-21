package com.example.stud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stud.model.Student;
import com.example.stud.service.StudentImpl;

@RestController
@RequestMapping("/stud")
public class StudentController {
	
	@Autowired
	private StudentImpl studentImpl;
	
	@PostMapping("/save")
	public Student saveStudentData(@RequestBody Student student) {
		
		return studentImpl.saveStudentData(student);
	}
	
	
	@GetMapping("/getAll")
	public List<Student> getStudentData() {
		
		return studentImpl.getStudentData();
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudentData(@RequestBody Student st, @PathVariable("id") int id) {
		
		return studentImpl.updateStudentData(st, id);
	}

	@DeleteMapping("delete/{id}")
	public Student deleteStudentData(@ PathVariable int id) {
		
		return studentImpl.deleteStudentData(id);
	}
}
