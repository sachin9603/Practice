package jan18;

public class Mat {
	
	
	public static void main(String[] args) {
		
		int [][] matttt  = {{1,2,3} ,
				             {4,5,6} ,
				             {7,8,9}} ;
		
		
		
		
		for ( int i = 2 ;i>=0 ;i--) {
			System.out.print(matttt[i][0]+" ");
		}
		

		for ( int i = 1 ;i<3  ; i++) {
			System.out.print(matttt[i][i]+" ");
		}
		

		for ( int i = 1 ;i>=0 ;i--) {
			System.out.print(matttt[i][2]+" ");
		}
		
		
		
//		for ( int i =0 ;i< 3  ;i++) {
//			
//			for (int j= 0;j< 3 ;j++) {
//				
//				System.out.print(matttt[i][j]+" ");
//			}
//		}
//		
	}

}
