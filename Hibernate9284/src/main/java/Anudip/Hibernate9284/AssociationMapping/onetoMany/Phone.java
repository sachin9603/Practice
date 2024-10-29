package Anudip.Hibernate9284.AssociationMapping.onetoMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phone {

	
	
 @Id 
 private int pid  ;
 private String phoneType ;
 private String phoneNumber  ;
 
 private int userid  ;
 
 
 
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPhoneType() {
	return phoneType;
}
public void setPhoneType(String phoneType) {
	this.phoneType = phoneType;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public Phone(int pid, String phoneType, String phoneNumber, int userid) {
	super();
	this.pid = pid;
	this.phoneType = phoneType;
	this.phoneNumber = phoneNumber;
	this.userid = userid;
}
 
public Phone() {} ;

	

}
