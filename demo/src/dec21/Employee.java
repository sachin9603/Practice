package dec21;


// java bean  
public class Employee {
	
	
	private int empid  ; 
	
	private String empName  ; 
	
	private String department ;
// this is has a relation ship 
	
	 private Address address ;
	 
	//private String address ;
	
	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public Employee() {
	}



	public Employee(int empid, String empName, String department, Address address) {
		this.empid = empid;
		this.empName = empName;
		this.department = department;
		this.address = address;
	}
	
	
	
	
	
	
	
	
	
	
	

}
