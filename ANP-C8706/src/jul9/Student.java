package jul9;

public class Student {
	
	
	
	
	String  name  ;
	
	static String college = "MANIT" ;
	
	final static String surname  = "Xys" ;
	
      final String pancard  ;
	
	
	public Student() {
		
		pancard  = "sdsd" ;
		
	} ;
//	

	public Student(String name , String surname ) {
		
	
		this.name = name;
		
	}
	
//	
   static final int add(int a  ,int b ) {
		return a+b ;
		
	}
	
	final int add(int a  ,int b, int c ) {
		return a+b+c ;
		
	}
	

}
