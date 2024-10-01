package sep30.HasA;

public class Address {
	
	

	String city  ;
	String pincode  ;
	String state  ;
	
	
	public Address(String city, String pincode, String state) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}
	
	public Address() {} ;
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", state=" + state + "]";
	}

}
