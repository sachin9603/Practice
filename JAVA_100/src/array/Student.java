package array;

public class Student {
	
	int student_rollnumber ;
	
	String student_name  ;

	public Student(int roll_number, String name) {
		
		this.student_rollnumber = roll_number;
		this.student_name = name;
	}
	
	
	public Student() {}


	@Override
	public String toString() {
		return "Student [student_rollnumber=" + student_rollnumber + ", student_name=" + student_name + "]";
	};
	
	
	
	

}
