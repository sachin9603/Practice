package jan9;

public class Student implements  Comparable<Student>  {
	
	int studentId ;
	
	String studentName ;
	
	int studentMarks ;

	public Student(int studentId, String studentName, int studentMarks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	
	public Student() {
		
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

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student   [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}

	@Override
	public int compareTo(Student otherStudent) {
		// TODO Auto-generated method stub
		// Compare based on rollNumber
        int marksComparison = Integer.compare(this.studentMarks, otherStudent.studentMarks);

        // If rollNumbers are equal, then compare based on name
        if (marksComparison == 0) {
            return this.studentName.compareTo(otherStudent.studentName);
        }

        return marksComparison;
	}

}
