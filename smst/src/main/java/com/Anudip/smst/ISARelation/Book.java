package com.Anudip.smst.ISARelation;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2") 
public class Book extends MyProduct{
	
	private String author ;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(Integer id, String name, String author) {
		super(id, name);
		this.author = author;
	}
	
	
	
	public Book() {} ;
	
	
	
}
