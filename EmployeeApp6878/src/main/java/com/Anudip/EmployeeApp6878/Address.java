package com.Anudip.EmployeeApp6878;

import java.util.Objects;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Embeddable
public class Address {
	
	 private String city ;
	 private String State  ;
	 private String pincode ;
	 private String type ;

	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Address(String city, String state, String pincode, String type) {
		super();
		this.city = city;
		State = state;
		this.pincode = pincode;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", pincode=" + pincode + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(State, city, pincode, type);
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
		return Objects.equals(State, other.State) && Objects.equals(city, other.city)
				&& Objects.equals(pincode, other.pincode) && Objects.equals(type, other.type);
	}
	 
	 

}
