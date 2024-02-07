package dec_28;

public class Aarr {

	public static void main(String[] args) {
	///	what is array 
		
	//	[232,23443,234234,23423,234234]
		
		int  a  = 2323  ;
		
		//an array is a collection of similar type of elements which has contiguous memory location.
		
	//	trainer should not use hindi 
		
		int [] intArr = {12,34,6,8} ;
	//	                  0  1 2 3  (index )
		// size of intArr  ===   4  
		
		System.out.println(intArr[1]);
		
		int []sach  = new int[6] ;
		                                        //           0 1 2 3 4  5
		// is point of time tak ek arr ban gaya hai or isme [0,0,0,0,0]
		
    for(int ss  : sach) {
			
			
			System.out.println(ss);
		}
		
		
		
		
		
		for( int i =0  ;i <  sach.length ;i++) {
			
			sach[i]	 = i+4;
			
			System.out.println(sach[i]);
			
		}
	
		

		
		
		
		
		
		
	}
}
