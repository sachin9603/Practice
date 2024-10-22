package oct21.Exceptionn;

public class Demo {
	
	// Exception  =---- Checked Exception  (Compile time exception ) ,
	//               2. "Unchecked exception (Runtime Expection)    
	// Error  ======
	
	public void sum() {
		System.out.println("sum of any");
	
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("line 1");
		
		
		//System.out.println( 100/0 );// problem hai line 
		//they are recover
		
		int[] arr  = new int[3] ;
		
		arr[4] = 90  ;
		String ll  = "Sachin" ;
		ll.charAt(9) ;
		
		
		
		System.out.println("line 1000");
		
		Demo k = new Demo()  ;
		
		k.sum()  ;
		
		
		
	}

}
