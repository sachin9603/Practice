package dec22;
// client , yaa bank head 
public abstract class Bank {
	
	// alone abstract class ka koi utilize nahi hai 
	
	
	// is class ko extend kar na  hi hoga 
	// dono method , abstract  , non abstract  
	//// instance create nhi kar skte 
	
	// matlb ki abstract method ki body nahi hoti 
	
	
	int member ;
	
	
	// without body 
	 abstract int rateOfIntrest()  ;
	 
	 
	// method with body concrete method
	  void run(){
		  
		  System.out.println(" the bank is running ");
	  }
	  
	  
	  // no need to create object 
	  static void HomeLone() {
		  System.out.println(" home lone should not be more that 7 percent");
	  };
	  
	 
	 
	 // can abstract class have constructor 
	 
	 // can abstract class have private constructor
	 
	 // jab instance hi create  nahi kar rhe kya use hai
	 
	  
	 public Bank() {
		 
	 this(50000)  ;// line number 49 ko call kar rha hu 
		 
		 System.out.println(" I am from bank ");
	 }
//	 
	 private Bank(int rs) {
		 System.out.println("house rent for emp is " + rs );
		// this.member = 1000 ;
	 }
	 
	 // private access specifier ko bahar se access nahi karskte 
	 
	 
	 
	 
}
