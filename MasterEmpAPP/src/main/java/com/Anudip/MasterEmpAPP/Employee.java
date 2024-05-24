package com.Anudip.MasterEmpAPP;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
//@NamedQuery(query  = "select e from Employee e where e.empId = :id" ,name ="fd by id" )
//
//@NamedNativeQueries({
//	@NamedNativeQuery(
//			name = "findALL",
//			query = "select * from Employee_details" ,
//			resultClass = Employee.class
//			),
//	@NamedNativeQuery(
//			name = "findunique",
//			query = "select * from Employee_details where empId < 23" ,
//			resultClass = Employee.class
//			),
//	
//	
//})
public class Employee {
	
	
	@Id
	private int empId ;
	private  String name  ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Department dep  ;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Car> CarList ;
	
	
//	public Department getDep() {
//		return dep;
//	}
//
//	public void setDep(Department dep) {
//		this.dep = dep;
//	}

	public List<Car> getCarList() {
		return CarList;
	}

	public void setCarList(List<Car> carList) {
		CarList = carList;
	}

	public Department getDepartment() {
		return dep;
	}
	
	public void setDepartment(Department Depar) {
		this.dep = Depar;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	
	public Employee() {} ;
	
	
	

}
