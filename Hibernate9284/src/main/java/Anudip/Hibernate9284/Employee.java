package Anudip.Hibernate9284;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "CompanyEmployee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) /// agr ye aap laga rahe ho toh khud se primary nahi dena hai 
	
	private int  eid  ; 
	
	@Column(name  = "EmpName")
	private String  ename  ;
	
	@Transient
	private String dep  ;
	
	@Temporal(TemporalType.DATE )
	 Date myObj = new Date(); ; // Create a date object
	 
	    // System.out.println(myObj); // Display the current date
	
	
	//  GenerationType.auto --- khud ki table  table banayega  hibernate sequence
	//  GenerationType.IDENTITY)  -----> data base increment freature use karega ( GenerationType.IDENTITY))
	// .Table mai ek table bangeaa 
	//GenerationType.SEQUENCE  -- it uses sequence feature of data base 
	
	
	
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
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
	
	public Employee(int eid, String ename, String dep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dep = dep;
	}
	
	public Employee( String ename)  {
		super();
	
		this.ename = ename;
		
	}
	
	
	public Employee() {}
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dep=" + dep + "]";
	} ;
	
	
	

}
