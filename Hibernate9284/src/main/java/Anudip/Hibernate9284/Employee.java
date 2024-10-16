package Anudip.Hibernate9284;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int  eid  ; 
	private String  ename  ;
	private String dep  ;
	
	
	
	
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
	
	
	public Employee() {}
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dep=" + dep + "]";
	} ;
	
	
	

}
