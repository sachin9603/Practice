package jan30;

public class HumanBeing {
	
	// variables 
	int iQ ;
	
	String gender  ;
	
	String religion  ;
	
	String Catagoery ;
	
	// kuch method (function )
	public void sleep() {
		System.out.println("we prefer to sleep at 8 to 4");
	}
	
	public void eat() {
		System.out.println("we prefer healthy ");
	}
	
	//ye automatic hai or isko contructor kehate hai 
	
	public HumanBeing() {
		
	}

//	public HumanBeing(int iQ, String gender, String religion, String catagoery) {
//		super();
//		this.iQ = iQ;
//		this.gender = gender;
//		this.religion = religion;
//		Catagoery = catagoery;
//	}
//	
	// lekin jab aap parameter vaalaconstructro banate ho toh ye automatic gayab hojata phir aapko ye automatic bhi banana padega 
	
	
//	
	public HumanBeing(int iq  ,String g  , String r , String c ) {
		
		this.iQ = iq  ;
		this.gender  = g  ;
		this.religion = r  ;
		this.Catagoery = c  ;
		
	}
	
	
//	+91 78696 71906  vikas sr k numbe r
	
	

}
