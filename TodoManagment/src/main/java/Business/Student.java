package Business;

public class Student {

	public String name ;
	public String address ;
	public String sub ;
	public Student(String name, String address, String sub) {
		super();
		this.name = name;
		this.address = address;
		this.sub = sub;
	}
	public Student() {} ;
	
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
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	
}
