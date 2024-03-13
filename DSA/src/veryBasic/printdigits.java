package veryBasic;

public class printdigits {
	public static void main(String[] args) {

		int num  =  4567876 ; 
		// 567876
		         //  10 ki power 6  vala ek number banao  = 1000000
		//1000000
		//4
		//5
		//6
		//7
		//8
		//7 
		//6 
		int rnum   = num  ;
		int count  =  0  ;
		
		while(num >0) {
			num = num/10  ;
			count ++ ;
		}
		
		int div  = (int) Math.pow(10, count-1) ;
		
		while(rnum>0) {
			int digit =rnum / div  ;
			System.out.println(digit);
			rnum  = rnum%div ;
			
			div = div / 10  ;
			
			
			
			
		}
		
		
		
	}
}
