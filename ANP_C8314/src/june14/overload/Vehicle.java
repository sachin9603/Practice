package june14.overload;

public class Vehicle {
	
	static String  vehicleNo   = "23232";
	
	static class car{
		
		String type  ; 
		
	}
	
		
   class bike{
		int cc  =250 ;
		
	}
	int tyre   ;
	
	int colour ;
	
	void run() {
		System.out.println("veh is running");
	}
	
	public static void main(String[] args) {
		
	String no = 	Vehicle.vehicleNo ;
		
		Vehicle  v1  = new Vehicle () ;
		v1.tyre  =  6 ;
		
		v1.run();
		System.out.println(v1.tyre);
		
		
		
		bike b  = v1.new bike() ;
		
		
		System.out.println(b.cc);
		
		
		

		
		
		
	}
	
}
