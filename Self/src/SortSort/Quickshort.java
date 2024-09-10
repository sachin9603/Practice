package SortSort;

import java.util.Arrays;

public class Quickshort {
	
	
	
	private static int partition(int [] arr, int low, int high) {
	
		int i = low -1   ;
		int pivot = arr[high] ;
		
		for ( int j=low ; j< high ; j++ ) {
			if(arr[j] < pivot) {
				i++ ;
				int temp  = arr[j] ;
				arr[j] = arr[i] ;
				arr[i] = temp ;
			}
			
		}
		i++ ;
		
		int temp  = arr[i] ;
		arr[i] = arr[high] ;
		arr[high]  = temp ;
		return  i ;
		
	}

	
	public static void quick(int [] arr  , int low  , int high) {
		
		if (low<high) {
			
			 int pivot  = partition(arr  , low  , high )  ;
			 
			 quick(arr , low , pivot -1 );
			 quick(arr , pivot+1 , high );
			
		}
	
	 
		
	}
	
	



	public static void main(String[] args) {
		
		int[] arr  = {1,4,2,7,4,6,9};
		
		Quickshort.quick(arr,0 , 6);
		System.out.println(Arrays.toString(arr));
		
	}

}
