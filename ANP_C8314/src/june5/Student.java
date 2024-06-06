package june5;

public class Student {
	
	int rollNumber ;
	String name ;
	String address ;
	String subject ;
	
	// source -genrate const. using field  -select all  - genrated
	public Student(int rollNumber, String name, String address, String subject) {
	
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
		this.subject = subject;
	}
	
	// jab hume parameter vala construor banaya tab jo aapko defalut 
	// cons mil rha tha vo nahi milegaa ab aapko vo banana hai har baaar
	
	
	
	public Student() {} ;
	// default contructor
	
	
	// ek method bana raha hu jo is class ka object print karke dega 
	
	
	public void display() {
		
		System.out.println("===============================================================");
		
		System.out.println("roll number ---> " + this.rollNumber );
		System.out.println(" name  ---> " + this.name );
		System.out.println(" subject  ---> " + this.subject );
		System.out.println("roll address ---> " + this.address );
		
	}
	
	
	
	

}
