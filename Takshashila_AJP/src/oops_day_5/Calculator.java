
package oops_day_5;

public class Calculator {

	
	public int add(int a, int b) {
		
		return a+b ;
	}
	
	// overloading -- in to same class changing into number of
	//parameter and changes into return type that is know as compile time polymorphism 
	
     public double add(int a, int b, int c) {
		
		return a+b+c ;
	}
	
	public static void main(String[] args) {
		
		Calculator j = new Calculator() ;
		
		System.out.println(j.add(23,34) );// when i am writing you guys will figure out which method i am calling 
		System.out.println(j.add(23,34,89) );
		

		
		
	}
	
}
