package Anudip.Hibernate9284.AssociationMapping.onetoMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class PhoneUser {
	
	@Id
	private int userid  ; 
	private String username  ;
	
	
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name ="USERID")
	private List<Phone>  phoneList  ;


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public List<Phone> getPhoneList() {
		return phoneList;
	}


	public void setPhoneList(List<Phone> phoneList) {
		this.phoneList = phoneList;
	}


	public PhoneUser(int userid, String username, List<Phone> phoneList) {
		super();
		this.userid = userid;
		this.username = username;
		this.phoneList = phoneList;
	}
	
	
	
	
	public PhoneUser() {} ;
	
	
	
	

}
