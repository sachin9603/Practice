package june12.singleIeritance;

public class Device {
	
	
	protected String brand  ;
	protected String model ;
	
	
	
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
	
	

}
