package oops.inheritance;

public class Deemo {
	
	
//	Types of Inheritance in Java:
//
//		Single
//
//		Multilevel
//
//		Hierarchical
	
	// multiple inheritance is not possible in java (ambiguity issue)
	
	public static void main(String[] args) {
		Dog d = new Dog()  ;
	 int l = d.leg ;
	 System.out.println(l);
	 
	 d.sound();
	 
	 
	 
	 BabyDog bd  = new BabyDog() ;
	 bd.eat();
	 bd.walk();
	 bd.sound();
	 
	 System.out.println("-----------------------------------------------------------------------------");
	 Human h  = new Human()  ;
	 h.think();
	 h.walk();
	 
	 ///
			 
		
	}

}
