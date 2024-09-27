package sep25.Basic;

public class Demo3 {
	
	public static void main(String[] args) {
		int aa  = 10  ;
		int b  = 3  ;
		System.out.println(aa+b);
		System.out.println(aa-b); 
		System.out.println(aa%b); // % iska matlab hai ki jab a ko b se divide karege tab kitana remainder bachega 
	
		// ++ ko increament bolte hai 
		 //++a  // preincrement   , a++   post increment 
		
		
		//a++ ki phele operation hoga phir badegi 
		int h  = aa++ + ++aa + aa++;
		      // 10  +  12  + 12  ----> 34 
		
		// ++a phle value badegi or phir operation hoga a
		System.out.println(aa);
		
		// same decrement bhi esa hi hai 
		
		
		System.out.println(h);
		
		int c  =   5  ;
		int jj  =  ++c  - ++c  ;
		System.out.println(jj ) ;
		
		
		int a  = 5  ;
		        //    4 + 3   4     4      2 + 2      2    2
		int kl  = (--a+--a)*(++a - a--)+( --a+a--) * (++a + a++);
		System.out.println(kl);
;		
		
		
	}
	
	
	

}
