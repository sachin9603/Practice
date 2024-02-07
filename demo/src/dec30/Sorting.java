package dec30;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
	
	
	public static void main(String[] args) {
		//Integer ss  = ""
		Integer [] arr  = {12, 232,4,3,22} ;
		/// this array will be short into tree itration 
		             // 12 4 3 22  232  
		             // 4 3  12 22 232
		             // 3 4  12  22 232 
		
		
		 Arrays.sort(arr, Collections.reverseOrder());
		
		//  Arrays.sort(arr);
		  
//		for ( int i=0 ;i<arr.length ;i++ ) {
//			for( int j  =0 ;j<arr.length-i-1 ; j++) {
//				if(arr[j] < arr[j+1]) {
//					int temp = arr[j] ;
//					arr[j]  = arr[j+1] ;
//					arr[j+1] = temp ;
//				}
//			}
//		}
//		
		System.out.println(Arrays.toString(arr));
		               
		
		
		
		 
		//3 ,4 ,12,22, 232
		
		 // bubble short  ,selection short , insertion short , quick short 
		
	}

}
