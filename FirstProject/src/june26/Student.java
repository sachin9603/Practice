package june26;

public class Student {
	
	String name  ;
	String college ;
	int roll  ;
	int marks  ;
	
	
	void study() {
		
		System.out.println("yes we all are doing study  ");
		
	}

 // jese hi aap parameter vala cons banayenge jo by default mil raha tha vo gayab ho jaayega 
	public Student(String name, String college, int roll, int marks) {
	
		this.name = name;
		this.college = college;
		this.roll = roll;
		this.marks = marks;
	}
	
 public Student() {
	 // this is special mehtod which is use to make object 
	// iska return type nahi hotahai 
	// and if you not mentioning this contructor it would be automatic provided by
	// jvm 
 }
	
	
	
	  public void disply() {
		  System.out.println("name is " + name );
		  System.out.println("College is " + college );
		  System.out.println("marks is " + marks );
		  System.out.println("roll is " + roll );
		  
	  }
	
	
	
	
	
	

}
