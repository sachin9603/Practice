 package Anudip.BasicCrud.Inheritance;

import javax.persistence.Entity;

@Entity
public class Book  extends MyProduct{
	
	private String Author ;

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}
	
	

}
