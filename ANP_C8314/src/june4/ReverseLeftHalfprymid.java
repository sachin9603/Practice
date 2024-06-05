package june4;

public class ReverseLeftHalfprymid {

	public static void main(String[] args) {

     // *****
	 //  ****
	 //   ***
	 //    **
     //	    *
		
		
		// this loop is responsible row
		for (int i =0 ;i<5 ;i++) {
		
			// this loop is responsible for column 
			for (int j=0 ;j<5 ;j++) {
			 
				if(j< i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			 
			}
			System.out.println();
		}
		
		
	
		
		

	}

}
