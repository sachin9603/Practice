package com.Anudip.smst.hasAorIsARelation;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column ;
import javax.persistence.ElementCollection;

@Entity
@Table(name = "deve_Add_m")
public class Developer {
	
	@Id
	private int id ;
	private String name ;
	private double salary ;
	
//	
//	@Embedded
//	private Address address ; // has -A Relation 
//// suppose i want to creat table like  id , name , slary  , city ,state , pin  
	
//	 @Embedded
//	@AttributeOverrides({
//		
//		 @AttributeOverride(name = "city", column = @Column(name = "Home_City")),
//	      @AttributeOverride(name = "state", column = @Column(name = "Home_Sate")),
//	      @AttributeOverride(name = "pincode", column = @Column(name = "Home_pincode"))
//		
//	})
//	private Address homeAdd ;	
//	
//	
//	@AttributeOverrides({
//		
//		 @AttributeOverride(name = "city", column = @Column(name = "Office_City")),
//	      @AttributeOverride(name = "state", column = @Column(name = "Office_Sate")),
//	      @AttributeOverride(name = "pincode", column = @Column(name = "Office_pincode"))
//		
//	})
//	 @Embedded
//	private Address OfficeAdd ;	
//	
	@ElementCollection(fetch = FetchType.EAGER)
	@Embedded
	private Set<Address> addresses  = new HashSet<Address>()  ;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

		
	
	
	public Developer(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Developer()  {
		
	}
	
	
	

}
