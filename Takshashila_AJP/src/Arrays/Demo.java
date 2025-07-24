package Arrays;

import java.util.Arrays;

public class Demo {
	
	
	public static void main(String[] args) {
		
// i want to store 5 integers into a sequence and this is test number of 5 students how can i do this
		
		// we do have array data type 
		
		int[] student_marks  = new int[5] ; // this is declarationn of array of 5 length 
		
		
		// array jab bhi banta hai toh ek default value ka array ban jata hai 
		
		// {0, 0, 0, 0, 0}
	
		
		// it have constant length , it is type safe  it is fast 
		
		student_marks[0] = 50  ;
		student_marks[1] = 60 ;
		student_marks[2] = 90  ;
		
		student_marks[4] = 66 ;
		student_marks[3] = 91 ;
		
		for (int i =0  ;i<student_marks.length ;i++) {
			System.out.println("student marks of number " + i +" is " +student_marks[i] );
		}
		
	
		
		int [] arrr  = {23,34,12,53,12,52} ;
		
		for(int a:arrr) {
			System.out.println(a);
		}
		
		System.out.println(Arrays.toString(arrr));
		
		// matrix
		//0 0 0 0
		//1 2 3 4
		//9 4 5 6 
	   //89 3 5 7      4x4  row* col   
		
		// 00 01 02     10 11 12    20 21 22
		//[ [1 23 2]  ,[8 2 12] , [43,23,22] ]
		  //  ,[8 2 12] 
			//	, [43,23,22]]
		
		
		int [][] mat  = {  {1,2,3}  , {4,5,6} , {90 , 23,22}      } ;
		
		
		for (int i =0 ;i<mat.length ;i++) {
			
			for (int j =0  ;j<mat[0].length ;j++) {
				
				System.out.print(mat[i][j]);
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
