package demo;

import jan17.Car_factory;

public class Basic {

	public static void main(String[] args) {
//		
//		Employee e1  = new Employee(); // default constructor  
//		
//		Employee e2  = new Employee( 909 , "Sachin " , "sachin9009" ) ;
//		
//		System.out.println(e2.getEmpUserName());
		
		Animal a = new Animal() ; //  this object is creating with help of default construstor ,
		
		a.eat(); 
		
		a.eat("grass" );
		
		
		Animal aa = new Animal  (4 , "cat" ) ;
		
		Car_factory cc = new Car_factory() ;
		
		
		
		
		
		
		
		
		
		BabyDog bb  = new BabyDog();
		bb.weep();
		bb.bark();
		
		
		
	}
}
