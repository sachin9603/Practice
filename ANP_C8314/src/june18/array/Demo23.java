package june18.array;

import java.util.Arrays;

public class Demo23 {

	
	public static void main(String[] args) {
		 
		int [] arr  = {23,27,64,75,9083,24}  ;// you have to find weather 83 is present 
		
		boolean flg =  false ;
		
		for(int ssi  : arr) {
			
			if(ssi == 83) {
				flg = true ;
				System.out.println("yes");
			}
			
		}
		
		if(flg == false) {
			System.out.println("NO");
		}
		
		
		
		///  {4,6,7,8,5,3,9,23}	}
		
		
		int [] ppp  = {4,6,71,8,5} ;  // isko pehle short karo 
		
		int k  = 13  ;
		
		Arrays.sort(ppp); ; // 4 ,6 , 5, ,8 ,71
		
		System.out.println();
		
	//	find those two value whose sum  == 13
		
		for ( int i = 0 ;i<ppp.length ;i++) {
			
		
			for ( int j = i+1  ;j<ppp.length ;j++) {
				
				if((ppp[i]+ppp[j]) == k) {
					System.out.println(ppp[i]+" "+ppp[j]);
					break ;
				}
			}
		}
		// ek loop se kese hoga 
		
		
	}
		
		
		
}
