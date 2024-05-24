package com.Anudip.MasterEmpAPP;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id  
	private int id  ;
	private String depname ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepname() {
		return depname;
	}
	
	public void setDepname(String depname) {
		this.depname = depname;
	}
	
	public Department(int id, String depname) {
		super();
		this.id = id;
		this.depname = depname;
	}
	
	public Department() {} ;
	


}
