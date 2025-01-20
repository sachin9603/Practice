package studentManagementSystem.model;

public class Student {
	
//	  StudentID INT primary key ,
//	    studentName VARCHAR(225),
//	    studentAddress VARCHAR(225),
//	    classid INT ,
	private Integer StudentID ;
	private String studentName  ;
	private String studentAddress ;
	private Integer classid ;
	public Student(Integer studentID, String studentName, String studentAddress, Integer classid) {
		super();
		StudentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.classid = classid;
	}
	public Integer getStudentID() {
		return StudentID;
	}
	public void setStudentID(Integer studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Integer getClassid() {
		return classid;
	}
	public void setClassid(Integer classid) {
		this.classid = classid;
	}
 
	public Student() {}
	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", classid=" + classid + "]";
	}  ;
	
	
	
	
	

	

}
