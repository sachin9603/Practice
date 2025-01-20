package com.Anudip.smst.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Student_detailsss")
public class smst_  {
	
	@Id // primary 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rollNumber ;
	
	
	// i want to make this Primary key as auto increment  
	private String name  ;
	
	private String address  ;
	
	
	private String abcId ;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAbcId() {
		return abcId;
	}

	public void setAbcId(String abcId) {
		this.abcId = abcId;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	
	public smst_(String name, String address, String abcId) {
	
		this.name = name;
		this.address = address;
		this.abcId = abcId;
	}

	public smst_ (){} ;
	
	
	

}
