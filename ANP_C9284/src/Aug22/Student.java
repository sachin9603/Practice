package Aug22;

public class Student {
	
	/// what is encapsulation  , what is java bean 
	
	private int id ;
	private String name  ;
	private int marks  ;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		if(id < 0) {
			System.out.println("please give correct id ");
		}else {
			this.id = id;

		}
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
	} ;
	
	
	
	
	
	///getter and setter \
	
	
	
	

}
