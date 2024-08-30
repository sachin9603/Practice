package Anudip.BasicCrud.M21and12MBidirection;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private int depId  ;
	
	private String depName ;
	
	@OneToMany(mappedBy = "department" , cascade = CascadeType.ALL )
	private Set<EmployeeNayaVala> employees  = new HashSet<EmployeeNayaVala> () ;

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Set<EmployeeNayaVala> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<EmployeeNayaVala> employees) {
		this.employees = employees;
	}

	public Department(int depId, String depName, Set<EmployeeNayaVala> employees) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.employees = employees;
	}
	
	
	public Department() {}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", employees=" + employees + "]";
	} ;
	
	
	

}
