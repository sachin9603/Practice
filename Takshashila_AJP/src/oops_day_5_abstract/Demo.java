package oops_day_5_abstract;

public class Demo {
	
	public static void main(String[] args) {
		
		 //Bank b = new Bank()  ;can't instantiated
		
		
		SBI newBranch  = new SBI ()  ;// aumatic contructor call ho rha hai 
		newBranch.bankRuleBook();
		newBranch.rateOFIntrest() ;
		
		
		Demo22 d  = new Demo22()  ;
		
		
		   EmployeeApp.appLogo(); 
		   
		EmployeeApp Sanjay  = new EmployeeAppIMPL()  ;
		Sanjay.save()  ;
		Sanjay.login();
	
		
		
		
		
		
		
	}

}
