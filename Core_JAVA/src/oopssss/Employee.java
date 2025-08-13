package oopssss;



// i amm creating it as bean class and will create 
public class Employee {
	
	private String empName  ;
	
	// Employee class has a address ---  aggregation 
	private Address  empAddress  ; // yaha par data type ki jagah hum addess class ko use karenge 
	
    
	private String empDepartment ;


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Address getEmpAddress() {
		return empAddress;
	}


	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}


	public String getEmpDepartment() {
		return empDepartment;
	}


	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}


	public Employee(String empName, Address empAddress, String empDepartment) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
		this.empDepartment = empDepartment;
	}
	
	
	
 	
	public Employee( ) {}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAddress=" + empAddress + ", empDepartment=" + empDepartment + "]";
	}  ;
	

}
