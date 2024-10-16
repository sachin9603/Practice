package oct14.oopss;

public class Student {
	
	// whith each there is default contructor ban jata hai 
	
	// but if your are creating a parameterized cons then that default cons will be vanish (overload) 
	// at that time you must have to create defalut one also 
	
	 // fields 
	//
	int sid  ;
	String  sname  ;
	String password  ;
	String email ;
	
	
	
	// khaali  
	// no - args  // default constructor   // yes it is function 
	public Student() {
	}
	//  parameter  vala 
	// all args constructor
	
	public Student(int id  , String naam  , String pass  , String e) {
		sid  = id  ;
		sname   = naam  ;
		password = pass  ;
		email   = e  ;
	}
	
	public Student(String naam  , String pass  , String e , int id   ) {
		sid  = id  ;
		sname   = naam  ;
		password = pass  ;
		email   = e  ;
	}
	
	
	
	public Student( String naam  , String pass  , String e) {
		sname   = naam  ;
		password = pass  ;
		email   = e  ;
	}
	
	
	
	
	
	
	public void dispaly() {
		
		System.out.println(" student id  -> " +sid  );
		System.out.println(" student name   -> " +sname  );
		System.out.println(" student email -> " +email );
		System.out.println(" student passwrod  -> " + password );
		
		
	}
	
	
	public    int     calculate(int a  , int c) {
		System.out.println(" i will return sum of you paramenter");
		return a+c ;
		}
		

}
