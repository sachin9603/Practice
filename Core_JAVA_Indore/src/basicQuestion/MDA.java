package basicQuestion;

public class MDA {
	//                 12
//  [    [1 2 3] [ 4 5 6 ]     [ 7 8 9]      ]
//	mat =  ///  mat [ [1,2,3] ,  //11  12 13 , 00 01 02 
//	             [4,5,6] ,  21 22 23    -----  10 11  12
//	             [7,8,9]  ] , 31 32 33 ----    20 21 22
	
	
	public void dimond_Traversal() {
		System.out.println();
//		int [][] mat = {
//				{1,2,3},   // 02
//				{4,5,6},
//				{7,8,9} }	 ;
		int[][] mat = {
				// 1   2    3  4   5   <----- col
			    {  1,  2,  3,  4,  5 },  // Row 0
			    {  6,  7,  8,  9, 10 },  // Row 1
			    { 11, 12, 13, 14, 15 },  // Row 2   // 24 13 02
			    { 16, 17, 18, 19, 20 },  // Row 3
			    { 21, 22, 23, 24, 25 }   // Row 4
			};
		
		
		
		for(int i= (mat.length-1) / 2 , j = mat[0].length-1; i>=0 && j>= (mat[0].length-1) / 2 ;i--, j--) {
			// i row  j col 
			System.out.print(mat[i][j]+" ");
		}
		
	}
	
	public void n_traversal() {
		System.out.println();
//		int [][] mat = {
//				{1,2,3},   // 02
//				{4,5,6},
//				{7,8,9} }	 ;
		int[][] mat = {
				// 1   2    3  4   5   <----- col
			    {  1,  2,  3,  4,  5 },  // Row 0
			    {  6,  7,  8,  9, 10 },  // Row 1
			    { 11, 12, 13, 14, 15 },  // Row 2
			    { 16, 17, 18, 19, 20 },  // Row 3
			    { 21, 22, 23, 24, 25 }   // Row 4
			};
		
		  /// 2 1 0
		for(int i =mat.length -1 ;i>=0 ;i--) {
			System.out.print(mat[i][0]+" "); //741
		}
		
		for(int i =1 ;i<mat.length ;i++) {
			System.out.print(mat[i][i]+" "); //741
		}
		
		for(int i =mat.length -2 ;i>=0 ;i--) {
			System.out.print(mat[i][mat[0].length-1]+" "); //741
		}
		
	}
	
	public void traverse2DArray() {
		int [][] mat = {
				{1,8,9},   // 02
				{2,7,10},
				{3,6,11},
				{4,5,12}
				
		} ;
		
		
		// column    0 2 1 0
		for (int i=mat[0].length -1  ;i>=0  ;i--) {
			
			// row 
			for (int j =0 ;j<mat.length ;j++) {
				System.out.print(mat[j][i]+" ");
			}
			
		}
		
		
	}
	
	public void tranpose() {
		int [][] mat = {
				{0,0,0,0},
				{1,1,1,1},
				{2,2,2,2}
		} ;
		
		
		  
        for (int i =0  ;i<mat[0].length ;i++) {
        	for(int j =0  ;j<mat.length ;j++) {
        		System.out.print(mat[j][i]+" ");
        	}
        	System.out.println();
        }
		
		
		// write your code here 
	}
	
	public static void main(String[] args) {
		
		int [][] mat  =  new int[3][3] ; //9 
		
		mat[0][0] = 93 ;
		mat[0][1] = 94 ;
		
        mat[0][2] = 95 ;
		
        mat[1][0] = 83 ;
		mat[1][1] = 84 ;
		
        mat[1][2] = 85 ;
		
        mat[2][0] = 73 ;
		mat[2][1] = 74 ;
		
        mat[2][2] = 75 ;
        
        
        
        for (int i =0  ;i<mat.length ;i++) {
        	for(int j =0  ;j<mat[0].length ;j++) {
        		System.out.print(mat[i][j]+" ");
        	}
        	System.out.println();
        }
		
		
		
		
		
		
		MDA ob = new MDA()  ;
		
		ob.tranpose();
		ob.traverse2DArray();
		ob.n_traversal();
		ob.dimond_Traversal() ;
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
