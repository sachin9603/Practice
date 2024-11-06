package Anudip.EmployeeApp9284Hibernate.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId  ;
	private String employeeName;
	private String employeeUsername ;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeUsername() {
		return employeeUsername;
	}
	public void setEmployeeUsername(String employeeUsername) {
		this.employeeUsername = employeeUsername;
	}
	
	public Employee(int employeeId, String employeeName, String employeeUsername) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeUsername = employeeUsername;
	}
	
	public Employee( String employeeName, String employeeUsername) {
		super();
	
		this.employeeName = employeeName;
		this.employeeUsername = employeeUsername;
	}
	
	public Employee() {}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, employeeUsername);
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
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& Objects.equals(employeeUsername, other.employeeUsername);
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeUsername="
				+ employeeUsername + "]";
	} ;
	
	
	
	

}
