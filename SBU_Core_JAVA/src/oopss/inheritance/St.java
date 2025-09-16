package oopss.inheritance;

public class St {

	// this st class has Adress class as data type that's it is knon as has a realtion 
	
	
	private  String name ;
	private String email ;
	private String sub  ;
	private Address address ; // "indore  4000015  , state"  // address class is used as data type 
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	
	@Override
	public String toString() {
		return "St [name=" + name + ", email=" + email + ", sub=" + sub + ", address=" + address + "]";
	}
	public St(String name, String email, String sub, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.sub = sub;
		this.address = address;
	}
	public St() {
		super();
	}
	
	
	
	public static void main(String[] args) {
		
		St s  = new St()  ;
		
		
		
		
		Address ad = new Address() ;
		
		ad.setCity("Indore");
		ad.setState("MP");
		ad.setPincode("465654");
		
		s.setName("RAKA");
		s.setEmail("Raka@gamil.com");
		s.setSub("MATH");
		s.setAddress(ad);
		
		s.getAddress().setCity("Bhopal");
		
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
