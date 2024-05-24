package com.Anudip.batch7437_hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "studentWithAddresslist")// agar @Table(name= "sample_name") toh table ka naam chage ho jaayega 

public class Student {
	// id  , name  
	// city state pincode type 
	//
	@Id
	private int id  ;
	
	private String name  ;
	
	
	
//	
//	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name="city" , column=@Column(name="current_City")),
//		@AttributeOverride(name="state" , column=@Column(name="current_state")),
//		@AttributeOverride(name="pincode" , column=@Column(name="current_pincode"))
//	})
//	private Address curr_address ;
//	
//	
//	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name="city" , column=@Column(name="home_City")),
//		@AttributeOverride(name="state" , column=@Column(name="home_state")),
//		@AttributeOverride(name="pincode" , column=@Column(name="home_pincode"))
//	})
//	private Address home_address ;
	
	@ElementCollection
	@Embedded
    private List<Address> ListOfaddress   = new ArrayList<>() ;
	
	

	public List<Address> getListOfaddress() {
		return ListOfaddress;
	}

	public void setListOfaddress(List<Address> listOfaddress) {
		ListOfaddress = listOfaddress;
	}

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

	
//
//	public Address getCurr_address() {
//		return curr_address;
//	}
//
//	public void setCurr_address(Address curr_address) {
//		this.curr_address = curr_address;
//	}
//
//	public Address getHome_address() {
//		return home_address;
//	}
//
//	public void setHome_address(Address home_address) {
//		this.home_address = home_address;
//	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name +  "]";
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	public Student() {} ;
	
}
