package com.Anudip.MasterEmpAPP.different;

import javax.persistence.Entity;

@Entity
public class Book  extends Myproduct {

	private String author ;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
