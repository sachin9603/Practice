package jul11;

public class ExceptionConcept {
	
	public static void  sum(int a ) {
		
		System.out.println(" yes i am sum ");
		sum(a) ;
		
	}
	public static void main(String[] args) {
		// Exception --- kuch kiya jaa sskta hai  unko solve
		
		// error  --- 
		
		
		//ExceptionConcept.sum(12);
		
		// these nubers are provided by user 
		int a  = 46  ;
		int b  =  0 ;
		
		try {
			int data  = a/b  ;
			System.out.println(data);
		}catch( Exception  ee) {
			
			ee.printStackTrace();
			//System.out.println(ee);
		}
		
		
	
		
		// 10 lines 
		System.out.println("sachin");
		
		
	}
		
		
	

}
