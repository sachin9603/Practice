package Demo3;

public class Employee {
// jaba bbhi ek cals s k saare variable private and there are getter setter to access them and therer 
	
	//default and paramerter construror 
	private int empId;
    private String empName ;
    private String  empDepartment;
    // ye ban gaya static variable 
    
    public static String empCompnay = "Anudip" ;
    
    
    
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
    
	public Employee(int empId, String empName, String empDepartment) {
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
	}
	public Employee() {
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + "]";
	}
	
	/// your task is to create a java bean with name vehicle  
	// private int  wheels  ,, int speed =    = String vehcile name 
	
	
    
}
