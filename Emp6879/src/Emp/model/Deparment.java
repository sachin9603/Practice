package Emp.model;

public class Deparment {
	
	// one department can have multiple employee 
	
	private int dId ;
	
	private String dname  ;
	

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Deparment(int dId, String dname) {
		super();
		this.dId = dId;
		this.dname = dname;
	}

	public Deparment() {
		super();
	}
	

}
