package Collectionn;

// same class k obj apas mai kese compare honge ye logic comparable mai likte hai 
// comparable , comparator(Java.util)
import java.util.*;
public class Movie implements Comparable<Movie>{
	
	private String name  ;
	private double rating ;
	private int year  ;
	
	

	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", year=" + year + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		// rating se compare 
		// return teen integer return karega  +1 , -1  0 
		
		if(o.year >this.year ) {
			return 1 ;
			
		}else if (o.year ==  this.year ) {
			// here name is in ascending order and year is in decending order 
			
			return this.name.compareTo(o.name);
		}else {
			return -1 ;
		}
		
	}

	public static void main(String[] args) {
		
		ArrayList<Movie> list  = new ArrayList<>()  ;
		
		list.add(new Movie("BhahuBali" , 8.7, 2025));
		list.add(new Movie("Kantara" , 9.1, 2022));
		list.add(new Movie("Force" ,8.6, 2025));
		list.add(new Movie("GOT" , 6.3, 2025));
		list.add(new Movie("Hobbit" , 8.9, 2013));
		
	Collections.sort(list, new NameComparator() );
	System.out.println(list);
		
ArrayList<String> listt  = new ArrayList<>()  ;
		
		listt.add("Sachin");
		listt.add("Asus");
		listt.add("Mobile");
		listt.add("Camera");
		listt.add("Zerba");
		
		Collections.sort(listt);
		
		
		
		Collections.sort(list) ;
		
		System.out.println(listt);
		for ( Movie mm  : list) {
			System.out.println(mm);
		}
		
	}

	public Movie(String name, double rating, int year) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	
	
	
	

}
