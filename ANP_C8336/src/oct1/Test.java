package oct1;

public class Test {
	
	public static void main(String[] args) {
		
		
		Device dd  = new Smartphone("LG" , "adha9893" , "colorOS" , "8mp") ;
		
		
		dd.deviceInformation();
		dd.powerOn();
		dd.powerOff();
		
		Android ll  = new Android() ;
		ll.brand = "IQ" ;
		ll.model="11" ;
		ll.utility() ;
		
		ll.deviceInformation();
		
		
		Device charger  = new Device() ;
		System.out.println( charger.price );
		
	//	Device charger2  = new Device(500) ;
		
		
		
		
		
		
		
		
		
	}

}
