package oct17.MultidimesinalArray;

public class CircularTraversal {
	
	public static void main(String[] args) {
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

}
