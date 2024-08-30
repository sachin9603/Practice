package Anudip.BasicCrud.RelationsM21;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id  ;
	private String name  ;
	
	
	// multiple studdent have one addess that saved in that addess table 
	/// many student belg to one address 
	
	@ManyToOne(cascade = CascadeType.ALL   , fetch = FetchType.EAGER)
	@JoinColumn(name  = "AID")
	private Address address ;
// yaha par cascadeType.All lagta uski help se aapka student k saath secondary object jo ki addess hai vo bhi 
	// save ho jaayega lekin abhui nahi laga ahia toh toh aaako manuvaaly addesss 
	//ko save karna padega 

	
	public Student() {} ;
	
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


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
	
	

}
