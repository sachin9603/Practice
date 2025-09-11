package oopss;

public class Student {
	// state 
	String name  ;
	String address ;
	String sub ;
	
	
	// method behaviour 
	
	public void payfees()  {
		System.out.println("please your 20% fee in first installment");
	}
	
	public void ProfileDispaly() {
		System.out.println("Student name "+ name );
		System.out.println("Student address "+ address);
		System.out.println("Student sub " + sub );
	}
	
	
	//constructor  ---> it is method which will give object of same class
	// there is default cons. always but if are creating parameter cons. default will get overlaoded and it get vanish at 
	// at  that time  we need to creat our own default con.
	
	
	// it is default cons. which is not returning anything explicitly  but internally it is returning object of same class
	
      public Student( String n , String ad  , String s) {
    	  
    	  this.address = ad  ;
    	  this.name  = n ;
    	  this.sub =s  ;
    			  
		
	}
      public Student() {};
      
	
	

}
