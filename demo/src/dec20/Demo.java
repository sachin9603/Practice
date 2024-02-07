package dec20;

public class Demo {
	
	
	public static void main(String[] args) {
		// s1 obj defalut consturctor ka use kar rha hai 
		
		
		// ek hi  line puri value dedi or obj create kardiya 
		// ye sif ho paya  parmeter vaale constructor ki helpse 
		
	//	Student s2 = new Student(5555 , "sachin" , "java") ;
		// to string method ki help se 
		// pura object print karsakte ho 
		
		//System.out.println(s2);
		
		
		Student s1  = new Student() ;
		
		Address a1 = new Address() ;
		
		a1.setCity("indore");
		a1.setState("mp");
		a1.setPincode("465001");
		
		s1.setStudentId(23456789); 
		s1.setStudentName("Raja ji");
		s1.setStudentSubject("Math");
		s1.setStudentaddress(a1);
		
		int id  = s1.getStudentId() -12345622 ;
		s1.setStudentId(id);
		
		System.out.println(s1.getStudentId());
	
		
	
	a1.setCity("bhopal");
	s1.setStudentaddress(a1);
	String city = s1.getStudentaddress().getCity() ;
	System.out.println(city);
	
	System.out.println(s1.getStudentId());
	System.out.println(s1.getStudentName());
	System.out.println(s1.getStudentSubject());
	System.out.println(s1.getStudentaddress().getCity());
	System.out.println(s1.getStudentaddress().getPincode());
	System.out.println(s1.getStudentaddress().getState());
	
	System.out.println(s1);
	
	 System.out.println(s1.getStudentaddress().getCity() );
	
	 Student s2 = new Student(5555 , "sachin" , "java" , a1) ;
	 System.out.println(s2);
	 
	 
	 
	BcaStudent bb = new BcaStudent(6767 , "puja " , "math" ,a1,600000 ) ;
	
	System.out.println(bb);
	
		
		
		
	}

}
