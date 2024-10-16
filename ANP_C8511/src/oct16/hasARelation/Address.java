package oct16.hasARelation;

public class Address {
	
	String pincode ;
	String city ;
	String state ;
	
	public Address(String pincode, String city, String state) {
		super();
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}
	
	
	public Address() {}


	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", state=" + state + "]";
	} ;
	
	
	 

}
