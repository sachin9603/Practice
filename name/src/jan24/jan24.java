package jan24;

import java.util.Arrays;

public class jan24 {
	
	
	public static void main(String[] args) {
		
	/// there is array and a number k  you have to 
		//find two element such that there sum is equal to k 
		
		// sample input  -----[3,6,8,3,23,5,8]  and k = 8 
		// output would be     3 5
		
		int arr[]  =  {3,6,8,3,23,5,8} ;
		int k  = 8  ;
		
//		for ( int i =0 ; i< arr.length ; i++) {
//			
//			for ( int j =i+1 ; j< arr.length ; j++) {
//				
//				if(arr[i]+arr[j] == k) {
//					System.out.println(arr[i]+" "+ arr[j] );
//					return ;
//				}
//				
//			}
//			
//		}
		
		
		 // 14
		/// 3 3 5 6 8  8 23
		//  0 1 2 3 4  5  6 
		
		Arrays.sort(arr);
		
		int  l  = 0 ;
		int r = arr.length -1 ;
		
		while(l<r) {
			if(arr[l] + arr[r] == k) {
				System.out.println(arr[l] +" " + arr[r]);
				return ;
			}else if (arr[l] + arr[r] > k) {
				r-- ;
				
				
			}else {
				l++ ;
			}
		}
		
		
		// 0 1 0 0 1 1 1 0 2 2 0 
		//4 4 2 
		
		
		
	//	break till 6:40 
		
		
	 
		
		
		
		
		
		
		
		
		
		
	
		
		
	}

}
