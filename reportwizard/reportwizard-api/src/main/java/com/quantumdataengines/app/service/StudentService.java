package com.quantumdataengines.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quantumdataengines.app.dao.StudentDAO;
import com.quantumdataengines.app.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	public List<Student> getStudent() {
		return studentDAO.getStudent();
	}

}
