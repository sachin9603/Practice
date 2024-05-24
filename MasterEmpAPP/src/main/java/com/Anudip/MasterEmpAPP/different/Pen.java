package com.Anudip.MasterEmpAPP.different;

import javax.persistence.Entity;

@Entity
public class Pen  extends Myproduct{ 
	
	public Pen(){
		
	} ;
	
private String colour ;

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}



}
