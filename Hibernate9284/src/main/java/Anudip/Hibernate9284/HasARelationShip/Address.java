package Anudip.Hibernate9284.HasARelationShip;

import java.util.Objects;

public class Address {
	
	private String pin ;
	private String city ;
	private String state ;
	
	public Address(){
		
		
	};
	
	
	public Address(String pin, String city, String state) {
		super();
		this.pin = pin;
		this.city = city;
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
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
		return "Address [pin=" + pin + ", city=" + city + ", state=" + state + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(city, pin, state);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(pin, other.pin) && Objects.equals(state, other.state);
	}
	
	
	
	

}
