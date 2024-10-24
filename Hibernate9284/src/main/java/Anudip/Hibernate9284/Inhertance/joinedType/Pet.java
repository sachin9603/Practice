package Anudip.Hibernate9284.Inhertance.joinedType;

import javax.persistence.Entity;

@Entity
public class Pet extends Animal {
	//Pet ki table banegi alag or iski ek primaary ki bhi hogi  or vo lega parent class 
	
	private String  petname  ;

	public String getPetname() {
		return petname;
	}

	public void setPetname(String petname) {
		this.petname = petname;
	}

	public Pet(int aid, String petname) {
		super(aid);
		this.petname = petname;
	}
	
	
	public Pet() {} ;
	
}
