package oct17.inheritance;

public class Device {
	
//	Question 1: Single Inheritance
//	Scenario: Create a base class called Device and a derived class called Smartphone.
	//The Device class should contain attributes for brand and model, along with methods to display device information and power on/off.
	//The Smartphone class should inherit from Device and include additional attributes for operatingSystem and cameraResolution, along with methods to display smartphone-specific information and take a photo.
//	Requirements: 
//	Implement the Device class with the required attributes and methods.
//	Implement the Smartphone class that inherits from Device and adds its own attributes and methods.
//	Create an instance of Smartphone, set its attributes, and demonstrate the usage of all methods.
	
	
	String brand  ;  //"Samsung"
	String model  ;
	boolean power  ; // false 
	
	
	
	public void dispalyDeviceInforamation() {
		System.out.println("Device Brand is " +brand );
		System.out.println("Device Model is " + model);
	}
	
	public void powerOn() {
		if(power != true) {
			power = true  ;
			
			System.out.println("your devicce is on");
		}else {
			System.out.println("Device is already on");
		}
	}
	
	public void powerOff() {
		if(power == true) {
			power = false  ;
			
			System.out.println("your devicce is oFF");
		}else {
			System.out.println("Device is already OFF");
		}
	}
	

}
