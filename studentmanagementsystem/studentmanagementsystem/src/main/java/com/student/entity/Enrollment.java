package com.student.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Enrollment {
@Id
@Column(length = 10)
private String enrollmentId;
@Temporal(TemporalType.DATE)
private Date enrollmentDate=new Date();

@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
@JoinColumn(name = "StudentID")
private Student student; //foreign key in db,but hibernate it will hold student object

@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
@JoinColumn(name = "CourseID")
private Course course;

@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
@JoinColumn(name = "InstructorID")
private Instructor instructor;

public String getEnrollmentId() {
	return enrollmentId;
}

public void setEnrollmentId(String enrollmentId) {
	this.enrollmentId = enrollmentId;
}

public Date getEnrollmentDate() {
	return enrollmentDate;
}



public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

public Course getCourse() {
	return course;
}

public void setCourse(Course course) {
	this.course = course;
}

public Instructor getInstructor() {
	return instructor;
}

public void setInstructor(Instructor instructor) {
	this.instructor = instructor;
}

public Enrollment(String enrollmentId,  Student student, Course course, Instructor instructor) {
	super();
	this.enrollmentId = enrollmentId;
	this.student = student;
	this.course = course;
	this.instructor = instructor;
}

public Enrollment() {
	super();
}

@Override
public String toString() {
	return "Enrollment [enrollmentId=" + enrollmentId + ", enrollmentDate=" + enrollmentDate + ", student=" + student
			+ ", course=" + course + ", instructor=" + instructor + "]";
}


}
