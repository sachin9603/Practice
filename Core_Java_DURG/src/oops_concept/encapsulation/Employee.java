package oops_concept.encapsulation;

// aggregation example 
// employee has a address --- this is called has a realtion 
// aggregation  ,, composition 

public class Employee {
	
	private int empId   ;
	private String empName  ;
	private Address empAdd  ;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(Address empAdd) {
		this.empAdd = empAdd;
	}
	public Employee(int empId, String empName, Address empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
	}
	
	public Employee() {}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + "]";
	}  ;
	
	
	

}
