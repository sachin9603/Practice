package dec27;

public class Array {
	
	
	public static void main(String[] args) {
		 ///////////   0      1     2     3     4 
		
		int sachin [] = { 67634,54563,45456,675677,58678 } ;
		
		// length will be 5 
		
		// array data kis location par store hai usko  index 
		// array k ander chije (data) access karna hai toh index se  hi hogi  
		
		for (int i  =0  ;i< sachin.length ; i++ ) {
			System.out.println(sachin[i]);
		}
		 
		// second way to define array 
		int [] newarr = new int[5] ;
		//0 1 2 3 4 
		
		// on line 21 a array  will be created of length 5 and element  would be 00000
		
		// for each loop 
		
		
		
		for(int a  : newarr) {
			
			System.out.println(a);
		}
		
		//  if i want to put or insert value into on particular index
		
		for ( int i =0 ;i<= newarr.length ;i++ ) {
			
			newarr[i] = i+4 ;
			
		}
		
		
	for(int a  : newarr) {
			
			System.out.println(a);
		}
		
		
		
	
	}
	
	
	

}
