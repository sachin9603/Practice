package OOPSS.Encapsulation;
// java bean is example of encapsulation 
public class Student {
/// binding data into single unit is known as encapuslation 
	// capsule ---- it is wrapping entire medicine into a single unit
	
	// java bean ---- with all variable are private
	// getter and setter   , 
	// both constructor 
	// to string
	
	private String sname ;
	private int sroll ;
	private String address ;//// "indore 456600  mP"
	
	// write only ---- which have only setter method 
	// read only ---- which have only getter method 
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public int getSroll() {
		return sroll;
	}
	public void setSroll(int sroll) {
		this.sroll = sroll;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student(String sname, int sroll, String address) {
		super();
		this.sname = sname;
		this.sroll = sroll;
		this.address = address;
	}
	
	
	public Student(){}
	
	
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sroll=" + sroll + ", address=" + address + "]";
	} ;
	
	public void login(int roll) {
		if(roll == this.sroll) {
			System.out.println("Login is completed ");

		}else {
			System.out.println("No login ");
		}
	}
	
	
	
	
	
	
	
	
	
}
