package basicQuestion;

public class Demo {
	
	public void que1() {

//
//Sum of Digits
//Write a program to input a number and calculate the sum of its digits using a while loop.
//Example: n = 567 → sum = 18.

	}
	
	
	public void  ques_9(int num1, int num2)  {
		//6 12
		
		// if these two numbers are getting devided by all single greatest number that means that is GCD 
		int gcd  = 1;
		
		for( int i =2  ; i<= num1 && i<= num2 ;i++ ) {
			
			if(num1 %i == 0 && num2% i== 0) {
				gcd   = i  ;
			}
		}
		System.out.println(gcd);
		
		
		/// lcm -====num1*num2 / gcd 
		
		
		
		
		
	}
	
	public void que__6( int num) {
		System.out.println("Sachin");
		int orignal  = num ;
		
		int len  = String.valueOf(num).length();
		int sum = 0  ;
		while(orignal >0 ) {
			System.out.println("in loop");
			int dig  = orignal%10 ; //4
			
			int fn = (int) (Math.pow(dig, len));
			
			sum = sum + fn ;
			orignal = orignal/10 ;
			
		}
		System.out.println(sum);
		
		
		System.out.println(sum);
		
			
		
		
		
	}

	
	public void que6( int num) {
//		Armstrong Number
//		Check whether a given number is an Armstrong number.
//		(Example: 153 → 1³+5³+3³ = 153 → Armstrong).
//		
//		An Armstrong number (or narcissistic number) is a number that 
//		is equal to the sum of its own digits, each raised to the power of 
//		the number of digits in the number. For example, 153 is an Armstrong 
//		number because it has three digits, and 1³ + 5³ + 3³ = 1 + 125 + 27 = 153.
		//Similarly, 1634 is an 
		//Armstrong number because 1⁴ + 6⁴ + 3⁴ + 4⁴ = 1 + 1296 + 81 + 256 = 1634
//		
//		
		int duplicatNum = num , n = num ;
		int pow  = 0  ;
		//1634  
		// total length of then number 
		while(num>0 ) {
			pow++ ;
			num = num/10 ;
		}
			int sum  =0  ;
			
			while(duplicatNum >0 ) {
				int dig  = duplicatNum%10 ; //4
				int finalnumber = dig ; //4
				// 0 1 2 3
				for(int i=0  ;i<pow-1 ;i++) {
					
					finalnumber = finalnumber*dig ; //16 //64  //256 
					
				}
				sum = sum +finalnumber;
				
				duplicatNum = duplicatNum/10 ;
				
			}
		
		if (sum == n ) {
			System.out.println("Number is ArmStrong ");
		}else {
			System.out.println("NO number is not ArmStrong");
		}
		
		
		

	}
	
	
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
		
		obj1.que6(1634);
		
		obj1.que__6(1634);
		
		obj1.ques_9(75, 225);
		
	}
	
	

}
