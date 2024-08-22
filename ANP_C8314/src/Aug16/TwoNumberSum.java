package Aug16;

import java.util.Arrays;

public class TwoNumberSum {
	
	public static void main(String[] args) {
		int []arr = {12,7,6,4,5,33} ;  //n^2
		int k = 12 ;
		
		 //  4 5 6 7 12 33   
		//  l        r
		//   4 + 33  =  37
		//   4 + 12   =  16  
		//   4  + 7   =  11  
		///  5  + 7  = 12  
		
		Arrays.sort(arr) ;
		int n  = arr.length ;
		
		
		int l = 0;
		int r = n-1 ;
		while(l<r) {
			if(arr[l] + arr[r] == k) {
				System.out.println(arr[l] +" " +arr[r]);
				break ;
			}else  if ( (arr[l] + arr[r])< k ){
				l++  ;
				
			}else {
				r-- ;
			}
		}
		
		//{12,7,6,4, 98, 23  , 45 , 78 ,90,5,33}  int g  = 3 
		
		// you have to find max sum of three consecutive number 
		
		
		

	}

}
