package Anudip.BasicCrud.Relation12M;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {
	
	// ki ye jo ma
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private int phoneId  ;
	private String phonType  ;
	private long phoneNumber ;
	private  int userId  ;
	
	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Phone() {} ;
	
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhonType() {
		return phonType;
	}
	public void setPhonType(String phonType) {
		this.phonType = phonType;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Phone(int phoneId, String phonType, long phoneNumber) {
		super();
		this.phoneId = phoneId;
		this.phonType = phonType;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phonType=" + phonType + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	

	
	
	

}
