package day1;

public class Matt {

	
	
	public static void main(String[] args) {
		
		// it is arrays inside array ---  [ [ ] [] [] [] ]
		//  { {1,2,3}     ///00 01  02 
		 //, {4,5,6},      //10 11 12
		//  {7,8,9} }     // 20 21 22
		// Mat
		
		
		int[][] mat  = new int[3][3] ;
		int count  = 1  ;
		
		for ( int i=0  ;i<mat.length ;i++) {
			
			for (int j=0  ;j<mat[0].length ;j++) {
				mat[i][j] = count++ ;
				
			}
		}
		
		
		for ( int i=0  ;i<mat.length ;i++) {
			
			for (int j=0  ;j<mat[0].length ;j++) {
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
