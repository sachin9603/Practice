package june20.matrix;

public class rombusTraversal {
	
	public static void main(String[] args) {
		
		int [][] mat  = {
				{1,2,3},
				{4,5,6},          ///  12  (row/2 , col-1 )
				{7,8,9} };
		
		int  r  = mat.length ;
		int c  = mat[0] .length ;
		
		
		for (int  i = r/2 , j= c-1 ; i>=0 && j >=c/2 ; i-- , j-- ) {
			System.out.print(mat[i][j]+" ");
		}
		
		
		for (int  i = 1 , j= c/2-1 ; i<= r/2 && j >=0 ; i++ , j-- ) {
			System.out.print(mat[i][j]+" ");
		}
		
		
		
		
		
		
		
	}

}
