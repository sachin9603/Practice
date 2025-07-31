package MATIX_BASIC_DSA;

public class Demo2 {

	
	
	
	public static void main(String[] args) {
		
		   int[][] mat = {
		            {1, 2, 3, 4},   // row 0
		            {5, 6, 7, 8},   // row 1
		            {9, 10, 11, 12} // row 2
		        };
		   
		   
		   int  top = 0  ;
		   int bot  =  mat.length-1 ;
		   
		int left  = 0  ;
		int right  =  mat[0].length-1; 
		
		
		while (top<=bot && left <= right) {
			
			for (int  i = top  ; i<= bot  ;i++) {
			System.out.print(mat[i][left] +" ");
			}
			left++ ;
			
			
			for (int  i = left  ; i<= right  ;i++) {
				System.out.print(mat[bot][i]+" ");
				}
				bot-- ;
				
				
				for (int  i = bot  ; i>=top  ;i--) {
					System.out.print(mat[i][right]+" ");
					}
					right-- ;
					
					for (int  i = right  ; i>=left  ;i--) {
						System.out.print(mat[top][i]+" ");
						}
						top++ ;
				
			
		}
	}
}
