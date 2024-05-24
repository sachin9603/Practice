package com.Anudip.Employee_6878;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToOne;

@Entity
public class Car {
	
	@Id 
	private int carid ;
	
	private String carname ;
	
	private int empId  ;
//	
//	@ManyToOne
//	private Employee emp ;

	public Car(int carid, String carname, int empId) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carname=" + carname + "]";
	}

	public Car(int carid, String carname) {
		super();
		this.carid = carid;
		this.carname = carname;
	}
	public Car() {} ;
	
	
	

}
