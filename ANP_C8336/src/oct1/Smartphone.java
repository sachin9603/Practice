package oct1;

public class Smartphone  extends Device{
	
	String operatingSystem ;
	
	String cameraResolution ;

	public Smartphone(String brand, String model, String operatingSystem, String cameraResolution) {
		super(brand, model);//parent k contructor ko call // itshould be very first line of cons.
		
		
		this.operatingSystem = operatingSystem;
		this.cameraResolution = cameraResolution;
	}

	public Smartphone() {
		
	}
	
	
	
	
	public void takephoto() {
		System.out.println(" Photo captured ");
	}

	
	public String mobileInformation() {
		
		return "Smartphone [operatingSystem=" + operatingSystem + ", cameraResolution=" + cameraResolution + "]";
		
		
	}
	
	
	
	

}
