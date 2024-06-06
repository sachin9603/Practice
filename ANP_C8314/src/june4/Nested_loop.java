package june4;

public class Nested_loop {

	public static void main(String[] args) {
	
		
//		*****
//		****
//		***
//		**
//		*
		
		for(int i=1 ;i<=5 ;i++) {
			
			//jab  i  tha 1  tab j 5 tha or result aaya ***** iske baad hogi line change or ye kaam line 24 karegi
			//jab  i  tha 2  tab j 4 tha or result aaya ****
			//jab  i  tha 3  tab j 3 tha or result aaya ***	
			//jab  i  tha 4  tab j 2 tha or result aaya **
			//jab  i  tha 5  tab j 1 tha or result aaya *
			
			
			for(int j=1 ;j<=5-i+1;j++) {
				System.out.print("* ");
		}
			
			System.out.println(); // ye har baar line change kar rha hai 
			}
		
		
		
		
		

	}

}
