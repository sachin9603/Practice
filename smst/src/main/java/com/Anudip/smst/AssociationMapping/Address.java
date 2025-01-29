package com.Anudip.smst.AssociationMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	
	
    @Id
    private int aid  ;
    
    private String city  ;
    private String pincode ;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address(int aid, String city, String pincode) {
		super();
		this.aid = aid;
		this.city = city;
		this.pincode = pincode;
	}
    
    
	public Address() {}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", pincode=" + pincode + "]";
	}  ;
	
    
    
    
    

}
