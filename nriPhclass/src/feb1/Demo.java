package feb1;

public class Demo {

	
	
	public static void main(String[] args) {
		// ek simple sa obj  banane k liye aapko 
		Student s1  = new Student() ;
		 //s1.branch = "cse" ; 
		
		s1.setBranch("Mechanical");
		
	    s1.setMarks(500) ;
         s1.setName("Sachin");
         s1.setRoll(9211);
		
		System.out.println(s1.getBranch());
		
		System.out.println(s1.getMarks());
		
		System.out.println(s1.getName());
		
		System.out.println(s1.getRoll());
		
		
		Student s2  = new Student(768 , "kali" , 300 , "CS") ;
	
	   // s2.display();
		
		System.out.println(s2);
				
				s2.preprationForExam();
		
		
		
		
	}
}
