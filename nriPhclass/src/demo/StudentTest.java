package demo;

public class StudentTest {

	
	
	public static void main(String[] args) {
		
		Address ad1  = new Address("Saver" , "567890876" , "MP") ;
		
		Student s1  = new Student(1111 , "Rahul" ,ad1 );
		
	String city  =	s1.getAddress().getCity() ;
	
	System.out.println(city) ;
		
		
	}
}
