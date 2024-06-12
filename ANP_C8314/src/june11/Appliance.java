package june11;

public class Appliance {
	
	private String brandName  ;
	
	private double price  ;

	
	// one method 
	
	public void mainFunction() {
		System.out.println(" making life  easy  ");
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Appliance(String brandName, double price) {
	
		this.brandName = brandName;
		this.price = price;
	}
	
	
	public Appliance() {
		
	}

	@Override
	public String toString() {
		return "Appliance [brandName=" + brandName + ", price=" + price + "]";
	}
	
	
	
	
	
	
	

}
