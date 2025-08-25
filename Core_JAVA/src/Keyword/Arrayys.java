package Keyword;

import java.util.Arrays;

public class Arrayys {
	
	
	
	int a  = 12  ;
	// 10 baccho ka number storre karvana hai 
	
  
	
	
	public static void main(String[] args) {
		
		// by this it will create a default array of marks having 10 int with default value 0 
		int[] marks  = new int[10] ;// array of 10 number  [0,0,0,0,0,0,0,0,0,0]
		// isme index wise value store hoti hai 
		//[56,23,45,56,68,97,90,04,64,33]
		marks[0] = 23 ;
		marks[1] = 56 ;
		marks[2] = 89 ;
		marks[3] = 52 ;
		marks[4] = 87 ;    
		                // array ka size i<10 --- 0 1 2 3 4 5 6 7 8 9
		for( int i =0 ;i<marks.length ;i++) {
			
			System.out.println(marks[i]);
		}
		
		System.out.println(Arrays.toString(marks));
		
		int[] arr = {12,23,45,60} ;
		
		int[] arr2 = {12,23,45,60} ; // for loop 
		
		//System.out.println(Arrays.compare(arr, arr2));
		
		for(int kl :arr2) {
			System.out.println(kl+10);
		}
		
		
		
		
		// multidimesional array 
		
		
		// array in array  --- [[1,2,3],   2 row  3 column
		                     // [4,5,6]]
		
		
		int[][] mat = new int[3][4] ;
		
		// // mat[[0 0 0 0][0 0 0 0][0 0 0 0]]
		int count = 1 ; //  3 --- 0 1 2
		for (int i =0 ;i<mat.length  ;i++) {
			// 0
			for (int j = 0 ;j <mat[0].length  ;j++) {
				mat[i][j] = count ; //[0][0] = 1 , [0][1] = 2 ,[0][2] = 3
				count++;
			}
		}
	
       for (int i =0 ;i<mat.length  ;i++) {
			for (int j =0 ;j <mat[0].length  ;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
       
       
       int[][] mttt  = {
    		   {0,0,0,0},
    		   {1,1,1,1}, 
    		   {2,2,2,2}  
       } ;
       
	
		
		
		
		
	}

}
