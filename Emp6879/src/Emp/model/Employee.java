package Emp.model;

public class Employee {

	private int empId  ;
	private String empName ;
	private double salary  ;
	private int depid  ;
	
	
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public Employee(int empId, String empName, double salary, int depid) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.depid = depid;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", depid=" + depid + "]";
	}
		
}
