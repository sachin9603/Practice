package jan24;

public class Basic {
	
	
	public static void main(String[] args) {
		
    // main and ctrl+space 
		
		
	///	core java ---> basic syntax , oops, collection , exception handling , multithreading ----> dsa 
	 
	// advance java  --- > jdbc  , hibernate , Springboot , mqsql 
		
	/// System.out.println("hello ");
		
		// jdk install karo  ,,,,, eclipse install karo 
		
		
		
		//mutlidimesional array  
		
		int [][] mat  = new int[3][3] ;
		
		// line 23 is point of time tk isme 0  9 times store ho chuka hai 
		
		for (int i =0 ;i<3 ;i++) {
			for(int j =0 ;j<3 ;j++) {
				
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}
		
		int count  = 1 ;
		
		for (int i =0 ;i<3 ;i++) {
			for(int j =0 ;j<3 ;j++) {
				
				mat[i][j] = count ;
				
				count++ ;
			}
		}
		
		for (int i =0 ;i<3 ;i++) {
			for(int j =0 ;j<3 ;j++) {
				
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		int [][]newMat = { {1,72,3 , 5} 
						  ,{4,5,6 ,71} 
						  ,{7,8,9 , 88} } ;
		
		for (int i =0 ;i<3;i++) {
			for(int j =0 ;j<4 ;j++) {
				
				System.out.print(newMat[i][j]+" ");
				
			}
			System.out.println();
		}
		
		int row  = newMat.length ; /// ye hai row
		
		int col  = newMat[0].length ;
		
		for (int i =row -1  ;i>=0  ;i--) {
			 System.out.print(newMat[i][0]+" "); // 7 4 1
		 }
		
		for (int i =1  ;i< col  ;i++) {
			 System.out.print(newMat[0][i]+" "); //  72 3 5
		 }
		
		for (int i =1  ;i< row  ;i++) { //
			 System.out.print(newMat[i][col-1]+" ");
		 }x
		for (int i =col-2  ;i>= 1  ;i--) {
			 System.out.print(newMat[row-1][i]+" ");
		 }
		
		
	}

}
