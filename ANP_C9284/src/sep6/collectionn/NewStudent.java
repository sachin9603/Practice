package sep6.collectionn;

public class NewStudent {
     
	 int id  ;
	 String name  ;
	 int marks  ;
	
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
	public NewStudent(int id, String name, int marks) {
	
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public NewStudent() {}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
