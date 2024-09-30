package sep30;

public class Test {
	

	public static void main(String[] args) {
		
		
		Car ford = new Car() ;
		System.out.println(ford.seat);
	    ford.accelater() ;
	   
	    
	    Car mer  = new Car() ;
	   
	    mer.wheel  = 5  ;
	    
	 System.out.println(mer.wheel);
	 
	 
	 Student s1  = new Student() ; // ye jo s1 banan hai ye bana hai construtor ki help 
	 s1.id  = 1211 ;
	 s1.marks  = 500  ;
	 s1.name  = "Raman" ;
	 
	 
	 
	 
	 System.out.println("student ki  fees hai ");
	int  amount  =  s1.studentFees() ;
	System.out.println(amount );
	 
	 Student s2  = new Student(8898  , "Mohit", 89) ; // parameter constructor se kar diya 
	
	 System.out.println(s2.name );
	 
	 int amountt  = s2.studentFees() ;
	 
	System.out.println(s2);
	 
	 
	 Coder c1  = new Coder() ;
	 c1.laptop  = "Dell" ;
	 c1.marks  = 600  ;
	 c1.name  = "Abhinay" ;
	 
	 c1.calculation(); 
	 c1.studentFees() ;
			  
	 
	    
	    
	
	
		
	}

}
