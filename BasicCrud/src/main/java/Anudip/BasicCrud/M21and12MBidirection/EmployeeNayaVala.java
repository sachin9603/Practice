package Anudip.BasicCrud.M21and12MBidirection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeNayaVala {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private int empId  ;
	
	private String empName ;
	
	private String email ;

	
	@ManyToOne
	@JoinColumn(name  = "depId")
	private Department department ;


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", department=" + department
				+ "]";
	}


	public EmployeeNayaVala(int empId, String empName, String email, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.department = department;
	}

	
	public EmployeeNayaVala() {} ;
	
	
}
