package jan13;

import java.util.Arrays;

public class Bubble {
	
	public static void main(String[] args) {
		
		
		
		int [] arr  = {32,61,12,13,5} ;
//mera task hai jo sabase number hai usko last mai lejana 
		           /// 32 61 12 13 5 
		              //32 12 61 13  5
		              // 32 12 13 61 5
					// 32 12 13 5 61
		            //12 13 5 32 61 
		//////////  // 12 5 13 32 61
		
		
		   for (int i =0 ;i<arr.length ; i++) {
			  for (int j = 1 ;j<arr.length-i ;j++) {
				  if(arr[j-1] > arr[j]) {
					   int temp = arr[j-1] ;
					   arr[j-1] = arr[j];
					   arr[j] = temp ;
					}
				}
		   }
		
		
		   System.out.println(Arrays.toString(arr));
		
		              
		
		
//		Arrays.sort(arr); 
//		
//		System.out.println(Arrays.toString(arr));
//		
	// with the help of bubble sort you can sort this array
		
		
		
		
		
		
		
		
		
		
	}

}
