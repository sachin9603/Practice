package com.Anudip.smst.Association1toM;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class PhoneUser {
	
	@Id
	private int uid ; /// 9090
	
	private String uname  ;// ruhul 
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "SachinID")
	private List<Phone> phoneNumbers;
// here we are inserting list of phonenumber by user then  user table will be form and 
	// a dfffernt table phone or entry of phone table will get exta coulm and add primary of 
	// of user whose that phone is belonged 
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public List<Phone> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<Phone> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public PhoneUser(int uid, String uname, List<Phone> phoneNumbers) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.phoneNumbers = phoneNumbers;
	}
	public PhoneUser() {} ;

	@Override
	public String toString() {
		return "PhoneUser [uid=" + uid + ", uname=" + uname + ", phoneNumbers=" + phoneNumbers + "]";
	}
	
	
	
	

}
