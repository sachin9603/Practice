package dec12.Collectionn;

import java.util.ArrayList;
import java.util.*;

public class Matrixx {
	
	
	
	
	public static void spiralTraversal() {
		
		
		int[][] mat = {  // 15 9 3 7 11 17 23 19
	            {1,  2,  3,  4,   5},   // 00    01    02   03   04
	            {6,  7,  8,  9,   10},  // 10    11    12   13   14
	            {11, 12, 13, 14,  15},  // 20    21    22   23   24
	            {16, 17, 18, 19,  20}, //  30    31    32   33   34
	            {21, 22, 23, 24,  25}  //  40    41    42   43   44
	        };
		
		// 21 16 11 6 1 2 3 4 5 10 15 20 25 24  23 22 17 12 7 8 9 14 19 18 13
		int top  = 0  ;
		int bot  = mat.length-1  ;
		 int left  = 0 ;
		 int right  = mat[0].length-1;
		 
		 while(top<=bot && left <= right) {
		 
		 for (int i = bot ; i>= top  ; i--) {
			 System.out.print(mat[i][left]+ " ");
		 }
		left++ ;
		
		 
		 for (int i =left ; i<=right  ; i++) {
			 System.out.print(mat[top][i]+ " ");
		 }
		 top++ ;
		 
		 for (int i =top; i<=bot  ; i++) {
			 System.out.print(mat[i][right]+ " ");
		 }
		 right--  ;
		 
		 for (int i =right; i>=left  ; i--) {
			 System.out.print(mat[bot][i]+ " ");
		 }
		 bot--  ;
		
	
		
		 }
		
	}
	
	
	// [
	//   [1 2 3]
	//   [4 5 6] 
	//   [7 8 9] ]           2 3
	public static void column_wise() {
	
		
		int [][] mat  = {
				
				{1,2,3}	,
				{4,5,6}	,
				{7,8,9}	,
				
		} ; //1*3
		/// 3 6 9 2 5 8 1 4 7 
		for (int i  = mat[0].length -1 ; i>= 0  ;i--) {
		for(int  j  =0  ;j<mat.length ;j++ ) {
			System.out.print(mat[j][i]+" ");
		}
		}
		System.out.println();
	}
	
	
	
	
public static void reverse_n_Traversal() {
	
		
		int [][] mat  = {
				
				{1,2,3}	,
				{4,5,6}	,
				{7,8,9}	,
				
		} ; //1*3 20   11     02
		/// 3 6 9 2 5 8 1 4 7 
		
		int col  = mat[0].length-1 ;
		for (int i  = 0  ; i<=mat.length-1 ;i++) {
			System.out.print(mat[i][0]+" ");
		}
		
		// 1 0
//		for (int i  = mat.length-2  ; i>=0 ;i--) {
//			                        // 2  -i
//			System.out.print(mat[i][col-i]+" ");
//		}
		
		
		for (int i  = mat.length-2 , j = 1  ; i>=0 &&  j <=col ;i-- , j++) {
            // 2  -i
			System.out.print(mat[i][j]+" ");
			}

		
		for (int i  = 1  ; i<=mat.length-1 ;i++) {
			System.out.print(mat[i][col]+" ");
		}
		
		
		
		
	}
	public static void n_Traversal() {
	
		
		int [][] mat  = {
				
				{1,2,3}	,
				{4,5,6}	,
				{7,8,9}	,
				
		} ; //1*3
		/// 3 6 9 2 5 8 1 4 7 
		
		
		for (int i  = mat.length-1  ; i>=0 ;i--) {
			System.out.print(mat[i][0]+" ");
		}
		for (int i  = 1  ; i<mat.length ;i++) {
			
			System.out.print(mat[i][i]+" ");
		}
		
		for (int i  = mat.length-2  ; i>=0 ;i--) {
			System.out.print(mat[i][mat[0].length-1]+" ");
		}
		
		
		System.out.println();
		
	}
	public static void main(String[] args) {
	
		column_wise() ;
		n_Traversal()  ;
		reverse_n_Traversal() ;
		
		
	 List<String> studentList  =  new ArrayList<>()    ;
	 
	 studentList.add("Sachin");
	 studentList.add("aman");

	 studentList.add("Sachin");

	 studentList.add("pooja");

	 studentList.add("dheeraj");
	 
	 
//	 for (int  i =0  ;i < studentList.size()  ; i++ ) {
//		 System.out.println(studentList.get(i));
//	 }
	 
	 System.out.println(studentList);

	 
	 List<int[]> lis  =  new ArrayList<>() ; 
		
		
	 lis.add(new int[]{3,4}) ;
	 lis.add(new int[]{4,5}) ;
	 lis.add(new int[]{6,000}) ;
	 
	 
	 //System.out.println(lis);
	 
	 
	 for ( int []   asdfasdfasdf: lis) {
		 System.out.println(Arrays.toString(asdfasdfasdf));
	 }
	 
	 
	}

}
