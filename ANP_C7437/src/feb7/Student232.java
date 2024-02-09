package feb7;

import java.util.Objects;

public class Student232 {
    // encapsulation ,abstrction  , inheritance  , polymorphishm 
	
	// java bean kese banati or iska kya purpose 
	
	
	// 1. saare varible private  
	// 2. getter setter bana lo 
	// 3.  private con. ,default vonstrutor  
	
	 ///4 . to string banado 
	
	
	private int studentId  ;
	
	private String studentName  ;
	
	private int marks  ;
	
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int d) {
		this.studentId = d;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	// get method 
	
//	public int getStudentId () {
//		return this.studentId ;
//		
//	}
//	
	// set method 
	
//	public void setStudentId(int iiii) {
//		
//		this.studentId   = iiii ;
//		
//	}
//	
	
	
	// very very very very imp topic 
	
	// constructor 
	
	// jab aap contructor nahi banate ho toh jvm khud aapko degfaut constor har class ka banake deta 
	
	
	public Student232() {
		// implicitly ye deraha hai  object of that class 
		
	}
	
	// parameter vala const 
	
	
	public Student232(int id  , String naam  , int marks ) {
		
		this.studentId   = id  ;
		this.marks  = marks  ;
		this.studentName  = naam  ;
		
		
	}
	// jab bhi hum paramenter vala con banayeneg  tab default vala jo jvm de raha tha vo gayab ho jayega isiliye 
	//aapki jimeedaari ki paramenter bana rahe ho toh defalut  bhi banao 

	@Override
	public String toString() {
		return "Student232 [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}

	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(marks, studentId, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student232 other = (Student232) obj;
		return marks == other.marks && studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}
//	
	
	
	// by implementing a method called toString 
	
	
	
	
	
	
	
}
