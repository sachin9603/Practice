package com.Anudip.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dost {

	
	@Id
	private int did ;
	private Name dname ;
	private String dcolour ;
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	
	public String getDcolour() {
		return dcolour;
	}
	public void setDcolour(String dcolour) {
		this.dcolour = dcolour;
	}
	
	public Name getDname() {
		return dname;
	}
	public void setDname(Name dname) {
		this.dname = dname;
	}
	public Dost(int did, Name dname, String dcolour) {
		super();
		this.did = did;
		this.dname = dname;
		this.dcolour = dcolour;
	}
	public Dost() {
		super();
	}
	
}
