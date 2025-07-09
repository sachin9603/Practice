package oops_day_5_abstract;


// it is kind of rule that all child class must have to implement all asbtract method there parent class 

public class SBI extends Bank {
	
	///
	
	public double rateOFIntrest()  {
		return 7.5;
		
	}
	
	
	
	public int homeLone()  {
		return 6 ;
		
	}



	@Override
	public void bankRuleBook() {
		// TODO Auto-generated method stub
		
	 System.out.println(" every time is lunch time  ");
		
	}



	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}
	
	public SBI() {
	System.out.println(" mai hu child ka con");
	}

	
	
	
}
