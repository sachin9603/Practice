package june20.matrix;

public class Trasnpose {
	
//		Sample Input 
//		 
//		3 4
	// 00 01 02 03   
//		0 0 0 0
//	10	1 1 1 1
//	20	2 2 2 2  
//		
//		
//		Sample output 
//		   01
//		0 1 2
//	    0 1 2
//		0 1 2
//		0 1 2


	
	public static void main(String[] args) {
		
		int[][] mat  =  {{0, 0, 0, 0}
						,{1, 1, 1, 1},
						 {2, 2, 2, 2}
								} ;
		
		int col  = mat[0].length ;
		int row  = mat.length ;
		                         // 4           3
		int [][]arr  =  new int[col][row];
		for (int i =0  ;i< mat.length ; i++) {
			for (int j  = 0  ;j<mat[0].length ;j++) {
				arr[j][i] = mat[i][j] ;
				
			}
		}
		
		for (int i =0  ;i< arr.length ; i++) {
			for (int j  = 0  ;j<arr[0].length ;j++) {
				
				System.out.print(arr[i][j]+" " );
				
			}
			System.out.println();
		}
		
		
	
		
		
		
		
						
		
		
		
		
		
	}

}
