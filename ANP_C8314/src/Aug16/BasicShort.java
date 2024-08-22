package Aug16;

import java.util.Arrays;

public class BasicShort {
	
	// time complexity 
	// space complexity (extra space )
	
	public static void main(String[] args) {
		
		int [] arr  = {3,8,7,23,7} ; // time complexity of n 
		
		//           // 7 12 8 23 3 
		             // 7 8 12 23 3 
		             // 7 8 12 3 23 
		
		
		 // 2nd  i  = 1   toh j  1 se lekar 3 tak chlega 
		 // 7 8 12 3 23 
		//  7 8  3 12 23 
		
		// 3 rd iteration  i  = 2   toh j  1 se lekar 2 tak chlega 
				
				//  7 8  3 12 23 
		  ///        7 3 8  12 23 
		
		
		
		
		
		int n  = arr.length ; //5
		int count  = 0  ;
		
//		/{8,9,71,4,5,6}  // selction sort  mai  kya hoga second iteration  k baad
		
		
		
		for ( int i =0 ;i< n  ;i++ ) {
		
		boolean flg  = true  ;   1  2  3 4 5
			//	int [] arr  = {8,9,71,4,5,6}  //8 9  4 5 6 71      8 4 5 6 9 71
		                                         
			for(int j=1 ;j<n-i ;j++) {
				count ++ ; 
				if(arr[j-1] > arr[j]){
					int temp  = arr[j-1] ;
					arr[j-1] = arr[j] ;
					arr[j] = temp ;
					 flg  = false ;}
			}
			
			if (flg) {
				break ;
			}
			
		}
		
		System.out.println(count);
		
        System.out.println(Arrays.toString(arr));

		
		
		// can you short this array without any inbuilt function 
		
		//Arrays.sort(arr) ;
		
       // System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
	}
	

}
