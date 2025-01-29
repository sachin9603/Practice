package com.Anudip.smst.ISARelation.TablePerClass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {

	
	@Id
	private Integer vId ;
	
	
	private String manufacture ;


	public Integer getvId() {
		return vId;
	}


	public void setvId(Integer vId) {
		this.vId = vId;
	}


	public String getManufacture() {
		return manufacture;
	}


	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}


	public Vehicle(Integer vId, String manufacture) {
		super();
		this.vId = vId;
		this.manufacture = manufacture;
	}
	
	
	public Vehicle() {}  ;
	
	
}
