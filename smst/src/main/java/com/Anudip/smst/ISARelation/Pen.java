package com.Anudip.smst.ISARelation;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1") 
public class Pen extends MyProduct{

	
	private String color ;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Pen(Integer id, String name, String color) {
		super(id, name);
		this.color = color;
	}

	public Pen(Integer id, String name) {
		super(id, name);
	}
	
	
	
	
}

