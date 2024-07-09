package jul9;

public class NewDemo {

  public NewDemo() {} ;
  
	
	public static void main(String[] args) {
		
//		
//		Student s1  = new Student("Grish") ;
//		
//		System.out.println(s1.college); //Manit
//		
//		System.out.println(s1.surname);
//		
//		
//		s1.college  = "SGSITS" ;
//		
//		
//		
//		
//		
//		
//		System.out.println( Student.college); // sgsits 
//		
//		Student s2  = new Student("Piyush") ;
//		
//		System.out.println(s2.college);
//		
//		System.out.println(s2.surname );
//		
		
		
		
		// final varible are set at class level or object level 
		//Student k1  = new Student() ;
	//	System.out.println(k1.surname);
		
		
		Student  hh   = new Student ("Anu" , "Sharma") ;
		
		hh.name  = "Tanu" ;
		
		System.out.println(hh.name);
	
		
		
		System.out.println(hh.surname);
		
		
		Student kk  = new Student("KK" , "Shinghaniya") ;
		
	System.out.println(kk.surname);
	

	
		
		Student.add(0, 0) ;
		
		
		ChildOfFSt ll  = new  ChildOfFSt();
		
		ll.add(0, 0, 0) ;
		
		
		
	}
	
	
	
}
