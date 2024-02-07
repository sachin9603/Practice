package dec21;

public class DemoVehicleTest {
	
	public static void main(String[] args) {
		// default constuctor 
		Car c1  = new Car() ;
		
		c1.fuel = "gas" ;
		c1.AC = true ;
		c1.wheels = 4  ;
		c1.start();// abhi mere compiler ko nahipata hai ki kosi start method hai 
		
		System.out.println(c1.fuel);
				
		HatchBack  hb  = new HatchBack() ;
	
		PickupTruck pb  = new PickupTruck() ;
		// pb.offRoading ;
		
		Vehicle v1  = new Vehicle () ;
		
		v1.start();
		
		Poly p1 = new Poly () ;
		
		String a  = p1.sum("sachin", " parmar") ;
		
		int ssdfdf = p1.sum(12, 36) ;
		
		System.out.println(ssdfdf);
		System.out.println(a);
		
		
		
	}

}
