package june20.matrix;

public class Traversalreverse {
	
	public static void main(String[] args) {
		
		int [][] mat  = {
			// 	0 1  02
				{1,8,9} ,
				{2,7,10},
				{3,6,11},
				{4,5,12}
		};
		//9 10 11 12 8 7 6 5 1 2 3 4 
		int col  = mat[0].length ; // 3
		int row  = mat.length ; // 4
		
		for(int i= col -1  ;i>=0 ;i--) {
			for ( int j =0  ;j<row ;j++) {
			System.out.print(mat[j][i]+" ");
			}                    
		}
		
		
	}

}
