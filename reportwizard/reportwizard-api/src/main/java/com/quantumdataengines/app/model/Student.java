package com.quantumdataengines.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Student {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private int rollNum;
	private int marks;
	
	
	
	public Student(long id, String name, int rollNum, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.rollNum = rollNum;
		this.marks = marks;
	}
	
	

}
