package matix;

public class Demo11 {
	
	
	public static void main(String[] args) {
		//        0     1   2
		//mat { {1,2,3} , {} ,{}  }
		//       0 1 2
		
		
		///mat[0][2]
		
		int [][] mat = { {1,2,3},// 00 01 02
						 {4,5,6} ,//10 11 12
						 {7,8,9}  //20 21 22
				
		               };// 3*3
		
		/// * * * * 
		 // * * * * 
		//  * * * * 
		
		int row  = mat.length ;
		int col  = mat[0].length ;
		
		
		for( int i =0 ;i<row; i++) {
			
			for (int j =0 ;j<col ;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		int [][] matt = { {1,2,3,4},// 00 01 02
				          {5,6,7,8} ,//10 11 12
				          {9,10,11,12}  //20 21 22
		
              };// 3*3
		
		// output --- 4 8 12 3 7 11 2 6 10 1 5 9
		
		                // 3 2 1 0
		for (int  i = matt[0].length - 1 ;i>=0 ;i-- ) {
			
			for (int j =0 ; j < matt.length  ;j++ ) {
				System.out.print(matt[j][i]+ " ");
			}
			
		}
		
		
		
	}

}
