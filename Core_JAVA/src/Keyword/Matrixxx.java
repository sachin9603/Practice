package Keyword;

public class Matrixxx {
	public static void n_traversal() {
		System.out.println();
		
		int[][] mat  = {{1,2,3},
						{4,5,6}, // 11
						{7,8,9} } ;
		
		for ( int i = mat.length-1 ;i>=0 ;i--) {
			System.out.print(mat[i][0]+" ");
		}
		
		
		for ( int i = 1 ;i<mat.length-1 ;i++) {
			System.out.print(mat[i][i]+" ");
		}
		for ( int i = mat.length-1 ;i>=0 ;i--) {
			System.out.print(mat[i][mat[0].length-1]+" ");
		}
		
		
				
	}
	
	public static void reverseTraverse() {
		               
		int[][] mat  = {{1,8,9},
						{2,7,10},
						{3,6,11} ,
						{4,5,12}} ;
		
		             //2   1    0              
		for ( int j  = mat[0].length-1 ; j>=0 ;j--) {
			
			
			for (int i =0  ;i<mat.length ;i++) {
				System.out.print(mat[i][j]+" ");
			}
			
		}
		
				
		
		
	}
	
	
	
	
   public static void transpose() {
	                                  //rc
	   int [][] mat  =  {{0,0,0,0}, //  00 01 02 03
			             {1,1,1,1} //   10 11 12 13
			          ,  {2,2,2,2} };// 20 21 22 23       // bahar vale mai 3 // ander vaale mai hai 4 element 
			   
	    // 012 
	   //  012
	   //  012 
	   //  012
	   // please dry run this code 
	   for(int  i = 0  ;i<mat[0].length  ;i++ ) {
		   for ( int j  =0 ;j<mat.length ;j++) {
			   
			   //i =0 , 0, 0 1 , 02
			   
			   System.out.print(mat[j][i]);
			   
		   }
		   System.out.println();
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
	}
	
	public static void main(String[] args) {
		transpose() ;
		reverseTraverse()  ;
		n_traversal()  ;
		
	}

}
