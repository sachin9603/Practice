package jul2;

public class Employee {
	
	private String name  ;
	
	private String id  ;
	
	private double salary  ;
	
	
//	private String address  ;  // city  state pincode 
	
	private Address address ; // Aggregation or has a relationship 
	
	

	
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




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	public Employee(String name, String id, double salary, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
	}

	public Employee() {} ;
	



	




	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}




	public void EmployeeKiShift() {
		System.out.println("sabki common shift hai  9 to 6 ");
	}
	

}
