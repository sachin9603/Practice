package oct_15;
 //FrontEndDeveloper is a employee
public class FrontEndDeveloper extends Employee  {
	// FrontEndDeveloper is a child class of this employee Class
	
	int Salary  = 50000  ;
	
	
	public void learning() {
		System.out.println("learn latest tech in market related frontend ");
	}

 /// child class ka default constructor  yaa koi bhi constructor 
	// it  will call the parent class constructor automatically at veryfirst line 
	public FrontEndDeveloper() {
	// pehali line likhi hai by default hai super()  // parent k constructor ko call kar rahi hai 
	//	super() ;
		super(90  , "raaju") ;
		
		
	}


	public FrontEndDeveloper(int eid, String name , int salary ) {
		//super(eid, name);
		
		this.Salary  = salary ;
		
	}

//
//	public FrontEndDeveloper(int salary) {
//		super();
//		Salary = salary;
//	}
//	
	
	
	

}
