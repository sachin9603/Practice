package jan18;

public class MultiDimensinalArray {
	
	public static void main(String[] args) {
		//    0           1           2
	//	[ [12,23,34]  11 12 13       10 11 12
//		  , [2,3,1]   21 22 23       20 21 22 
//	     , [29,39,19] ]	 31 32 33    30 31 32
		
		//11
		
//		*
//		* *
//		* * *
		
		//[ [2,3] 
		 //,[45,6]]  45 ki position  10
		
		int [][] mat  = new int[3][3] ;
		
		//mat[3][1]  = 39 ;
		
		int count = 1 ;
		
		for (int i =0 ;i<mat.length ;i++) {
			
			for(int j = 0 ;j<mat[0] .length ;j++) {
				mat[i][j]  = count ;
				count++ ;
			}
		}
		
		
        for (int i =0 ;i<mat.length ;i++) {
			for(int j = 0 ;j<mat[0] .length ;j++) {
				System.out.print(mat[i][j]+" ");// ln nahi hai yaha toh ek hi line mai gap k saath chije print hoti jaayegi 
			}
			System.out.println();// ye kr raha hai line chaneg 
		}
		
		
		
		
	
	}

}
