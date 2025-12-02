package questions;

public class Pattern {
	
	public static void righthalfPyramid(int num) {
		
//		*
//		* *
//		* * *
//		* * * *
		//       0 1 2  3 4   <5
		for(int i=0 ;i<num ; i++) {// 0
			
			for(int j =0 ;j<=i ;j++){
				
				System.out.print("* "+" ");
			}
			System.out.println();
			
			
			
		}
		
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		
		
	}
	
	public static void main(String[] args) {
		
		righthalfPyramid(10);
		
		
	}

}
