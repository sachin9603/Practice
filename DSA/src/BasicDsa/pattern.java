package BasicDsa;

public class pattern {
//*******
// *****
//  ***
//   * 	
//  ***
// *****
//*******	
	
	
	public void pat(int n) {
		      int l = 0 ;
            //7
              int rr= n ;
              if (n%2 == 1) {
            	  while(  rr>=0) {
          			for (int k =0 ;k<l ;k++) {
          				System.out.print(" ");
          			}
          			
          			for ( int j = 0  ; j<rr;j++) {
          				
          				System.out.print("*");
          			}
          			System.out.println();
          			l++;

          			rr = rr-2;
          			
          			

          		}
          		
          		
          		
          		l =n/2-1;
          		
          		for (int i = 3 ;i<=n ;i=i+2 ) {
          			
                   for ( int j = 0; j<l ;j++) {
          				
          				System.out.print(" ");
          			}
          			for (int k =0 ;k<i ;k++) {
          				System.out.print("*");
          			}
          			
          			System.out.println();
          			l--;
          		
          		} 
              }else {
            	  
            	  
            	  
            	  while(  rr>=0) {
          			
          			
          			if (rr==0) {
          				for (int k =0 ;k<(l*2)-1 ;k++) {
              				System.out.print(" ");
              			}
          				System.out.print("*");
          			}else {
          				for (int k =0 ;k< l;k++) {
              				System.out.print("  ");
              			}
          				for ( int j = 0  ; j<rr;j++) {
              				
              				System.out.print("* ");
              			}
          			}
          			
          			System.out.println();
          			l++;

          			rr = rr-2;
          			
          			

          		}
          		
          		
          		l =n/2-1;
          		
          		for (int i = 2 ;i<=n ;i=i+2 ) {
          			
                   for ( int j = 0; j<l ;j++) {
          				
          				System.out.print("  ");
          			}
          			for (int k =0 ;k<i ;k++) {
          				System.out.print("* ");
          			}
          			
          			System.out.println();
          			l--;
          		
          		}
            	  
              }
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		pattern  p = new pattern() ;
		p.pat(7);
	}
	
}
