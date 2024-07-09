package june21.abstracttt;

public class childOfAbstract extends DemoAbstract {
//yes it 
	// suppose yaha contructor  hai 
	public childOfAbstract() {
		
		//super() ; // parent class k constructor ko call kar raha hai 
		System.out.println("child class construstor ");
	}
	
	@Override
	public void saveCutomerDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("yes in this class details are"
				+ " getting processed and  save ");
		
	}

	@Override
	public void takeLoan() {
		// TODO Auto-generated method stub\
		System.out.println("first check customer civil score ");
		
	}


	
// does abstract have cons. 
	// yes it do have conctructor it is while while we r making object of 
	//child class  at that time constructor of child class would be called
	//and we all know that there is fist of child class const is super()
	
	
	

}
