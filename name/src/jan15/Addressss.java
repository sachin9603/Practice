package jan15;

public class Addressss {
	
	@Override
	public String toString() {
		return "Addressss [city=" + city + ", pincode=" + pincode + ", State=" + State + "]";
	}

	private String city ;
	
	private String pincode ;
	
	private String State ;
	

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

	public Addressss(String city, String pincode, String state) {
		super();
		this.city = city;
		this.pincode = pincode;
		State = state;
	}
	
	public Addressss() {} ;
	
	

}
