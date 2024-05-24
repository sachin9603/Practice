package fourFiFty;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int [] arr  = {2,3,5,4,9}; // 9 4 3 5 3 2
          int n = arr.length/2 ;
          int p = arr.length ;
          
		for(int i =0 ;i<n ;i++) {
			int temp = arr[i] ;
			arr[i]  = arr[p-1-i];
			arr[p-1-i] = temp ;
			
			
			
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
