package opps.Inheritance;

// has a relation 
// Student has a Address 
public class Student {
	
	private String studentName  ;
	private Address studentAddess ;
	private String studentsubject ;
	///private Course studentCourse  ;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getStudentAddess() {
		return studentAddess;
	}
	public void setStudentAddess(Address studentAddess) {
		this.studentAddess = studentAddess;
	}
	public String getStudentsubject() {
		return studentsubject;
	}
	public void setStudentsubject(String studentsubject) {
		this.studentsubject = studentsubject;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAddess=" + studentAddess + ", studentsubject="
				+ studentsubject + "]";
	}
	public Student(String studentName, Address studentAddess, String studentsubject) {
		super();
		this.studentName = studentName;
		this.studentAddess = studentAddess;
		this.studentsubject = studentsubject;
	}
	public Student() {
		super();
	}
	
	
	

}
