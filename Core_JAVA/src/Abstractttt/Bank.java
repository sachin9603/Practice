package Abstractttt;

public abstract class Bank {
	
	
	// abstract method
	public  abstract void rateofIntrest() ;
	
	
	// concrete method 
	public void BankLOGO()  {
		
		System.out.println("bank logo ");
		
		
		
	}
	
	// contructor 
	
	// yes it have constructor 
	// when you will create obj of Sub class by default there is super keyword  in sub class constructor 
	
       public Bank( ) {
    	  this(89) ;
    	  System.out.println("it is calling by its child ");
       }
	
       
       private Bank(int s) {
    	   System.out.println("it is calling by Bank() and i am child  ");
       }
	
	
	
	
	
}
