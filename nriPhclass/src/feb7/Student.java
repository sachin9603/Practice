package feb7;

public class Student {

	/// sab likha hai 
	
	int id  ; 
	String name  ;
	String Collge;
	
	
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
	public String getCollge() {
		return Collge;
	}
	public void setCollge(String collge) {
		Collge = collge;
	}
	
	
	
	public Student() {
		super();
	}
	public Student(int id, String name, String collge) {
		super();
		this.id = id;
		this.name = name;
		Collge = collge;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Collge=" + Collge + "]";
	} 
	
	
	
	
	
	
}
