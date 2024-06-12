package fourFiFty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Commonelementsinallrows {
	
	
	public static void main(String[] args) {
		
		
		
		int mat[][] = 
			{ 
				{1, 2, 1, 4, 8}, 
				{3, 7, 8, 5, 1}, 
				{8, 7, 7, 3, 1}, 
				{8, 1, 2, 7, 9}, 
			}; 
		
		
		int row  = mat.length ;
		
		int col = mat[0].length ;// 1000  ---- 9999 
		int num ;
		
		
			Set<Integer> array = new HashSet<>() ;
			
			
			for (int p =  0  ;p<col  ;p++) {
				
			num = mat[0][p] ;
			
			boolean colmilgaya  = false ;
			boolean rowmaimila  = false  ;
			
			for (int i  =1  ;i<row  ;i++) {
				
				for (int j = 0 ;j< col  ;j++) {
					
					if (num == mat[i][j]) {
						colmilgaya = true  ;
					
					}
					
				}
				
				
			}
			if(colmilgaya == true) {
				
				rowmaimila = true ;
			}else {
				rowmaimila = false  ;
			}
			
			
			if(rowmaimila) {
				array.add(num );
			}
			
			
				
			}
			
			for (int a:array) {
				System.out.println(a);
			}
			
		
	
		
		
		
	}

}
