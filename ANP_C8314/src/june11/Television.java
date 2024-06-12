package june11;

public class Television extends Appliance {
	
	private int size ;
	
	private String loudness ;
	
	
	public void changeChanel() {
		
		System.out.println(" chanel has been changed ");
		
	}
	public Television( int size, String loudness) {
		
		this.size = size;
		this.loudness = loudness;
		
	}
	public Television() {} ;
	
    public Television(String brandName, double price, int size, String loudness) {
		super(brandName, price); // super() ka use parent class k contructor ko cll karne k liye hota hai  
		this.size = size;
		this.loudness = loudness;
	}
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getLoudness() {
		return loudness;
	}


	public void setLoudness(String loudness) {
		this.loudness = loudness;
	}
	@Override
	public String toString() {
		return "Television [size=" + size + ", loudness=" + loudness + ", getSize()=" + getSize() + ", getLoudness()="
				+ getLoudness() + ", getBrandName()=" + getBrandName() + ", getPrice()=" + getPrice() +  "]";
	}

	
	
	

}
