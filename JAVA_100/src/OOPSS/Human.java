package OOPSS;

public class Human {

	String name  ;
	String geneticCode ;
	
	int eye = 2  ;
	int leg = 2  ;
	
	// contructor 
	
	/// it is cons. and it will no return any thing explicitly 
	// but implicitly it is returning object 
	// there will be always a default contructor 

	public Human() {
	System.out.println("yes i am getting called ");	
	}
	
	public void belive() {
	
		System.out.println("Things will be start happening ");
	}
	
	public void greedyness() {
		System.out.println("need more ");
	}
	
	
	public void display() {
		System.out.println("Name is " +name +" gen code is " + geneticCode );
	}
	
}
