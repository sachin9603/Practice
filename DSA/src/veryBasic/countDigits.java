package veryBasic;

public class countDigits {
	
	public static void main(String[] args) {
		
		int num  = 122323  ;
		int count  = 0  ;
		
		while(num > 0) {
			count++ ;
			num = num/10;
		}
		System.out.println(count) ;
		
	}
	
}
