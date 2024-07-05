package june26;

public class Demo2 {
	
	
	public static void main(String[] args) {
		
		Student s1  = new Student() ; // by default vale se bana hai 
		
		
		s1.name  = "Sachin" ;
		s1.marks = 500  ;
		s1.study() ;
		System.out.println(s1.name);
		
		// parameter vaale cons. ka use 
		Student s2  = new Student("Rahul" , "DAVV" , 345675432, 400 ) ;
		s2.disply();
		s2.study() ;
		
		
		
		
		
	}

}
