package jan25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Basic {
	
	public static void main(String[] args) {
		
		
		
		
		
		//arr  =  [2,8,5,2,6,7 ,3,-25,2,2,4] // sliding window 
		
		// int k = 3 
		
		
		
		//ek value dhai   k  =  28
		
		// is array se do element ese batane hai jinka sum 28 ho 
		            //0  1  2 3   4 5  6
//		  int arr [] = {3,6,7,8,9,18,53} ;
//		
//		  int k   = 17  ;
//		
//		int sum =0 ;
//		// i 0se  lekar 5 tak chalega 
//		for ( int i =0  ;i<arr.length ;i++) {
//			
//		sum = sum+arr[i] ;
//		
//		}
//		
//		System.out.println(sum);
		
		
		  int arr [] = {3,6,7,8,9,18,53} ;
		  
			
		  int k   = 17  ; // find two number from this array whose sum is equal to k 
		  
		  
//		 for ( int i =0 ;i<arr.length ;i++ )  {
//			 
//			  for (int j =i+1  ; j< arr.length ;j++ ) {
//				  
//				  if (arr[i]+ arr[j] ==  k) {
//					  System.out.println(arr[i] +" " +arr[j]); 
//					  return ;
//				  }
//			  }
//			  
//			  
//		  }
		 
		
		 
		 //{ 3, 6, 7, 8, 9, 18,53} 
		 // 
		 Arrays.sort(arr);// unsorted array dalo or sorted array niklega 
		  
		 System.out.println( Arrays.toString(arr) );
		 
		 
		int l =  0  ;
		int r = arr.length-1 ; //6  5
		
		while(l<r) { // ye true hai jab tak while loop chalega 
			 //{ 3, 6, 7, 8, 9, 18,53} 
			if(arr[l]+arr[r] == k) {
				System.out.println(arr[l] +" "+arr[r]);
				return  ;
				
			}else if(arr[l]+arr[r] < k) {
				l++ ;
				
			}else {
				r-- ;
				
			}
			
		}
		
		System.out.println("koi nahi hai ");
		
		
		
		
		
	}

}
