package june13.override;

public class Bank{
	
	public double rateOfIntrest ;
//	
//	private  -- only in class
//	default --- same package  only 
//	protected --- same package  only or child class
//	public -- full project
	

	public double rate(){// abhi hum same package mai access karsakte hai and differnt packge but class should child class
		
		rateOfIntrest = 3.90 ;
		
		return rateOfIntrest ;
		
	}
	
}