package oops;

public class Student {
	
	///we need private access modifier
	
	private String studentName ;
	
	private String studentSubject;
	
	private int marks ;
	

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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		if (marks<33) {
			this.marks = 33;
		}else {
		this.marks = marks;
		}
	}
	
	
	
	
	
	

}
