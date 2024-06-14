package june13.staticcccc;

public class Student {
	
	String name  ;
	
	String subject  ;
	
	static String  collegeName = "IES" ;
	
	
	public  static void learn() {
	//	subject  = "hindi" ; // non static variable can not be written  
	//	collegeName = "sistec"; // we  can write only static variable 
		
		collegeName  = "sistect" ;
		
			
	System.out.println(" all students are learning ");
	}
	
	
	public void pdadaikaro() {
		System.out.println("pad rahe hai  ");
	}
	

//	method area  , heap area  , stack area
	public static void main(String[] args) {
		
		Student.learn(); //  static method ko class k naam se direct call
		                 //kar sakte hai object banae ki jarurat nahi hai 
		
		//student.pdadaikaro() ;
		
		
		System.out.println(Student.collegeName);
		
		
		Student s  = new Student() ;
		s.name  = "Rajaji" ;
		s.subject = "CS" ;
		
		s.pdadaikaro();
		
		
	
		System.out.println(s.name ) ;
		System.out.println(s.subject);
		System.out.println(s.collegeName);
		
		
		
		
		Student s2  = new Student() ;
		s2.name  = "pawan" ;
		s2.subject = "math" ;
	
		System.out.println(s2.name ) ;
		System.out.println(s2.subject);
		System.out.println(s2.collegeName);
		
		
		
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + "]";
	}
	
	
	
	
	

}
