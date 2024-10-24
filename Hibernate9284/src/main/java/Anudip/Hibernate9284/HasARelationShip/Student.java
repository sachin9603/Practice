package Anudip.Hibernate9284.HasARelationShip;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

@Entity
public class Student {
	
	 @Id
	 private int id  ;
	
	 private String name  ;
	 
	 @ElementCollection(fetch=FetchType.EAGER)
	 @Embedded
	 @JoinTable(name  = "StAdd" , joinColumns = @JoinColumn(name  = "SSid"))
	 private Set<Address> multipleAddress = new HashSet <Address>() ;
	 
	 
	

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

	public Student() {}

	public Set<Address> getMultipleAddress() {
		return multipleAddress;
	}

	public void setMultipleAddress(Set<Address> multipleAddress) {
		this.multipleAddress = multipleAddress;
	}

	public Student(int id, String name, Set<Address> multipleAddress) {
		super();
		this.id = id;
		this.name = name;
		this.multipleAddress = multipleAddress;
	}

	

	
	 
	 
	 
	 

}
