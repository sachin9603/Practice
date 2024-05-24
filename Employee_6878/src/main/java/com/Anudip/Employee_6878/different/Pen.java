package com.Anudip.Employee_6878.different;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("2")
public class Pen extends Myproduct {
	
	
	//private long productId;
	//private String name;
private String color;

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

}
