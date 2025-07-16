package day_8;

public class Student {
	
	//Student class has a addesss class 
	private String name  ;
	private int marks ;
	//private  String address ;// by decalreing address as  i can not diffenciat and insert data , state mp  , city indore
	
	private Address address  ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(String name, int marks, Address address) {
		super();
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	
	public Student() {}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}  ;
	
	
	

}
