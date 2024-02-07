package jan31;

public class CheckCheck {
	
	
	public static boolean primeCheck(int num) throws NonPrimeException {
		
		//2 3,5,7,11,13,11,13,17,19,23,
		 for (int i = 2  ;i<num  ;i++ ) {
			 if(num%i == 0) {
				 throw new NonPrimeException("this number is not prime ");
			 }
		 }
		 return true  ;
	}
	
	public static void main(String[] args) {
		
		
		
	try {
		 boolean ans  = 	primeCheck(2);
		System.out.println(ans);
		
		
		
	} catch (NonPrimeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		System.out.println("ye kaam toh hokar rahega ");
	}
	
	
     	
     	System.out.println("mai hu last line ");
	}
}
