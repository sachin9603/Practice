package basicQuestion;

public class Demo {
	
	
	public void fibb(int t) {
		int u  = 0 ;
		int k = 1  ;
		// 5
		System.out.println(u);
		System.out.println(k);
		int next  ;
		for (int i = 2 ; i<t ;i++ ) {
			next = u+k ;
			u=k;
			k =next ;
			System.out.println(next);
					
		}
		
		
				
				
	}
	
	public void checkPrime(int k)  {
		
	// 1 2 3 5 7 11 
		if (k==1) {
			System.out.println("Not Prime");
          return  ;
		}
		
		
		boolean flg  = false  ;
		
		for( int i = 2 ;i< k ;i++) {
			
			if(k%i == 0) {
				System.out.println("Not prime ");
				 flg  =  true ;
	       break ;
			}
		}
		if(!flg) {
			System.out.println("Prime");
		}
		
		
	}
	
	
	// method 
	public  void evenDigitSum() {
		// 568769789
				int k  = 568789482 ; /// yadi is number ko 10 se divide karu 
				// ans = 56878948.2 ---- remider 2
				
				
				// you have to do sum of all even digits and odd digits present in k 
				// String --- then string ko traverse 
				 int evenSum =  0  ;
				 int oddSum =  0  ;
				
				while(k>0) {
					int reminderValue  = k%10 ;
					
					// checking even last value
					if(reminderValue % 2 == 0) {
						evenSum = evenSum + reminderValue ;
						
					}else {
						oddSum = oddSum + reminderValue;
						
					}
					
					k = k/10 ;
					
					
				}
				
				
				System.out.println(" even sum " + evenSum + " odd sum " + oddSum);
				
				
	}
	
	
	public static void main(String[] args) {
		
		Demo obj1  =  new Demo()  ;
		obj1.evenDigitSum();
		
		
		obj1.checkPrime(110);
		
	
		
		obj1.fibb(8);
	}
	
	

}
