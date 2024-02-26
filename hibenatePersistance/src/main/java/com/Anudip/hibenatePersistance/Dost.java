package com.Anudip.hibenatePersistance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Friends")
public class Dost {
  
	@Id
	private int dId ;
	
	private String  dName  ;
	
	private String dAddress ;

	public Dost(int dId, String dName, String dAddress) {
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

	public String getdAddress() {
		return dAddress;
	}

	public void setdAddress(String dAddress) {
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
