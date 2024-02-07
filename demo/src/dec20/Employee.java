package dec20;

public class Employee {
 
	private int empId  ;
	
	private int empName  ;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpName() {
		return empName;
	}

	public void setEmpName(int empName) {
		this.empName = empName;
	}

	public Employee(int empId, int empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public void  shift() {
		System.out.println(" it will be from 9 to 6");
	}

	public Employee() {
	}
	 
}
