package cons;

public class Student {
// nahi koi default constructor nahi banaya 
	//then 
	
	int studentId ; 
	
	String studentName ;
	
	//constructor ka kaam hai obj ko construct kar ke dena 
	// parameter constructor 
	public Student(int id  , String name ) {
		this.studentId = id ;
		this.studentName = name  ;
		
	}
	
	
	// jese hi parameter cons. banaya default aapko nahi milega ab ab default bhi aapko 
	// khud banana padega 
	
	public Student() {
		
	}
	
	
	
	
}
