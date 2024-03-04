package com.Anudip.EmployeeApp6878;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Employee {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid  ;
	
	private String empname ;
	 
	private double salary  ;

	public Employee() {
		super();
	}

	public Employee(int empid, String empname, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

	

	public Employee( String empname, double salary) {
	
		this.empname = empname;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
