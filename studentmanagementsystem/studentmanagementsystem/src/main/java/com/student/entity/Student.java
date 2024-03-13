package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id	
private String studentId;

@Column(name = "FisrtName",length = 30)
private String firstName;

@Column(name = "LastName",length = 30)
private String lastName;

@Column(length = 10)
private String gender;

@Column(length = 50)
private String email;

public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Student(String studentId, String firstName, String lastName, String gender, String email) {
	super();
	this.studentId = studentId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.email = email;
}


public Student(String firstName, String lastName, String gender, String email) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.email = email;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
			+ gender + ", email=" + email + "]";
}


}
