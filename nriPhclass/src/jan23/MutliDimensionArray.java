package jan23;

import java.util.Scanner;

public class MutliDimensionArray {
	
	public static void main(String[] args) {
		
		/// multxx`i dimensiona array
		
		
		//[[2,3,4] ,   00  01 02
		 //[2,54,4]  , 10 11   12
		// [4,2,0] ]3*3 20 21 22 
		
		/*
		 * int [][] mat = new int[3][3] ;// yaha par maine matrix initialize karvaya
		 * 
		 * // then check kiya ki kya kya element hai uske ander for (int i = 0 ;i<3
		 * ;i++) { for ( int j =0 ;j<3 ;j++) { System.out.print(mat[i][j]+" "); }
		 * System.out.println(); }
		 * 
		 * //ab mai kuch element insert karavana chah raha hu int count = 1 ;
		 * 
		 * for (int i = 0 ;i<3 ;i++) { for ( int j =0 ;j<3 ;j++) { mat[i][j] = count;
		 * count++ ; } //System.out.println(); }
		 * 
		 * // how to run nested loop oin java
		 * 
		 * 
		 * // then firse check kiya ki kya kya element hai uske ander for (int i = 0
		 * ;i<3 ;i++) { for ( int j =0 ;j<3 ;j++) { System.out.print(mat[i][j]+" "); }
		 * System.out.println(); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // how to take input from user
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in) ;
		 * 
		 * int row = sc.nextInt() ;
		 * 
		 * int col = sc.nextInt() ; // mera target hai ek naya matrix banana or usme
		 * user se input lena hai
		 * 
		 * int [][] nayaMat = new int [row][col] ;// yaha par ye value bhoi dena hogi ki
		 * kitane by kitane ka banana hai for (int i = 0 ;i<row ;i++) { for ( int j =0
		 * ;j< col ;j++) { nayaMat[i][j] = sc.nextInt() ;
		 * 
		 * } //System.out.println(); }
		 * 
		 * for (int i = 0 ;i<3 ;i++) { for ( int j =0 ;j<3 ;j++) {
		 * System.out.print(nayaMat[i][j]+" "); } System.out.println(); }
		 * 
		 * 
		 */
	 
	 
	 int [][]nPattern  = {{1,2,3} , //0
			               {4,5,6} , // 1
			               {7,8,9}    //2
			              };
		// 7 4 1 5 9 6 3
         for ( int i = 2 ;i>=0 ;i--) {
			System.out.print(nPattern[i][0]+" ");
		}
         please remove the FJWP course's core Java module from my current time slot, which is from 10 am to 1 pm in batch ANP-C6879? I would like to reschedule it for the AJP batch. Thank you.
		

		for ( int i = 1 ;i<3  ; i++) {
			System.out.print(nPattern[i][i]+" ");
		}
		

		for ( int i = 1 ;i>=0 ;i--) {
			System.out.print(nPattern[i][2]+" ");
		}
		
		
		 
		
		
		
	}

}
