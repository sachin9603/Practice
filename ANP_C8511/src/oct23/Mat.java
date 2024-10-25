package oct23;

public class Mat {
	
	public void basicMatix() {
		
		 //  0      1    2    3    4
		// { 12  , 45 , 66  , 89  , 70
		
		int[] arr = new int[4] ; //length fix
		
	   int [] newArr  = {1,5,6,3,2} ;
	   
	   // int [][]arr  = { {1,3,5}     00 01  02
	                   //, {2,9 ,8}    10 11 12   }   // arr[1][2] ;
	   
	   
	   ///
	   int [][] matr  ={ {1, 5, 9},  
					     {2, 6, 10},
					     {3, 7, 11},
					     {4, 8, 12} } ;  // 1  2   3  4  5 6 7 8 9 10 11 12
	                                   // 00 10  20 30
	   ///  1 5 9  2 6 10 3 7 11 4 8 12
	   int row  = matr.length ; // 4
	   int col  = matr[0] .length ; // 3
	   
	   for (int i  = 0  ;i<col  ;i++) { //00  01 02 10 11 12
		   
		    for (int j=0 ;j<row  ;j++) {
		    	
			   System.out.print(matr[j][i]+" ");  //
		   }
	   }
	   
	   
	   System.out.println();
	   
	   
	   
	   
	 }
	
	
	public void nTraversal() {
		System.out.println("mmmm");
		int [][]arr  =  {
				
				    {1, 2, 3, 4, 5},       // 00 01 02 03  04
		            {6, 7, 8, 9, 10},      // 10 11 12 13  14
		            {11, 12, 13, 14, 15},  // 20 21 22 23  24
		            {16, 17, 18, 19, 20},  // 30 31 32 33  34
		            {21, 22, 23, 24, 25}   // 40 41 42 43  44
		} ;
		int row  = arr.length  ;
		int col = arr[0].length ;
		
		
		for ( int  i = row-1  ; i>=0  ;i--) {
			System.out.print(arr[i][0]+" ");
		}
		
		for ( int  i = 1  ; i<row  ;i++) {
			System.out.print(arr[i][i]+" ");
		}
		
		for ( int  i = row-2  ; i>=0  ;i--) {
			System.out.print(arr[i][col-1]+" ");
		}
		
		System.out.println();
		}
	
	
	public void nReverseTraversal() {
		
		int [][]arr  =  {
				
			    {1, 2, 3, 4, 5},       // 00 01 02 03  04
	            {6, 7, 8, 9, 10},      // 10 11 12 13  14
	            {11, 12, 13, 14, 15},  // 20 21 22 23  24
	            {16, 17, 18, 19, 20},  // 30 31 32 33  34
	            {21, 22, 23, 24, 25}   // 40 41 42 43  44
	} ;
		
		
		for(int i  =0  ;i<arr.length ;i++) {
			System.out.print(arr[i][0]+" " );
		}
		
		for(int i  = arr.length-2 , j =1  ;i>= 0  &&  j<arr[0].length  ;i-- ,j++) {
			System.out.print(arr[i][j]+" ");
		}
		
		for(int i  =1  ;i<arr.length ;i++) {
			System.out.print(arr[i][arr[0].length-1]+" ");
		}
		
		System.out.println();
		
	}
	
	
	public void circularTraversal() {
		
		
	int [][]arr  =  {
			//       0  1 2  3  4
				    {1, 2, 3, 4,     5},       // 00 01 02 03  04
		            {6, 7, 8, 9,     10},      // 10 11 12 13  14
		            {11, 12, 13, 14, 15},  // 20 21 22 23  24
		            {16, 17, 18, 19, 20},  // 30 31 32 33  34
		            {21, 22, 23, 24, 25}   // 40 41 42 43  44
		} ;
	 
	// 1 6 11 16  21 22 23 24 25 20 15 10 5 4 3 2 
	
	int left  =  0  ;
	int right  =  arr[0].length-1 ;
	int top  = 0  ;
	int bot  = arr.length -1 ;
	
	for ( int  i = top  ;i<= bot  ;i++) {
		System.out.print(arr[i][left]+" " );
	}
	left++  ;
	
	for ( int  i = left  ;i<= right  ;i++) {
		System.out.print(arr[bot][i]+" " );
	}
	bot--  ;
	
	for ( int  i = bot  ;i>=top  ;i--) {
		System.out.print(arr[i][right]+" " );
	}
	right--  ;

	for ( int  i = right  ;i>=left  ;i--) {
		System.out.print(arr[top][i]+" " );
	}
	top++  ;
	
	
	System.out.println();
	}
	
	
	
	
	public void spiralTraversal() {
		
		int [][]arr  =  {
				//       0  1 2  3  4
					    {1,  2,  3,  4,   5},       // 00 01 02 03  04
			            {6,  7,  8,  9,  10},      // 10 11 12 13  14
			            {11, 12, 13, 14, 15},  // 20 21 22 23  24
			            {16, 17, 18, 19, 20},  // 30 31 32 33  34
			            {21, 22, 23, 24, 25}   // 40 41 42 43  44
			} ;
		 
		// 1 6 11 16  21 22 23 24 25 20 15 10 5 4 3 2 
		
		int left  =  0  ;
		int right  =  arr[0].length-1 ;
		int top  = 0  ;
		int bot  = arr.length -1 ;
		
		while(left<=right && top <=right ) {
			
		
		
		
		for ( int  i = top  ;i<= bot  ;i++) {
			System.out.print(arr[i][left]+" " );
		}
		
		left++  ;
		
		for ( int  i = left  ;i<= right  ;i++) {
			System.out.print(arr[bot][i]+" " );
		}
		bot--  ;
		
		for ( int  i = bot  ;i>=top  ;i--) {
			System.out.print(arr[i][right]+" " );
		}
		right--  ;

		for ( int  i = right  ;i>=left  ;i--) {
			System.out.print(arr[top][i]+" " );
		}
		top++  ;
		
		}
		
		System.out.println();
		
	}
		
	
	
	public void diamond() {
		
		
		int [][]arr  =  {
				//       0  1 2  3  4
					    {1,  2,  3,  4,   5},       // 00 01 02 03  04
			            {6,  7,  8,  9,  10},      // 10 11 12 13  14
			            {11, 12, 13, 14, 15},  // 20 21 22 23  24
			            {16, 17, 18, 19, 20},  // 30 31 32 33  34
			            {21, 22, 23, 24, 25}   // 40 41 42 43  44
			} ;
		 
		int row  = arr.length -1 ;
		int col = arr[0] .length-1 ;
		
		
		for ( int  i  =row/2 , j = col ; i>=0 && j>= col/2;i-- , j--  ) {
			
		     System.out.print(arr[i][j]+" ");
		
		}
		
	}
		
	public static void main(String[] args) {
		Mat m  = new Mat() ;
		m.basicMatix();
		m.nTraversal() ;
		m.nReverseTraversal() ;
		m.circularTraversal();
		m.spiralTraversal();
		m.diamond()  ;
		
		
		
	}

}
