package oct1;

public class Device {
	
	String brand  ;
	
	String model  ;
	
	boolean power ;
	
	int price ;
	

	
	public Device(String brand, String mo) {
	
		this.brand = brand;
		this.model = mo;
		
	}
	
	private Device(int price) {
		
		this.price  = price ;
		
		
	}

	
	public Device() {
		this(500) ;// it should be only very first 
		System.out.println("mai hu normal device ");
	
		
		
	}
	
	
	public void deviceInformation() {
		
	System.out.println("This device brand is " +brand+ " and model is " +model);
	}
	
	public void powerOn() {
		if(power == false ) {
			power = true  ;
			System.out.println("your divice is on now ");
		}else{
			
			System.out.println("It is already on");

		}
		
	}
	
	
	public void powerOff() {
		if(power) {
			power = false ;
			System.out.println("your divice is off now ");
		}else {
		System.out.println("it is already OFF");
			
		}
	}
	
 

}
