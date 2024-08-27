package aug27;

public class Test {
	
	static {
		System.out.println("mai hu anudip ka student 111111");
	}
	
	
	public static void singing () {
		System.out.println("yes I am singing ");
		
	}
	static int g= 90  ;
	
	public static void main(int a ) {
		System.out.println("good morning ");
	}
	
	public static void main(String[] args) {
		 g = 80   ;
		 
		 
				 
				 
		 
		
		
		Student.study();
		//Student.scrolling() ;
		
		Student s1  = new Student() ;
		s1.setId(23); 
		s1.setName("Kulpratap");
		s1.scrolling();
	
	//s1.scrolling();
	
	String college	= s1.college ;
	
	System.out.println(college);
	
		
		System.out.println(s1);
		
		Student s2  = new Student() ;
		s2.setId(239); 
		s2.setName("Shalini");
		//s2.setCollege("IES");
		// heap 
		
		
		
		System.out.println(s2);
		
		
		Student objwithParameterContructor = new Student(23  , "Tatiyana" , "lnct") ;
		System.out.println(objwithParameterContructor);
		
		
		
	
	}
	
	
	

}
