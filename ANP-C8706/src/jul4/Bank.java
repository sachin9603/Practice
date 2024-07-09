package jul4;

public abstract class Bank {
	
	// you can't create object of this class
	
//	public void saveCustomer() {
//		// suppose 100 line ka code hai 
//		
//		
//	concrete method 
//		
//		
//		
//	}
	
	public abstract void saveCustomer() ;// Functionality 
	
	public void showLogo() {
		System.out.println("this is bank logo ");
	}
	
	static void acInAtm() {
		System.out.println("yes all ac are installed ");
	}
	
	
	public Bank() {
		this(100) ;
		System.out.println("yes Bank construotr is called ");
	} ;
	
	private Bank(int speed ) {
		
		System.out.println("speed of bank is  " + speed  );
		
	}
	
	
	
	
	
	// kya abstract mai constructor hota hai jabki uska object banata nahi hai  
	
	// yes it do have constructor bcz there would be a child which will extends this abstarct
	//class jese ki (ChildOfBank)  so when you will create a construtor of child class or you will create obj of 
	// child class at that time by default super() key word would be their and it means it is calling
	// parent class contructor so there a cons. must be there in parent classs in this way it proved yes abstract have consrtuctor 
	
	// kay abstract class can have private construtor 

}
