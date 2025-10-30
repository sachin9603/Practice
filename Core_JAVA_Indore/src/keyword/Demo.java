package keyword;

public class Demo  extends Student{
	
		
	static {
		System.out.println("I am first ");
	}
	
	public static void main(String[] args) {
		
		
		Student.study();
		
		Student.study(); 
		String coll = Student.collegename ;
		
		
		
		Student s  = new Student()  ;
		s.rollnumer = 11  ;
		s.name = "Kali" ;
		s.change();
		s.study();
		
		
		System.out.println(s);
		
		

		Student s1  = new Student()  ;
		s.rollnumer = 12  ;
		s.name = "LUV" ;
		
		
		
		System.out.println(s);
		

		Student s2  = new Student()  ;
		s2.rollnumer = 13  ;
		s2.name = "kush" ;
		
		
		
		System.out.println(s2);
		
		Student s23  = new Student()  ;
		s23.rollnumer = 133  ;
		s23.name = "kush333" ;
	
		System.out.println(s23);
		
		
		
		
		
		
		
		
		
		
		
	}

}
