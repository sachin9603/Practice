package Anudip.Hibernate9284.Inhertance.joinedType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy  = InheritanceType.JOINED)
public class Animal {
	
	
	@Id 
	private int aid  ;
	private String species  ;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public Animal(int aid, String species) {
		super();
		this.aid = aid;
		this.species = species;
	}
	
	
	public Animal() {}
	public Animal(int aid2) {
		// TODO Auto-generated constructor stub
		this.aid  = aid2  ;
	} ;
	
	
	
	
	
	

}
