package aug21;

//Student has address  ;
public class Student {
	// access modifier  ---- pulbic , private , protected , default
	
    int id  ;
	String name  ;
    Address address  ;
	
 	
	// parameterized cons 
	public Student(int id, String name, Address address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}


      public Student() {} ;
	
	// toString method  is string reprentation of this Student object
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
