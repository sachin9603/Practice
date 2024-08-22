package Aug16;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int []arr = {12,7,6,4,5,33} ;
		            // 4 || 7 6 12 5 33 
		int n  = arr.length ;
		
		//8,9,71,4,5,6
		for (int  i = 0 ;i<n  ;i++) {
			int index  = i  ;
			for (int j =i+1  ;j < n  ;j++) {
				if(arr[j] < arr[index]) {
					index = j  ; //  serching for smallest valued index 
				}
			}
			int temp  = arr[index] ;
			arr[index]  = arr[i] ;
			arr[i] = temp ;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
