package com.student.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Feedback {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int feedbackId;

@Column(length=20)
private String instructorName;

@Column(length = 100)
private String Feedback;
@Temporal(TemporalType.DATE)
private Date feedbackDate=new Date();
//one student can give many feedback

@ManyToOne
@JoinColumn(name = "StudentID")
private Student student;

public int getFeedbackId() {
	return feedbackId;
}

public void setFeedbackId(int feedbackId) {
	this.feedbackId = feedbackId;
}

public String getInstructorName() {
	return instructorName;
}

public void setInstructorName(String instructorName) {
	this.instructorName = instructorName;
}

public String getFeedback() {
	return Feedback;
}

public void setFeedback(String feedback) {
	Feedback = feedback;
}

public Date getFeedbackDate() {
	return feedbackDate;
}

public void setFeedbackDate(Date feedbackDate) {
	this.feedbackDate = feedbackDate;
}

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

public Feedback( String instructorName, String feedback, Student student) {
	super();
	
	this.instructorName = instructorName;
	Feedback = feedback;
	this.student = student;
}

public Feedback() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Feedback [feedbackId=" + feedbackId + ", instructorName=" + instructorName + ", Feedback=" + Feedback
			+ ", feedbackDate=" + feedbackDate + ", student=" + student + "]";
}


}
