package dec12.Collectionn;

public class Student {
	
	int rollno  ;
	String name  ;
	int marks  ;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Student() {}  ;
	
	public Student(int rollno, String name, int marks) {

		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	

}
