package Com.Anudip.StudentManager.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adress {
	@Id
	private String id  ;
	private String city ;
	private String pincode ;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Adress(String id, String city, String pincode) {
		super();
		this.id = id;
		this.city = city;
		this.pincode = pincode;
	}
	public Adress() {
		super();
	}
	
	

}
