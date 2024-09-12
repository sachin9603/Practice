package sep6.collectionn;

public class Student implements Comparable<Student>{
	
	private int id  ;
	private String name  ;
	private int marks  ;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Student(int id, String name, int marks) {
	
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public Student() {}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if(this.marks == o.marks)
		{
			return this.name.compareTo(o.name);
		}else if (this.marks > o.marks) {
			return 1 ;
		}else {
			return  -1 ;
		}
	}
	
	
	
	

}
