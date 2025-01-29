package com.Anudip.smst.ISARelation.joinedTable;

import javax.persistence.Entity;

@Entity
public class Pet extends Animal {
	
	private String petType ;
	

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public Pet(Integer aid, String name, String petType) {
		super(aid, name);
		this.petType = petType;
	}
	
	public Pet() {}  ;
	
	
	
	

}
