package OOPSS.Encapsulation;

// this address bean 
public class Address {
	
	private String city ;
	private String pincode  ;
	private String state ;
	
	public Address() {}  ;
	
	public Address(String city, String pincode, String state) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", state=" + state + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	

}
