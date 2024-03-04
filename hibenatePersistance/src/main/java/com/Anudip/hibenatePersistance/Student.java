package com.Anudip.hibenatePersistance;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Student {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId ;
	
	private String studentname;
	
    @OneToMany
	private List<Books> Booklist  = new ArrayList<>();
    
	private int marks ; 

	// aapko moi coloum nahi bana hai studednt table mai 
	@OneToOne(mappedBy ="s")
	private Laptop lp  ;
	
     public Laptop getLp() {
		return lp;
	}




	public void setLp(Laptop lp) {
		this.lp = lp;
	}




	public Student(String studentname, int marks) {
		
		this.studentname = studentname;
		this.marks = marks;
	}


	public List<Books> getBooklist() {
		return Booklist;
	}




	public void setBooklist(List<Books> Booklist) {
		this.Booklist = Booklist;
	}


	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int studentId, String studentname, int marks) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.marks = marks;
		
	}

	public Student() {
		super();
	}
    


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", marks=" + marks + "]";
	}
	
	
	

}
