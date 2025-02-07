package com.Anudip.smst.bidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPP")
public class Employee {

	
	@Id 
	private int id ;
	
	private String name  ;
	
	
	@ManyToOne
	@JoinColumn(name = "deparmentIDD")
	private Depp deparment  ;


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


	public Depp getDeparment() {
		return deparment;
	}


	public void setDeparment(Depp deparment) {
		this.deparment = deparment;
	}


	public Employee(int id, String name, Depp deparment) {
		super();
		this.id = id;
		this.name = name;
		this.deparment = deparment;
	}
	public Employee() {}  ;
	
	
	
	
	
	
}
