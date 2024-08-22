package aug21;

public class Address {


	String ctiy  ; 
	String state  ;
	int pincode  ;
	
	// parameter
	public Address(String ctiy, String state, int pincode) {
	
		this.ctiy = ctiy;
		this.state = state;
		this.pincode = pincode;
	}
	
	// default 
	public Address() {
	}
	
	
	
	@Override
	public String toString() {
		return "Address [ctiy=" + ctiy + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
}
