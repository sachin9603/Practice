package aug21;

public class Demo {
	
	public static void main(String[] args) {
		Address p1  = new Address() ; 
		
		p1.ctiy  = "inodre " ;
		p1.state = "MP" ;
		p1.pincode = 9090909  ;
		
		
		Student s1  = new Student();
		s1.name  = "Ranjit" ;
		s1.id  = 90  ;
		s1.address = p1 ;
		System.out.println(s1);
		
		
		Student s2 = new Student(89 , "Palak" ,  new Address( "Bhopal" , "up" , 8989909) ) ;
		
		s2.name  = "Chanchal" ;
		
		System.out.println(s2);
		
		
		programer p6  = new programer() ;
		
		p6.salary = 80000 ;
		p6.bonous  = 8000 ;
		System.out.println(	p6.salary);
		
		
		
		
		
	}

}
