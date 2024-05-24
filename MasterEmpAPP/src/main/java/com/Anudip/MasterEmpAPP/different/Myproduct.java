package com.Anudip.MasterEmpAPP.different;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Myproduct {
	
	@Id
	private int  id  ;
	
	private String name  ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Myproduct [id=" + id + ", name=" + name + "]";
	}

	public Myproduct(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Myproduct() {} ;
	
	
	
	

}
