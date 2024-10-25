package Anudip.Hibernate9284.AssociationMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name  ="ADDSttttt")
public class Address {
	
	@Id 
	private int aid  ;
	private String City ;
	private String state ;
	
	
	public Address(int aid, String city, String state) {
		super();
		this.aid = aid;
		City = city;
		this.state = state;
	}
	
	public Address() {}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", City=" + City + ", state=" + state + "]";
	} ;
	
	
	

}
