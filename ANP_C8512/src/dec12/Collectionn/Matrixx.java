package dec12.Collectionn;

public class Matrixx {
	
	// [
	//   [1 2 3]
	//   [4 5 6] 
	//   [7 8 9] ]           2 3
	public static void column_wise() {
	
		
		int [][] mat  = {
				
				{1,2,3}	,
				{4,5,6}	,
				{7,8,9}	,
				
		} ; //1*3
		/// 3 6 9 2 5 8 1 4 7 
		for (int i  = mat[0].length -1 ; i>= 0  ;i--) {
		for(int  j  =0  ;j<mat.length ;j++ ) {
			System.out.print(mat[j][i]+" ");
		}
		}
		System.out.println();
	}
	
	
	
	public static void n_Traversal() {
	
		
		int [][] mat  = {
				
				{1,2,3}	,
				{4,5,6}	,
				{7,8,9}	,
				
		} ; //1*3
		/// 3 6 9 2 5 8 1 4 7 
		
		
		for (int i  = mat.length-1  ; i>=0 ;i--) {
			System.out.print(mat[i][0]+" ");
		}
		for (int i  = 1  ; i<mat.length ;i++) {
			
			System.out.print(mat[i][i]+" ");
		}
		
		for (int i  = mat.length-2  ; i>=0 ;i--) {
			System.out.print(mat[i][mat[0].length-1]+" ");
		}
		
		
		
		
	}
	public static void main(String[] args) {
	
		column_wise() ;
		n_Traversal()  ;
		
	}

}
