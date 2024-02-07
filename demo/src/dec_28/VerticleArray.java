package dec_28;

import java.util.Scanner;

public class VerticleArray {

	
	public static void main(String[] args) {
		
		int [][] mat =  new int [3][3] ;
		
		Scanner sc = new Scanner( System.in);
		
		for(int i =0 ;i<3 ;i++) {
			for ( int j =0 ;j<3 ;j++) {
				mat[i][j] = sc.nextInt();
				
			}
		}
		//00 10 20 01 11 21
//		 1 2 3
//		 4 5 6
//		 7 8 9    7 4 1 5 9 6 3
		
		for(int i =2 ;i>=0 ;i--) {	
			System.out.print(mat[i][0]+" ");
		}
		
		for ( int i =1 , j =1 ;j<3&& i<3  ;j++ ,i++) {
			System.out.print(mat[j][i] +" ");
		}
		
		for(int i =1 ;i>=0 ;i--) {	
			System.out.print(mat[i][2]+" ");
		}
		
		
		
		
	}
}
