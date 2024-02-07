package demo;
// this is java bean 
// and this is perfect example of ecapsulation 


public class Employee {
	// private varibale  , getter setter , construtor  , parameter constructor ,  toString 
	
	private int empId ;
	
	private String empName  ;
	
	private String empUserName  ;
	
	public Employee(int empId, String empName, String empUserName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empUserName = empUserName;
	}
	
	public Employee() {} ;
	

	
	

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

	public String getEmpUserName() {
		return empUserName;
	}

	public void setEmpUserName(String empUserName) {
		this.empUserName = empUserName;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empUserName=" + empUserName + "]";
	}
	
	
	public void lunchKaTime() {
		System.out.println("sabke lunch ka time hai 1 pm to 2 pm ");
	}

	
	

}
