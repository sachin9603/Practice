package dec12.Collectionn;

public class Student implements Comparable<Student> {
	
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
	public void pado() {} ;
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.rollno  == o.rollno) {
			
			return this.name.compareTo(o.name);
		}else if (this.rollno <  o.rollno) {
			return 1  ;
		}else {
			return -1 ;
		}
	}
	
	
	

}
