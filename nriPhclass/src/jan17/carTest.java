package jan17;

public class carTest {
	
	static {
		System.out.println("sachin");
	}

	
	public static void main(String[] args) {
		
	//	Car c = new Car() ;ye obj nahi banega kyuki abstract class ka obj nahi banata hai 
		
   Car_factory  cf = new Car_factory() ;
    
   cf.applyBreak();
   cf.increaseSpeed();
   cf.carColour();
  //ye method concrete hai 
   
  // Car c = new Car()  ;
    
  String s  = Car_factory.carBrand ;
  
   
   
   
   
   Car.carWheels();// static methods aap class  k naam se bhi access kar skte hai 
   
   
		
		
	}
	
}
