package jan13;

import java.util.Arrays;

public class SelectionSort {

	
	public static void main(String[] args) {
		
		int [] arr = {74,3,85,10,24,1} ;
		
		
		for ( int i =0  ;i< arr.length-1 ;i++) {
			int min_idx  =  i ;
			for(int j = i+1  ;j<arr.length ;j++) {
				
				if (arr[j] < arr[min_idx]) {
					min_idx  = j ;
				}
			}
			
				int temp = arr[min_idx] ;
					arr[min_idx] = arr[i] ;
					arr[i]   = temp ;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
}
