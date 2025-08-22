package Keyword;

public class Student {
		
	String name    ;
	String sub  ;
	String email  ;
	static String collegename  = "iess" ;
	
	
	
	public Student(String name, String sub, String email) {
		super();
		this.name = name;
		this.sub = sub;
		this.email = email;
	}
	
	
	public Student() {}


	@Override
	public String toString() {
		return "Student [name=" + name + ", sub=" + sub + ", email=" + email +  ", collegeName =" + collegename+"]";
	}  ;
	
	
	
	public  static void idCard() {
		System.out.println("all students need to wear i card ");
	}
	
	


	
	
	
}
