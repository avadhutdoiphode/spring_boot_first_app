package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

 public class StudentController 
 {
	 //http://localhost:8080/student
	//we get rest api
	@GetMapping("/student")
   public Student getStudent()
   {
	   return new Student("avadhut" , "doiphode");
   }
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> students = new ArrayList<>();
		students.add(new Student("avadht", "Doiphoe"));
		students.add(new Student("patil", "avadhut"));
		return students;
	}
 }
 