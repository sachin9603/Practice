package feb19;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	
	private int empID  ;
	private String empName;
	private double empSalary  ;
	
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public Employee(int empID, String empName, double empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public Employee() {}
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
//	
	
	// ye method automatic hi aayi jab aap comaparable interface ko implements karoge 
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
//		if (this.getEmpSalary() == o.getEmpSalary()) {
//			return 0 ;
//		}else if ( this.getEmpSalary() > o.getEmpSalary()) {
//			return 1 ;
//		}else {
//			return  -1  ;
//		}
		
	
		//o.getEmpID().compare
	return o.getEmpName().compareTo( o.getEmpName()) ;
	 
	}
	// hascode // what is equals 
	@Override
	public int hashCode() {
		return Objects.hash(empID, empName, empSalary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empID == other.empID && Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary);
	}
	
	//
	
	

}
