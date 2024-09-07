package Anudip.BasicCrud.M21and12MBidirection;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "DEPARTMENT")
public class Department {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private int depId  ;
	
	@NotNull
	@NotEmpty
	private String depName ;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL  )
	private Set<EmployeeNayaVala> employeeNayaValas  = new HashSet<EmployeeNayaVala> () ;

	
     
        
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

	public Set<EmployeeNayaVala> getEmployeeNayaValas() {
		return employeeNayaValas;
	}

	public void setEmployeeNayaValas(Set<EmployeeNayaVala> employees) {
		this.employeeNayaValas = employees;
	}

	public Department(int depId, String depName, Set<EmployeeNayaVala> employeeNayaValas) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.employeeNayaValas = employeeNayaValas;
	}
	
	
	public Department() {}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", employees=" + employees + "]";
	} ;
	
	
	

}
