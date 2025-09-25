package basicQuestion;

public class SpiralTraversal {
	
	public static void main(String[] args) {
		
		
		int[][] mat = {
				// 0   1    2  3   4   <----- col
			    {  1,  2,  3,  4,  5 },  // Row 0 
			    {  6,  7,  8,  9, 10 },  // Row 1
			    { 11, 12, 13, 14, 15 },  // Row 2
			    { 16, 17, 18, 19, 20 },  // Row 3
			    { 21, 22, 23, 24, 25 }   // Row 4
			};
		
		
		// 1 6 11 16 21 22 23 24 25 20 15 .........13
		
		int top  = 0  ;
		int bot  = mat.length-1  ;
		int left = 0  ;
		int right  = mat[0].length-1  ;
		
		while(top <= bot && left <=right ) {
			
			for ( int i =top  ;i<= bot ;i++) {
				System.out.print(mat[i][left]+" ");
			}
			left++ ;
			
			for (int i = left ; i<= right ;i++) {
				System.out.print(mat[bot][i]+" ");

			}
			bot-- ;
			
			   //3 210
			for (int i = bot ;  i>= top ;i--) {
				System.out.print(mat[i][right]+" ");

			}
			
			right-- ;
			
			for (int i = right ;  i >= left;i--) {
				System.out.print(mat[top][i]+" ");

			}
			
			top++ ;
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
