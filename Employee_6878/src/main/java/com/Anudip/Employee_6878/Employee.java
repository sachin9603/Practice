package com.Anudip.Employee_6878;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	private int empid;
	private String empName;
	
	// yadi yaha par casecade type all nahi laga hai tohaapko deparment manually save karana padega pehle 
	// yaa toh phir aapp casecde type all lagao 
	@ManyToOne(cascade=CascadeType.ALL)
	private Department dep ;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "EMPId")
     private List<Car> cars ;

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + "]";
	}

	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}

	public Employee() {
	};

}
