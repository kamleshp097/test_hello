package com.quantumdataengines.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quantumdataengines.app.model.Student;
import com.quantumdataengines.app.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	private StudentService studentService;
	
	@GetMapping
	public List<Student> getStudent()
	{
		return studentService.getStudent();
		
	}

}
