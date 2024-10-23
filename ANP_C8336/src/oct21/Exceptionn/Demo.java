package oct21.Exceptionn;

public class Demo {
	
	// Exception  =---- Checked Exception  (Compile time exception ) ,--- (Code likhte vakt )
	//               2. "Unchecked exception (Runtime Expection)    
	// Error  ======
	
	public void sum() {
		System.out.println("sum of any");
	
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
	
		
		System.out.println("line 1");
		
	
		
		//System.out.println( 100/0 );// problem hai line 
		//they are recover
		
				
		
		System.out.println("line 1000");
		
		Demo k = new Demo()  ;
		
		k.sum()  ;
		
//		
//		System.out.println(100 / 0 ); // Arithmetic Exception 
//    int[] arr  = new int[3] ;
//		
//		arr[4] = 90  ;  // Array Index Out of bond 
//		String ll  = "Sachin" ;
//		ll.charAt(9) ; // String Index Out of Bond Exception  
//		
//		String s  = null  ;
//		System.out.println(s.length()); // null pointer exception  
//		
//		Integer kk= Integer.parseInt(ll) ;; // number format Exception 
//		//  "9090"
//		
//		
//		

		
		//int[] arr  = new int[3] ;
		
  	 // arr[4] = 90  ; 
		
		
  	 
		
		try {
		 	
			String ll  = "888"  ;
			Integer.parseInt(ll) ;
			ll.charAt(9) ;
			System.out.println("this linee is imp ");
			
		}catch(NumberFormatException e) {
			System.out.println(e);
		}catch (StringIndexOutOfBoundsException e) {
			
			
			System.out.println("I am Rider");
			System.out.println(e); 
			
			
		}catch(Exception ll) {
			System.out.println(ll);
			System.out.println("I am final");
			
		}finally {
			System.out.println(" Ye chalega har baarr  ");
		}
	
  	 
		System.out.println("990000");
	}

}
