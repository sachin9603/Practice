package BasicDsa;

import java.util.Arrays;

public class BasicDsa {
	
	
	
	
	public static int subArrSum( int [] arr) {
		
		
		// 2 3 -8 7 -1 2 3 
		
		int maxsum  = 0  ;
		for ( int i =0 ;i< arr.length  ;i++) {
			
			int currsum =  0 ;
			
			for ( int j =i;j< arr.length  ;j++) {
				currsum = currsum + arr[j] ;
				maxsum = Math.max(maxsum,currsum ) ;
			}
		}
		
		return maxsum ;
		
	}
	
	public static void selectionShort(int[] arr) {
		
		////= new int[]{4,55,32,6,2,42 }
		///    2 55 32 6 4  42 
		//     2 4 32 6 55 42
		//     2 4 6 32 55 42 
       //	   2 4 6 32 42 55
         
		 
		int n  = arr.length ;
		
		for( int i =0  ;i< arr.length  ;i++) {
			
			int minidx  = i  ;
			
			// to find inx of that element which is smallest 
			for ( int j  = i+1 ;j<arr.length  ;j++ ) {
				
				if (arr[j]< arr[minidx] ) {
					minidx  = j  ;
				}
			}
		
			int temp  = arr [i ] ;
			arr[i] = arr[minidx] ;
			arr[minidx] = temp  ;
			
			
			
		}
		
		
		
		
		
		
	}
	public static void bubbleShort(int[] arr) {
		//  0 1  232 1 3122 1 3212 1
		// time complexity   -- (o)n2 
		// space complexity --- (o)1
		// it is stable shorting technique 
		
		//= new int[]{1,3,4,55,32,6,2,42 }
		//             1 3 4 32 6 2  42 55  -------------1
		//              1 3 4 6 2  32 42 55-------------2
		//            1 3 4 2  6  32 42 55--- 3 
		//             1 3 2 4  6 -------- 4 
		//              1 2 3 4 6 ----------- 5
		//         ( 1 3 4 32   6 2    42  , 55 ) 
		// it is shorting last to first 
		// it will swap its neibhour element to it self 
		
		 int n  = arr.length ;
		 int temp  ;
		 int count  = 0  ;
		 
		 
		
		for (int i  =0  ;i< n  ;i++) {
			 boolean  swap  = false  ;
			for (int j  =0  ;j< n-i -1 ; j++) {
				count++  ;
				
				if(arr[j]> arr[j+1]) {
					
					temp = arr[j] ;
					arr[j]  = arr[j+1];
					arr[j+1] = temp ;
				swap = true ;
				}
			}
			
			if (swap  == false) {
				break  ;
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		// ( 1,3,4,5,32,6,2,42)
		
		int arr []  = new int[]{1,3,4,32,6,2,42} ;
		//Arrays.sort(arr) ;

     //  System.out.println(Arrays.toString(arr));
		
		//bubbleShort(arr);
		
		selectionShort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		// 2 3 -8 7 -1 2 3 
		
		
		System.out.println(subArrSum(new int [] {2, 3 ,-8, 7 ,-1 ,2, 3 } ));

		
	}

}
