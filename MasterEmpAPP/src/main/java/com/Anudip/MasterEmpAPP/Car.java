package com.Anudip.MasterEmpAPP;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id 
	private int carid  ;
	
	private String carname ;
	
	private int empoyeeID ;
	
	
	
	
	public int getEmpoyeeID() {
		return empoyeeID;
	}


	public void setEmpoyeeID(int empoyeeID) {
		this.empoyeeID = empoyeeID;
	}


	public Car() {} ;
	

	public Car(int carid, String carname) {
		super();
		this.carid = carid;
		this.carname = carname;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	
	

}
