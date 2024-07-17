package jul12;

public class Basic {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Student s  = new Student() ; // no args contrutor use ho raha hai
		
		s.name  = "Thonas" ;
		s.rollNumber = 999  ;
		System.out.println(s.name );
		System.out.println(s.rollNumber );
		
		int vv =s.calculate(12, 34) ;
		System.out.println(vv);
		
		
		
		Student ss  = new Student("Rakul" , 2132312) ;
		
		System.out.println(ss.name );
		System.out.println(ss.rollNumber );
		
		Mobile vivo  = new Mobile() ; 
		
		vivo.battery  = 5000 ;
		vivo.displayType = "Amolde" ;
		vivo.megapx  = 50  ;
		vivo.price = 52000 ;
		
		
		Mobile oppo  = new Mobile( 12  , "LED" ,60000 , 600000) ;
		
		
		
		
	
		
		

		
		
		
	}

}
