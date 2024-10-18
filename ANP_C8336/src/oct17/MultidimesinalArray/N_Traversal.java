package oct17.MultidimesinalArray;

public class N_Traversal {
	
	
	
	public static void traversal() {
		 int[][] matrix = {
	                {1,   2,    3,   4},
	                {5,   6,    7,   8},
	                {9,  10,   11,  12},
	                {13, 14,   15,  16}
	        };
	        int direction = 0;
	        int top = 0;
	        int left = 0;
	        int down = matrix.length - 1;
	        int right = matrix.length - 1;


	        
	        while (top <= down && left <= right) {
	            if (direction == 0) {
	                for (int i = left; i <= right; i++) {
	                    System.out.print(matrix[top][i]);
	                }
	                top += 1;
	                direction += 1;
	            } else if (direction == 1) {
	                for (int i = top; i <= down; i++) {
	                    System.out.print(matrix[i][right]);
	                }
	                right -= 1;
	                direction += 1;
	            } else if (direction == 2) {
	                for (int i = right; i >= top; i--) {
	                    System.out.print(matrix[down][i]);
	                }
	                down -= 1;
	                direction += 1;
	            } else if (direction == 3) {
	                for (int i = down; i >= top; i--) {
	                    System.out.print(matrix[i][left]);
	                }
	                left += 1;
	             
	                     }
	        }
	        
	}
	
	
	
	public static void diogonalTraversal() {
		int[][] mat = {  // 15 9 3 7 11 17 23 19
	            {1,  2,  3,  4,   5},   // 00    01    02   03   04
	            {6,  7,  8,  9,   10},  // 10    11    12   13   14
	            {11, 12, 13, 14,  15},  // 20    21    22   23   24
	            {16, 17, 18, 19,  20}, //  30    31    32   33   34
	            {21, 22, 23, 24,  25}  //  40    41    42   43   44
	        };
		 
		int row  = mat.length;
		int col  = mat[0].length ;
		
		
		for (int i = row/2 , j = col -1 ;i>=0 & j>= col/2  ;i-- ,j--  ) {
			System.out.print(mat[i][j]+" ");
			
		}
		
		for (int i = 1 , j = col/2-1 ;i<=row/2 & j>= 0  ;i++ ,j--  ) {
			System.out.print(mat[i][j]+" ");
			
		}
		
		

	}
	
	
	
	public static void main(String[] args) {
//		
//		int [][]  mat  =  {{1,2,3} 
//		                 , {4,5,6} 
//		                ,  {7, 8,9}}  ;
//		
		
		int[][] mat = {
	            {1, 2, 3, 4, 5},
	            {6, 7, 8, 9, 10},
	            {11, 12, 13, 14, 15},
	            {16, 17, 18, 19, 20},
	            {21, 22, 23, 24, 25}
	        };

		int row  = mat.length -1;
		int col  = mat[0].length  -1 ;
		
		
		for ( int i  = row ; i>= 0 ;i-- ) {
			System.out.print(mat[i][0]+" ");
		}
		
		for (int i=1 ;i<row  ;i++) {
			System.out.print(mat[i][i]+" ");
		}
		
		
		for ( int i  = row ; i>= 0 ;i-- ) {
			System.out.print(mat[i][col]+" ");
		}
		System.out.println();
		
		diogonalTraversal();
		
		traversal() ;
	}

}
