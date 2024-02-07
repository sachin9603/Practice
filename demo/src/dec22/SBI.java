package dec22;

public  class SBI extends Bank{

	
	
	public SBI() {
		//super()
	// jab bhi child class ka construtor cll karenge ye automatic 
		//super class k constructor ko calll karega 
		
		//parent classs k construtor ko ko cll karega  hi 
	   // super() ; //by default it is calling its parent class constructor 
		
		System.out.println(" you have called SBI constructor ");
		
		// mai constructor hu 
	}

	@Override
	int rateOfIntrest() {
		// TODO Auto-generated method stub
		return  7;
	}

		
	

}
