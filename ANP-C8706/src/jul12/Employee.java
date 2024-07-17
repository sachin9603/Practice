package jul12;
// java bean
public class Employee {
	// all varible are private 
	private String name  ;
	private	String id  ;
	private String address ;
	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// both costructor
	public Employee(String name, String id, String address) {
		
		this.name = name;
		this.id = id;
		this.address = address;
		
		
	}
	public Employee() {
		super();
	}
	
	// to string 
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
	

}
