package matix;

public class Questions {
	
	
	public void zigZag() {
		
		int[][] mat = {
			    { 1,  2,  3,  4,  5 }, // 00
			    { 6,  7,  8,  9, 10 }, //11
			    {11, 12, 13, 14, 15 },  //22 
			    {16, 17, 18, 19, 20 }, // 33
			    {21, 22, 23, 24, 25 }   //44
			};	
		
		
		
		for ( int  i =0  ;i<mat.length  ;i++) {
			
			if(i%2 == 0 ) {
				for (int  j = mat[0].length -1  ; j>=0 ; j--) {
				System.out.print(mat[i][j]+" ");	
				}
			}else {
				for (int  j = 0  ; j< mat[0].length ; j++) {
					System.out.print(mat[i][j]+" ");	
					}
			}
			
			
		}
		
		
	}
	
	public void spriralTraversal() {
		int[][] mat = {
			    { 1,  2,  3,  4,  5 }, // 00
			    { 6,  7,  8,  9, 10 }, //11
			    {11, 12, 13, 14, 15 },  //22 
			    {16, 17, 18, 19, 20 }, // 33
			    {21, 22, 23, 24, 25 }   //44
			};
		
		int top  = 0  ;
		int bot = mat.length  ;
		int left = 0 ;
		int right  = mat[0].length;
		
		
		
		while(top<bot && left < right) {
			
			for ( int i = top ;i<bot ;i++) {
				System.out.print(mat[i][left] +" ");
			}
			left++ ;
			
			
			for( int i = left ; i< right ;i++ ) {
				System.out.print(mat[bot-1][i] +" ");

			}
			bot-- ;
			
			for( int i = bot-1 ; i>=top ;i-- ) {
				System.out.print(mat[i][right-1] +" ");

			}
			right-- ;
			
			for( int i = right-1 ; i>=left ;i-- ) {
				System.out.print(mat[top][i] +" ");

			}
			top++;
			
			
			}
		
		
		
		
		
		
	}
	
	
	
	public void circularTraversal() {
		
		int [][]  mat  = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		            } ;
		// 7 4 1 
		
		for (int i= mat.length-1 ;i>=0  ;i-- ) {
		System.out.print(mat[i][0]+" ");	
		}
		
		// 2 3
		for (int i=1 ;i< mat[0].length  ;i++ ) {
			System.out.print(mat[0][i]+" ");	
			}
		
		// 6 9
		for (int i=1 ;i< mat.length  ;i++ ) {
			System.out.print(mat[i][mat[0].length-1]+" ");	
			}
		
		//8
		for (int i= mat[0].length-2 ;i>=1  ;i-- ) {
			System.out.print(mat[mat.length-1][i]+" ");	
			}
		
		
		
		
		
	}
	
	public void  dimondTraversal(){
		
		
		int[][] mat = {
			    { 1,  2,  3,  4,  5 },  // 02
			    { 6,  7,  8,  9, 10 },    // 13
			    {11, 12, 13, 14, 15 }, // 24
			    {16, 17, 18, 19, 20 }, 
			    {21, 22, 23, 24, 25 }   
			}; // 15 9 3 7 11
		
		
		for ( int  i = mat.length /2 ,j = mat[0].length -1 ;i>=0 && j>= mat[0].length/ 2;i-- , j--) {
			System.out.print(mat[i][j]+" ");
		}
		
		for (int  i =1 ,j =  mat[0].length/ 2-1 ;i<=mat.length /2 && j>=0  ; i++ , j--) {
			System.out.print(mat[i][j]+" ");
		}
		
		
		
		
		
		
		
	}

	public void ntraversal() {
		
		
		int[][] mat = {
			    { 1,  2,  3,  4,  5 }, //
			    { 6,  7,  8,  9, 10 }, //11
			    {11, 12, 13, 14, 15 },  //22 
			    {16, 17, 18, 19, 20 }, // 33
			    {21, 22, 23, 24, 25 }   //44
			};
//		
//		int [][]  mat  = {
//						{1,2,3},
//						{4,5,6},
//						{7,8,9}
//						
//				            } ;
		
		
		for (int  i=mat.length -1 ; i>=0 ;i--) {
			
			System.out.print(mat[i][0]+" ");
		}
		for ( int i=1 ;i<mat.length ;i++ ) {
			System.out.print(mat[i][i]+" " );
		}

		for (int  i=mat.length -2 ; i>=0 ;i--) {
			
			System.out.print(mat[i][mat[0].length -1]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Questions q  = new Questions()  ;
		
		q.ntraversal() ;
		System.out.println("==========================================");
		q.dimondTraversal();
		System.out.println("==========================================");

		q.circularTraversal()  ;
		System.out.println("==========================================");

		
		q.spriralTraversal()  ;
		System.out.println("==========================================");

		
		q.zigZag()  ;
		
		
		
		
		
		
	}
}
