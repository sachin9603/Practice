package Anudip.BasicCrud.RelationM2MBidirection;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class NewCourse {
	
	@Id 
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private int cid  ;
	
	private String cname  ;
	
	@ManyToMany(mappedBy  = "courses" , cascade =CascadeType.ALL)
	private Set<NewStudent>  students   ;
	
	
	
public NewCourse() {} ;


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public Set<NewStudent> getStudents() {
		return students;
	}


	public void setStudents(Set<NewStudent> students) {
		this.students = students;
	}
	
	
	
	
	
	

}
