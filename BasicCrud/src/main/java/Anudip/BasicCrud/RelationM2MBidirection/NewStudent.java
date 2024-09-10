package Anudip.BasicCrud.RelationM2MBidirection;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class NewStudent {
	
	
	@Id
	@Column(name  = "sid")
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private int sid;
	
	private String sname  ;
	
	@ManyToMany(cascade= CascadeType.ALL)
	@JoinTable(name = "studentCourse" , joinColumns = { @JoinColumn(name = "sid") } , inverseJoinColumns = { @JoinColumn(name = "cid") }  )
	private Set<NewCourse> courses ;
	
	
	
	public NewStudent() {} ;
	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Set<NewCourse> getCourses() {
		return courses;
	}

	public void setCourses(Set<NewCourse> courses) {
		this.courses = courses;
	}

	
	

	
	@Override
	public String toString() {
		return "NewStudent [sid=" + sid + ", sname=" + sname + ", courses=" + courses + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

	
}
