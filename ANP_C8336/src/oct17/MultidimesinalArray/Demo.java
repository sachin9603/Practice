package oct17.MultidimesinalArray;

public class Demo {
	
	public static void main(String[] args) {
		//  1 1                  0          1           2
	      int  [][] arr  =  { {1,2,4}  //     00  01  02 
	                         ,{5,8,0} //      10  11  12
	                         ,{3,6,7} }  ;  //20  21  22
	      
	      // 1 2 4 5 8 0 3 6 7
	      // 1 5 3 2 8 6 4 0 7
	      
	      
	      ///  3 5 1 8 7 0 4
		
	
		//System.out.println(	arr[2][2]);
		
	      
	      for (int  i =0  ; i< arr.length ;i++ )  // row ko access kar raha ahai 
	    	  {
	    	  
	    	  for ( int  j =0  ; j< arr[i].length ;j++) {
	    		 // System.out.print(i+""+j ) ;
	    		  System.out.print("    "+arr[i][j]+" ");
	    	  }
	    	  System.out.println();
	    	  
	      }
	      
	      
	      
	//int[] [] arr = { {1,2,4}, {5,8,0} , {3,6,7}}  ;
		
		//System.out.println(arr[2][1]);
		
		for(int i = 0; i< arr.length; i++) {
			
			for(int j =0; j<arr[i].length; j++) {
				System.out.print(arr[j][i]+ " ");
			}
			
		}
		System.out.println("////////////////////////////////////////");
		
		
		
		 int [][] kk  = {{1, 2, 3},     //00  01   02
				 		 {4, 5, 6},     //10  11   12     (mid row se  0  + last col)    
				 		 {7, 8  ,9}} ;  //20  21    22    6 2 4 8  
		 
		 // 7 4 1 2 3 6 9 8
		 int row  =  kk.length-1 ;
		 int col  = kk[0].length -1 ;
		 
		 
		 
//		 for(int  i = row/2 ; i>=0 ; i-- ) {
//			 for (int j  = col ; j>= col/2 ; j-- ) {
//				 System.out.print(kk[i][j]+" ");
//			 }
//		 }
		  for(int  i = row/2, j  = col; i>=0 &&  j>= col/2;    i-- , j--  ) {
			 System.out.print(kk[i][j]+" ");
		}
		
		
		
		
		
		
		
	}

}
