package com.Anudip.Employee_6878.different;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("1")

public class Book extends Myproduct {// Book is type of MyProduct

private String author;

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}
}

