package jul1;

public class Student {
	// java bean is example of encapsulation 
	
	//all varibable private 	
	private int studentId  ;
	
	private	String studentName ;
	
	// all args contructor
	public Student(int studentId, String studentName) {
		
		this.studentId = studentId;
		this.studentName = studentName;
	}

	
	// getters and setter 

	
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

	//no args contructor
	public Student() {}

	// to string method
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	


	
	

}
