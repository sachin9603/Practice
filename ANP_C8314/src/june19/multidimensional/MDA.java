package june19.multidimensional;

public class MDA {
	
	
	public static void main(String[] args) {
		
//		2 3 5  har row mai jitne even num aapko print karne hai 
//		6 7 2
//		2 4 8
		
	///	out put  
//		2
//		6 2
//		2 4 8
		
		int [][] mat  = {{2,3,5}
		                   ,{6,7,2} ,
		                   {2,4,8}} ;
		
		for (int i  =0  ;i<mat.length ;i++) {
			for ( int j =0 ;j<mat[0].length ;j++) {
				if(mat[i][j]%2 == 0) {
					System.out.print(mat[i][j]+" ");
				}
			}
			System.out.println();
			
		}
		
		
	}

}
