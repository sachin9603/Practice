package dec21;

public class Address {
	
	private String city ;
	
	private String state ;
	
	private String pincode ;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Address(String city, String state, String pincode) {
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Address() {
	}
	
	
	
	
	
	

}
