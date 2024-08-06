package Model;
// java bean of student 

public class Student {
	
	private int studentId  ;
	
	private String studentName ;
	
	private int studentmarks ;
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentmarks=" + studentmarks
				+ "]";
	}

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int studentmarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentmarks = studentmarks;
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

	public int getStudentmarks() {
		return studentmarks;
	}

	public void setStudentmarks(int studentmarks) {
		this.studentmarks = studentmarks;
	}
	
	

}
