package pack_03;

import java.util.Scanner;

public class Matrix {

	
	
	public static void main(String[] args) {
	// scanner--- user se input leta hai 
		Scanner sc  = new Scanner(System.in) ;
		
		int [][] mat  = new int[3][2]  ;
//		0 0 
//		0 0
//		0 0
//		int [][] mat2  = {{1,3,5},
//						{1,32,5},
//						{1,3,54}} ;
//		6 7 00 01 
//		6 8 10 11
//		8 9 20 21
		
		for( int i = 0  ;i<3 ;i++) {
			for ( int j =0  ;j<2  ;j++) {
				mat[i][j] = sc.nextInt() ;
				
			}
		}
		
		
		for( int i = 0  ;i<3 ;i++) {
			for ( int j =0  ;j<2  ;j++) {
				System.out.print(mat[i][j]+" " );
				
			}
			System.out.println();
		}
		
		
	
		
		
				
				
		
	}
}
