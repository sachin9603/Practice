
package Anudip.BasicCrud;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class EmployeeHASAddress {
	
	
	@Id
	private int eid ;
	private String ename  ;
	
	@Embedded
	@AttributeOverrides({
		
		@AttributeOverride(name = "city" ,column=@Column(name="home_city")),
		@AttributeOverride(name = "state" ,column=@Column(name="home_state")),
		@AttributeOverride(name = "pin" ,column=@Column(name="home_pin")),
		
		
	})
	
	
	private Address home_add  ; // home   // office 
	
	@Embedded
@AttributeOverrides({
		
		@AttributeOverride(name = "city" ,column=@Column(name="off_city")),
		@AttributeOverride(name = "state" ,column=@Column(name="off_state")),
		@AttributeOverride(name = "pin" ,column=@Column(name="Off_pin")),
		
		
	})
	private Address Office_add  ;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	public Address getHome_add() {
		return home_add;
	}
	public void setHome_add(Address home_add) {
		this.home_add = home_add;
	}
	public Address getOffice_add() {
		return Office_add;
	}
	public void setOffice_add(Address office_add) {
		Office_add = office_add;
	}
	
	
	public EmployeeHASAddress() {
		
	} 
	
	
	

}
