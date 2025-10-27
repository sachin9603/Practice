package array;

import java.util.Arrays;

public class Demo {
	
	public static void main(String[] args) {
		
		String collageName= "IES , RNTU , TRUBA, SATI, BIT" ;
		
		String [] arrOfString = new String[5];// at this point a array with default value will get created
		
//		for(String collagename : arrOfString) {
//			System.out.println(collagename);
//		}
//		
		
		arrOfString[0] = "IES" ;
		arrOfString[1] = "RNTU" ;
		arrOfString[3] = "BIT" ;
		arrOfString[2] = "Sati" ;
		arrOfString[4] = "TRUBA" ;

		
		
		for(String collagename : arrOfString) {
			System.out.println(collagename);
		}
		
		
		int [] arr  = new int [5] ;
		System.out.println(Arrays.toString(arr));
		
		// a array with default value will get created 
		//it is fixed in size 
		// only same type data is allow 
		// it is object type of data type 
		// you can acceess any element if you have index of that element 
		
		
		int [] arr2 = {12,12,23,45434,2} ;
		System.out.println(Arrays.toString(arr2));
		
		int lenOfArray  = arr2.length ;// 5 this method will give size of array 
		
		for (int i =0 ;i<arr2.length ;i++ ) {
			System.out.println(arr2[i]);
			
			
		}
		
		System.out.println(arr2[2]);
		
		//	int [] arr2 = {12,12,23,45434,2} ;
		
		
		for (int i = arr2.length-1 ;i>=0 ;i--) {
			System.out.println(arr2[i]);
		}
		
		
		int arr3[] = {23,4,6,84,2,56} ; // find summ of all element 
		// find largest and smallest number in array 
		
		int sum  = 0  ;
		for (int i = arr3.length-1 ;i>=0 ;i--) {
			sum = sum + arr3[i];
		}
		System.out.println("sum is "+sum);
		
		
		//int arr3[] = {23,4,6,84,2,56} ; // find summ of all element 
		// find largest and smallest number in array 
		
		
		int smallestNumber = Integer.MAX_VALUE ; // sabse bada number 
		
		int lagestNumber  = Integer.MIN_VALUE ;
		
		
		for( int i =0  ;i<arr3.length ;i++) {
			if(arr3[i] <smallestNumber) {
				smallestNumber = arr3[i];
			}
			
			if(arr3[i]> lagestNumber) {
				lagestNumber = arr3[3] ;
				
			}
		}
		
		System.out.println("small "+smallestNumber  +" , large : " + lagestNumber);
		
		
		
		
		int [] sarr = {2,4,7,9,12,23,25} ;
		
		// you have to return two index such that their sum is 30 ;
		
		
		int [][] mat = {  {1,2,3},  // 00 01 02
				
					      {4,5,6}, // 10 11 12
					      {7,8,9} } ;   // 20 21 22
		
		System.out.println(	mat[2][2]);
		
		
		for ( int i =0 ;i<mat.length ; i++) {
			
			for (int j =0  ;j< mat[0].length ;j++ ) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	
		
		
			
		
		
	}

}
