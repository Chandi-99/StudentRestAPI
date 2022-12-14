package com.example.demo1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@NotBlank
	private Long id;
	
	@NotBlank
	@Size(max=15)
	private String studentNumber;
	
	@NotBlank
	@Size(max=25)
	private String studentName;
	
	@NotBlank
	@Size(max=15)
	private String city;
	
	@NotBlank
	@Size(max=25)
	@Email
	private String email;

	//no argument constructor
	public Student() {
		
	}

	//all argument constructor
	public Student(String studentNumber, String studentName, String city,String email) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.city = city;
		this.email= email;
		
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
