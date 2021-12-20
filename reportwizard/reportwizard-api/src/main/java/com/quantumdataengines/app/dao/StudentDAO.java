package com.quantumdataengines.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.quantumdataengines.app.model.Student;

@Repository
public class StudentDAO {

	public List<Student> getStudent() {
		List<Student> student=new ArrayList<Student>();
		student.add(new Student(1,"kamlesh",11,80));
		student.add(new Student(2,"manish",12,85));
		student.add(new Student(3,"bhuwalram",13,90));
		student.add(new Student(4,"maheshwaridevi",14,100));
		return student;
	}

}
