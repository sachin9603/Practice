package june18.array;

import java.util.Arrays;

public class Demo4 {
	
	public static void main(String[] args) {
		
		 int [] arr  = {4,7,1,75,31,72} ;
		 
		// you have to find maximum and minimum element in this array
		 // int max  = arr[0] ;
		 //int min  = arr[0] ;
		 
		 Arrays.sort(arr);   //  1 4 7 31 72 75
		 
//		 for(int a  : arr) {
//			 
//			 if(a>max) {
//				 max  = a ;
//			 }
//			 if(a<min) {
//				 min = a  ;
//			}
//		 }
//		                             // arr[5]
		 System.out.println("max is " + arr[arr.length-1]);
		 System.out.println( "min is " + arr[0]);
		
		
		
	}

}
