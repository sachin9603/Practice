package sep30.HasA;
// Employee class has address 

public class Employee {

	int    id  ;
	String name ;
	
	Address address ;// one class is taking other class as data type 

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	public Employee() {} ;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	
	
	
	
	
}
