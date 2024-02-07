package dec20;

public class BcaStudent extends Student {
//  yaha student class ko  hum parent class yaa phir  super class bhi bolte hai
	
	//BCAStudent is a student 
	int tutionFee ;

	/**
	 * 
	 */
	public BcaStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BcaStudent(int studentId, String studentName, String studentSubject, Address studentaddress , int fees ) {
		super(studentId, studentName, studentSubject, studentaddress);
		// TODO Auto-generated constructor stub
		
		this .tutionFee = fees  ;
		
	}

	@Override
	public String toString() {
		return "BcaStudent [tutionFee=" + tutionFee + ", getStudentaddress()=" + getStudentaddress()
				+ ", getStudentId()=" + getStudentId() + ", getStudentName()=" + getStudentName()
				+ ", getStudentSubject()=" + getStudentSubject() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
 

	
	
	

        
	
	
	
	// jab ek classs dusari class ko extends karti ahi 
	// jis class ko extends kar rahi hai  vo haoghai  parent class
	// or jo class extend karti hai vo class hai child class 
	// is pure khel  ko  inheritance
	
	
	
	
	
	
}
