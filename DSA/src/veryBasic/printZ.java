package veryBasic;

public class printZ {
	
	public static void main(String[] args) {
		
		for( int i=0 ;i<5 ;i++) {
			if (i==0||i == 4) {
				for ( int j=0 ;j<5 ;j++) {
					System.out.print("*");
				}
			}else {
				for( int  j =1 ;j<=5-i ;j++ ) {
					if(j == 5-i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
									}
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
