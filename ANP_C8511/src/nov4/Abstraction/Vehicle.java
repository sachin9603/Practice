package nov4.Abstraction;

public abstract class Vehicle {
	
	public Vehicle() {
		this(80) ;
	 System.out.println("this is default by parent class");
	}
	
	private  Vehicle( int speed  ) {
		this(80 , "HeroHonda");
		System.out.println(" this vehicle can run at speed "+ speed);
	}
	
	
	
	private  Vehicle( int speed  , String name ) {
		
		System.out.println(" this vehicle can run at speed "+ speed);
	}
	
 public abstract void drive() ;
 
 public void functionality() {
	 
	 System.out.println("to make life more easy ");
 }
 
 public final void fuel() {
	 System.out.println("they will work on some fuel only ");
 }
 
 
 
 
 

}
