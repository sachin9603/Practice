package oops_concept.polymorphism;

public class Calculation {
	
	
	// polymorphism ----- poly  + morphism
	
	// jab ek hi method ko mutiple form mai use kare toh polymorphism 
	
	// overloading------> ek hi method ko ek hi class mai number of parameter or tyep of parameter 
	//change kar dene or implement part bhi change kar dene se achive hota hai 
	
	//,, overriding 
	
	
	
	/// overloading 
	public int add(int a , int b) {
		return a+b ;
		
	}
	
	public int add() {
		return 0;
		
	}
	
//	public void add(int a , int b) { no you can not acive by changing number of parameter 
//		System.out.println(a+b);
//		
//	}
	public int add(int a , int b, int c) {
		return a+b+c ;
		
	}
	
	public double  add(double a , double b) {
		return a+b ;
		
	}
	
	
	public static void main(String[] args) {
		Calculation c = new Calculation()  ;
		
		System.out.println(c.add(2.9, 8.9));
		 // line 37 
		// code likhte vakt hi aapne bata diya ki konsi method aap call kar rahe ahi 
		// compile time polymorphism 
		
		
		System.out.println(  c.add(1,2,4));
		 ;
		
		
		
		 
		 Employee e = new Developer()  ;
		 
		 e.salary(); // runtime polymorphism 
		
	}
	
	

}
