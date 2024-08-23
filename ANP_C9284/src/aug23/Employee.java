package aug23;

import java.io.Serializable;

public class Employee {
	
	//bean 
	
	private  String empName  ;
	
	private int empId  ;
	
	private  double salary  ;
	
	private Address address  ;
	
	static public  String company  = "TSC"    ;
	
	
	
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		if(empId  < 0 ) {
			System.out.println("can't set");
		}else {
			this.empId = empId;
		}
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + ", address=" + address
				+ "]";
	}

	public Employee(String empName, int empId, double salary, Address address) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		this.address = address;
	}

	public Employee() {
		
	}
	
	
	
	
	
	
	
	

}
