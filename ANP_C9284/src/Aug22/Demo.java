package Aug22;
import java.util.ArrayList;

import aug23.Car;


public class Demo {
	// polymorphism --- overloading 
	
	public static void add(int a  , int b) {
		
		int c  = a+b  ;
		
		System.out.println(c);
	}
	
	public static String  add(int a  , int c  , int b ) {
		int i  = a+ b+ c ;
		System.out.println(i);
		
		return "sachinooooooooooooooooooooooooooooooooooooo" ;
 	}
	
	public static void add(double vv  , double  c  , double b ) {
		
		double  i  = vv + b+ c ;
		System.out.println(i);
		
 	}
	
	public static void main(String[] args) {
		add(12,43) ;
		String s  = add(2,5,6) ;
		
		System.out.println(s);
		
		
		Student ss  = new Student() ;
		//ss.id  = 99 ;
		
		ss.setId(23);
		ss.setMarks(500);
		ss.setName("Rakul");
		
		
	System.out.println(ss.getId());
	System.out.println(ss.getMarks());
	System.out.println(ss.getName());
	
	System.out.println(ss.toString());
	
	ArrayList<E> list = new ArrayList() ;
	
		
		Car  c   = new Car () ;
		c.carEngine = "3" ;
		
		
		
		
	}

}
