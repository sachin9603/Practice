package Anudip.Hibernate9284.Inhertance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Pen extends MyProduct{

	
	private String color  ;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Pen(int productId, String productName, String color) {
		super(productId, productName);
		this.color = color;
	}
	
	public Pen() {};
	
	
	
}
