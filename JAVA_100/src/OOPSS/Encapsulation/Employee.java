package OOPSS.Encapsulation;

// Employee has a Address 
// this is example of aggregation 
public class Employee {
	
    private String empName  ;
	private String empDep ;
	private Address empAdd ;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDep() {
		return empDep;
	}
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	public Address getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(Address empAdd) {
		this.empAdd = empAdd;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDep=" + empDep + ", empAdd=" + empAdd + "]";
	}
	public Employee(String empName, String empDep, Address empAdd) {
		super();
		this.empName = empName;
		this.empDep = empDep;
		this.empAdd = empAdd;
	}
	
	
	
	public Employee() {}  ;
	
	
	
	
	
	
	
}
