package model;

public class Address {
	
	private int addessId  ;
	private String city  ;
	private String state ;
	private int studentId ;
	
	public int getAddessId() {
		return addessId;
	}
	public void setAddessId(int addessId) {
		this.addessId = addessId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public Address(int addessId, String city, String state, int studentId) {
	
		this.addessId = addessId;
		this.city = city;
		this.state = state;
		this.studentId = studentId;
	}
	
	public Address() {}
	
	@Override
	public String toString() {
		return "Address [addessId=" + addessId + ", city=" + city + ", state=" + state + ", studentId=" + studentId
				+ "]";
	} ;
	
	
	
	
	
	

}
