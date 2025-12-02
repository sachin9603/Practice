package questions;

public class Demo1 {
	
	// 125521 ----- 

	// you have to find sum of all digits 
	
	// ek function yaa method 
	
	public static boolean checkPrime(int num) {
		
	for ( int i=2 ;i<num ;i++) {
		
		if ( num%i == 0) {
			return false ;
		}
	}
	
	return true ;
		
	}
	
	public static void printAllPrime(int num ) {
		// input 20 
		// 2 3  5  7 11 13 17 19 
		    /// 1 ---- 20 
		for( int i=2 ;i<= num  ;i++) {
			
			// is i ko check karunga ki ye prime hai yaa nahi 
			/// i will divide that num from 2 to num-1  and if it gets divide toh ye prime nahi hai 
			 
			if (checkPrime(i)) {
				System.out.print(i+" ");
			}
			
			
			
		}
		
		
		
	}
	
	public static void sumOfEvenOdd(int num) {
		
		int e_sum =0 ;
		int o_sum =0 ;
		
		
		while(num>0) {
			
			int last=num%10 ;
			if(last%2 == 0) {
				e_sum += last ;
				
			}else {
				o_sum += last; 
				
			}
			num = num/10 ;
			
			
		}
		
		System.out.println("even sum = " +e_sum +", odd sum = "+ o_sum);
		
		
		
		
	}
	
	public static void main(String[] args) {
		int eknumber  = 1234 ; 
		sumOFdigit(eknumber);
		
		
		sumOfEvenOdd(712345678);
		
		// you have to give me even sum and odd sum 
		
		
		//123132 -----> 231321
		
	}
	
	
	
	
	
	public static void sumOFdigit(int i) {
		int sum =0 ;
		// 79456123 ; -----
		// yadi mai is number ko  79456123% 10 == 3    --->>79456123/ 10  ------7945612
		while(i>0) {
			
			int lastnumber = i%10 ;//3
			sum = sum + lastnumber; // now you are add that number into sum varibale 
			
			i = i/10 ;
			
			
			
			
		}
		System.out.println(sum );
		System.out.println();
		
		// you have to print all prime numbe till n 
		printAllPrime(20);
		
		
		// you function should print sum of i's digit 
	}
	
	
}
