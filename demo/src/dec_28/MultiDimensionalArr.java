package dec_28;

import java.util.Scanner;

public class MultiDimensionalArr {
// arr =  [[2,3,5] ,    00  01 02     
//       [12,13,15],    10  11 12 
//	     [21,31,51]]    20   21 22 
//			
//			arr[1][1]
//			
	
	public static void main(String[] args) {
//	 
//		int [][]mat = {{1,2,3} ,
//				{12,24,35} ,
//				{11,22,34} ,
//				{121,232,534}} ;
//		
//		
//		for (int i =0 ;i<mat.length ;i++) {
//			
//			for (int j = 0; j<mat[0].length ;j++) {
//				
//				System.out.print(mat[i][j] +" ");
//				
//			}
//			System.out.println();
//			
//		}
//		
//		
		
		int [][] matx = new int[3][3] ;
		
	//	[[ 0 0 0] ,[ 0 0 0] ,[ 0 0 0] ]
		
		
		Scanner sc  = new Scanner(System.in) ;
		
		for(int i =0  ;i< matx.length;i++ ) {
//			 00 01  02 
//			 10 11  12
			for ( int j=0 ;j<matx[0].length ;j++) {
				matx[i][j] = sc.nextInt() ;
				//System.out.print(matx[i][j] +" ");
			}
			System.out.println();
		}
		
for(int i =0  ;i< matx.length;i++ ) {
			
			for ( int j=0 ;j<matx[0].length ;j++) {
		
				System.out.print(matx[i][j] +" ");
				
			}
			System.out.println();
		}
		System.out.println("Sachin");
//		
		
		
		
		
		
	}
}
