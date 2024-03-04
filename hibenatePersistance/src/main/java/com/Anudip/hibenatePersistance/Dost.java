package com.Anudip.hibenatePersistance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Friends")
public class Dost {
  
	@Id
	private int dId ;
	
	
	@Column(name = "dost_name")
	private String  dName  ;
	
//	has a relationship 
	
	private Address dAddress ;
	
//	onetoone 
//	oneto many 
	

	public Dost(int dId, String dName, Address dAddress) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dAddress = dAddress;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public Address getdAddress() {
		return dAddress;
	}

	public void setdAddress(Address dAddress) {
		this.dAddress = dAddress;
	}

	public Dost() {
		super();
	}

	@Override
	public String toString() {
		return "Dost [dId=" + dId + ", dName=" + dName + ", dAddress=" + dAddress + "]";
	}

	
	
	
}
