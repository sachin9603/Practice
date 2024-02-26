package com.Anudip.in.FirstMaven;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentSt {

	@Id
     private int roll;
	private int marks;
	private String name;
	public StudentSt() {
	// TODO Auto-generated constructor stub
	}
	public StudentSt(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	}
	public int getRoll() {
	return roll;
	}
	public void setRoll(int roll) {
	this.roll = roll;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getMarks() {
	return marks;
	}
	public void setMarks(int marks) {
	this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";

	}
}
