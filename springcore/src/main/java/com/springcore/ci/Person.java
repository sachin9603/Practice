package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;

	public Person(String name, int personId,Certi certi) {
		this.name = name;
		this.personId = personId;
		this.certi=certi;
	
	}

	@Override
	public String toString() {		
		return this.name+" : "+this.personId+"{ "+this.certi.name+" }";
	}
	
	
}
