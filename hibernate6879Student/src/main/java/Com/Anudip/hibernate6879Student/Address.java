package Com.Anudip.hibernate6879Student;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int aid  ;
	
	private String city ;
	
	private String state ;
	
//	private Type_OF_address type;
	

//	
//	public Type_OF_address getType() {
//		return type;
//	}
//
//	public void setType(Type_OF_address type) {
//		this.type = type;
//	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

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

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", state=" + state + "]";
	}
	public Address() {};
	
	public Address(int aid, String city, String state) {
		super();
		this.aid = aid;
		this.city = city;
		this.state = state;
	}
	

}
