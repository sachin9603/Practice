package jul5;

public class Student {
	
	private int id  ; 
	
	private String name  ;
	
	private Address add ;
	

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

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Student(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public Student() {} ;
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	
	
	
	
	
	
	

}
