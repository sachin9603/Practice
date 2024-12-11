package dec9.Exception;

public class MutlipleCatchBlock {
	
	
	public static void main(String[] args) {
		
		
		int [] arr  = new int [] {1,23,4,3,2,4,2}  ;
		
		
		try {
	 ;
			 arr[9]  = 99 ; // i know this would give me a problem 
			 
			 
		}catch(ArithmeticException ae){
			ae.printStackTrace(); 
		}catch (ArrayIndexOutOfBoundsException ab) {
			
			System.out.println("");
			ab.printStackTrace(); 
		}catch (Exception e  ) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
