package basicConcept;

public class WideningExample {
	
//	Definition:
//		Casting in Java means converting the type of a variable from one data type to another.
//
//		There are two types of casting in Java:
//
//		Primitive Type Casting
//
//		Reference Type Casting (Object Casting)
	
	
//	 2. Primitive Type Casting
//	  A. Widening Casting (Implicit)
//	 Smaller type to larger type
//
//	 Done automatically by Java	
	
	public static void main(String[] args) {
		
		//"Order hota hai: byte → short → int → long → float → double"
		int a  = 10  ;
		
		double b  = a  ;// automatic 
		
		// narrow
		double n = 8.9  ;
		int k  = (int)n;
		
		System.out.println(k);
		
		Animal animal = new Dog()  ;// upcasting 
		
		
		animal.sound();
		
		
		
		
		Dog d = (Dog)animal ;// downcasting 
		
		d.bark();
		d.sound();
		
		
		
		
	}

}
