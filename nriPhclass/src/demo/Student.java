package demo;

public class Student {
	
	private int Id  ;
	 
    private String name  ;
    
    private Address address ;
    
    private String Address ;
    


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", address=" + address + "]";
	}

	public Student(int id, String name, Address address) {
		super();
		Id = id;
		this.name = name;
		this.address = address;
	}

	public Student() {
		super();
	}
    
	
	
    
    
    
    
    
	
	

}
