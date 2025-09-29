package oops;

public class Book {
//	Define a Book bean with: 
//
//		title, author, price.
//
//		Add a method to calculate discounted price when discount percentage is given.

	private String title ;
	private String author  ;
	private double price  ;
	
	public void discountedPrice(double percentage) {
		
		double num  = (price*percentage)/100 ;
		num = price - num  ;
		System.out.println(" your discouted price is "+ num );
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
	}
	
	
	
	
	
}
