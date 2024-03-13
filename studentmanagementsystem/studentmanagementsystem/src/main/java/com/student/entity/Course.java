package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "coursedetails")
public class Course {
@Id	
@Column(length = 10)
private String courseID;

@Column(length = 30,nullable = false)
private String courseTitle;

@Column(nullable = false)
private int credits;

public String getCourseID() {
	return courseID;
}
public void setCourseID(String courseID) {
	this.courseID = courseID;
}
public String getCourseTitle() {
	return courseTitle;
}
public void setCourseTitle(String courseTitle) {
	this.courseTitle = courseTitle;
}
public int getCredits() {
	return credits;
}
public void setCredits(int credits) {
	this.credits = credits;
}
public Course(String courseID, String courseTitle, int credits) {
	super();
	this.courseID = courseID;
	this.courseTitle = courseTitle;
	this.credits = credits;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Course [courseID=" + courseID + ", courseTitle=" + courseTitle + ", credits=" + credits + "]";
}

}
