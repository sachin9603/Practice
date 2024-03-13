package com.Anudip.EmployeeApp6878;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.ElementCollection;

@Entity // java se only hql that deals with only entity
@Table(name = "Employee_details") // iska lena dena hai sidha database
@NamedQuery(query = "select e from Employee e where e.empid = :id", name = "find emp by id")

public class Employee {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;

	private String empname;

	private double salary;

	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;

	@ElementCollection
	@Embedded
	@JoinTable(name = "EmpAddess", joinColumns = @JoinColumn(name = "emp_ID"))

	private Set<Address> address = new HashSet<Address>();

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

	public Employee(int empid, String empname, double salary, Department department, Set<Address> address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.department = department;
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Employee(int empid, String empname, double salary, Set<Address> address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.address = address;
	}

	public Employee() {
		super();
	}

}
