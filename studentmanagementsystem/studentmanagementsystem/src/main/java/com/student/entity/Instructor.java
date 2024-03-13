package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Instructor {
@Id
@Column(length = 10)
private String instructorId;

@Column(length = 30,nullable = false)
private String firstName;

@Column(length = 30,nullable = false)
private String lastName;

@Column(length = 30,nullable = false)
private String email;

public String getInstructorId() {
	return instructorId;
}

public void setInstructorId(String instructorId) {
	this.instructorId = instructorId;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Instructor(String instructorId, String firstName, String lastName, String email) {
	super();
	this.instructorId = instructorId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
}

public Instructor() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Instructor [instructorId=" + instructorId + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", email=" + email + "]";
}


}
