package studentManagementSystem.model;

public class Student {
	
	private Integer rollnumber ;
	private String name  ;
	private String address ;
	
	public Integer getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(Integer rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student(Integer rollnumber, String name, String address) {
		
		this.rollnumber = rollnumber;
		this.name = name;
		this.address = address;
	}
	public Student() {
	
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
	

	

}
