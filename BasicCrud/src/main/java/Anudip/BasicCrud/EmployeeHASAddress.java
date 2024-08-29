
package Anudip.BasicCrud;

import javax.persistence.AttributeOverride;
import java.util.*;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ElementCollection;

@Entity
public class EmployeeHASAddress {
	
	
	@Id
	private int eid ;
	
	private String ename  ;
	
	//private List<String>  kaamkilist = new ArrayList<>() ;
	
	
//	@Embedded
//	@AttributeOverrides({
//		
//		@AttributeOverride(name = "city" ,column=@Column(name="home_city")),
//		@AttributeOverride(name = "state" ,column=@Column(name="home_state")),
//		@AttributeOverride(name = "pin" ,column=@Column(name="home_pin")),
//		
//		
//	})
//	
//	
//	private Address home_add  ; // home   // office 
//	
//	@Embedded
//@AttributeOverrides({
//		
//		@AttributeOverride(name = "city" ,column=@Column(name="off_city")),
//		@AttributeOverride(name = "state" ,column=@Column(name="off_state")),
//		@AttributeOverride(name = "pin" ,column=@Column(name="Off_pin")),
//		
//		
//	})
//	private Address Office_add  ;
	
	@ElementCollection
	@Embedded
	private Set<Address>  addess = new HashSet<Address> () ; /// EmployeeHASAddress_addess
	

	
	public Set<Address> getAddess() {
		return addess;
	}
	public void setAddess(Set<Address> addess) {
		this.addess = addess;
	}
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
	
	
	public EmployeeHASAddress() {
		
	} 
	
	
	

}
