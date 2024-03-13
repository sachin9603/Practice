package Com.Anudip.StudentManager_____2.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	private String stId;
	
	private String stname  ;
	
	private int stMarks ;
	
	// bhot saare bacche ek address ko belong karte hai 
	@ManyToOne
	@JoinColumn(name= "AID")
    private Address address ;
	


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStId() {
		return stId;
	}

	public void setStId(String stId) {
		this.stId = stId;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public int getStMarks() {
		return stMarks;
	}

	public void setStMarks(int stMarks) {
		this.stMarks = stMarks;
	}

	public Student() {} ;
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stname=" + stname + ", stMarks=" + stMarks + ", staddress="
				+ "]";
	}

	public Student(String stId, String stname, int stMarks) {
		super();
		this.stId = stId;
		this.stname = stname;
		this.stMarks = stMarks;
		
	}
	
	

}
