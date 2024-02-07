package dec26;

public class Bike {
	// for overloading parameter must be different 
	
	// do i need to create obj for using this speed method 
    void speed( int r ) {
		
		System.out.println( "Bike is running at speed of " + r);
	}
    
    // same speed method hai 
    // but new speed method mai aap parameter ,mai time bhi dena hoga
    
   public int speed( int speed ,int hours ) {
	   
	   return speed*hours  ;
	   
  }
   
   public void speed() {
	   System.out.println("No need to ride above 100Km/h");
   }
	
	
}
