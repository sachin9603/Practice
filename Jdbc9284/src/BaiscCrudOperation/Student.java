package BaiscCrudOperation;

public class Student {

	private int studentId;
	private String studentName  ;
	private String address  ;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String add) {
		this.address = add;
	}
	public Student(int studentId, String studentName, String address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
