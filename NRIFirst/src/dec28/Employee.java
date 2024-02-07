package dec28;

public class Employee {
	
	public static void main(String[] args) {
		
		
		int x = 2 ;
		  		     
		     
		 int y = 6 ;
		 
		 
		 
		 int z = x - y ;
		  // -- ++  ----> ek se vlaue badate hai or ek se ghate hai 
		 
		// % modulus operator  
		 // 7%3  ki 7 ko 3 se divide karne par kya reminder kya aayega  1 
		 
		 System.out.println(17%7);
		 System.out.println(x);
		 System.out.println(y);
		 
		  // 2, 6
		 // post increment hai 
		 
		 int xy  = x++ + y++ ;
		 
		 // 3 7 
		 
		 System.out.println(xy);
		 
		 
		 int yxy  = ++x + y++ ;
		 System.out.println(yxy);
		 
		 int a=5;
		                //  4      3    4 -  4
		// System.out.println((--a+--a)*(++a - a--));
		 System.out.println((--a+--a)*(++a-a--)+(--a+a--)*(++a+a++));
	}

		 
		 
		 
	

}
