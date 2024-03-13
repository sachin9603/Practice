package com.Anudip.EmployeeApp6878;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 

public class Department {
	
	@Id
	private int depid  ;
	 private String name ;
	 
 @Override
	public String toString() {
		return "Department [depid=" + depid + ", name=" + name + "]";
	}
public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

 public Department(int depid, String name) {
		super();
		this.depid = depid;
		this.name = name;
	}
public Department () {} ;
 
	
	 
}
