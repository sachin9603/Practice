package dec20;

// java bean // this is also example of encapsulation
// has a relation ship 


public class Student  {
	 
	// sare variable private
	// generate getter setter 
	//generated construtor  parametersize  and nonparameter
	
	private int studentId ; 
	
	private String studentName ;
	
	private String studentSubject ;
	
	//agar koi class dusari class ka referance ho that is has - a relation 
	// here student has Address class
	private Address studentaddress;
	
	
	
	
	//mere  client ki need hai ki ek hochahiye address  type  ka data 
	// jo ki  student city  , state , pincode  ;
	
	
	
	
	

	public Address getStudentaddress() {
		return studentaddress;
	}

	public void setStudentaddress(Address studentaddress) {
		this.studentaddress = studentaddress;
	}

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

	public String getStudentSubject() {
		return studentSubject;
	}

	public void setStudentSubject(String studentSubject) {
		this.studentSubject = studentSubject;
	}
//  parameter 
	// inplicitly  ek obj return karega 
	// student ka 
	
	
	
	//whenever i will create a parameter constructor 
	// jo jvm nai diya tha default cons. vo gayab ho jaayega  
	// vo bhi aapko ab banana padega
	
	
	//non parameter   
   public Student() {}

public Student(int studentId, String studentName, String studentSubject, Address studentaddress) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentSubject = studentSubject;
	this.studentaddress = studentaddress;
}

@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSubject=" + studentSubject
			+ ", studentaddress=" + studentaddress + "]";
}



  public void Attendance () {
	  System.out.println("All you need to come college daily ");
  }
 
	
	
	

}
