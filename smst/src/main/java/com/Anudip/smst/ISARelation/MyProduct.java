package com.Anudip.smst.ISARelation;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name  = "ProductType", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("100") 

public class MyProduct {
	
	@Id
	private Integer id  ;
	private String name  ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyProduct(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public MyProduct() {}  ;
	

}
