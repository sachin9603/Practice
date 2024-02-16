package feb16;

public class Student {
 
	// I am creating address as datatype into this stduent class 
	// and this is called has a relation ship  
	
	private String  name  ; 
	
	private int id  ; 
	
	// has a relationship ka example 
	private Address address ;
	
	

	public Student(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	
	// getter setter , parameter cons  , default cons  , to sting 
	
    
}
