package oops.polymorphismm;

import java.util.ArrayList;

public class Demo {
	
	String name  ;
	
	
	@Override
	public String toString() {
		return "Demo [name=" + name + "]";
	}


	public Demo() {} ;
	
	
	public Demo(String name) {
		super();
		this.name = name;
	}
	//poly morphism -----multiple form 
	
	// when we can use one method into mutiple form that means we ar using polymorphsim 
	
	// ------overloading  ,, overriding 
	// overloading ---- when mutiple method have same name and different parameter , different return type ,implimentation is also different in the same class is 
	// compile time --- jab code likh rahe ho tabhi pata lag jaayega which method u are calling 
	
	/// over riding --- we do not have change number of parameter  , two different method will be perform runtime poly morphism --- when these two classes in parent child relation and method signature will be same .
	
	public int cal(int a ,int b) {
		return a+b ;
		
	}
	public String  cal(int s) {
		
		return "sachin" ;
		
	}
	
	public int cal(int a ,int b , int c ) {
		return a+b+c ;
		
	}
	
	public double  cal(double a ,double b) {
		ArrayList<String > s = new ArrayList<>()  ;
		s.add("sachin") ;
		///s.add("Pooja") ;
		
		s.add(0, "pooja") ;
	// pooja sachin
		
		
		return a+b ;
		
	}
	
	public void  cal() {
		System.out.println("I am not doing anything ");
		
	}
	
	public void checkKaro(Student s) {
		
		if (s  instanceof SeniorStudent) {
		System.out.println("ye hai senior student "); ;
			s.deciplin();
		}else {
			System.out.println("ye hai real student "); ;
			s.deciplin();

		}
	}
	
	public static void main(String[] args) {
		
		SeniorStudent s  = new SeniorStudent()  ;
		
		Demo d  = new Demo() ;
		
		d.checkKaro(s);
		
		 int dd  = d.cal(41, 12,12) ;
		 double jk  =   d.cal(45.1, 45.2) ;
		 System.out.println(jk);
		 System.out.println(dd);
		 
		 
		 
		 
		 
		 
		 
		 
	 
	 
	 
		
		
		
	}
	
	
	
	

}
