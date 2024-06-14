package june12.singleIeritance;

public class Device {
	
	
	///Method Overriding in Java
	
	//Overriding --- isme ek hi method k naa hi parameter , naa hi return type  , or naa hi naam 
	// change hoga  ,change hoga toh sirf execution
	
	// for override we need two classes in is a relation ship and parent child relation ship 
	
	
	
   String brand  ;
   String model ;
	
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void display() {
		System.out.println("brand is  " + this.brand);
		
		System.out.println("model is "+ this.model);
		
	}
	
	public void powerOn() {
		System.out.println("device is getting on");
	}
	
	
	public void powerOff() {
		System.out.println("device is getting off");
	}
	
	public void takingPower() {
		System.out.println("device is taking 2 kw electricity");
	}
	
	

}
