package feb7;

public class Student232
{
/// encapsulation ,abstrction  , inheritance  , polymorphishm 
	
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

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	
	
	
	// by implementing a method called toString 
	
	
	
	
	
	
	
}
