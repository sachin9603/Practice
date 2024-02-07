package dec29;

public class finalll  {
	
//	The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
//
//		variable
//		method
//		class

	final String  pancard   ;
	
	
   public finalll ( String s ) {
	   this.pancard = s ;
   }
	
	
	// construtor change tab mana jayega jab jab dusari class isko in
//	public finalll(int i ){
//		
//	}
	
 final static String collegename   ;
 
 static {
	 collegename ="sdfasd" ;
 }
 
	 
	
	void sum(final int i ) {
	
		int s = i+10 ;
		
		//i = i+10 ;
		
		
	}
	
   
	
	public static void main(String[] args) {
		
		
//		pancard = "345643256" ;
//		
//		pancard = "4r4r34" ;
		
		//System.out.println(pancard);
		
		
      int x  =10 ;
	 x  = 12  ;
		 
	
		finalll dd  = new finalll("sav3245hin" );
	 finalll ddd  = new finalll("sav34253245hin" );
		
		System.out.println(dd.pancard);
		
		System.out.println(ddd.pancard);
		
		
		
		//System.out.println(ddd.adhar);
		System.out.println(x);
		
		
		
		
		
		
	}

}
