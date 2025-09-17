package basicQuestion;

import java.util.Arrays;

public class Arrayss {

	public static void main(String[] args) {
	                 //0  1  2
		int [] arr  = {10,20,30 ,45} ;
		
		int [] arr2  = new int[5] ; // 0 0 0 0 0 0 0 0
		
		arr2[0] = 12 ;
		arr2[1] = 45 ;

		arr2[2] = 2 ;

		arr2[3] = 26 ;

		arr2[4] = 156 ;

		int sum  = 0 ;
		
		for ( int i=0 ;i<arr2.length ;i++) {
			
			sum = sum +arr2[i] ;
			
		}
		System.out.println(sum);
		
		for(  int hh :arr2 ) {
			System.out.println(hh);
		}
		
		
		
	}

}
