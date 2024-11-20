package nov_14.collection;

public class Student  implements Comparable<Student>{

	// if i want to store its object into treeset then i need to implements Comparable interface 
	
	private  int id  ;
	private	String name  ;
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
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
	// these is deal with two object 
		// +  -  0 
		
		if (this.id == o.id) {
			return o.getName().compareTo(this.getName()) ;
			
		}else if (this.id > o.id) {
			return 1  ;
		}else {
			return -1  ;
			
		}
		
		
		
	
	}
	
	
	
}
