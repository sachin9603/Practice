package com.Anudip.smst.AssociationMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "StudentNEW")
public class Student {
	
	
	@Id
	private int sid  ;
	
	private String sname  ;
	
	// multiple student can have one address
	// bhot saare student ek address mai jaa sakte hai 
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AIDKIPRIMARYKEY")
	private Address add  ;
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", add=" + add + "]";
	}


	public Student() {}  ;
	
	
	public Student(int sid, String sname, Address add) {
	
		this.sid = sid;
		this.sname = sname;
		this.add = add;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
	
	
	

}
