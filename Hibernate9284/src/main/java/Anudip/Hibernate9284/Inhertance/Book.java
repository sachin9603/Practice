package Anudip.Hibernate9284.Inhertance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Book  extends MyProduct{

	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(int productId, String productName, String author) {
		super(productId, productName);
		this.author = author;
	}
	
	
	
	public Book() {};
	
	
}
