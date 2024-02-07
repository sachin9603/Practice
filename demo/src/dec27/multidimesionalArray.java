package dec27;

public class multidimesionalArray {
//	[ [1,2,3], 00 01 02
	
//	 [1,2,3],   10 11 12 
//	 [1,2,344] ] 20 21 22
	
	public static void main(String[] args) {
		
		int [][]matrix  = { {2,3,4} ,
				{21,32,44} ,
				{24,23,444} } ;
		
		
		
		for (int i  = 0 ;i<matrix.length ;i++) {
			
			for (int j =0  ;j<matrix[0].length ;j++) {
				
				System.out.print (matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println( matrix[2][2] );
		
	}

}
