package Anudip.Hibernate9284.Inhertance.MappedSUperClass;

import javax.persistence.Entity;

@Entity
public class MyEmployee extends Person {
	
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
