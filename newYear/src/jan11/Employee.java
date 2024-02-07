package jan11;

import java.util.Objects;

public class Employee extends Company {

	
	private  int  empId  ;
	
	private String empName  ;
	
	private String empDepartment ;
	
	private int empCode ;
	
//	this() 
//	super() ; parent class ka constructor
	
//	public void callkaro() {
//		
//		
//	}
	
	
	public static void runKro(int s) {
		System.out.println("runkaro " + s + " times ");
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

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empDepartment, empId, empName);
	}

	public Employee(int code, String empName, String empDepartment) {
		this.empCode = code ;
		empName = empName;
		empDepartment = empDepartment;
	}
	public Employee() {
		this(4) ;
		
		
//		super.name = "tata" ;

		System.out.println(super.name);
		System.out.println("mai hu emp ka const ");
		
	} ;
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empDepartment, other.empDepartment) && empId == other.empId
				&& Objects.equals(empName, other.empName);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + "]";
	}
	
	
	private Employee (int hours){
		
		System.out.println("aapne "+ hours +" gante kaam nahi kiya ");
		
	}
	
	
	
	
	
}
