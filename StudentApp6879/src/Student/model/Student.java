package Student.model;

public class Student {
	 
	private int rollnumber  ;
	private String name  ;
	private int marks  ;
	
	
	
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
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
	
	public Student(int rollnumber, String name, int marks) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	

}
