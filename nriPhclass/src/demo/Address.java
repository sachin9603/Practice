package demo;

// address ka bean banaya 

public class Address {

	private String city  ;
	private String pincode ;
	private String State ;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", State=" + State + "]";
	}
	public Address() {
		super();
	}
	public Address(String city, String pincode, String state) {
		super();
		this.city = city;
		this.pincode = pincode;
		State = state;
	}
	public String getCity() {
		return city;
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
		return State;
	}
	public void setState(String state) {
		State = state;
	}

	
	
	
	
	
	
}
