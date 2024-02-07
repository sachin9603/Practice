package dec26;

public class Honda extends Bike { 
	
//  // if you are putting @Override then Method signature must be same 
	 // parameter will be same  
	// return type will be same  
	// method name will be same 
	
	@Override
	public int speed( int speed ,int hours ) {
		
		// distance 
		
		int distance  =speed*hours  + 2;
		   
		   return distance ;
		   
	  }
	// neither  overriding  
	public void speed(char c ) {
		
	}
	
	@Override
	public void speed() {
	
	System.out.println("honda bike can run at speed of 170 km/hr");
	}
	

}
