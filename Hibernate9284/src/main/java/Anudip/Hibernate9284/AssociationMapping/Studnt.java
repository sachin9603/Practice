package Anudip.Hibernate9284.AssociationMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STT")
public class Studnt {
	
	@Id 
	private int studentId  ;
	private String Studentname  ; 
	
	
	//bhot saare bacche ek hi aaddress ko belong karte hai 
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AID")
	private Address add  ;


	public Studnt(int studentId, String studentname, Address add) {
		super();
		this.studentId = studentId;
		Studentname = studentname;
		this.add = add;
	}
	
	
	public Studnt() {}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentname() {
		return Studentname;
	}


	public void setStudentname(String studentname) {
		Studentname = studentname;
	}


	public Address getAdd() {
		return add;
	}


	public void setAdd(Address add) {
		this.add = add;
	} ;
	
	
	
	
	
	
	
	

}
