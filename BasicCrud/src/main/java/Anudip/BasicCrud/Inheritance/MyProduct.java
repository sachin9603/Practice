package Anudip.BasicCrud.Inheritance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class MyProduct {
	
	@Id
	private int id  ;
	private String name  ;
	
	
	public MyProduct() {} ;
	
	
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
	public MyProduct(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	
	

}
