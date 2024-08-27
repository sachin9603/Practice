package Anudip.BasicCrud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity 
@Table(name = "Employee_data")
@NamedQuery(query = "select e from Employee e where e.id = :id" ,name  = "find emp id")
@NamedNativeQueries({
	
	@NamedNativeQuery(
			name  = "Find All Employee",
			query = "select * from Employee_data" , resultClass  = Employee.class 
			),
	
	@NamedNativeQuery(
			name  = "Find Employee by name",
			query = "select * from Employee_data where empName = ?" , resultClass  = Employee.class 
			)
	
	
	
	
})


public class Employee {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private int empID  ;
	private String empName  ;
	private double empSalary  ;
	private String deg;
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
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	public Employee() {} ;
	
	public Employee(int empID, String empName, double empSalary, String deg) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deg = deg;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + ", deg=" + deg + "]";
	} 
	
	
	
	
	
	

}
