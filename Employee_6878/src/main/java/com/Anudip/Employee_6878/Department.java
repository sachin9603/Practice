package com.Anudip.Employee_6878;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
 
	  @Id
	  private int did ;
	  private String dname  ;
//	  
	  @OneToMany(mappedBy = "dep" ,cascade = CascadeType.ALL ,fetch= FetchType.EAGER)
	  private Set<Employee> employees = new HashSet<Employee>();

	  
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	  
	public Department() {}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	} ;
	
	  
}
