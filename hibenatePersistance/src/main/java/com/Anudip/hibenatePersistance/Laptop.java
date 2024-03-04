package com.Anudip.hibenatePersistance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	
	@Id
	private int lid  ;
	
	private String company ;
	
	@OneToOne
    private Student s  ;
    
	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Laptop(int lid, String company) {
		super();
		this.lid = lid;
		this.company = company;
	}

	public Laptop() {
		super();
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", company=" + company + "]";
	}
	
	
	
	

	
	
}
