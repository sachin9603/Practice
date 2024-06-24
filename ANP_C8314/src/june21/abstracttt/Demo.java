package june21.abstracttt;

public class Demo {
	
	public static void main(String[] args) {
		
		
  // DemoAbstract  a  = new DemoAbstract() ;// you can't instantiated this 
		
		childOfAbstract bb  = new childOfAbstract() ; // this is child class now you can create object of this class 
		// and you can entire method of that abs class 
		bb.bankLogo(); 
		bb.saveCutomerDetails(); 
		bb.takeLoan() ;
		
		
		DemoInterface.showCustomer();
	}

}
