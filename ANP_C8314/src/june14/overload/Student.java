package june14.overload;

public class Student {
	
	
	// overload 
	// same class mai there will multiple method with same name but diffent parameter and return tyep may bbe differnent 
	
 public int adt(int a  ,int b) {
	 
	 return a+b  ;
	 
 }
	
 
 public int adt(int a  ,int b ,int c ) {
	 
	 return a+b+c  ;
	 
 }
 
 public static void main(String[] args) {
	 Student  s  = new Student() ;
	 
	System.out.println( s.adt(12, 10)); 
	
	System.out.println( s.adt(12, 10, 10)); 
	 
	 
	 
 }
	

}
