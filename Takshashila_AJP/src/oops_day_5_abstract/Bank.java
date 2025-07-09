package oops_day_5_abstract;

public abstract class Bank {
	
	/// we can not create object of this class ///can't instantiated 
	
	
	// concrete method // non abstract method
	
	public double rateOFIntrest()  {
		return 7 ;
		
	}
	
	// abstract method also 
	public abstract void bankRuleBook() ;
	
	public abstract void login() ;
	
	public abstract void  logout()  ;
	
	
	/// yes ---abstract class  have constructor 
	
	
	
	
	public Bank() {
		
	System.out.println("mai hu abs ka contructor or mai ko call kiya hai child class k contructor ");
	}
	
	
	

}
