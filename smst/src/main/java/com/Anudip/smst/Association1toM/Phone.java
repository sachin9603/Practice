package com.Anudip.smst.Association1toM;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Phone {
	
	@Id
	private int phoneId  ;
	private String phoneNumber ;

	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber +  "]";
	}
	public Phone(int phoneId, String phoneNumber) {
		super();
		this.phoneId = phoneId;
		this.phoneNumber = phoneNumber;
		
	}
	
	
	
	
	

}
