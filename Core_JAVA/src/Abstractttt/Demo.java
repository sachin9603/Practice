package Abstractttt;

public class Demo {
	
	
	// abstract ----- those verbs --- jo ki action toh ho raha hai but nahi dikhega (sad , love , like, hate )
	
	// abstraction -------> mobile use 

	
	
	public static void main(String[] args) {
		
		
		
	// 	Bank bb  = new Bank() ; you can never create obj of Abstrct
		
		Bank b1  = new SBI() ;
		
		
		b1.rateofIntrest()  ;
		b1.BankLOGO();
		
		
		
		
		
		User u = new Admin()  ;
		u.signup();
		
		User u2  = new Customer()  ;
		u2.signup();
		u2.appLogo();
		
		
		
		Emoployee e1  = new EmployeeImpl() ;
		e1.login();
		e1.saveData();
		
		int s = e1.salary;
		System.out.println(s);
		
		
		
		
	}
}
