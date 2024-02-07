package feb6;

import feb5.Tester;

public class whatsUpTest {
	
	public static void main(String[] args) {
		// abstct clas s ka kabhi obj nahi banta hai 
		
		// kya abs class mai koi construtor hoga 
		
		int b  =  0  ;
		
		try {
			int a  = 100/b;
		}catch(Exception e ) {
			e.getMessage() ;
		}
		
		
		
		whatsUP ss  = new  whatsupImpl() ;
		
		ss.sendMessage();
		
		EmployeeApp t = new Tester () ;
		
		t.deleteEmployee();
		
		EmployeeApp.basicPAy();
		
		t.shift();
		
		
		
		
		
	}

}
