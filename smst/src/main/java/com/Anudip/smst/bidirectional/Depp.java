package com.Anudip.smst.bidirectional;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Depp {
	
	@Id 
	private int depId  ;
	private String depName  ;
	
	
	@OneToMany( mappedBy = "deparment" ,cascade  = CascadeType.ALL)
     private Set<Employee> employees  = new HashSet<>()  ;


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


	public Set<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}


	public Depp(int depId, String depName, Set<Employee> employees) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.employees = employees;
	}
	
	public Depp() {}  ;

}
