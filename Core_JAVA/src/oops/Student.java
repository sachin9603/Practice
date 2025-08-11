package oops;

public class Student {
	
	
	// class  ----- is blue print for creating objects 
	
	//state 
	int rollNumber  ;
	String name ;
	
	String subject  ;
	String address  ; 
	
	
	
	// behaviour 
	public void studty() {
		System.out.println("yes are studing very hard");
	}
	
	
	public int payfees(int amount) {
		
		int k  = amount - 2000 ;
		System.out.println("your amount has been submited successfully " + k);
		
		return k  ;
		
	}
	
	
	public void display() {
		System.out.println("New Student Data --->");
		System.out.println("student name is " + this.name);
		System.out.println("student Address is " + this.address);
		System.out.println("student name is " + this.rollNumber);
		System.out.println("student name is " + this.subject);
		
		}
	
	
	
	
	
	
	
	
	// constructor   --- banane vala 
	
	// return type --- none --> implicitly  it is returning object of that class
	public Student() {
		
	}
	
	
	// pamertise contructor 
	
	// there should be always a default con. when you are creating parameer
	public Student (int roll  , String name  , String sub  , String add) {
		
		this.rollNumber = roll  ;
		this.name  = name  ;
		this.subject  = sub ;
		this.address  = add  ;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
