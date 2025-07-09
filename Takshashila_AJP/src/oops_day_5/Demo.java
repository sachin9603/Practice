package oops_day_5;

public class Demo {
	
    // class , object 
	// encapsulation ---- java bean is best example of encapsulation  
	
	// abstraction  
	// polymorphism
	
	// inheritance  = inherit --- 
	
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog() ;
		
		int s = dog1.leg ;// animal 
		
		dog1.sound(); // 
		dog1.eat() ;// dog 
		
		BabyDog rakesh  = new BabyDog() ;
		rakesh.weep();
		rakesh.eat();
		rakesh.sound();
		
		Animal a  = new Animal () ;
		a.sound();
		
		Dog dogeshBhai  = new Dog()  ;
		
		dogeshBhai.sound();
		
		Animal aa  = new Animal () ;
		a.sound();
		
		
		Animal dd =  new Dog()  ;
		dd.sound();
		//Scenario
		
		
		
		
		
		
	}
	
	
	
	

}
