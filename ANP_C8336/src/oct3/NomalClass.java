package oct3;

public final class NomalClass {
// final 
	
	//this
	// this() 
	
	
	final String adhar =  "6789076578546789" ; 
	// variable can't be change
	
	// method can not be override 
	// class can't be extends 
	
	final String pan ;
	
	
	final int speed  = 70  ;
	
	
	public void calculation(final int n ) {
		// n  = n +2  ;
		 
		int p  = n+ 2  ;
		
	}
	

	NomalClass( String ll){
		this.pan = ll ;
		speed  = 90  ;
		
		
	}
	
	
	
	public final void breathing() { // in methods ko aap override nahi kar sakte 
		System.out.println("yes you to breath");
	}
	
	public static void main(String[] args) {
		NomalClass  kk  = new NomalClass () ;
		//kk.adhar  = "8927398273" ;
		System.out.println(kk);
		
	}

}
