package june18.multidimensional;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		                                // vasu
		//int [][] arr  = [[1,2,4,5] ,  [11,12,14,15] , [21,22,24,25]] ;
		
		//arr[1] ==vasu 
		
		//arr[1][2] = 14  ;
		                           // R C 
		 //{ {1,2,3 },    00 01 02          arr[0][2]  == 3     
	//		 {4,5,6} ,    10 11 12
	//		 {9, 7,8}   }  20 21 22 
		
		
		
		int [][] mat  = new int [3][3] ;
		
		int count = 1  ;
		for (int i = 0 ;i<3 ;i++) {
			
			for(int j =0 ;j<3 ;j++) {
				
				mat[i][j] = count++;
				
				
			}
		}
		
      for (int i = 0 ;i<3 ;i++) {
			
			for(int j =0 ;j<3 ;j++) {
				
			System.out.print(	mat[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
	}

}
