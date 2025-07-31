package MATIX_BASIC_DSA;

import java.util.Scanner;

public class Demo {
	
	
	public static void ques5()  {
		 int[][] mat = {
		            {10, 20, 30, 40, 50}, // row 0
		            {11, 21, 31, 41, 51}, // row 1
		            {12, 22, 32, 42, 52}, // row 2 52 41 30x 35
		            {13, 23, 33, 43, 53}, // row 3
		            {14, 24, 34, 44, 54}  // row 4
		        };
		 int row = mat.length  ;
		 int col  = mat[0].length;
		  
		 
		 
		 
		 
		 for ( int i =row/2  , j =col-1  ; i>=0 && j>=col/2 ; i-- ,j--) {
			 System.out.println(mat[i][j]);
		 }
		  
		 
		 
	}

public static void ques4() {
		
		int[][] mat = {
				
				{1,2,3} , //00 , 01,02
				{4,5,6} ,// 10
				{7,8,9}  , // 20
				
			};
		//9 l0 11 12 8 7 6 5 1 234
		
		for (int i = mat.length -1  ;i>=0 ; i--) {
			System.out.print(mat[i][0]+" ");
		}
			
		for (int i = 1  ;i<mat.length; i++) {
			System.out.print(mat[i][i]+" ");
		}
		
		for (int i = mat.length -2  ;i>=0 ; i--) {
			System.out.print(mat[i][mat.length -1]+" ");
		}
			
		
	}
	
	
public static void ques3() {
		
		int[][] mat = {
				{1,8,9} , //00 , 01,02
				{2,7,10} ,// 10
				{3,6,11}  , // 20
				{4,5, 12}  // 20
				
				
		};
		//9 l0 11 12 8 7 6 5 1 234
		
		for (int i = mat[0].length -1  ;i>=0 ; i--) {
			
			for(int j  = 0; j<mat.length; j++) {
				System.out.print(mat[j][i]+" ");
			}
		
		}
		
		
	}
	
	
	public static void ques2() {
		
		int[][] mat = {
				{0,0,0,0} , //00
				{1,1,1,1} ,// 10
				{2,2,2,2}   // 20
				
		};
		
		for (int i =0  ;i<mat[0].length ; i++) {
			
			for(int j  = 0; j<mat.length; j++) {
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void ques1() {
		// this would be a square matrix only
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("enter the number of length of matrix");
		
		int len  = sc.nextInt() ; // 3
	
		int [][] mat  =new int [len][len]; // khaali matrix 
		
		System.out.println("now press total number = " + len*len);
		
		for (int i =0  ;i<len ; i++) { // row 
			System.out.println(i +" row  number");
			for (int j =0  ;j<len ;j++) {
				
				mat[i][j] = sc.nextInt() ;
				
			}
		}
		
		
		for (int i =0  ;i<len ; i++) {
			
			for (int j =0  ;j<len ;j++) {
		
				System.out.print(mat[i][j]+1 +" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
//		Scanner sc  = new Scanner(System.in) ; // it is used to take input form useer 
//		
//		System.out.println("ek number press karo ");
//		// jese hi samne vala ek number press karega we will took that number as data from user
//		
//		int ekNumber  = sc.nextInt() ;
//		System.out.println("ek  or number press karo ");
//		int ekorNumber  = sc.nextInt() ;
//		
//		
//		System.out.println(ekNumber+ekorNumber);
//
//		
//		
//		System.out.println("ek line likho ");
//		
//		String ekLine  = sc.next() ;
//		
//		
//		
//		
//		System.out.println(ekLine);
//		
//		
//		System.out.println("boolean value likho  ");
//	Boolean b  = sc.nextBoolean() ;
//	
//		
//		
//		
//		
//		System.out.println(b);
		
		//ques1() ;
		
//		ques2() ;
//		
//		ques3() ;	
//		System.out.println();
//		ques4() ;
		
		ques5() ;
		
//		
		
		
		
	}

}
